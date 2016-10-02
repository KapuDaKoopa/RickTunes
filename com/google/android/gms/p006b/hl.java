package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.hl */
final class hl implements Runnable {
    final /* synthetic */ hm f3326a;
    final /* synthetic */ hn f3327b;
    final /* synthetic */ go f3328c;

    hl(go goVar, hm hmVar, hn hnVar) {
        this.f3328c = goVar;
        this.f3326a = hmVar;
        this.f3327b = hnVar;
    }

    public final void run() {
        try {
            this.f3326a.m3766a(this.f3327b);
        } catch (Throwable e) {
            C0501b.m3026a("Could not propagate interstitial ad event.", e);
        }
    }
}
