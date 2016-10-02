package com.google.android.gms.p006b;

import com.google.ads.C0234b;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.lf */
final class lf implements Runnable {
    final /* synthetic */ C0234b f3572a;
    final /* synthetic */ le f3573b;

    lf(le leVar, C0234b c0234b) {
        this.f3573b = leVar;
        this.f3572a = c0234b;
    }

    public final void run() {
        try {
            this.f3573b.f3571a.m3911a(lh.m4174a(this.f3572a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }
}
