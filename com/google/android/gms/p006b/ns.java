package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ns */
final class ns implements Runnable {
    final /* synthetic */ pz f3699a;
    final /* synthetic */ nq f3700b;

    ns(nq nqVar, pz pzVar) {
        this.f3700b = nqVar;
        this.f3699a = pzVar;
    }

    public final void run() {
        synchronized (this.f3700b.f3694c) {
            this.f3700b.m4263a(this.f3699a);
        }
    }
}
