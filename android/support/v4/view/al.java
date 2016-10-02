package android.support.v4.view;

import android.view.VelocityTracker;

final class al implements am {
    al() {
    }

    public final float m360a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public final float m361b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
