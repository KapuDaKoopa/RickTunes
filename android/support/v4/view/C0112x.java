package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.x */
final class C0112x implements C0111z {
    C0112x() {
    }

    public final int m545a(MotionEvent motionEvent) {
        return 1;
    }

    public final int m546a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    public final int m547b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public final float m548c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public final float m549d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
