package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ar extends aq {
    ar() {
    }

    public final int m413a(int i, int i2) {
        return View.resolveSizeAndState(i, i2, 0);
    }

    final long m414a() {
        return ValueAnimator.getFrameDelay();
    }

    public final void m415a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public void m416a(View view, Paint paint) {
        m415a(view, view.getLayerType(), paint);
        view.invalidate();
    }

    public final int m417e(View view) {
        return view.getLayerType();
    }
}
