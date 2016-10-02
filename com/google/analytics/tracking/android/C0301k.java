package com.google.analytics.tracking.android;

/* renamed from: com.google.analytics.tracking.android.k */
final class C0301k extends Thread {
    final /* synthetic */ C0300j f1653a;

    C0301k(C0300j c0300j, String str) {
        this.f1653a = c0300j;
        super(str);
    }

    public final void run() {
        synchronized (this.f1653a.f1652f) {
            this.f1653a.f1650d = this.f1653a.m1932b();
            this.f1653a.f1651e = true;
            this.f1653a.f1652f.notifyAll();
        }
    }
}
