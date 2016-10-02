package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.w */
public final class C0110w {
    static final C0111z f226a;

    static {
        if (VERSION.SDK_INT >= 5) {
            f226a = new C0113y();
        } else {
            f226a = new C0112x();
        }
    }

    public static int m533a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m534a(MotionEvent motionEvent, int i) {
        return f226a.m541a(motionEvent, i);
    }

    public static int m535b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int m536b(MotionEvent motionEvent, int i) {
        return f226a.m542b(motionEvent, i);
    }

    public static float m537c(MotionEvent motionEvent, int i) {
        return f226a.m543c(motionEvent, i);
    }

    public static int m538c(MotionEvent motionEvent) {
        return f226a.m540a(motionEvent);
    }

    public static float m539d(MotionEvent motionEvent, int i) {
        return f226a.m544d(motionEvent, i);
    }
}
