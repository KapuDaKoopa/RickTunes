package com.andromo.dev576782.app537736;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;

final class hu implements AnimationListener {
    final WeakReference f1081a;
    final int f1082b;

    public hu(View view) {
        this.f1081a = new WeakReference(view);
        this.f1082b = 8;
    }

    public final void onAnimationEnd(Animation animation) {
        View view = (View) this.f1081a.get();
        if (view != null) {
            view.setVisibility(this.f1082b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
