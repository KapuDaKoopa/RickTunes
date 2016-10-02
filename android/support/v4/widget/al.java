package android.support.v4.widget;

import android.view.animation.Animation;

final class al extends ao {
    final /* synthetic */ SwipeRefreshLayout f342a;

    al(SwipeRefreshLayout swipeRefreshLayout) {
        this.f342a = swipeRefreshLayout;
        super((byte) 0);
    }

    public final void onAnimationEnd(Animation animation) {
        this.f342a.f305l = 0.0f;
    }
}
