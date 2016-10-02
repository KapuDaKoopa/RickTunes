package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.tf;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class af implements fk {
    final /* synthetic */ CountDownLatch f1781a;

    af(CountDownLatch countDownLatch) {
        this.f1781a = countDownLatch;
    }

    public final void m2106a(tf tfVar, Map map) {
        C0501b.m3025a("Adapter returned an ad, but assets substitution failed");
        this.f1781a.countDown();
        tfVar.destroy();
    }
}
