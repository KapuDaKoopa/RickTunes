package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.u */
final class C0499u implements Runnable {
    final /* synthetic */ AdRequestParcel f2536a;
    final /* synthetic */ C0498t f2537b;

    C0499u(C0498t c0498t, AdRequestParcel adRequestParcel) {
        this.f2537b = c0498t;
        this.f2536a = adRequestParcel;
    }

    public final void run() {
        synchronized (this.f2537b.f2535o) {
            aj c = this.f2537b.m3008c();
            this.f2537b.f2533m = new WeakReference(c);
            c.m2220a(this.f2537b.f2524d);
            c.m2221a(this.f2537b.f2525e);
            c.m2216a(this.f2537b.f2526f);
            c.m2149a(this.f2537b.f2522b);
            c.m2228b(this.f2537b.f2527g);
            c.m2224a(this.f2537b.m2999d());
            c.m2217a(this.f2537b.f2528h);
            c.m2151a(this.f2537b.f2530j);
            c.m2163a(this.f2536a);
        }
    }
}
