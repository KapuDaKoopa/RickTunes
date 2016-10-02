package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.actionbarsherlock.C0152R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

/* renamed from: com.andromo.dev576782.app537736.j */
final class C0208j {
    private static boolean f1177a;
    private static boolean f1178b;

    static Intent m1604a(Context context) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        context.getClass().getName();
        String string = context.getResources().getString(2131230835);
        if (string.equals("")) {
            return intent;
        }
        try {
            Class cls = Class.forName(packageName + "." + string);
            return Activity.class.isAssignableFrom(cls) ? new Intent(context, cls) : new Intent();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new Intent();
        }
    }

    static Class m1605a(Activity activity) {
        String parentActivityName = NavUtils.getParentActivityName(activity);
        "trying parent: " + parentActivityName;
        String str = parentActivityName;
        while (str != null) {
            try {
                Class cls = Class.forName(str);
                if (gs.class.isAssignableFrom(cls)) {
                    cls = C0208j.m1606a(C0208j.m1618b(activity, str), true);
                    "potential upClass: " + cls;
                    if (cls != null && !cls.equals(activity.getClass())) {
                        return cls;
                    }
                    try {
                        parentActivityName = NavUtils.getParentActivityName(activity, new ComponentName(activity.getPackageName(), str));
                        "trying parent: " + parentActivityName;
                        str = parentActivityName;
                    } catch (NameNotFoundException e) {
                        return null;
                    }
                }
                "using parent as upClass: " + cls;
                return cls;
            } catch (Throwable e2) {
                Log.w("ActionBarUtils", "ClassNotFoundException trying to get parent", e2);
                return null;
            }
        }
        return null;
    }

    static Class m1606a(String[] strArr, boolean z) {
        for (String str : strArr) {
            String str2;
            "checking: " + str2;
            try {
                str2 = "com.andromo.dev576782.app537736." + str2;
                "checking: " + str2;
                Class cls = Class.forName(str2);
                if (!(z && gs.class.isAssignableFrom(cls)) && Activity.class.isAssignableFrom(cls)) {
                    return cls;
                }
            } catch (Throwable e) {
                Log.w("ActionBarUtils", "ClassNotFoundException", e);
            }
        }
        return null;
    }

    static String m1607a(Context context, int i) {
        String str = "";
        String[] stringArray = context.getResources().getStringArray(2131623936);
        return (stringArray == null || i < 0 || i >= stringArray.length) ? str : stringArray[i];
    }

    static String m1608a(Context context, String str) {
        for (int stringArray : new int[]{2131623938}) {
            for (String str2 : context.getResources().getStringArray(stringArray)) {
                if (str2.equalsIgnoreCase(str)) {
                    return context.getPackageName() + "." + str2;
                }
            }
        }
        return "";
    }

    static void m1609a(Activity activity, ActionBar actionBar, int i) {
        if (i >= 0 && actionBar != null) {
            Context themedContext = actionBar.getThemedContext();
            SpinnerAdapter createFromResource = ArrayAdapter.createFromResource(themedContext, 2131623936, C0152R.layout.sherlock_spinner_dropdown_item);
            createFromResource.setDropDownViewResource(C0152R.layout.sherlock_spinner_dropdown_item);
            actionBar.setNavigationMode(1);
            actionBar.setListNavigationCallbacks(createFromResource, new C0209k(themedContext, i, activity, actionBar));
        }
    }

    static void m1610a(ActionBar actionBar, int i) {
        if (actionBar != null && i >= 0) {
            actionBar.setSelectedNavigationItem(i);
        }
    }

    static void m1611a(ActionBar actionBar, String str) {
        if (actionBar != null) {
            actionBar.setTitle((CharSequence) str);
        }
    }

    static void m1612a(ActionBar actionBar, boolean z, boolean z2) {
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowCustomEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(z2);
            actionBar.setDisplayShowTitleEnabled(z);
        }
    }

    static void m1613a(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(2131689472, menu);
        menuInflater.inflate(2131689474, menu);
    }

    private static boolean m1614a() {
        if (!f1178b) {
            try {
                Class.forName("com.andromo.dev576782.app537736.Dashboard_000");
                f1177a = true;
            } catch (ClassNotFoundException e) {
            }
            f1178b = true;
        }
        return f1177a;
    }

    static boolean m1615a(Activity activity, MenuItem menuItem) {
        Intent parentActivityIntent;
        switch (menuItem.getItemId()) {
            case 16908332:
                "home pressed on activity: " + activity;
                parentActivityIntent = NavUtils.getParentActivityIntent(activity);
                if (parentActivityIntent == null) {
                    "No parent for " + activity + " -- NavUtils.getParentActivityIntent() returned null.";
                    return false;
                }
                if (C0208j.m1616a(parentActivityIntent.getComponent().getClassName())) {
                    Class a = C0208j.m1605a(activity);
                    "upClass: " + a;
                    if (a != null) {
                        "original upIntent: " + parentActivityIntent;
                        parentActivityIntent = new Intent("android.intent.action.MAIN").setClassName(activity, a.getName());
                    } else {
                        Log.w("ActionBarUtils", "No valid parent -- getUpClass() returned null.");
                        return false;
                    }
                }
                parentActivityIntent.putExtra("HomeAsUp", true);
                "upIntent: " + parentActivityIntent;
                if (NavUtils.shouldUpRecreateTask(activity, parentActivityIntent)) {
                    TaskStackBuilder.create(activity).addNextIntentWithParentStack(parentActivityIntent).startActivities();
                } else {
                    if (!"com.andromo.dev576782.app537736.Dashboard_000".equals(parentActivityIntent.getComponent().getClassName()) || C0208j.m1614a()) {
                        parentActivityIntent.addFlags(335544320);
                        aw.m1294a(activity, parentActivityIntent);
                    }
                }
                return true;
            case 2131361820:
                parentActivityIntent = new Intent(activity, AndromoPreferencesActivity.class);
                parentActivityIntent.addFlags(67108864);
                activity.startActivity(parentActivityIntent);
                return true;
            case 2131362004:
                activity.showDialog(0);
                return true;
            default:
                return false;
        }
    }

    private static boolean m1616a(String str) {
        try {
            return gs.class.isAssignableFrom(Class.forName(str));
        } catch (Throwable e) {
            Log.w("ActionBarUtils", "ClassNotFoundException", e);
            return false;
        }
    }

    static int m1617b(Context context) {
        String[] stringArray = context.getResources().getStringArray(2131623938);
        String name = context.getClass().getName();
        String str = context.getPackageName() + ".";
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            if (name.equals(str + stringArray[i])) {
                return i;
            }
        }
        return -1;
    }

    private static String[] m1618b(Context context, String str) {
        if (str != null) {
            "getting category class names for: " + str;
            try {
                Class cls = Class.forName(str);
                if (ds.class.isAssignableFrom(cls)) {
                    return ((ds) cls.newInstance()).getClassNamesArray(context);
                }
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e2) {
            } catch (ClassNotFoundException e3) {
            }
        }
        return null;
    }
}
