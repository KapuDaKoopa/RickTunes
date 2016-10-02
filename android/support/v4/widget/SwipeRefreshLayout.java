package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.C0110w;
import android.support.v4.view.an;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import com.google.android.gms.C0772e;

public class SwipeRefreshLayout extends ViewGroup {
    private static final String f291a;
    private static final int[] f292v;
    private final Runnable f293A;
    private final Runnable f294B;
    private ah f295b;
    private View f296c;
    private int f297d;
    private ap f298e;
    private int f299f;
    private boolean f300g;
    private int f301h;
    private float f302i;
    private int f303j;
    private float f304k;
    private float f305l;
    private int f306m;
    private int f307n;
    private float f308o;
    private float f309p;
    private boolean f310q;
    private int f311r;
    private boolean f312s;
    private final DecelerateInterpolator f313t;
    private final AccelerateInterpolator f314u;
    private final Animation f315w;
    private Animation f316x;
    private final AnimationListener f317y;
    private final AnimationListener f318z;

    static {
        f291a = SwipeRefreshLayout.class.getSimpleName();
        f292v = new int[]{16842766};
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f300g = false;
        this.f302i = -1.0f;
        this.f304k = 0.0f;
        this.f305l = 0.0f;
        this.f311r = -1;
        this.f315w = new ai(this);
        this.f316x = new aj(this);
        this.f317y = new ak(this);
        this.f318z = new al(this);
        this.f293A = new am(this);
        this.f294B = new an(this);
        this.f301h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f303j = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f295b = new ah(this);
        this.f306m = (int) (getResources().getDisplayMetrics().density * 4.0f);
        this.f313t = new DecelerateInterpolator(2.0f);
        this.f314u = new AccelerateInterpolator(1.5f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f292v);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void m608a() {
        if (this.f296c == null) {
            if (getChildCount() <= 1 || isInEditMode()) {
                this.f296c = getChildAt(0);
                this.f297d = this.f296c.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
        }
        if (this.f302i == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f302i = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    static /* synthetic */ void m610a(SwipeRefreshLayout swipeRefreshLayout, int i, AnimationListener animationListener) {
        swipeRefreshLayout.f299f = i;
        swipeRefreshLayout.f315w.reset();
        swipeRefreshLayout.f315w.setDuration((long) swipeRefreshLayout.f303j);
        swipeRefreshLayout.f315w.setAnimationListener(animationListener);
        swipeRefreshLayout.f315w.setInterpolator(swipeRefreshLayout.f313t);
        swipeRefreshLayout.f296c.startAnimation(swipeRefreshLayout.f315w);
    }

    private void m611a(MotionEvent motionEvent) {
        int b = C0110w.m535b(motionEvent);
        if (C0110w.m536b(motionEvent, b) == this.f311r) {
            b = b == 0 ? 1 : 0;
            this.f309p = C0110w.m539d(motionEvent, b);
            this.f311r = C0110w.m536b(motionEvent, b);
        }
    }

    private boolean m613b() {
        if (VERSION.SDK_INT >= 14) {
            return an.m368a(this.f296c);
        }
        if (!(this.f296c instanceof AbsListView)) {
            return this.f296c.getScrollY() > 0;
        } else {
            AbsListView absListView = (AbsListView) this.f296c;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
    }

    private void setTargetOffsetTopAndBottom(int i) {
        this.f296c.offsetTopAndBottom(i);
        this.f307n = this.f296c.getTop();
    }

    private void setTriggerPercentage(float f) {
        if (f == 0.0f) {
            this.f305l = 0.0f;
            return;
        }
        this.f305l = f;
        this.f295b.m654a(f);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f295b.m656a(canvas);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f294B);
        removeCallbacks(this.f293A);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f293A);
        removeCallbacks(this.f294B);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m608a();
        int a = C0110w.m533a(motionEvent);
        if (this.f312s && a == 0) {
            this.f312s = false;
        }
        if (!isEnabled() || this.f312s || m613b()) {
            return false;
        }
        switch (a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                float y = motionEvent.getY();
                this.f308o = y;
                this.f309p = y;
                this.f311r = C0110w.m536b(motionEvent, 0);
                this.f310q = false;
                this.f305l = 0.0f;
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                this.f310q = false;
                this.f305l = 0.0f;
                this.f311r = -1;
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                String str;
                if (this.f311r != -1) {
                    a = C0110w.m534a(motionEvent, this.f311r);
                    if (a >= 0) {
                        float d = C0110w.m539d(motionEvent, a);
                        if (d - this.f308o > ((float) this.f301h)) {
                            this.f309p = d;
                            this.f310q = true;
                            break;
                        }
                    }
                    str = f291a;
                    return false;
                }
                str = f291a;
                return false;
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                m611a(motionEvent);
                break;
        }
        return this.f310q;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f295b.m655a(measuredWidth, this.f306m);
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f307n + getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1 && !isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        } else if (getChildCount() > 0) {
            getChildAt(0).measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        int a = C0110w.m533a(motionEvent);
        if (this.f312s && a == 0) {
            this.f312s = false;
        }
        if (!isEnabled() || this.f312s || m613b()) {
            return false;
        }
        float y;
        switch (a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                y = motionEvent.getY();
                this.f308o = y;
                this.f309p = y;
                this.f311r = C0110w.m536b(motionEvent, 0);
                this.f310q = false;
                this.f305l = 0.0f;
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                this.f310q = false;
                this.f305l = 0.0f;
                this.f311r = -1;
                return false;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                a = C0110w.m534a(motionEvent, this.f311r);
                if (a >= 0) {
                    float d = C0110w.m539d(motionEvent, a);
                    y = d - this.f308o;
                    if (!this.f310q && y > ((float) this.f301h)) {
                        this.f310q = true;
                    }
                    if (this.f310q) {
                        if (y > this.f302i) {
                            removeCallbacks(this.f294B);
                            this.f293A.run();
                            setRefreshing(true);
                            ap apVar = this.f298e;
                        } else {
                            setTriggerPercentage(this.f314u.getInterpolation(y / this.f302i));
                            a = (int) y;
                            int top = this.f296c.getTop();
                            if (((float) a) > this.f302i) {
                                i = (int) this.f302i;
                            } else if (a >= 0) {
                                i = a;
                            }
                            setTargetOffsetTopAndBottom(i - top);
                            if (this.f309p <= d || this.f296c.getTop() != getPaddingTop()) {
                                removeCallbacks(this.f294B);
                                postDelayed(this.f294B, 300);
                            } else {
                                removeCallbacks(this.f294B);
                            }
                        }
                        this.f309p = d;
                        break;
                    }
                }
                String str = f291a;
                return false;
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                i = C0110w.m535b(motionEvent);
                this.f309p = C0110w.m539d(motionEvent, i);
                this.f311r = C0110w.m536b(motionEvent, i);
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                m611a(motionEvent);
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public void setOnRefreshListener(ap apVar) {
        this.f298e = apVar;
    }

    public void setRefreshing(boolean z) {
        if (this.f300g != z) {
            m608a();
            this.f305l = 0.0f;
            this.f300g = z;
            if (this.f300g) {
                this.f295b.m653a();
            } else {
                this.f295b.m657b();
            }
        }
    }
}
