package com.google.android.gms.ads.internal.request;

/* renamed from: com.google.android.gms.ads.internal.request.f */
final class C0454f implements Runnable {
    final /* synthetic */ C0453e f2456a;

    C0454f(C0453e c0453e) {
        this.f2456a = c0453e;
    }

    public final void run() {
        synchronized (this.f2456a.f2447b) {
            if (this.f2456a.f2450e == null) {
                return;
            }
            this.f2456a.m2838b();
            this.f2456a.m2836a(2, "Timed out waiting for ad response.");
        }
    }
}
