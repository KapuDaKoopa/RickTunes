package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.p006b.tf;

/* renamed from: com.google.android.gms.ads.internal.formats.s */
final class C0397s implements Runnable {
    final /* synthetic */ C0387j f2129a;
    final /* synthetic */ C0396r f2130b;

    C0397s(C0396r c0396r, C0387j c0387j) {
        this.f2130b = c0396r;
        this.f2129a = c0387j;
    }

    public final void run() {
        tf d = this.f2129a.m2577d();
        if (d != null) {
            this.f2130b.f2125f.addView(d.m4564b());
        }
    }
}
