package com.google.android.gms.p006b;

import java.util.Map;

/* renamed from: com.google.android.gms.b.iq */
final class iq implements fk {
    final /* synthetic */ hy f3413a;
    final /* synthetic */ im f3414b;

    iq(im imVar, hy hyVar) {
        this.f3414b = imVar;
        this.f3413a = hyVar;
    }

    public final void m3877a(tf tfVar, Map map) {
        synchronized (this.f3414b.f3408b.f3399a) {
            if (this.f3414b.f3407a.m3887e() == -1 || this.f3414b.f3407a.m3887e() == 1) {
                return;
            }
            this.f3414b.f3408b.f3405g = 0;
            this.f3414b.f3408b.f3403e.m2828a(this.f3413a);
            this.f3414b.f3407a.m3885a(this.f3413a);
            this.f3414b.f3408b.f3404f = this.f3414b.f3407a;
            qk.m4383a();
        }
    }
}
