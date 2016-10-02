package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.C0101n;
import android.support.v4.view.C0105r;
import android.support.v4.view.an;
import android.support.v4.view.bb;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.C0772e;

public class DrawerLayout extends ViewGroup {
    private static final int[] f240a;
    private final C0123j f241b;
    private int f242c;
    private int f243d;
    private float f244e;
    private Paint f245f;
    private final aq f246g;
    private final aq f247h;
    private final C0125m f248i;
    private final C0125m f249j;
    private int f250k;
    private boolean f251l;
    private boolean f252m;
    private int f253n;
    private int f254o;
    private boolean f255p;
    private boolean f256q;
    private C0005k f257r;
    private float f258s;
    private float f259t;
    private Drawable f260u;
    private Drawable f261v;
    private CharSequence f262w;
    private CharSequence f263x;

    public class LayoutParams extends MarginLayoutParams {
        public int f233a;
        float f234b;
        boolean f235c;
        boolean f236d;

        public LayoutParams() {
            super(-1, -1);
            this.f233a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f233a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f240a);
            this.f233a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f233a = 0;
            this.f233a = layoutParams.f233a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f233a = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f233a = 0;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f237a;
        int f238b;
        int f239c;

        static {
            CREATOR = new C0124l();
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f237a = 0;
            this.f238b = 0;
            this.f239c = 0;
            this.f237a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f237a = 0;
            this.f238b = 0;
            this.f239c = 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f237a);
        }
    }

    static {
        f240a = new int[]{16842931};
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f241b = new C0123j(this);
        this.f243d = -1728053248;
        this.f245f = new Paint();
        this.f252m = true;
        float f = getResources().getDisplayMetrics().density;
        this.f242c = (int) ((64.0f * f) + 0.5f);
        f *= 400.0f;
        this.f248i = new C0125m(this, 3);
        this.f249j = new C0125m(this, 5);
        this.f246g = aq.m660a((ViewGroup) this, 1.0f, this.f248i);
        this.f246g.m675a(1);
        this.f246g.m674a(f);
        this.f248i.f378b = this.f246g;
        this.f247h = aq.m660a((ViewGroup) this, 1.0f, this.f249j);
        this.f247h.m675a(2);
        this.f247h.m674a(f);
        this.f249j.f378b = this.f247h;
        setFocusableInTouchMode(true);
        an.m371b(this, 1);
        an.m366a((View) this, new C0122i(this));
        bb.m465a(this);
    }

    private void m561a(int i, int i2) {
        int a = C0101n.m514a(i2, an.m375f(this));
        if (a == 3) {
            this.f253n = i;
        } else if (a == 5) {
            this.f254o = i;
        }
        if (i != 0) {
            (a == 3 ? this.f246g : this.f247h).m686e();
        }
        View b;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                b = m578b(a);
                if (b != null) {
                    m584e(b);
                }
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                b = m578b(a);
                if (b != null) {
                    m570h(b);
                }
            default:
        }
    }

    private void m562a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m565d(childAt) && (!z || layoutParams.f235c)) {
                i = m577a(childAt, 3) ? i | this.f246g.m679a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.f247h.m679a(childAt, getWidth(), childAt.getTop());
                layoutParams.f235c = false;
            }
        }
        this.f248i.m695a();
        this.f249j.m695a();
        if (i != 0) {
            invalidate();
        }
    }

    static float m563b(View view) {
        return ((LayoutParams) view.getLayoutParams()).f234b;
    }

    private static String m564c(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    static boolean m565d(View view) {
        return (C0101n.m514a(((LayoutParams) view.getLayoutParams()).f233a, an.m375f(view)) & 7) != 0;
    }

    static /* synthetic */ boolean m566f(View view) {
        return (an.m373d(view) == 4 || an.m373d(view) == 2) ? false : true;
    }

    private View m568g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m565d(childAt) && m571i(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean m569g(View view) {
        return ((LayoutParams) view.getLayoutParams()).f233a == 0;
    }

    private void m570h(View view) {
        if (m565d(view)) {
            if (this.f252m) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f234b = 1.0f;
                layoutParams.f236d = true;
            } else if (m577a(view, 3)) {
                this.f246g.m679a(view, 0, view.getTop());
            } else {
                this.f247h.m679a(view, getWidth() - view.getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    private static boolean m571i(View view) {
        if (m565d(view)) {
            return ((LayoutParams) view.getLayoutParams()).f234b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public final int m572a(View view) {
        int c = m580c(view);
        return c == 3 ? this.f253n : c == 5 ? this.f254o : 0;
    }

    public final CharSequence m573a(int i) {
        int a = C0101n.m514a(i, an.m375f(this));
        return a == 3 ? this.f262w : a == 5 ? this.f263x : null;
    }

    public final void m574a() {
        View b = m578b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m564c(8388611));
        }
        m570h(b);
    }

    final void m575a(int i, View view) {
        int a = this.f246g.m673a();
        int a2 = this.f247h.m673a();
        a = (a == 1 || a2 == 1) ? 1 : (a == 2 || a2 == 2) ? 2 : 0;
        if (view != null && i == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            View childAt;
            if (layoutParams.f234b == 0.0f) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.f236d) {
                    layoutParams.f236d = false;
                    if (this.f257r != null) {
                        this.f257r.onDrawerClosed(view);
                    }
                    childAt = getChildAt(0);
                    if (childAt != null) {
                        an.m371b(childAt, 1);
                    }
                    an.m371b(view, 4);
                    if (hasWindowFocus()) {
                        childAt = getRootView();
                        if (childAt != null) {
                            childAt.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (layoutParams.f234b == 1.0f) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.f236d) {
                    layoutParams.f236d = true;
                    if (this.f257r != null) {
                        this.f257r.onDrawerOpened(view);
                    }
                    childAt = getChildAt(0);
                    if (childAt != null) {
                        an.m371b(childAt, 4);
                    }
                    an.m371b(view, 1);
                    sendAccessibilityEvent(32);
                    view.requestFocus();
                }
            }
        }
        if (a != this.f250k) {
            this.f250k = a;
            if (this.f257r != null) {
                this.f257r.onDrawerStateChanged(a);
            }
        }
    }

    final void m576a(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f234b) {
            layoutParams.f234b = f;
            if (this.f257r != null) {
                this.f257r.onDrawerSlide(view, f);
            }
        }
    }

    final boolean m577a(View view, int i) {
        return (m580c(view) & i) == i;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (i > 0 || (i < 0 && getChildCount() > 0)) {
            an.m371b(view, 4);
            an.m366a(view, this.f241b);
        } else {
            an.m371b(view, 1);
        }
        super.addView(view, i, layoutParams);
    }

    final View m578b(int i) {
        int a = C0101n.m514a(i, an.m375f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m580c(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public final void m579b() {
        View b = m578b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m564c(8388611));
        }
        m584e(b);
    }

    final int m580c(View view) {
        return C0101n.m514a(((LayoutParams) view.getLayoutParams()).f233a, an.m375f(this));
    }

    public final boolean m581c() {
        View b = m578b(8388611);
        if (b == null) {
            return false;
        }
        if (m565d(b)) {
            return ((LayoutParams) b.getLayoutParams()).f236d;
        }
        throw new IllegalArgumentException("View " + b + " is not a drawer");
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f234b);
        }
        this.f244e = f;
        if ((this.f246g.m688g() | this.f247h.m688g()) != 0) {
            an.m372c(this);
        }
    }

    public final boolean m582d() {
        View b = m578b(8388611);
        return b != null ? m571i(b) : false;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int right;
        int height = getHeight();
        boolean g = m569g(view);
        int i = 0;
        int width = getWidth();
        int save = canvas.save();
        if (g) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    Object obj = background != null ? background.getOpacity() == -1 ? 1 : null : null;
                    if (obj != null && m565d(childAt) && childAt.getHeight() >= height) {
                        if (m577a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right <= i) {
                                right = i;
                            }
                            i = right;
                            right = width;
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                            }
                        }
                        i2++;
                        width = right;
                    }
                }
                right = width;
                i2++;
                width = right;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        right = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f244e > 0.0f && g) {
            this.f245f.setColor((((int) (((float) ((this.f243d & -16777216) >>> 24)) * this.f244e)) << 24) | (this.f243d & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) right, (float) getHeight(), this.f245f);
        } else if (this.f260u != null && m577a(view, 3)) {
            right = this.f260u.getIntrinsicWidth();
            i = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i) / ((float) this.f246g.m680b()), 1.0f));
            this.f260u.setBounds(i, view.getTop(), right + i, view.getBottom());
            this.f260u.setAlpha((int) (255.0f * r2));
            this.f260u.draw(canvas);
        } else if (this.f261v != null && m577a(view, 5)) {
            right = this.f261v.getIntrinsicWidth();
            i = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i)) / ((float) this.f247h.m680b()), 1.0f));
            this.f261v.setBounds(i - right, view.getTop(), i, view.getBottom());
            this.f261v.setAlpha((int) (255.0f * r2));
            this.f261v.draw(canvas);
        }
        return drawChild;
    }

    final void m583e() {
        int i = 0;
        if (!this.f256q) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.f256q = true;
        }
    }

    public final void m584e(View view) {
        if (m565d(view)) {
            if (this.f252m) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f234b = 0.0f;
                layoutParams.f236d = false;
            } else if (m577a(view, 3)) {
                this.f246g.m679a(view, -view.getWidth(), view.getTop());
            } else {
                this.f247h.m679a(view, getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f252m = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f252m = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.view.C0110w.m533a(r8);
        r3 = r7.f246g;
        r3 = r3.m678a(r8);
        r4 = r7.f247h;
        r4 = r4.m678a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0039;
            case 1: goto L_0x0074;
            case 2: goto L_0x0060;
            case 3: goto L_0x0074;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0037;
    L_0x0019:
        if (r0 != 0) goto L_0x0037;
    L_0x001b:
        r4 = r7.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x0080;
    L_0x0022:
        r0 = r7.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r0 = r0.f235c;
        if (r0 == 0) goto L_0x007c;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r7.f256q;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.f258s = r0;
        r7.f259t = r4;
        r5 = r7.f244e;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0082;
    L_0x004c:
        r5 = r7.f246g;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.m681b(r0, r4);
        r0 = m569g(r0);
        if (r0 == 0) goto L_0x0082;
    L_0x005a:
        r0 = r1;
    L_0x005b:
        r7.f255p = r2;
        r7.f256q = r2;
        goto L_0x0017;
    L_0x0060:
        r0 = r7.f246g;
        r0 = r0.m689h();
        if (r0 == 0) goto L_0x0016;
    L_0x0068:
        r0 = r7.f248i;
        r0.m695a();
        r0 = r7.f249j;
        r0.m695a();
        r0 = r2;
        goto L_0x0017;
    L_0x0074:
        r7.m562a(r1);
        r7.f255p = r2;
        r7.f256q = r2;
        goto L_0x0016;
    L_0x007c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x0080:
        r0 = r2;
        goto L_0x0031;
    L_0x0082:
        r0 = r2;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m568g() != null) {
                C0105r.m520c(keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g = m568g();
        if (g != null && m572a(g) == 0) {
            m562a(false);
        }
        return g != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f251l = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m569g(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m577a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * layoutParams.f234b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * layoutParams.f234b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != layoutParams.f234b ? 1 : null;
                    int i8;
                    switch (layoutParams.f233a & 112) {
                        case C0772e.MapAttrs_ambientEnabled /*16*/:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < layoutParams.topMargin) {
                                i8 = layoutParams.topMargin;
                            } else if (i8 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i8 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (obj != null) {
                        m576a(childAt, f);
                    }
                    int i10 = layoutParams.f234b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f251l = false;
        this.f252m = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.getMode(r11);
        r4 = android.view.View.MeasureSpec.getMode(r12);
        r2 = android.view.View.MeasureSpec.getSize(r11);
        r0 = android.view.View.MeasureSpec.getSize(r12);
        if (r3 != r9) goto L_0x001a;
    L_0x0018:
        if (r4 == r9) goto L_0x00e4;
    L_0x001a:
        r5 = r10.isInEditMode();
        if (r5 == 0) goto L_0x006a;
    L_0x0020:
        if (r3 == r6) goto L_0x0025;
    L_0x0022:
        if (r3 != 0) goto L_0x0025;
    L_0x0024:
        r2 = r1;
    L_0x0025:
        if (r4 == r6) goto L_0x00e4;
    L_0x0027:
        if (r4 != 0) goto L_0x00e4;
    L_0x0029:
        r10.setMeasuredDimension(r2, r1);
        r4 = r10.getChildCount();
        r0 = 0;
        r3 = r0;
    L_0x0032:
        if (r3 >= r4) goto L_0x00e3;
    L_0x0034:
        r5 = r10.getChildAt(r3);
        r0 = r5.getVisibility();
        r6 = 8;
        if (r0 == r6) goto L_0x0066;
    L_0x0040:
        r0 = r5.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r6 = m569g(r5);
        if (r6 == 0) goto L_0x0072;
    L_0x004c:
        r6 = r0.leftMargin;
        r6 = r2 - r6;
        r7 = r0.rightMargin;
        r6 = r6 - r7;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9);
        r7 = r0.topMargin;
        r7 = r1 - r7;
        r0 = r0.bottomMargin;
        r0 = r7 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
        r5.measure(r6, r0);
    L_0x0066:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0032;
    L_0x006a:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY.";
        r0.<init>(r1);
        throw r0;
    L_0x0072:
        r6 = m565d(r5);
        if (r6 == 0) goto L_0x00be;
    L_0x0078:
        r6 = r10.m580c(r5);
        r6 = r6 & 7;
        r7 = r6 & 0;
        if (r7 == 0) goto L_0x00a1;
    L_0x0082:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child drawer has absolute gravity ";
        r1.<init>(r2);
        r2 = m564c(r6);
        r1 = r1.append(r2);
        r2 = " but this DrawerLayout already has a drawer view along that edge";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00a1:
        r6 = r10.f242c;
        r7 = r0.leftMargin;
        r6 = r6 + r7;
        r7 = r0.rightMargin;
        r6 = r6 + r7;
        r7 = r0.width;
        r6 = getChildMeasureSpec(r11, r6, r7);
        r7 = r0.topMargin;
        r8 = r0.bottomMargin;
        r7 = r7 + r8;
        r0 = r0.height;
        r0 = getChildMeasureSpec(r12, r7, r0);
        r5.measure(r6, r0);
        goto L_0x0066;
    L_0x00be:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child ";
        r1.<init>(r2);
        r1 = r1.append(r5);
        r2 = " at index ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e3:
        return;
    L_0x00e4:
        r1 = r0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f237a != 0) {
            View b = m578b(savedState.f237a);
            if (b != null) {
                m570h(b);
            }
        }
        m561a(savedState.f238b, 3);
        m561a(savedState.f239c, 5);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m565d(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f236d) {
                    savedState.f237a = layoutParams.f233a;
                    break;
                }
            }
        }
        savedState.f238b = this.f253n;
        savedState.f239c = this.f254o;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f246g.m683b(motionEvent);
        this.f247h.m683b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f258s = x;
                this.f259t = y;
                this.f255p = false;
                this.f256q = false;
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View b = this.f246g.m681b((int) x, (int) y);
                if (b != null && m569g(b)) {
                    x -= this.f258s;
                    y -= this.f259t;
                    int d = this.f246g.m685d();
                    if ((x * x) + (y * y) < ((float) (d * d))) {
                        View view;
                        int childCount = getChildCount();
                        for (d = 0; d < childCount; d++) {
                            View childAt = getChildAt(d);
                            if (((LayoutParams) childAt.getLayoutParams()).f236d) {
                                view = childAt;
                                if (view != null) {
                                    z = m572a(view) != 2;
                                    m562a(z);
                                    this.f255p = false;
                                    break;
                                }
                            }
                        }
                        view = null;
                        if (view != null) {
                            if (m572a(view) != 2) {
                            }
                            m562a(z);
                            this.f255p = false;
                        }
                    }
                }
                z = true;
                m562a(z);
                this.f255p = false;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                m562a(true);
                this.f255p = false;
                this.f256q = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f255p = z;
        if (z) {
            m562a(true);
        }
    }

    public void requestLayout() {
        if (!this.f251l) {
            super.requestLayout();
        }
    }

    public void setDrawerListener(C0005k c0005k) {
        this.f257r = c0005k;
    }

    public void setDrawerLockMode(int i) {
        m561a(i, 3);
        m561a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f243d = i;
        invalidate();
    }
}
