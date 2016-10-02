package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.io */
final class io implements Runnable {
    final /* synthetic */ in f3411a;

    io(in inVar) {
        this.f3411a = inVar;
    }

    public final void run() {
        synchronized (this.f3411a.f3410b.f3408b.f3399a) {
            if (this.f3411a.f3410b.f3407a.m3887e() == -1 || this.f3411a.f3410b.f3407a.m3887e() == 1) {
                return;
            }
            this.f3411a.f3410b.f3407a.m3886d();
            rd.m4419a(new ip(this));
            qk.m4383a();
        }
    }
}
