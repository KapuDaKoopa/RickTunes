package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0428r;

/* renamed from: com.google.android.gms.ads.internal.z */
final class C0507z implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel f2571a;
    final /* synthetic */ C0506y f2572b;

    C0507z(C0506y c0506y, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2572b = c0506y;
        this.f2571a = adOverlayInfoParcel;
    }

    public final void run() {
        ar.m2238c();
        C0428r.m2712a(this.f2572b.f2568a.f.f1858c, this.f2571a, true);
    }
}
