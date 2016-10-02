package com.google.android.gms.ads.internal.overlay;

/* renamed from: com.google.android.gms.ads.internal.overlay.f */
final class C0416f implements Runnable {
    final /* synthetic */ String f2214a;
    final /* synthetic */ String f2215b;
    final /* synthetic */ C0413c f2216c;

    C0416f(C0413c c0413c, String str, String str2) {
        this.f2216c = c0413c;
        this.f2214a = str;
        this.f2215b = str2;
    }

    public final void run() {
        if (this.f2216c.f2211p != null) {
            this.f2216c.f2211p.m2715a(this.f2214a, this.f2215b);
        }
    }
}
