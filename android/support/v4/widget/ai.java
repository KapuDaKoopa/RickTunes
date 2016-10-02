package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ai extends Animation {
    final /* synthetic */ SwipeRefreshLayout f338a;

    ai(SwipeRefreshLayout swipeRefreshLayout) {
        this.f338a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i = 0;
        if (this.f338a.f299f != this.f338a.f297d) {
            i = this.f338a.f299f + ((int) (((float) (this.f338a.f297d - this.f338a.f299f)) * f));
        }
        i -= this.f338a.f296c.getTop();
        int top = this.f338a.f296c.getTop();
        if (i + top < 0) {
            i = 0 - top;
        }
        this.f338a.setTargetOffsetTopAndBottom(i);
    }
}
