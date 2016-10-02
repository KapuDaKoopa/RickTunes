package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.q */
final class C0427q implements Runnable {
    final /* synthetic */ Drawable f2249a;
    final /* synthetic */ C0426p f2250b;

    C0427q(C0426p c0426p, Drawable drawable) {
        this.f2250b = c0426p;
        this.f2249a = drawable;
    }

    public final void run() {
        this.f2250b.f2248a.f2235o.getWindow().setBackgroundDrawable(this.f2249a);
    }
}
