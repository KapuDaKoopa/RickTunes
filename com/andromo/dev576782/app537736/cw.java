package com.andromo.dev576782.app537736;

import android.os.Handler;

public final class cw {
    int f813a;
    Handler f814b;
    Runnable f815c;
    Runnable f816d;
    boolean f817e;

    public cw(Runnable runnable) {
        this.f813a = 500;
        if (runnable != null) {
            this.f815c = runnable;
            this.f816d = new cx(this);
        }
        this.f814b = new Handler();
    }
}
