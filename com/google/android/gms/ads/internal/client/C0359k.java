package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.ads.internal.client.k */
final class C0359k implements Runnable {
    final /* synthetic */ C0358j f2009a;

    C0359k(C0358j c0358j) {
        this.f2009a = c0358j;
    }

    public final void run() {
        if (this.f2009a.f2008a != null) {
            try {
                this.f2009a.f2008a.m2284a(1);
            } catch (Throwable e) {
                C0501b.m3026a("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
