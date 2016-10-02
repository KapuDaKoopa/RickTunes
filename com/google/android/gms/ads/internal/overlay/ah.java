package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;

@op
public final class ah implements Runnable {
    private C0431x f2194a;
    private boolean f2195b;

    ah(C0431x c0431x) {
        this.f2195b = false;
        this.f2194a = c0431x;
    }

    public final void m2633a() {
        this.f2195b = true;
        rd.f4041a.removeCallbacks(this);
    }

    public final void m2634b() {
        rd.f4041a.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.f2195b) {
            this.f2194a.m2741l();
            m2634b();
        }
    }
}
