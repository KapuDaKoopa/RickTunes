package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class aj {
    static final am f205a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f205a = new al();
        } else {
            f205a = new ak();
        }
    }

    public static float m354a(VelocityTracker velocityTracker, int i) {
        return f205a.m356a(velocityTracker, i);
    }

    public static float m355b(VelocityTracker velocityTracker, int i) {
        return f205a.m357b(velocityTracker, i);
    }
}
