package com.andromo.dev576782.app537736;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class id implements AnimationListener {
    final /* synthetic */ SlidingPanel f1105a;

    id(SlidingPanel slidingPanel) {
        this.f1105a = slidingPanel;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1105a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
