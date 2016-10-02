package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.purchase.C0443k;

/* renamed from: com.google.android.gms.ads.internal.d */
final class C0375d implements Runnable {
    final /* synthetic */ Intent f2044a;
    final /* synthetic */ C0349c f2045b;

    C0375d(C0349c c0349c, Intent intent) {
        this.f2045b = c0349c;
        this.f2044a = intent;
    }

    public final void run() {
        ar.m2250o();
        int a = C0443k.m2798a(this.f2044a);
        ar.m2250o();
        if (!(a != 0 || this.f2045b.f.f1865j == null || this.f2045b.f.f1865j.f3926b == null || this.f2045b.f.f1865j.f3926b.m4576i() == null)) {
            this.f2045b.f.f1865j.f3926b.m4576i().m2682a();
        }
        this.f2045b.f.f1846E = false;
    }
}
