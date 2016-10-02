package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ot */
final class ot implements Runnable {
    final /* synthetic */ il f3785a;
    final /* synthetic */ pc f3786b;
    final /* synthetic */ cz f3787c;
    final /* synthetic */ cv f3788d;
    final /* synthetic */ String f3789e;

    ot(il ilVar, pc pcVar, cz czVar, cv cvVar, String str) {
        this.f3785a = ilVar;
        this.f3786b = pcVar;
        this.f3787c = czVar;
        this.f3788d = cvVar;
        this.f3789e = str;
    }

    public final void run() {
        iz b = this.f3785a.m3875b();
        this.f3786b.f3818f = b;
        this.f3787c.m3603a(this.f3788d, "rwc");
        b.m3884a(new ou(this, this.f3787c.m3599a()), new ov(this));
    }
}
