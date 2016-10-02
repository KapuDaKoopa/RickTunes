package android.support.v4.widget;

import android.view.animation.Animation;

final class ak extends ao {
    final /* synthetic */ SwipeRefreshLayout f341a;

    ak(SwipeRefreshLayout swipeRefreshLayout) {
        this.f341a = swipeRefreshLayout;
        super((byte) 0);
    }

    public final void onAnimationEnd(Animation animation) {
        this.f341a.f307n = 0;
    }
}
