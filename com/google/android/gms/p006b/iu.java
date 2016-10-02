package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.iu */
final class iu implements sx {
    final /* synthetic */ jd f3421a;
    final /* synthetic */ il f3422b;

    iu(il ilVar, jd jdVar) {
        this.f3422b = ilVar;
        this.f3421a = jdVar;
    }

    public final /* synthetic */ void m3879a(Object obj) {
        synchronized (this.f3422b.f3399a) {
            this.f3422b.f3405g = 0;
            if (!(this.f3422b.f3404f == null || this.f3421a == this.f3422b.f3404f)) {
                qk.m4383a();
                this.f3422b.f3404f.m3896c();
            }
            this.f3422b.f3404f = this.f3421a;
        }
    }
}
