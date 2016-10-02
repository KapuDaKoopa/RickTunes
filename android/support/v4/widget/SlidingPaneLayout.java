package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.an;
import android.support.v7.widget.GridLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.C0772e;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final ad f270a;
    private int f271b;
    private int f272c;
    private Drawable f273d;
    private Drawable f274e;
    private final int f275f;
    private boolean f276g;
    private View f277h;
    private float f278i;
    private float f279j;
    private int f280k;
    private boolean f281l;
    private int f282m;
    private float f283n;
    private float f284o;
    private ab f285p;
    private final aq f286q;
    private boolean f287r;
    private boolean f288s;
    private final Rect f289t;
    private final ArrayList f290u;

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] f264e;
        public float f265a;
        boolean f266b;
        boolean f267c;
        Paint f268d;

        static {
            f264e = new int[]{16843137};
        }

        public LayoutParams() {
            super(-1, -1);
            this.f265a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f265a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f264e);
            this.f265a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f265a = 0.0f;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f265a = 0.0f;
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        boolean f269a;

        static {
            CREATOR = new ac();
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f269a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f269a ? 1 : 0);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f270a = new ag();
        } else if (i >= 16) {
            f270a = new af();
        } else {
            f270a = new ae();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f271b = -858993460;
        this.f288s = true;
        this.f289t = new Rect();
        this.f290u = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f275f = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        an.m366a((View) this, new C0137y(this));
        an.m371b(this, 1);
        this.f286q = aq.m660a((ViewGroup) this, 0.5f, new aa());
        this.f286q.m674a(f * 400.0f);
    }

    static /* synthetic */ void m585a(SlidingPaneLayout slidingPaneLayout, int i) {
        if (slidingPaneLayout.f277h == null) {
            slidingPaneLayout.f278i = 0.0f;
            return;
        }
        boolean e = slidingPaneLayout.m597e();
        LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f277h.getLayoutParams();
        int width = slidingPaneLayout.f277h.getWidth();
        if (e) {
            i = (slidingPaneLayout.getWidth() - i) - width;
        }
        slidingPaneLayout.f278i = ((float) (i - ((e ? layoutParams.rightMargin : layoutParams.leftMargin) + (e ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft())))) / ((float) slidingPaneLayout.f280k);
        if (slidingPaneLayout.f282m != 0) {
            slidingPaneLayout.m592b(slidingPaneLayout.f278i);
        }
        if (layoutParams.f267c) {
            slidingPaneLayout.m587a(slidingPaneLayout.f277h, slidingPaneLayout.f278i, slidingPaneLayout.f271b);
        }
        View view = slidingPaneLayout.f277h;
        if (slidingPaneLayout.f285p != null) {
            ab abVar = slidingPaneLayout.f285p;
            float f = slidingPaneLayout.f278i;
        }
    }

    private void m587a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.f268d == null) {
                layoutParams.f268d = new Paint();
            }
            layoutParams.f268d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (an.m374e(view) != 2) {
                an.m364a(view, 2, layoutParams.f268d);
            }
            m594c(view);
        } else if (an.m374e(view) != 0) {
            if (layoutParams.f268d != null) {
                layoutParams.f268d.setColorFilter(null);
            }
            Runnable c0138z = new C0138z(this, view);
            this.f290u.add(c0138z);
            an.m367a((View) this, c0138z);
        }
    }

    private boolean m588a(float f) {
        if (!this.f276g) {
            return false;
        }
        int width;
        LayoutParams layoutParams = (LayoutParams) this.f277h.getLayoutParams();
        if (m597e()) {
            width = (int) (((float) getWidth()) - ((((float) (layoutParams.rightMargin + getPaddingRight())) + (((float) this.f280k) * f)) + ((float) this.f277h.getWidth())));
        } else {
            width = (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.f280k) * f));
        }
        if (!this.f286q.m679a(this.f277h, width, this.f277h.getTop())) {
            return false;
        }
        m605c();
        an.m372c(this);
        return true;
    }

    private void m592b(float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean e = m597e();
        LayoutParams layoutParams = (LayoutParams) this.f277h.getLayoutParams();
        if (layoutParams.f267c) {
            if ((e ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                obj = 1;
                childCount = getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    if (childAt != this.f277h) {
                        i2 = (int) ((1.0f - this.f279j) * ((float) this.f282m));
                        this.f279j = f;
                        i2 -= (int) ((1.0f - f) * ((float) this.f282m));
                        if (e) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m587a(childAt, e ? this.f279j - 1.0f : 1.0f - this.f279j, this.f272c);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt != this.f277h) {
                i2 = (int) ((1.0f - this.f279j) * ((float) this.f282m));
                this.f279j = f;
                i2 -= (int) ((1.0f - f) * ((float) this.f282m));
                if (e) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (e) {
                    }
                    m587a(childAt, e ? this.f279j - 1.0f : 1.0f - this.f279j, this.f272c);
                }
            }
        }
    }

    private void m594c(View view) {
        f270a.m647a(this, view);
    }

    private boolean m596d() {
        if (!this.f288s && !m588a(0.0f)) {
            return false;
        }
        this.f287r = false;
        return true;
    }

    private boolean m597e() {
        return an.m375f(this) == 1;
    }

    final void m601a() {
        if (this.f285p != null) {
            ab abVar = this.f285p;
        }
        sendAccessibilityEvent(32);
    }

    final void m602a(View view) {
        int left;
        int right;
        int top;
        int bottom;
        int childCount;
        int i;
        View childAt;
        boolean e = m597e();
        int width = e ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = e ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null) {
            Object obj;
            if (an.m377h(view)) {
                obj = 1;
            } else {
                if (VERSION.SDK_INT < 18) {
                    Drawable background = view.getBackground();
                    if (background != null) {
                        obj = background.getOpacity() == -1 ? 1 : null;
                    }
                }
                obj = null;
            }
            if (obj != null) {
                left = view.getLeft();
                right = view.getRight();
                top = view.getTop();
                bottom = view.getBottom();
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    if (childAt != view) {
                        int i2 = (Math.max(e ? paddingLeft : width, childAt.getLeft()) >= left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(e ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4;
                        childAt.setVisibility(i2);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
        bottom = 0;
        top = 0;
        right = 0;
        left = 0;
        childCount = getChildCount();
        i = 0;
        while (i < childCount) {
            childAt = getChildAt(i);
            if (childAt != view) {
                if (e) {
                }
                if (e) {
                }
                if (Math.max(e ? paddingLeft : width, childAt.getLeft()) >= left) {
                }
                childAt.setVisibility(i2);
                i++;
            } else {
                return;
            }
        }
    }

    final void m603b() {
        if (this.f285p != null) {
            ab abVar = this.f285p;
        }
        sendAccessibilityEvent(32);
    }

    final boolean m604b(View view) {
        if (view == null) {
            return false;
        }
        return this.f276g && ((LayoutParams) view.getLayoutParams()).f267c && this.f278i > 0.0f;
    }

    final void m605c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f286q.m688g()) {
            return;
        }
        if (this.f276g) {
            an.m372c(this);
        } else {
            this.f286q.m687f();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = m597e() ? this.f274e : this.f273d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int right;
            int i;
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m597e()) {
                right = childAt.getRight();
                i = right + intrinsicWidth;
            } else {
                i = childAt.getLeft();
                right = i - intrinsicWidth;
            }
            drawable.setBounds(right, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f276g || layoutParams.f266b || this.f277h == null)) {
            canvas.getClipBounds(this.f289t);
            if (m597e()) {
                this.f289t.left = Math.max(this.f289t.left, this.f277h.getRight());
            } else {
                this.f289t.right = Math.min(this.f289t.right, this.f277h.getLeft());
            }
            canvas.clipRect(this.f289t);
        }
        if (VERSION.SDK_INT < 11) {
            if (layoutParams.f267c && this.f278i > 0.0f) {
                if (!view.isDrawingCacheEnabled()) {
                    view.setDrawingCacheEnabled(true);
                }
                Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache != null) {
                    canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.f268d);
                    z = false;
                    canvas.restoreToCount(save);
                    return z;
                }
                "drawChild: child view " + view + " returned null drawing cache";
            } else if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
        }
        z = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return z;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f272c;
    }

    public int getParallaxDistance() {
        return this.f282m;
    }

    public int getSliderFadeColor() {
        return this.f271b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f288s = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f288s = true;
        int size = this.f290u.size();
        for (int i = 0; i < size; i++) {
            ((C0138z) this.f290u.get(i)).run();
        }
        this.f290u.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r2 = 0;
        r1 = 1;
        r3 = android.support.v4.view.C0110w.m533a(r7);
        r0 = r6.f276g;
        if (r0 != 0) goto L_0x002d;
    L_0x000a:
        if (r3 != 0) goto L_0x002d;
    L_0x000c:
        r0 = r6.getChildCount();
        if (r0 <= r1) goto L_0x002d;
    L_0x0012:
        r0 = r6.getChildAt(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0018:
        r4 = r6.f286q;
        r4 = r7.getX();
        r4 = (int) r4;
        r5 = r7.getY();
        r5 = (int) r5;
        r0 = android.support.v4.widget.aq.m669b(r0, r4, r5);
        if (r0 != 0) goto L_0x0041;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r6.f287r = r0;
    L_0x002d:
        r0 = r6.f276g;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r6.f281l;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        if (r3 == 0) goto L_0x0043;
    L_0x0037:
        r0 = r6.f286q;
        r0.m686e();
        r2 = super.onInterceptTouchEvent(r7);
    L_0x0040:
        return r2;
    L_0x0041:
        r0 = r2;
        goto L_0x002b;
    L_0x0043:
        r0 = 3;
        if (r3 == r0) goto L_0x0048;
    L_0x0046:
        if (r3 != r1) goto L_0x004e;
    L_0x0048:
        r0 = r6.f286q;
        r0.m686e();
        goto L_0x0040;
    L_0x004e:
        switch(r3) {
            case 0: goto L_0x005e;
            case 1: goto L_0x0051;
            case 2: goto L_0x0082;
            default: goto L_0x0051;
        };
    L_0x0051:
        r0 = r2;
    L_0x0052:
        r3 = r6.f286q;
        r3 = r3.m678a(r7);
        if (r3 != 0) goto L_0x005c;
    L_0x005a:
        if (r0 == 0) goto L_0x0040;
    L_0x005c:
        r2 = r1;
        goto L_0x0040;
    L_0x005e:
        r6.f281l = r2;
        r0 = r7.getX();
        r3 = r7.getY();
        r6.f283n = r0;
        r6.f284o = r3;
        r4 = r6.f286q;
        r4 = r6.f277h;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = android.support.v4.widget.aq.m669b(r4, r0, r3);
        if (r0 == 0) goto L_0x0051;
    L_0x0078:
        r0 = r6.f277h;
        r0 = r6.m604b(r0);
        if (r0 == 0) goto L_0x0051;
    L_0x0080:
        r0 = r1;
        goto L_0x0052;
    L_0x0082:
        r0 = r7.getX();
        r3 = r7.getY();
        r4 = r6.f283n;
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r4 = r6.f284o;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.f286q;
        r4 = r4.m685d();
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0051;
    L_0x00a3:
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x00a7:
        r0 = r6.f286q;
        r0.m686e();
        r6.f281l = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean e = m597e();
        if (e) {
            this.f286q.m675a(2);
        } else {
            this.f286q.m675a(1);
        }
        int i5 = i3 - i;
        int paddingRight = e ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = e ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f288s) {
            float f = (this.f276g && this.f287r) ? 1.0f : 0.0f;
            this.f278i = f;
        }
        int i6 = 0;
        int i7 = paddingRight;
        while (i6 < childCount) {
            int i8;
            int i9;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i10;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int i11 = 0;
                if (layoutParams.f266b) {
                    int min = (Math.min(paddingRight, (i5 - paddingLeft) - this.f275f) - i7) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f280k = min;
                    i8 = e ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f267c = ((i7 + i8) + min) + (measuredWidth / 2) > i5 - paddingLeft;
                    i9 = (int) (((float) min) * this.f278i);
                    i10 = i7 + (i8 + i9);
                    this.f278i = ((float) i9) / ((float) this.f280k);
                } else {
                    i9 = (!this.f276g || this.f282m == 0) ? 0 : (int) ((1.0f - this.f278i) * ((float) this.f282m));
                    i11 = i9;
                    i10 = paddingRight;
                }
                if (e) {
                    i8 = (i5 - i10) + i11;
                    i9 = i8 - measuredWidth;
                } else {
                    i9 = i10 - i11;
                    i8 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i9 = childAt.getWidth() + paddingRight;
                i8 = i10;
            } else {
                i9 = paddingRight;
                i8 = i7;
            }
            i6++;
            paddingRight = i9;
            i7 = i8;
        }
        if (this.f288s) {
            if (this.f276g) {
                if (this.f282m != 0) {
                    m592b(this.f278i);
                }
                if (((LayoutParams) this.f277h.getLayoutParams()).f267c) {
                    m587a(this.f277h, this.f278i, this.f271b);
                }
            } else {
                for (i9 = 0; i9 < childCount; i9++) {
                    m587a(getChildAt(i9), 0.0f, this.f271b);
                }
            }
            m602a(this.f277h);
        }
        this.f288s = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    size = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else if (isInEditMode()) {
            if (mode != GridLayout.UNDEFINED && mode == 0) {
                i3 = mode2;
                i4 = 300;
                size = size2;
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        switch (i3) {
            case GridLayout.UNDEFINED /*-2147483648*/:
                size2 = 0;
                mode2 = (size - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                size2 = (size - getPaddingTop()) - getPaddingBottom();
                mode2 = size2;
                break;
            default:
                size2 = 0;
                mode2 = -1;
                break;
        }
        boolean z = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f277h = null;
        int i6 = 0;
        int i7 = paddingLeft;
        int i8 = size2;
        float f = 0.0f;
        while (i6 < childCount) {
            float f2;
            boolean z2;
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f267c = false;
                size2 = i7;
                f2 = f;
                i5 = i8;
                z2 = z;
            } else {
                if (layoutParams.f265a > 0.0f) {
                    f += layoutParams.f265a;
                    if (layoutParams.width == 0) {
                        size2 = i7;
                        f2 = f;
                        i5 = i8;
                        z2 = z;
                    }
                }
                mode = layoutParams.leftMargin + layoutParams.rightMargin;
                mode = layoutParams.width == -2 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, GridLayout.UNDEFINED) : layoutParams.width == -1 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                i5 = layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, GridLayout.UNDEFINED) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                childAt.measure(mode, i5);
                mode = childAt.getMeasuredWidth();
                i5 = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && i5 > i8) {
                    i8 = Math.min(i5, mode2);
                }
                i5 = i7 - mode;
                boolean z3 = i5 < 0;
                layoutParams.f266b = z3;
                z3 |= z;
                if (layoutParams.f266b) {
                    this.f277h = childAt;
                }
                size2 = i5;
                i5 = i8;
                float f3 = f;
                z2 = z3;
                f2 = f3;
            }
            i6++;
            z = z2;
            i8 = i5;
            f = f2;
            i7 = size2;
        }
        if (z || f > 0.0f) {
            int i9 = paddingLeft - this.f275f;
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        Object obj = (layoutParams.width != 0 || layoutParams.f265a <= 0.0f) ? null : 1;
                        i5 = obj != null ? 0 : childAt2.getMeasuredWidth();
                        if (!z || childAt2 == this.f277h) {
                            if (layoutParams.f265a > 0.0f) {
                                mode = layoutParams.width == 0 ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, GridLayout.UNDEFINED) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z) {
                                    size2 = paddingLeft - (layoutParams.rightMargin + layoutParams.leftMargin);
                                    i6 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
                                    if (i5 != size2) {
                                        childAt2.measure(i6, mode);
                                    }
                                } else {
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(((int) ((layoutParams.f265a * ((float) Math.max(0, i7))) / f)) + i5, 1073741824), mode);
                                }
                            }
                        } else if (layoutParams.width < 0 && (i5 > i9 || layoutParams.f265a > 0.0f)) {
                            size2 = obj != null ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, GridLayout.UNDEFINED) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), size2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, (getPaddingTop() + i8) + getPaddingBottom());
        this.f276g = z;
        if (this.f286q.m673a() != 0 && !z) {
            this.f286q.m687f();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        View view;
        if (savedState.f269a) {
            view = this.f277h;
            if (this.f288s || m588a(1.0f)) {
                this.f287r = true;
            }
        } else {
            view = this.f277h;
            m596d();
        }
        this.f287r = savedState.f269a;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f276g ? !this.f276g || this.f278i == 1.0f : this.f287r;
        savedState.f269a = z;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f288s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f276g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f286q.m683b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f283n = x;
                this.f284o = y;
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (m604b(this.f277h)) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    float f = x - this.f283n;
                    float f2 = y - this.f284o;
                    int d = this.f286q.m685d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d))) {
                        aq aqVar = this.f286q;
                        if (aq.m669b(this.f277h, (int) x, (int) y)) {
                            View view = this.f277h;
                            m596d();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f276g) {
            this.f287r = view == this.f277h;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f272c = i;
    }

    public void setPanelSlideListener(ab abVar) {
        this.f285p = abVar;
    }

    public void setParallaxDistance(int i) {
        this.f282m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f273d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f274e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.f271b = i;
    }
}
