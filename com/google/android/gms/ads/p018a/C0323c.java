package com.google.android.gms.ads.p018a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.a.c */
final class C0323c extends Thread {
    CountDownLatch f1734a;
    boolean f1735b;
    private WeakReference f1736c;
    private long f1737d;

    public C0323c(C0321a c0321a, long j) {
        this.f1736c = new WeakReference(c0321a);
        this.f1737d = j;
        this.f1734a = new CountDownLatch(1);
        this.f1735b = false;
        start();
    }

    private void m2021c() {
        C0321a c0321a = (C0321a) this.f1736c.get();
        if (c0321a != null) {
            c0321a.m2020b();
            this.f1735b = true;
        }
    }

    public final void m2022a() {
        this.f1734a.countDown();
    }

    public final boolean m2023b() {
        return this.f1735b;
    }

    public final void run() {
        try {
            if (!this.f1734a.await(this.f1737d, TimeUnit.MILLISECONDS)) {
                m2021c();
            }
        } catch (InterruptedException e) {
            m2021c();
        }
    }
}
