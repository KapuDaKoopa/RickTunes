package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.y */
final class C0113y implements C0111z {
    C0113y() {
    }

    public final int m550a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public final int m551a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public final int m552b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public final float m553c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public final float m554d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
