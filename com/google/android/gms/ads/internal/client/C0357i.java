package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.ads.internal.client.i */
final class C0357i implements Runnable {
    final /* synthetic */ C0356h f2007a;

    C0357i(C0356h c0356h) {
        this.f2007a = c0356h;
    }

    public final void run() {
        if (this.f2007a.f2006a.f2005a != null) {
            try {
                this.f2007a.f2006a.f2005a.m2284a(1);
            } catch (Throwable e) {
                C0501b.m3026a("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
