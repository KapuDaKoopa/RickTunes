package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ab;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.b.nz */
final class nz implements Runnable {
    final /* synthetic */ CountDownLatch f3712a;
    final /* synthetic */ ny f3713b;

    nz(ny nyVar, CountDownLatch countDownLatch) {
        this.f3713b = nyVar;
        this.f3712a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f3713b.d) {
            this.f3713b.f3707i = ab.m2098a(this.f3713b.f3706h, this.f3713b.f3705g, this.f3712a);
        }
    }
}
