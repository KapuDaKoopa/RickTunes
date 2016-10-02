package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.C0772e;

public abstract class cu {
    ab f633a;
    boolean f634b;
    private boolean f635c;

    public cu() {
        this.f634b = false;
        this.f635c = false;
    }

    protected void m1214a(Activity activity) {
    }

    protected abstract boolean m1215a();

    protected abstract boolean m1216a(Activity activity, View view);

    public boolean m1217a(Activity activity, ViewGroup viewGroup, ae aeVar) {
        if (activity == null || viewGroup == null) {
            return false;
        }
        View view;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        int b = m1218b();
        if (!m1215a() || layoutInflater == null) {
            view = null;
        } else {
            View inflate = layoutInflater.inflate(b, null);
            if (inflate != null) {
                m1216a(activity, inflate);
            }
            view = inflate;
        }
        if (view == null) {
            return false;
        }
        viewGroup.addView(view);
        Handler handler;
        Animation translateAnimation;
        switch (cv.f812a[aeVar.ordinal()]) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (ad.m1213a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new hu(view));
                    handler.postDelayed(new ax(view, translateAnimation), 20000);
                    return true;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                if (ad.m1213a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new hu(view));
                    handler.postDelayed(new ax(view, translateAnimation), 20000);
                    break;
                }
                break;
        }
        return true;
    }

    protected abstract int m1218b();
}
