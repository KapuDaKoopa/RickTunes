package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class aj extends Animation {
    final /* synthetic */ SwipeRefreshLayout f339a;

    aj(SwipeRefreshLayout swipeRefreshLayout) {
        this.f339a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f339a.f295b.m654a(this.f339a.f304k + ((0.0f - this.f339a.f304k) * f));
    }
}
