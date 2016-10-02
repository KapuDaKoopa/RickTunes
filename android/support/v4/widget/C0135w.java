package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.w */
class C0135w implements C0133u {
    C0135w() {
    }

    public final Object m755a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public final void m756a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public final boolean m757a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public final int m758b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public final int m759c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public final boolean m760d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public final void m761e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public final int m762f(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public final int m763g(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
