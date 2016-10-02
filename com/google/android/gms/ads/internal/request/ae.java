package com.google.android.gms.ads.internal.request;

import com.google.android.gms.p006b.qa;

final class ae implements Runnable {
    final /* synthetic */ qa f2435a;
    final /* synthetic */ ad f2436b;

    ae(ad adVar, qa qaVar) {
        this.f2436b = adVar;
        this.f2435a = qaVar;
    }

    public final void run() {
        this.f2436b.f2430h.m2139a(this.f2435a);
        if (this.f2436b.f2434m != null) {
            this.f2436b.f2434m.m3888a();
            this.f2436b.f2434m = null;
        }
    }
}
