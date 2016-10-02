package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: android.support.v4.widget.v */
final class C0134v implements C0133u {
    C0134v() {
    }

    public final Object m746a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    public final void m747a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public final boolean m748a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    public final int m749b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    public final int m750c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    public final boolean m751d(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    public final void m752e(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    public final int m753f(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    public final int m754g(Object obj) {
        return ((Scroller) obj).getFinalY();
    }
}
