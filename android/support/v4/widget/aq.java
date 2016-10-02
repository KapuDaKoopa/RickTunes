package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0110w;
import android.support.v4.view.aj;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.C0772e;
import java.util.Arrays;

public final class aq {
    private static final Interpolator f345v;
    private int f346a;
    private int f347b;
    private int f348c;
    private float[] f349d;
    private float[] f350e;
    private float[] f351f;
    private float[] f352g;
    private int[] f353h;
    private int[] f354i;
    private int[] f355j;
    private int f356k;
    private VelocityTracker f357l;
    private float f358m;
    private float f359n;
    private int f360o;
    private int f361p;
    private C0132t f362q;
    private final at f363r;
    private View f364s;
    private boolean f365t;
    private final ViewGroup f366u;
    private final Runnable f367w;

    static {
        f345v = new ar();
    }

    private aq(Context context, ViewGroup viewGroup, at atVar) {
        this.f348c = -1;
        this.f367w = new as(this);
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (atVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f366u = viewGroup;
            this.f363r = atVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f360o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f347b = viewConfiguration.getScaledTouchSlop();
            this.f358m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f359n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f362q = new C0132t(context, f345v);
        }
    }

    private static float m658a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int m659a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f366u.getWidth();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(sin / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    public static aq m660a(ViewGroup viewGroup, float f, at atVar) {
        aq aqVar = new aq(viewGroup.getContext(), viewGroup, atVar);
        aqVar.f347b = (int) (((float) aqVar.f347b) * (1.0f / f));
        return aqVar;
    }

    private void m661a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f349d == null || this.f349d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f349d != null) {
                System.arraycopy(this.f349d, 0, obj, 0, this.f349d.length);
                System.arraycopy(this.f350e, 0, obj2, 0, this.f350e.length);
                System.arraycopy(this.f351f, 0, obj3, 0, this.f351f.length);
                System.arraycopy(this.f352g, 0, obj4, 0, this.f352g.length);
                System.arraycopy(this.f353h, 0, obj5, 0, this.f353h.length);
                System.arraycopy(this.f354i, 0, obj6, 0, this.f354i.length);
                System.arraycopy(this.f355j, 0, obj7, 0, this.f355j.length);
            }
            this.f349d = obj;
            this.f350e = obj2;
            this.f351f = obj3;
            this.f352g = obj4;
            this.f353h = obj5;
            this.f354i = obj6;
            this.f355j = obj7;
        }
        float[] fArr = this.f349d;
        this.f351f[i] = f;
        fArr[i] = f;
        fArr = this.f350e;
        this.f352g[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f353h;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.f366u.getLeft() + this.f360o) {
            i2 = 1;
        }
        if (i4 < this.f366u.getTop() + this.f360o) {
            i2 |= 4;
        }
        if (i3 > this.f366u.getRight() - this.f360o) {
            i2 |= 2;
        }
        if (i4 > this.f366u.getBottom() - this.f360o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f356k |= 1 << i;
    }

    private boolean m662a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f353h[i] & i2) != i2 || (this.f361p & i2) == 0 || (this.f355j[i] & i2) == i2 || (this.f354i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f347b) && abs2 <= ((float) this.f347b)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            at atVar = this.f363r;
        }
        return (this.f354i[i] & i2) == 0 && abs > ((float) this.f347b);
    }

    private boolean m663a(int i, int i2, int i3, int i4) {
        int left = this.f364s.getLeft();
        int top = this.f364s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f362q.m736c();
            m682b(0);
            return false;
        }
        View view = this.f364s;
        int b = m665b(i3, (int) this.f359n, (int) this.f358m);
        int b2 = m665b(i4, (int) this.f359n, (int) this.f358m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        float f = b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8);
        float f2 = b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8);
        int a = m659a(i5, b, this.f363r.m635c(view));
        at atVar = this.f363r;
        a = (int) ((f2 * ((float) m659a(i6, b2, 0))) + (f * ((float) a)));
        C0132t c0132t = this.f362q;
        c0132t.f385b.m738a(c0132t.f384a, left, top, i5, i6, a);
        m682b(2);
        return true;
    }

    private boolean m664a(View view, float f) {
        if (view == null) {
            return false;
        }
        boolean z = this.f363r.m635c(view) > 0;
        at atVar = this.f363r;
        return z && Math.abs(f) > ((float) this.f347b);
    }

    private static int m665b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void m666b(float f) {
        this.f365t = true;
        this.f363r.m630a(this.f364s, f);
        this.f365t = false;
        if (this.f346a == 1) {
            m682b(0);
        }
    }

    private void m667b(float f, float f2, int i) {
        int i2 = 1;
        if (!m662a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m662a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m662a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m662a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f354i;
            iArr[i] = iArr[i] | i2;
            this.f363r.m629a(i2, i);
        }
    }

    private boolean m668b(View view, int i) {
        if (view == this.f364s && this.f348c == i) {
            return true;
        }
        if (view == null || !this.f363r.m632a(view)) {
            return false;
        }
        this.f348c = i;
        m676a(view, i);
        return true;
    }

    public static boolean m669b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    private void m670c(int i) {
        if (this.f349d != null) {
            this.f349d[i] = 0.0f;
            this.f350e[i] = 0.0f;
            this.f351f[i] = 0.0f;
            this.f352g[i] = 0.0f;
            this.f353h[i] = 0;
            this.f354i[i] = 0;
            this.f355j[i] = 0;
            this.f356k &= (1 << i) ^ -1;
        }
    }

    private void m671c(MotionEvent motionEvent) {
        int c = C0110w.m538c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = C0110w.m536b(motionEvent, i);
            float c2 = C0110w.m537c(motionEvent, i);
            float d = C0110w.m539d(motionEvent, i);
            this.f351f[b] = c2;
            this.f352g[b] = d;
        }
    }

    private void m672i() {
        this.f357l.computeCurrentVelocity(1000, this.f358m);
        float a = m658a(aj.m354a(this.f357l, this.f348c), this.f359n, this.f358m);
        m658a(aj.m355b(this.f357l, this.f348c), this.f359n, this.f358m);
        m666b(a);
    }

    public final int m673a() {
        return this.f346a;
    }

    public final void m674a(float f) {
        this.f359n = f;
    }

    public final void m675a(int i) {
        this.f361p = i;
    }

    public final void m676a(View view, int i) {
        if (view.getParent() != this.f366u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f366u + ")");
        }
        this.f364s = view;
        this.f348c = i;
        this.f363r.m634b(view);
        m682b(1);
    }

    public final boolean m677a(int i, int i2) {
        if (this.f365t) {
            return m663a(i, i2, (int) aj.m354a(this.f357l, this.f348c), (int) aj.m355b(this.f357l, this.f348c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean m678a(MotionEvent motionEvent) {
        int a = C0110w.m533a(motionEvent);
        int b = C0110w.m535b(motionEvent);
        if (a == 0) {
            m686e();
        }
        if (this.f357l == null) {
            this.f357l = VelocityTracker.obtain();
        }
        this.f357l.addMovement(motionEvent);
        float y;
        int b2;
        at atVar;
        switch (a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                b2 = C0110w.m536b(motionEvent, 0);
                m661a(x, y, b2);
                View b3 = m681b((int) x, (int) y);
                if (b3 == this.f364s && this.f346a == 2) {
                    m668b(b3, b2);
                }
                if ((this.f353h[b2] & this.f361p) != 0) {
                    atVar = this.f363r;
                    b = this.f361p;
                    atVar.m636c();
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                m686e();
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                b = C0110w.m538c(motionEvent);
                a = 0;
                while (a < b) {
                    b2 = C0110w.m536b(motionEvent, a);
                    float c = C0110w.m537c(motionEvent, a);
                    float d = C0110w.m539d(motionEvent, a);
                    float f = c - this.f349d[b2];
                    m667b(f, d - this.f350e[b2], b2);
                    if (this.f346a != 1) {
                        View b4 = m681b((int) c, (int) d);
                        if (b4 == null || !m664a(b4, f) || !m668b(b4, b2)) {
                            a++;
                        }
                    }
                    m671c(motionEvent);
                    break;
                }
                m671c(motionEvent);
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                a = C0110w.m536b(motionEvent, b);
                float c2 = C0110w.m537c(motionEvent, b);
                y = C0110w.m539d(motionEvent, b);
                m661a(c2, y, a);
                if (this.f346a != 0) {
                    if (this.f346a == 2) {
                        View b5 = m681b((int) c2, (int) y);
                        if (b5 == this.f364s) {
                            m668b(b5, a);
                            break;
                        }
                    }
                } else if ((this.f353h[a] & this.f361p) != 0) {
                    atVar = this.f363r;
                    b = this.f361p;
                    atVar.m636c();
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                m670c(C0110w.m536b(motionEvent, b));
                break;
        }
        return this.f346a == 1;
    }

    public final boolean m679a(View view, int i, int i2) {
        this.f364s = view;
        this.f348c = -1;
        return m663a(i, i2, 0, 0);
    }

    public final int m680b() {
        return this.f360o;
    }

    public final View m681b(int i, int i2) {
        for (int childCount = this.f366u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f366u;
            at atVar = this.f363r;
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    final void m682b(int i) {
        if (this.f346a != i) {
            this.f346a = i;
            this.f363r.m628a(i);
            if (i == 0) {
                this.f364s = null;
            }
        }
    }

    public final void m683b(MotionEvent motionEvent) {
        int i = 0;
        int a = C0110w.m533a(motionEvent);
        int b = C0110w.m535b(motionEvent);
        if (a == 0) {
            m686e();
        }
        if (this.f357l == null) {
            this.f357l = VelocityTracker.obtain();
        }
        this.f357l.addMovement(motionEvent);
        float x;
        float y;
        View b2;
        at atVar;
        int i2;
        int top;
        switch (a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = C0110w.m536b(motionEvent, 0);
                b2 = m681b((int) x, (int) y);
                m661a(x, y, i);
                m668b(b2, i);
                if ((this.f353h[i] & this.f361p) != 0) {
                    atVar = this.f363r;
                    i2 = this.f361p;
                    atVar.m636c();
                }
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (this.f346a == 1) {
                    m672i();
                }
                m686e();
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                if (this.f346a == 1) {
                    i = C0110w.m534a(motionEvent, this.f348c);
                    x = C0110w.m537c(motionEvent, i);
                    i2 = (int) (x - this.f351f[this.f348c]);
                    a = (int) (C0110w.m539d(motionEvent, i) - this.f352g[this.f348c]);
                    i = this.f364s.getLeft() + i2;
                    this.f364s.getTop();
                    b = this.f364s.getLeft();
                    top = this.f364s.getTop();
                    if (i2 != 0) {
                        i = this.f363r.m633b(this.f364s, i);
                        this.f364s.offsetLeftAndRight(i - b);
                    }
                    if (a != 0) {
                        this.f364s.offsetTopAndBottom(this.f363r.m637d(this.f364s) - top);
                    }
                    if (!(i2 == 0 && a == 0)) {
                        this.f363r.m631a(this.f364s, i);
                    }
                    m671c(motionEvent);
                    return;
                }
                i2 = C0110w.m538c(motionEvent);
                while (i < i2) {
                    a = C0110w.m536b(motionEvent, i);
                    float c = C0110w.m537c(motionEvent, i);
                    float d = C0110w.m539d(motionEvent, i);
                    float f = c - this.f349d[a];
                    m667b(f, d - this.f350e[a], a);
                    if (this.f346a != 1) {
                        b2 = m681b((int) c, (int) d);
                        if (!m664a(b2, f) || !m668b(b2, a)) {
                            i++;
                        }
                    }
                    m671c(motionEvent);
                }
                m671c(motionEvent);
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                if (this.f346a == 1) {
                    m666b(0.0f);
                }
                m686e();
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                i = C0110w.m536b(motionEvent, b);
                x = C0110w.m537c(motionEvent, b);
                y = C0110w.m539d(motionEvent, b);
                m661a(x, y, i);
                if (this.f346a == 0) {
                    m668b(m681b((int) x, (int) y), i);
                    if ((this.f353h[i] & this.f361p) != 0) {
                        atVar = this.f363r;
                        i2 = this.f361p;
                        atVar.m636c();
                        return;
                    }
                    return;
                }
                if (m669b(this.f364s, (int) x, (int) y)) {
                    m668b(this.f364s, i);
                }
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                a = C0110w.m536b(motionEvent, b);
                if (this.f346a == 1 && a == this.f348c) {
                    b = C0110w.m538c(motionEvent);
                    while (i < b) {
                        top = C0110w.m536b(motionEvent, i);
                        if (top != this.f348c) {
                            if (m681b((int) C0110w.m537c(motionEvent, i), (int) C0110w.m539d(motionEvent, i)) == this.f364s && m668b(this.f364s, top)) {
                                i = this.f348c;
                                if (i == -1) {
                                    m672i();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m672i();
                    }
                }
                m670c(a);
            default:
        }
    }

    public final View m684c() {
        return this.f364s;
    }

    public final int m685d() {
        return this.f347b;
    }

    public final void m686e() {
        this.f348c = -1;
        if (this.f349d != null) {
            Arrays.fill(this.f349d, 0.0f);
            Arrays.fill(this.f350e, 0.0f);
            Arrays.fill(this.f351f, 0.0f);
            Arrays.fill(this.f352g, 0.0f);
            Arrays.fill(this.f353h, 0);
            Arrays.fill(this.f354i, 0);
            Arrays.fill(this.f355j, 0);
            this.f356k = 0;
        }
        if (this.f357l != null) {
            this.f357l.recycle();
            this.f357l = null;
        }
    }

    public final void m687f() {
        m686e();
        if (this.f346a == 2) {
            this.f362q.m734a();
            this.f362q.m735b();
            this.f362q.m736c();
            int a = this.f362q.m734a();
            this.f362q.m735b();
            this.f363r.m631a(this.f364s, a);
        }
        m682b(0);
    }

    public final boolean m688g() {
        if (this.f346a == 2) {
            C0132t c0132t = this.f362q;
            boolean d = c0132t.f385b.m742d(c0132t.f384a);
            int a = this.f362q.m734a();
            int b = this.f362q.m735b();
            int left = a - this.f364s.getLeft();
            int top = b - this.f364s.getTop();
            if (left != 0) {
                this.f364s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f364s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f363r.m631a(this.f364s, a);
            }
            if (d) {
                C0132t c0132t2 = this.f362q;
                if (a == c0132t2.f385b.m744f(c0132t2.f384a)) {
                    C0132t c0132t3 = this.f362q;
                    if (b == c0132t3.f385b.m745g(c0132t3.f384a)) {
                        this.f362q.m736c();
                        c0132t = this.f362q;
                        d = c0132t.f385b.m739a(c0132t.f384a);
                    }
                }
            }
            if (!d) {
                this.f366u.post(this.f367w);
            }
        }
        return this.f346a == 2;
    }

    public final boolean m689h() {
        int length = this.f349d.length;
        for (int i = 0; i < length; i++) {
            boolean z;
            if ((this.f356k & (1 << i)) != 0) {
                float f = this.f351f[i] - this.f349d[i];
                float f2 = this.f352g[i] - this.f350e[i];
                z = (f * f) + (f2 * f2) > ((float) (this.f347b * this.f347b));
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
