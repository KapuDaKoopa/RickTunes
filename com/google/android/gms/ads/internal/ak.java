package com.google.android.gms.ads.internal;

import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;

final class ak implements Runnable {
    final /* synthetic */ qa f1802a;
    final /* synthetic */ aj f1803b;

    ak(aj ajVar, qa qaVar) {
        this.f1803b = ajVar;
        this.f1802a = qaVar;
    }

    public final void run() {
        this.f1803b.m2201b(new pz(this.f1802a));
    }
}
