package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.tf;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ae implements fk {
    final /* synthetic */ CountDownLatch f1780a;

    ae(CountDownLatch countDownLatch) {
        this.f1780a = countDownLatch;
    }

    public final void m2105a(tf tfVar, Map map) {
        this.f1780a.countDown();
        View b = tfVar.m4564b();
        if (b != null) {
            b.setVisibility(0);
        }
    }
}
