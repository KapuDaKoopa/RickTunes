package com.andromo.dev576782.app537736;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

final class ax implements Runnable {
    private final WeakReference f727a;
    private final Animation f728b;

    public ax(View view, Animation animation) {
        this.f727a = new WeakReference(view);
        this.f728b = animation;
    }

    public final void run() {
        View view = (View) this.f727a.get();
        Animation animation = this.f728b;
        if (view != null && animation != null && view.getVisibility() != 8) {
            view.startAnimation(animation);
        }
    }
}
