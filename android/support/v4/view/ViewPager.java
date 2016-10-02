package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.p000a.C0001b;
import android.support.v4.p000a.C0002c;
import android.support.v4.p000a.C0003d;
import android.support.v4.widget.C0127o;
import android.support.v7.widget.GridLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    private static final int[] f136a;
    private static final bs ag;
    private static final Comparator f137c;
    private static final Interpolator f138d;
    private boolean f139A;
    private boolean f140B;
    private int f141C;
    private int f142D;
    private int f143E;
    private float f144F;
    private float f145G;
    private float f146H;
    private float f147I;
    private int f148J;
    private VelocityTracker f149K;
    private int f150L;
    private int f151M;
    private int f152N;
    private int f153O;
    private boolean f154P;
    private C0127o f155Q;
    private C0127o f156R;
    private boolean f157S;
    private boolean f158T;
    private boolean f159U;
    private int f160V;
    private bo f161W;
    private bo aa;
    private bn ab;
    private bp ac;
    private Method ad;
    private int ae;
    private ArrayList af;
    private final Runnable ah;
    private int ai;
    private int f162b;
    private final ArrayList f163e;
    private final bl f164f;
    private final Rect f165g;
    private aa f166h;
    private int f167i;
    private int f168j;
    private Parcelable f169k;
    private ClassLoader f170l;
    private Scroller f171m;
    private bq f172n;
    private int f173o;
    private Drawable f174p;
    private int f175q;
    private int f176r;
    private float f177s;
    private float f178t;
    private int f179u;
    private int f180v;
    private boolean f181w;
    private boolean f182x;
    private boolean f183y;
    private int f184z;

    public class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean f127a;
        public int f128b;
        float f129c;
        boolean f130d;
        int f131e;
        int f132f;

        public LayoutParams() {
            super(-1, -1);
            this.f129c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f129c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f136a);
            this.f128b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f133a;
        Parcelable f134b;
        ClassLoader f135c;

        static {
            C0002c brVar = new br();
            if (VERSION.SDK_INT >= 13) {
                C0003d c0003d = new C0003d(brVar);
            }
            CREATOR = new C0001b(brVar);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f133a = parcel.readInt();
            this.f134b = parcel.readParcelable(classLoader);
            this.f135c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f133a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f133a);
            parcel.writeParcelable(this.f134b, i);
        }
    }

    static {
        f136a = new int[]{16842931};
        f137c = new bh();
        f138d = new bi();
        ag = new bs();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163e = new ArrayList();
        this.f164f = new bl();
        this.f165g = new Rect();
        this.f168j = -1;
        this.f169k = null;
        this.f170l = null;
        this.f177s = -3.4028235E38f;
        this.f178t = Float.MAX_VALUE;
        this.f184z = 1;
        this.f148J = -1;
        this.f157S = true;
        this.f158T = false;
        this.ah = new bj(this);
        this.ai = 0;
        setWillNotDraw(false);
        setDescendantFocusability(Menu.CATEGORY_ALTERNATIVE);
        setFocusable(true);
        Context context2 = getContext();
        this.f171m = new Scroller(context2, f138d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f143E = ax.m430a(viewConfiguration);
        this.f150L = (int) (400.0f * f);
        this.f151M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f155Q = new C0127o(context2);
        this.f156R = new C0127o(context2);
        this.f152N = (int) (25.0f * f);
        this.f153O = (int) (2.0f * f);
        this.f141C = (int) (16.0f * f);
        an.m366a((View) this, new bm(this));
        if (an.m373d(this) == 0) {
            an.m371b(this, 1);
        }
    }

    private Rect m97a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private bl m98a(int i, int i2) {
        bl blVar = new bl();
        blVar.f212b = i;
        blVar.f211a = this.f166h.instantiateItem((ViewGroup) this, i);
        blVar.f214d = this.f166h.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f163e.size()) {
            this.f163e.add(blVar);
        } else {
            this.f163e.add(i2, blVar);
        }
        return blVar;
    }

    private bl m99a(View view) {
        for (int i = 0; i < this.f163e.size(); i++) {
            bl blVar = (bl) this.f163e.get(i);
            if (this.f166h.isViewFromObject(view, blVar.f211a)) {
                return blVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f167i;
        r0 = r19;
        if (r4 == r0) goto L_0x0334;
    L_0x000a:
        r0 = r18;
        r2 = r0.f167i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.f167i;
        r0 = r18;
        r3 = r0.m113b(r3);
        r0 = r19;
        r1 = r18;
        r1.f167i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.f166h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.m118d();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.f183y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.m118d();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.f166h;
        r0 = r18;
        r2.startUpdate(r0);
        r0 = r18;
        r2 = r0.f184z;
        r5 = 0;
        r0 = r18;
        r6 = r0.f167i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.f166h;
        r12 = r5.getCount();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.f167i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.f162b;
        if (r12 == r2) goto L_0x00d6;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00cc }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00cc }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00cc }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r18;
        r5 = r0.f162b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f166h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00cc:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00d6:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00d9:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x0331;
    L_0x00e3:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        r7 = r2.f212b;
        r0 = r18;
        r8 = r0.f167i;
        if (r7 < r8) goto L_0x016b;
    L_0x00f5:
        r7 = r2.f212b;
        r0 = r18;
        r8 = r0.f167i;
        if (r7 != r8) goto L_0x0331;
    L_0x00fd:
        if (r2 != 0) goto L_0x032e;
    L_0x00ff:
        if (r12 <= 0) goto L_0x032e;
    L_0x0101:
        r0 = r18;
        r2 = r0.f167i;
        r0 = r18;
        r2 = r0.m98a(r2, r5);
        r10 = r2;
    L_0x010c:
        if (r10 == 0) goto L_0x028f;
    L_0x010e:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x0170;
    L_0x0113:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.bl) r2;
    L_0x011d:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x0172;
    L_0x0123:
        r6 = 0;
    L_0x0124:
        r0 = r18;
        r7 = r0.f167i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0134:
        if (r9 < 0) goto L_0x01b8;
    L_0x0136:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0182;
    L_0x013a:
        if (r9 >= r11) goto L_0x0182;
    L_0x013c:
        if (r2 == 0) goto L_0x01b8;
    L_0x013e:
        r15 = r2.f212b;
        if (r9 != r15) goto L_0x0168;
    L_0x0142:
        r15 = r2.f213c;
        if (r15 != 0) goto L_0x0168;
    L_0x0146:
        r0 = r18;
        r15 = r0.f163e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.f166h;
        r2 = r2.f211a;
        r0 = r18;
        r15.destroyItem(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0180;
    L_0x015e:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
    L_0x0168:
        r9 = r9 + -1;
        goto L_0x0134;
    L_0x016b:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00d9;
    L_0x0170:
        r2 = 0;
        goto L_0x011d;
    L_0x0172:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.f214d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0124;
    L_0x0180:
        r2 = 0;
        goto L_0x0168;
    L_0x0182:
        if (r2 == 0) goto L_0x019c;
    L_0x0184:
        r15 = r2.f212b;
        if (r9 != r15) goto L_0x019c;
    L_0x0188:
        r2 = r2.f214d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x019a;
    L_0x018f:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        goto L_0x0168;
    L_0x019a:
        r2 = 0;
        goto L_0x0168;
    L_0x019c:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.m98a(r9, r2);
        r2 = r2.f214d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x01b6;
    L_0x01ab:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        goto L_0x0168;
    L_0x01b6:
        r2 = 0;
        goto L_0x0168;
    L_0x01b8:
        r6 = r10.f214d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x028a;
    L_0x01c2:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x022c;
    L_0x01cc:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.bl) r2;
        r7 = r2;
    L_0x01d7:
        if (r14 > 0) goto L_0x022e;
    L_0x01d9:
        r2 = 0;
        r5 = r2;
    L_0x01db:
        r0 = r18;
        r2 = r0.f167i;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x01e7:
        if (r9 >= r12) goto L_0x028a;
    L_0x01e9:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x023c;
    L_0x01ed:
        if (r9 <= r13) goto L_0x023c;
    L_0x01ef:
        if (r2 == 0) goto L_0x028a;
    L_0x01f1:
        r11 = r2.f212b;
        if (r9 != r11) goto L_0x0327;
    L_0x01f5:
        r11 = r2.f213c;
        if (r11 != 0) goto L_0x0327;
    L_0x01f9:
        r0 = r18;
        r11 = r0.f163e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.f166h;
        r2 = r2.f211a;
        r0 = r18;
        r11.destroyItem(r0, r9, r2);
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x023a;
    L_0x0215:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x021f:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x0224:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x01e7;
    L_0x022c:
        r7 = 0;
        goto L_0x01d7;
    L_0x022e:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x01db;
    L_0x023a:
        r2 = 0;
        goto L_0x021f;
    L_0x023c:
        if (r2 == 0) goto L_0x0263;
    L_0x023e:
        r11 = r2.f212b;
        if (r9 != r11) goto L_0x0263;
    L_0x0242:
        r2 = r2.f214d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0261;
    L_0x0251:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x025b:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x0261:
        r2 = 0;
        goto L_0x025b;
    L_0x0263:
        r0 = r18;
        r2 = r0.m98a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.f214d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0288;
    L_0x0278:
        r0 = r18;
        r2 = r0.f163e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x0282:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x0288:
        r2 = 0;
        goto L_0x0282;
    L_0x028a:
        r0 = r18;
        r0.m107a(r10, r8, r4);
    L_0x028f:
        r0 = r18;
        r4 = r0.f166h;
        r0 = r18;
        r5 = r0.f167i;
        if (r10 == 0) goto L_0x02de;
    L_0x0299:
        r2 = r10.f211a;
    L_0x029b:
        r0 = r18;
        r4.setPrimaryItem(r0, r5, r2);
        r0 = r18;
        r2 = r0.f166h;
        r0 = r18;
        r2.finishUpdate(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x02af:
        if (r4 >= r5) goto L_0x02e0;
    L_0x02b1:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.f132f = r4;
        r7 = r2.f127a;
        if (r7 != 0) goto L_0x02da;
    L_0x02c3:
        r7 = r2.f129c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x02da;
    L_0x02ca:
        r0 = r18;
        r6 = r0.m99a(r6);
        if (r6 == 0) goto L_0x02da;
    L_0x02d2:
        r7 = r6.f214d;
        r2.f129c = r7;
        r6 = r6.f212b;
        r2.f131e = r6;
    L_0x02da:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x02af;
    L_0x02de:
        r2 = 0;
        goto L_0x029b;
    L_0x02e0:
        r18.m118d();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02e9:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0325;
    L_0x02ef:
        r0 = r18;
        r2 = r0.m114b(r2);
    L_0x02f5:
        if (r2 == 0) goto L_0x02ff;
    L_0x02f7:
        r2 = r2.f212b;
        r0 = r18;
        r4 = r0.f167i;
        if (r2 == r4) goto L_0x002f;
    L_0x02ff:
        r2 = 0;
    L_0x0300:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0306:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.m99a(r4);
        if (r5 == 0) goto L_0x0322;
    L_0x0314:
        r5 = r5.f212b;
        r0 = r18;
        r6 = r0.f167i;
        if (r5 != r6) goto L_0x0322;
    L_0x031c:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x0322:
        r2 = r2 + 1;
        goto L_0x0300;
    L_0x0325:
        r2 = 0;
        goto L_0x02f5;
    L_0x0327:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x032e:
        r10 = r2;
        goto L_0x010c;
    L_0x0331:
        r2 = r6;
        goto L_0x00fd;
    L_0x0334:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void m101a(int i, float f) {
        int paddingLeft;
        int paddingRight;
        if (this.f160V > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                int i3;
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f127a) {
                    int max;
                    switch (layoutParams.f128b & 7) {
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                            max = childAt.getWidth() + paddingLeft;
                            i3 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i3;
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i3 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        default:
                            max = paddingLeft;
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i3 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i3;
                }
                i2++;
                i3 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i3;
            }
        }
        if (this.f161W != null) {
            this.f161W.m346a(i, f);
        }
        if (this.aa != null) {
            this.aa.m346a(i, f);
        }
        if (this.ac != null) {
            getScrollX();
            paddingRight = getChildCount();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((LayoutParams) childAt2.getLayoutParams()).f127a) {
                    childAt2.getLeft();
                    getClientWidth();
                    bp bpVar = this.ac;
                }
            }
        }
        this.f159U = true;
    }

    private void m102a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f163e.isEmpty()) {
            bl b = m113b(this.f167i);
            int min = (int) ((b != null ? Math.min(b.f215e, this.f178t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m109a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f171m.isFinished()) {
            this.f171m.startScroll(paddingLeft, 0, (int) (m113b(this.f167i).f215e * ((float) i)), 0, this.f171m.getDuration() - this.f171m.timePassed());
        }
    }

    private void m103a(int i, boolean z, int i2, boolean z2) {
        bl b = m113b(i);
        int i3 = 0;
        if (b != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.f177s, Math.min(b.f215e, this.f178t)));
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    m109a(false);
                    m126b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    i3 = getClientWidth();
                    int i6 = i3 / 2;
                    float f = (float) i6;
                    float sin = (((float) i6) * ((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (1.0f * ((float) Math.abs(i4))) / ((float) i3)) - 0.5f)) * 0.4712389167638204d))))) + f;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i3 = Math.round(1000.0f * Math.abs(sin / ((float) abs))) * 4;
                    } else {
                        i3 = (int) (((((float) Math.abs(i4)) / ((((float) i3) * this.f166h.getPageWidth(this.f167i)) + ((float) this.f173o))) + 1.0f) * 100.0f);
                    }
                    this.f171m.startScroll(scrollX, scrollY, i4, i5, Math.min(i3, 600));
                    an.m372c(this);
                }
            }
            if (z2 && this.f161W != null) {
                this.f161W.m344a();
            }
            if (z2 && this.aa != null) {
                this.aa.m344a();
                return;
            }
            return;
        }
        if (z2 && this.f161W != null) {
            this.f161W.m344a();
        }
        if (z2 && this.aa != null) {
            this.aa.m344a();
        }
        m109a(false);
        scrollTo(i3, 0);
        m116c(i3);
    }

    private void m104a(int i, boolean z, boolean z2) {
        m105a(i, z, z2, 0);
    }

    private void m105a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f166h == null || this.f166h.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f167i != i || this.f163e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f166h.getCount()) {
                i = this.f166h.getCount() - 1;
            }
            int i3 = this.f184z;
            if (i > this.f167i + i3 || i < this.f167i - i3) {
                for (int i4 = 0; i4 < this.f163e.size(); i4++) {
                    ((bl) this.f163e.get(i4)).f213c = true;
                }
            }
            if (this.f167i != i) {
                z3 = true;
            }
            if (this.f157S) {
                this.f167i = i;
                if (z3 && this.f161W != null) {
                    this.f161W.m344a();
                }
                if (z3 && this.aa != null) {
                    this.aa.m344a();
                }
                requestLayout();
                return;
            }
            m100a(i);
            m103a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void m107a(bl blVar, int i, bl blVar2) {
        float f;
        int i2;
        bl blVar3;
        int i3;
        int count = this.f166h.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f173o) / ((float) clientWidth) : 0.0f;
        if (blVar2 != null) {
            clientWidth = blVar2.f212b;
            int i4;
            if (clientWidth < blVar.f212b) {
                f = (blVar2.f215e + blVar2.f214d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= blVar.f212b && i2 < this.f163e.size()) {
                    blVar3 = (bl) this.f163e.get(i2);
                    while (i4 > blVar3.f212b && i2 < this.f163e.size() - 1) {
                        i2++;
                        blVar3 = (bl) this.f163e.get(i2);
                    }
                    while (i4 < blVar3.f212b) {
                        f += this.f166h.getPageWidth(i4) + f2;
                        i4++;
                    }
                    blVar3.f215e = f;
                    f += blVar3.f214d + f2;
                    i4++;
                }
            } else if (clientWidth > blVar.f212b) {
                i2 = this.f163e.size() - 1;
                f = blVar2.f215e;
                i4 = clientWidth - 1;
                while (i4 >= blVar.f212b && i2 >= 0) {
                    blVar3 = (bl) this.f163e.get(i2);
                    while (i4 < blVar3.f212b && i2 > 0) {
                        i2--;
                        blVar3 = (bl) this.f163e.get(i2);
                    }
                    while (i4 > blVar3.f212b) {
                        f -= this.f166h.getPageWidth(i4) + f2;
                        i4--;
                    }
                    f -= blVar3.f214d + f2;
                    blVar3.f215e = f;
                    i4--;
                }
            }
        }
        int size = this.f163e.size();
        float f3 = blVar.f215e;
        i2 = blVar.f212b - 1;
        this.f177s = blVar.f212b == 0 ? blVar.f215e : -3.4028235E38f;
        this.f178t = blVar.f212b == count + -1 ? (blVar.f215e + blVar.f214d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            blVar3 = (bl) this.f163e.get(i3);
            f = f3;
            while (i2 > blVar3.f212b) {
                f -= this.f166h.getPageWidth(i2) + f2;
                i2--;
            }
            f3 = f - (blVar3.f214d + f2);
            blVar3.f215e = f3;
            if (blVar3.f212b == 0) {
                this.f177s = f3;
            }
            i2--;
        }
        f3 = (blVar.f215e + blVar.f214d) + f2;
        i2 = blVar.f212b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            blVar3 = (bl) this.f163e.get(i3);
            f = f3;
            while (i2 < blVar3.f212b) {
                f = (this.f166h.getPageWidth(i2) + f2) + f;
                i2++;
            }
            if (blVar3.f212b == count - 1) {
                this.f178t = (blVar3.f214d + f) - 1.0f;
            }
            blVar3.f215e = f;
            f3 = f + (blVar3.f214d + f2);
            i2++;
        }
        this.f158T = false;
    }

    private void m108a(MotionEvent motionEvent) {
        int b = C0110w.m535b(motionEvent);
        if (C0110w.m536b(motionEvent, b) == this.f148J) {
            b = b == 0 ? 1 : 0;
            this.f144F = C0110w.m537c(motionEvent, b);
            this.f148J = C0110w.m536b(motionEvent, b);
            if (this.f149K != null) {
                this.f149K.clear();
            }
        }
    }

    private void m109a(boolean z) {
        int scrollX;
        boolean z2 = this.ai == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f171m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f171m.getCurrX();
            int currY = this.f171m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f183y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f163e.size(); scrollX++) {
            bl blVar = (bl) this.f163e.get(scrollX);
            if (blVar.f213c) {
                blVar.f213c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            an.m367a((View) this, this.ah);
        } else {
            this.ah.run();
        }
    }

    private boolean m110a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f144F - f;
        this.f144F = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f177s;
        float f5 = ((float) clientWidth) * this.f178t;
        bl blVar = (bl) this.f163e.get(0);
        bl blVar2 = (bl) this.f163e.get(this.f163e.size() - 1);
        if (blVar.f212b != 0) {
            f4 = blVar.f215e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (blVar2.f212b != this.f166h.getCount() - 1) {
            f2 = blVar2.f215e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.f155Q.m709a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f156R.m709a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f144F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m116c((int) f4);
        return z3;
    }

    private boolean m111a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m111a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && an.m369a(view, -i);
    }

    private bl m113b(int i) {
        for (int i2 = 0; i2 < this.f163e.size(); i2++) {
            bl blVar = (bl) this.f163e.get(i2);
            if (blVar.f212b == i) {
                return blVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.view.bl m114b(android.view.View r3) {
        /*
        r2 = this;
    L_0x0000:
        r0 = r3.getParent();
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r1 = r0 instanceof android.view.View;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = (android.view.View) r0;
        r3 = r0;
        goto L_0x0000;
    L_0x0012:
        r0 = r2.m99a(r3);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(android.view.View):android.support.v4.view.bl");
    }

    private boolean m116c(int i) {
        if (this.f163e.size() == 0) {
            this.f159U = false;
            m101a(0, 0.0f);
            if (this.f159U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bl f = m121f();
        int clientWidth = getClientWidth();
        int i2 = this.f173o;
        float f2 = ((float) this.f173o) / ((float) clientWidth);
        int i3 = f.f212b;
        float f3 = ((((float) i) / ((float) clientWidth)) - f.f215e) / (f.f214d + f2);
        this.f159U = false;
        m101a(i3, f3);
        if (this.f159U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m118d() {
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList();
            } else {
                this.af.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.af.add(getChildAt(i));
            }
            Collections.sort(this.af, ag);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m119d(int r10) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 66;
        r7 = 17;
        r3 = 1;
        r4 = 0;
        r2 = r9.findFocus();
        if (r2 != r9) goto L_0x003f;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r1 = android.view.FocusFinder.getInstance();
        r1 = r1.findNextFocus(r9, r0, r10);
        if (r1 == 0) goto L_0x00b7;
    L_0x0018:
        if (r1 == r0) goto L_0x00b7;
    L_0x001a:
        if (r10 != r7) goto L_0x009b;
    L_0x001c:
        r2 = r9.f165g;
        r2 = r9.m97a(r2, r1);
        r2 = r2.left;
        r3 = r9.f165g;
        r3 = r9.m97a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x0096;
    L_0x002e:
        if (r2 < r3) goto L_0x0096;
    L_0x0030:
        r0 = r9.m123h();
    L_0x0034:
        r4 = r0;
    L_0x0035:
        if (r4 == 0) goto L_0x003e;
    L_0x0037:
        r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10);
        r9.playSoundEffect(r0);
    L_0x003e:
        return r4;
    L_0x003f:
        if (r2 == 0) goto L_0x00e3;
    L_0x0041:
        r0 = r2.getParent();
    L_0x0045:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x00e6;
    L_0x0049:
        if (r0 != r9) goto L_0x007c;
    L_0x004b:
        r0 = r3;
    L_0x004c:
        if (r0 != 0) goto L_0x00e3;
    L_0x004e:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r2.getClass();
        r0 = r0.getSimpleName();
        r5.append(r0);
        r0 = r2.getParent();
    L_0x0062:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0081;
    L_0x0066:
        r2 = " => ";
        r2 = r5.append(r2);
        r6 = r0.getClass();
        r6 = r6.getSimpleName();
        r2.append(r6);
        r0 = r0.getParent();
        goto L_0x0062;
    L_0x007c:
        r0 = r0.getParent();
        goto L_0x0045;
    L_0x0081:
        r0 = new java.lang.StringBuilder;
        r2 = "arrowScroll tried to find focus based on non-child current focused view ";
        r0.<init>(r2);
        r2 = r5.toString();
        r0 = r0.append(r2);
        r0.toString();
        r0 = r1;
        goto L_0x000e;
    L_0x0096:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x009b:
        if (r10 != r8) goto L_0x0035;
    L_0x009d:
        r2 = r9.f165g;
        r2 = r9.m97a(r2, r1);
        r2 = r2.left;
        r5 = r9.f165g;
        r5 = r9.m97a(r5, r0);
        r5 = r5.left;
        if (r0 == 0) goto L_0x00b1;
    L_0x00af:
        if (r2 <= r5) goto L_0x00c6;
    L_0x00b1:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x00b7:
        if (r10 == r7) goto L_0x00bb;
    L_0x00b9:
        if (r10 != r3) goto L_0x00c1;
    L_0x00bb:
        r0 = r9.m123h();
        goto L_0x0034;
    L_0x00c1:
        if (r10 == r8) goto L_0x00c6;
    L_0x00c3:
        r0 = 2;
        if (r10 != r0) goto L_0x0035;
    L_0x00c6:
        r0 = r9.f166h;
        if (r0 == 0) goto L_0x00e0;
    L_0x00ca:
        r0 = r9.f167i;
        r1 = r9.f166h;
        r1 = r1.getCount();
        r1 = r1 + -1;
        if (r0 >= r1) goto L_0x00e0;
    L_0x00d6:
        r0 = r9.f167i;
        r0 = r0 + 1;
        r9.setCurrentItem$2563266(r0);
        r0 = r3;
        goto L_0x0034;
    L_0x00e0:
        r0 = r4;
        goto L_0x0034;
    L_0x00e3:
        r0 = r2;
        goto L_0x000e;
    L_0x00e6:
        r0 = r4;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.d(int):boolean");
    }

    private void m120e() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private bl m121f() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f173o) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        bl blVar = null;
        while (i2 < this.f163e.size()) {
            int i3;
            bl blVar2;
            bl blVar3 = (bl) this.f163e.get(i2);
            bl blVar4;
            if (obj != null || blVar3.f212b == i + 1) {
                blVar4 = blVar3;
                i3 = i2;
                blVar2 = blVar4;
            } else {
                blVar3 = this.f164f;
                blVar3.f215e = (f2 + f3) + f;
                blVar3.f212b = i + 1;
                blVar3.f214d = this.f166h.getPageWidth(blVar3.f212b);
                blVar4 = blVar3;
                i3 = i2 - 1;
                blVar2 = blVar4;
            }
            f2 = blVar2.f215e;
            f3 = (blVar2.f214d + f2) + f;
            if (obj == null && scrollX < f2) {
                return blVar;
            }
            if (scrollX < f3 || i3 == this.f163e.size() - 1) {
                return blVar2;
            }
            f3 = f2;
            i = blVar2.f212b;
            obj = null;
            f2 = blVar2.f214d;
            blVar = blVar2;
            i2 = i3 + 1;
        }
        return blVar;
    }

    private void m122g() {
        this.f139A = false;
        this.f140B = false;
        if (this.f149K != null) {
            this.f149K.recycle();
            this.f149K = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean m123h() {
        if (this.f167i <= 0) {
            return false;
        }
        setCurrentItem$2563266(this.f167i - 1);
        return true;
    }

    private void setCurrentItem$2563266(int i) {
        this.f183y = false;
        m104a(i, true, false);
    }

    private void setScrollState(int i) {
        if (this.ai != i) {
            this.ai = i;
            if (this.ac != null) {
                Object obj = i != 0 ? 1 : null;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    an.m364a(getChildAt(i2), obj != null ? 2 : 0, null);
                }
            }
            if (this.f161W != null) {
                this.f161W.m345a(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f182x != z) {
            this.f182x = z;
        }
    }

    final bo m124a(bo boVar) {
        bo boVar2 = this.aa;
        this.aa = boVar;
        return boVar2;
    }

    final void m125a() {
        int max;
        int count = this.f166h.getCount();
        this.f162b = count;
        boolean z = this.f163e.size() < (this.f184z * 2) + 1 && this.f163e.size() < count;
        boolean z2 = false;
        int i = this.f167i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f163e.size()) {
            int i3;
            boolean z4;
            boolean z5;
            bl blVar = (bl) this.f163e.get(i2);
            int itemPosition = this.f166h.getItemPosition(blVar.f211a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f163e.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f166h.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f166h.destroyItem((ViewGroup) this, blVar.f212b, blVar.f211a);
                    if (this.f167i == blVar.f212b) {
                        i3 = i2;
                        z4 = z2;
                        max = Math.max(0, Math.min(this.f167i, count - 1));
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        max = i;
                        z5 = true;
                    }
                } else if (blVar.f212b != itemPosition) {
                    if (blVar.f212b == this.f167i) {
                        i = itemPosition;
                    }
                    blVar.f212b = itemPosition;
                    i3 = i2;
                    z4 = z2;
                    max = i;
                    z5 = true;
                }
                z3 = z5;
                i = max;
                z2 = z4;
                i2 = i3 + 1;
            }
            i3 = i2;
            z4 = z2;
            max = i;
            z5 = z3;
            z3 = z5;
            i = max;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f166h.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f163e, f137c);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f127a) {
                    layoutParams.f129c = 0.0f;
                }
            }
            m104a(i, false, true);
            requestLayout();
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    bl a = m99a(childAt);
                    if (a != null && a.f212b == this.f167i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == Menu.CATEGORY_ALTERNATIVE && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bl a = m99a(childAt);
                if (a != null && a.f212b == this.f167i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f127a |= view instanceof bk;
        if (!this.f181w) {
            super.addView(view, i, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f127a) {
            layoutParams2.f130d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final void m126b() {
        m100a(this.f167i);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f166h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f177s)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f178t));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f171m.isFinished() || !this.f171m.computeScrollOffset()) {
            m109a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f171m.getCurrX();
        int currY = this.f171m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m116c(currX)) {
                this.f171m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        an.m372c(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r1 = 1;
        r0 = 0;
        r2 = super.dispatchKeyEvent(r5);
        if (r2 != 0) goto L_0x0018;
    L_0x0008:
        r2 = r5.getAction();
        if (r2 != 0) goto L_0x0015;
    L_0x000e:
        r2 = r5.getKeyCode();
        switch(r2) {
            case 21: goto L_0x001a;
            case 22: goto L_0x0021;
            case 61: goto L_0x0028;
            default: goto L_0x0015;
        };
    L_0x0015:
        r2 = r0;
    L_0x0016:
        if (r2 == 0) goto L_0x0019;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        return r0;
    L_0x001a:
        r2 = 17;
        r2 = r4.m119d(r2);
        goto L_0x0016;
    L_0x0021:
        r2 = 66;
        r2 = r4.m119d(r2);
        goto L_0x0016;
    L_0x0028:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0015;
    L_0x002e:
        r2 = android.support.v4.view.C0105r.m519b(r5);
        if (r2 == 0) goto L_0x003a;
    L_0x0034:
        r2 = 2;
        r2 = r4.m119d(r2);
        goto L_0x0016;
    L_0x003a:
        r2 = android.support.v4.view.C0105r.m518a(r5);
        if (r2 == 0) goto L_0x0015;
    L_0x0040:
        r2 = r4.m119d(r1);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == FragmentTransaction.TRANSIT_ENTER_MASK) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bl a = m99a(childAt);
                if (a != null && a.f212b == this.f167i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int b = an.m370b(this);
        if (b == 0 || (b == 1 && this.f166h != null && this.f166h.getCount() > 1)) {
            int width;
            if (!this.f155Q.m708a()) {
                b = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.f177s * ((float) width));
                this.f155Q.m707a(i, width);
                i = this.f155Q.m710a(canvas) | 0;
                canvas.restoreToCount(b);
            }
            if (!this.f156R.m708a()) {
                b = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f178t + 1.0f)) * ((float) width));
                this.f156R.m707a(height, width);
                i |= this.f156R.m710a(canvas);
                canvas.restoreToCount(b);
            }
        } else {
            this.f155Q.m711b();
            this.f156R.m711b();
        }
        if (i != 0) {
            an.m372c(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f174p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public aa getAdapter() {
        return this.f166h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ae == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.af.get(i2)).getLayoutParams()).f132f;
    }

    public int getCurrentItem() {
        return this.f167i;
    }

    public int getOffscreenPageLimit() {
        return this.f184z;
    }

    public int getPageMargin() {
        return this.f173o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f157S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f173o > 0 && this.f174p != null && this.f163e.size() > 0 && this.f166h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f173o) / ((float) width);
            bl blVar = (bl) this.f163e.get(0);
            float f2 = blVar.f215e;
            int size = this.f163e.size();
            int i = blVar.f212b;
            int i2 = ((bl) this.f163e.get(size - 1)).f212b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > blVar.f212b && i3 < size) {
                    i3++;
                    blVar = (bl) this.f163e.get(i3);
                }
                if (i4 == blVar.f212b) {
                    f3 = (blVar.f215e + blVar.f214d) * ((float) width);
                    f2 = (blVar.f215e + blVar.f214d) + f;
                } else {
                    float pageWidth = this.f166h.getPageWidth(i4);
                    f3 = (f2 + pageWidth) * ((float) width);
                    f2 += pageWidth + f;
                }
                if (((float) this.f173o) + f3 > ((float) scrollX)) {
                    this.f174p.setBounds((int) f3, this.f175q, (int) ((((float) this.f173o) + f3) + 0.5f), this.f176r);
                    this.f174p.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f139A = false;
            this.f140B = false;
            this.f148J = -1;
            if (this.f149K == null) {
                return false;
            }
            this.f149K.recycle();
            this.f149K = null;
            return false;
        }
        if (action != 0) {
            if (this.f139A) {
                return true;
            }
            if (this.f140B) {
                return false;
            }
        }
        float x;
        switch (action) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                x = motionEvent.getX();
                this.f146H = x;
                this.f144F = x;
                x = motionEvent.getY();
                this.f147I = x;
                this.f145G = x;
                this.f148J = C0110w.m536b(motionEvent, 0);
                this.f140B = false;
                this.f171m.computeScrollOffset();
                if (this.ai == 2 && Math.abs(this.f171m.getFinalX() - this.f171m.getCurrX()) > this.f153O) {
                    this.f171m.abortAnimation();
                    this.f183y = false;
                    m126b();
                    this.f139A = true;
                    m120e();
                    setScrollState(1);
                    break;
                }
                m109a(false);
                this.f139A = false;
                break;
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                action = this.f148J;
                if (action != -1) {
                    action = C0110w.m534a(motionEvent, action);
                    float c = C0110w.m537c(motionEvent, action);
                    float f = c - this.f144F;
                    float abs = Math.abs(f);
                    float d = C0110w.m539d(motionEvent, action);
                    float abs2 = Math.abs(d - this.f147I);
                    if (f != 0.0f) {
                        x = this.f144F;
                        boolean z = (x < ((float) this.f142D) && f > 0.0f) || (x > ((float) (getWidth() - this.f142D)) && f < 0.0f);
                        if (!z && m111a(this, false, (int) f, (int) c, (int) d)) {
                            this.f144F = c;
                            this.f145G = d;
                            this.f140B = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f143E) && 0.5f * abs > abs2) {
                        this.f139A = true;
                        m120e();
                        setScrollState(1);
                        this.f144F = f > 0.0f ? this.f146H + ((float) this.f143E) : this.f146H - ((float) this.f143E);
                        this.f145G = d;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.f143E)) {
                        this.f140B = true;
                    }
                    if (this.f139A && m110a(c)) {
                        an.m372c(this);
                        break;
                    }
                }
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                m108a(motionEvent);
                break;
        }
        if (this.f149K == null) {
            this.f149K = VelocityTracker.obtain();
        }
        this.f149K.addMovement(motionEvent);
        return this.f139A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            LayoutParams layoutParams;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f127a) {
                    int i9 = layoutParams.f128b & 112;
                    switch (layoutParams.f128b & 7) {
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case C0772e.MapAttrs_ambientEnabled /*16*/:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case hp.SherlockTheme_textAppearanceListItemSmall /*48*/:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams.f127a) {
                    bl a = m99a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f215e * ((float) max))) + paddingLeft;
                        if (layoutParams.f130d) {
                            layoutParams.f130d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f129c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f175q = paddingTop;
        this.f176r = i6 - paddingBottom;
        this.f160V = i7;
        if (this.f157S) {
            m103a(this.f167i, false, 0, false);
        }
        this.f157S = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f142D = Math.min(measuredWidth / 10, this.f141C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams;
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f127a) {
                    int i6 = layoutParams.f128b & 7;
                    int i7 = layoutParams.f128b & 112;
                    i3 = GridLayout.UNDEFINED;
                    i5 = GridLayout.UNDEFINED;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (layoutParams.width != -2) {
                        i7 = 1073741824;
                        i3 = layoutParams.width != -1 ? layoutParams.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (layoutParams.height != -2) {
                        i5 = 1073741824;
                        if (layoutParams.height != -1) {
                            measuredWidth = layoutParams.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f179u = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f180v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f181w = true;
        m126b();
        this.f181w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams == null || !layoutParams.f127a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f129c * ((float) paddingLeft)), 1073741824), this.f180v);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                bl a = m99a(childAt);
                if (a != null && a.f212b == this.f167i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f166h != null) {
                this.f166h.restoreState(savedState.f134b, savedState.f135c);
                m104a(savedState.f133a, false, true);
                return;
            }
            this.f168j = savedState.f133a;
            this.f169k = savedState.f134b;
            this.f170l = savedState.f135c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f133a = this.f167i;
        if (this.f166h != null) {
            savedState.f134b = this.f166h.saveState();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m102a(i, i3, this.f173o, this.f173o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f154P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f166h == null || this.f166h.getCount() == 0) {
            return false;
        }
        if (this.f149K == null) {
            this.f149K = VelocityTracker.obtain();
        }
        this.f149K.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & 255) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                this.f171m.abortAnimation();
                this.f183y = false;
                m126b();
                x = motionEvent.getX();
                this.f146H = x;
                this.f144F = x;
                x = motionEvent.getY();
                this.f147I = x;
                this.f145G = x;
                this.f148J = C0110w.m536b(motionEvent, 0);
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (this.f139A) {
                    VelocityTracker velocityTracker = this.f149K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f151M);
                    int a = (int) aj.m354a(velocityTracker, this.f148J);
                    this.f183y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bl f2 = m121f();
                    i = f2.f212b;
                    f = ((((float) scrollX) / ((float) clientWidth)) - f2.f215e) / f2.f214d;
                    if (Math.abs((int) (C0110w.m537c(motionEvent, C0110w.m534a(motionEvent, this.f148J)) - this.f146H)) <= this.f152N || Math.abs(a) <= this.f150L) {
                        scrollX = (int) ((((float) i) + f) + (i >= this.f167i ? 0.4f : 0.6f));
                    } else {
                        if (a <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.f163e.size() > 0) {
                        scrollX = Math.max(((bl) this.f163e.get(0)).f212b, Math.min(scrollX, ((bl) this.f163e.get(this.f163e.size() - 1)).f212b));
                    }
                    m105a(scrollX, true, true, a);
                    this.f148J = -1;
                    m122g();
                    z = this.f155Q.m712c() | this.f156R.m712c();
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                if (!this.f139A) {
                    i = C0110w.m534a(motionEvent, this.f148J);
                    float c = C0110w.m537c(motionEvent, i);
                    f = Math.abs(c - this.f144F);
                    float d = C0110w.m539d(motionEvent, i);
                    x = Math.abs(d - this.f145G);
                    if (f > ((float) this.f143E) && f > x) {
                        this.f139A = true;
                        m120e();
                        this.f144F = c - this.f146H > 0.0f ? this.f146H + ((float) this.f143E) : this.f146H - ((float) this.f143E);
                        this.f145G = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f139A) {
                    z = m110a(C0110w.m537c(motionEvent, C0110w.m534a(motionEvent, this.f148J))) | 0;
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                if (this.f139A) {
                    m103a(this.f167i, true, 0, false);
                    this.f148J = -1;
                    m122g();
                    z = this.f155Q.m712c() | this.f156R.m712c();
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                i = C0110w.m535b(motionEvent);
                this.f144F = C0110w.m537c(motionEvent, i);
                this.f148J = C0110w.m536b(motionEvent, i);
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                m108a(motionEvent);
                this.f144F = C0110w.m537c(motionEvent, C0110w.m534a(motionEvent, this.f148J));
                break;
        }
        if (z) {
            an.m372c(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f181w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(aa aaVar) {
        if (this.f166h != null) {
            int i;
            this.f166h.unregisterDataSetObserver(this.f172n);
            this.f166h.startUpdate((ViewGroup) this);
            for (i = 0; i < this.f163e.size(); i++) {
                bl blVar = (bl) this.f163e.get(i);
                this.f166h.destroyItem((ViewGroup) this, blVar.f212b, blVar.f211a);
            }
            this.f166h.finishUpdate((ViewGroup) this);
            this.f163e.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((LayoutParams) getChildAt(i).getLayoutParams()).f127a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.f167i = 0;
            scrollTo(0, 0);
        }
        aa aaVar2 = this.f166h;
        this.f166h = aaVar;
        this.f162b = 0;
        if (this.f166h != null) {
            if (this.f172n == null) {
                this.f172n = new bq();
            }
            this.f166h.registerDataSetObserver(this.f172n);
            this.f183y = false;
            boolean z = this.f157S;
            this.f157S = true;
            this.f162b = this.f166h.getCount();
            if (this.f168j >= 0) {
                this.f166h.restoreState(this.f169k, this.f170l);
                m104a(this.f168j, false, true);
                this.f168j = -1;
                this.f169k = null;
                this.f170l = null;
            } else if (z) {
                requestLayout();
            } else {
                m126b();
            }
        }
        if (this.ab != null && aaVar2 != aaVar) {
            this.ab.m343a(aaVar2, aaVar);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ad == null) {
                try {
                    this.ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                }
            }
            try {
                this.ad.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e2) {
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f183y = false;
        m104a(i, !this.f157S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f184z) {
            this.f184z = i;
            m126b();
        }
    }

    void setOnAdapterChangeListener(bn bnVar) {
        this.ab = bnVar;
    }

    public void setOnPageChangeListener(bo boVar) {
        this.f161W = boVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f173o;
        this.f173o = i;
        int width = getWidth();
        m102a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f174p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f174p;
    }
}
