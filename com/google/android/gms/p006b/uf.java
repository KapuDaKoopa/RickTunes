package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.uf */
final class uf implements Runnable {
    final /* synthetic */ String f4217a;
    final /* synthetic */ long f4218b;
    final /* synthetic */ ue f4219c;

    uf(ue ueVar, String str, long j) {
        this.f4219c = ueVar;
        this.f4217a = str;
        this.f4218b = j;
    }

    public final void run() {
        this.f4219c.f3011a.m4921a(this.f4217a, this.f4218b);
        this.f4219c.f3011a.m4920a(toString());
    }
}
