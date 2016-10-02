package com.google.android.gms.ads.internal;

import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;

/* renamed from: com.google.android.gms.ads.internal.g */
final class C0398g implements Runnable {
    final /* synthetic */ qa f2131a;
    final /* synthetic */ C0377e f2132b;

    C0398g(C0377e c0377e, qa qaVar) {
        this.f2132b = c0377e;
        this.f2131a = qaVar;
    }

    public final void run() {
        this.f2132b.m2201b(new pz(this.f2131a));
    }
}
