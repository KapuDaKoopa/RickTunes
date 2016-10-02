package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.is */
final class is implements Runnable {
    final /* synthetic */ hy f3418a;
    final /* synthetic */ im f3419b;

    is(im imVar, hy hyVar) {
        this.f3419b = imVar;
        this.f3418a = hyVar;
    }

    public final void run() {
        synchronized (this.f3419b.f3408b.f3399a) {
            if (this.f3419b.f3407a.m3887e() == -1 || this.f3419b.f3407a.m3887e() == 1) {
                return;
            }
            this.f3419b.f3407a.m3886d();
            rd.m4419a(new it(this));
            qk.m4383a();
        }
    }
}
