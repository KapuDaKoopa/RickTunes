package com.actionbarsherlock.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import com.actionbarsherlock.C0152R;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

public class MenuInflater {
    private static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    private static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    private static final String LOG_TAG = "MenuInflater";
    private static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    private final Object[] mActionProviderConstructorArguments;
    private final Object[] mActionViewConstructorArguments;
    private Context mContext;
    private Object mRealOwner;

    class InflatedOnMenuItemClickListener implements OnMenuItemClickListener {
        private static final Class[] PARAM_TYPES;
        private Method mMethod;
        private Object mRealOwner;

        static {
            PARAM_TYPES = new Class[]{MenuItem.class};
        }

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem})).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemEnabled;
        private int itemIconResId;
        private int itemId;
        private String itemListenerMethodName;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private boolean itemVisible;
        private Menu menu;

        public MenuState(Menu menu) {
            this.menu = menu;
            resetGroup();
        }

        private char getShortcut(String str) {
            return str == null ? '\u0000' : str.charAt(defaultItemOrder);
        }

        private Object newInstance(String str, Class[] clsArr, Object[] objArr) {
            try {
                return MenuInflater.this.mContext.getClassLoader().loadClass(str).getConstructor(clsArr).newInstance(objArr);
            } catch (Throwable e) {
                Log.w(MenuInflater.LOG_TAG, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void setItem(MenuItem menuItem) {
            boolean z = defaultItemVisible;
            menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable > 0 ? defaultItemVisible : defaultItemChecked).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId).setAlphabeticShortcut(this.itemAlphabeticShortcut).setNumericShortcut(this.itemNumericShortcut);
            if (this.itemShowAsAction >= 0) {
                menuItem.setShowAsAction(this.itemShowAsAction);
            }
            if (this.itemListenerMethodName != null) {
                if (MenuInflater.this.mContext.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(MenuInflater.this.mRealOwner, this.itemListenerMethodName));
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(defaultItemVisible);
                } else {
                    this.menu.setGroupCheckable(this.groupId, defaultItemVisible, defaultItemVisible);
                }
            }
            if (this.itemActionViewClassName != null) {
                menuItem.setActionView((View) newInstance(this.itemActionViewClassName, MenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, MenuInflater.this.mActionViewConstructorArguments));
            } else {
                z = defaultItemChecked;
            }
            if (this.itemActionViewLayout > 0) {
                if (z) {
                    Log.w(MenuInflater.LOG_TAG, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(this.itemActionViewLayout);
                }
            }
            if (this.itemActionProvider != null) {
                menuItem.setActionProvider(this.itemActionProvider);
            }
        }

        public void addItem() {
            this.itemAdded = defaultItemVisible;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = defaultItemVisible;
            SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = MenuInflater.this.mContext.obtainStyledAttributes(attributeSet, C0152R.styleable.SherlockMenuGroup);
            this.groupId = obtainStyledAttributes.getResourceId(C0152R.styleable.SherlockMenuGroup_android_id, defaultItemOrder);
            this.groupCategory = obtainStyledAttributes.getInt(C0152R.styleable.SherlockMenuGroup_android_menuCategory, defaultItemOrder);
            this.groupOrder = obtainStyledAttributes.getInt(C0152R.styleable.SherlockMenuGroup_android_orderInCategory, defaultItemOrder);
            this.groupCheckable = obtainStyledAttributes.getInt(C0152R.styleable.SherlockMenuGroup_android_checkableBehavior, defaultItemOrder);
            this.groupVisible = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuGroup_android_visible, defaultItemVisible);
            this.groupEnabled = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuGroup_android_enabled, defaultItemVisible);
            obtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            boolean z = defaultItemVisible;
            TypedArray obtainStyledAttributes = MenuInflater.this.mContext.obtainStyledAttributes(attributeSet, C0152R.styleable.SherlockMenuItem);
            this.itemId = obtainStyledAttributes.getResourceId(C0152R.styleable.SherlockMenuItem_android_id, defaultItemOrder);
            this.itemCategoryOrder = (obtainStyledAttributes.getInt(C0152R.styleable.SherlockMenuItem_android_menuCategory, this.groupCategory) & Menu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(C0152R.styleable.SherlockMenuItem_android_orderInCategory, this.groupOrder) & Menu.USER_MASK);
            this.itemTitle = obtainStyledAttributes.getText(C0152R.styleable.SherlockMenuItem_android_title);
            this.itemTitleCondensed = obtainStyledAttributes.getText(C0152R.styleable.SherlockMenuItem_android_titleCondensed);
            this.itemIconResId = obtainStyledAttributes.getResourceId(C0152R.styleable.SherlockMenuItem_android_icon, defaultItemOrder);
            this.itemAlphabeticShortcut = getShortcut(obtainStyledAttributes.getString(C0152R.styleable.SherlockMenuItem_android_alphabeticShortcut));
            this.itemNumericShortcut = getShortcut(obtainStyledAttributes.getString(C0152R.styleable.SherlockMenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C0152R.styleable.SherlockMenuItem_android_checkable)) {
                this.itemCheckable = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuItem_android_checkable, defaultItemChecked) ? 1 : defaultItemOrder;
            } else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuItem_android_checked, defaultItemChecked);
            this.itemVisible = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuItem_android_visible, this.groupVisible);
            this.itemEnabled = obtainStyledAttributes.getBoolean(C0152R.styleable.SherlockMenuItem_android_enabled, this.groupEnabled);
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(C0152R.styleable.SherlockMenuItem_android_showAsAction, typedValue);
            this.itemShowAsAction = typedValue.type == 17 ? typedValue.data : -1;
            this.itemListenerMethodName = obtainStyledAttributes.getString(C0152R.styleable.SherlockMenuItem_android_onClick);
            this.itemActionViewLayout = obtainStyledAttributes.getResourceId(C0152R.styleable.SherlockMenuItem_android_actionLayout, defaultItemOrder);
            typedValue = new TypedValue();
            obtainStyledAttributes.getValue(C0152R.styleable.SherlockMenuItem_android_actionViewClass, typedValue);
            this.itemActionViewClassName = typedValue.type == 3 ? typedValue.string.toString() : null;
            typedValue = new TypedValue();
            obtainStyledAttributes.getValue(C0152R.styleable.SherlockMenuItem_android_actionProviderClass, typedValue);
            this.itemActionProviderClassName = typedValue.type == 3 ? typedValue.string.toString() : null;
            if (this.itemActionProviderClassName == null) {
                z = defaultItemChecked;
            }
            if (z && this.itemActionViewLayout == 0 && this.itemActionViewClassName == null) {
                this.itemActionProvider = (ActionProvider) newInstance(this.itemActionProviderClassName, MenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, MenuInflater.this.mActionProviderConstructorArguments);
            } else {
                if (z) {
                    Log.w(MenuInflater.LOG_TAG, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.itemActionProvider = null;
            }
            obtainStyledAttributes.recycle();
            this.itemAdded = defaultItemChecked;
        }

        public void resetGroup() {
            this.groupId = defaultItemOrder;
            this.groupCategory = defaultItemOrder;
            this.groupOrder = defaultItemOrder;
            this.groupCheckable = defaultItemOrder;
            this.groupVisible = defaultItemVisible;
            this.groupEnabled = defaultItemVisible;
        }
    }

    static {
        Class[] clsArr = new Class[]{Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public MenuInflater(Context context) {
        this.mContext = context;
        this.mRealOwner = context;
        this.mActionViewConstructorArguments = new Object[]{context};
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }

    public MenuInflater(Context context, Object obj) {
        this.mContext = context;
        this.mRealOwner = obj;
        this.mActionViewConstructorArguments = new Object[]{context};
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, com.actionbarsherlock.view.Menu r13) {
        /*
        r10 = this;
        r4 = 0;
        r1 = 1;
        r6 = 0;
        r7 = new com.actionbarsherlock.view.MenuInflater$MenuState;
        r7.<init>(r13);
        r0 = r11.getEventType();
    L_0x000c:
        r2 = 2;
        if (r0 != r2) goto L_0x0046;
    L_0x000f:
        r0 = r11.getName();
        r2 = "menu";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x001b:
        r0 = r11.next();
    L_0x001f:
        r2 = r4;
        r5 = r6;
        r3 = r0;
        r0 = r6;
    L_0x0023:
        if (r0 != 0) goto L_0x00db;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x00d3;
            case 2: goto L_0x004d;
            case 3: goto L_0x0081;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5;
    L_0x0029:
        r5 = r11.next();
        r9 = r3;
        r3 = r5;
        r5 = r9;
        goto L_0x0023;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expecting menu, got ";
        r2.<init>(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r0 = r11.next();
        if (r0 != r1) goto L_0x000c;
    L_0x004c:
        goto L_0x001f;
    L_0x004d:
        if (r5 != 0) goto L_0x0028;
    L_0x004f:
        r3 = r11.getName();
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0060;
    L_0x005b:
        r7.readGroup(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0060:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x006d;
    L_0x0068:
        r7.readItem(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x006d:
        r8 = "menu";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x007e;
    L_0x0075:
        r3 = r7.addSubMenuItem();
        r10.parseMenu(r11, r12, r3);
        r3 = r5;
        goto L_0x0029;
    L_0x007e:
        r2 = r3;
        r3 = r1;
        goto L_0x0029;
    L_0x0081:
        r3 = r11.getName();
        if (r5 == 0) goto L_0x0090;
    L_0x0087:
        r8 = r3.equals(r2);
        if (r8 == 0) goto L_0x0090;
    L_0x008d:
        r2 = r4;
        r3 = r6;
        goto L_0x0029;
    L_0x0090:
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x009d;
    L_0x0098:
        r7.resetGroup();
        r3 = r5;
        goto L_0x0029;
    L_0x009d:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00c7;
    L_0x00a5:
        r3 = r7.hasAddedItem();
        if (r3 != 0) goto L_0x0028;
    L_0x00ab:
        r3 = r7.itemActionProvider;
        if (r3 == 0) goto L_0x00c1;
    L_0x00b1:
        r3 = r7.itemActionProvider;
        r3 = r3.hasSubMenu();
        if (r3 == 0) goto L_0x00c1;
    L_0x00bb:
        r7.addSubMenuItem();
        r3 = r5;
        goto L_0x0029;
    L_0x00c1:
        r7.addItem();
        r3 = r5;
        goto L_0x0029;
    L_0x00c7:
        r8 = "menu";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x0028;
    L_0x00cf:
        r0 = r1;
        r3 = r5;
        goto L_0x0029;
    L_0x00d3:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x00db:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.view.MenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, com.actionbarsherlock.view.Menu):void");
    }

    public void inflate(int i, Menu menu) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.mContext.getResources().getLayout(i);
            parseMenu(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (Throwable e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (Throwable e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
