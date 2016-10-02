package com.google.android.gms.p006b;

import com.google.ads.C0234b;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.lg */
final class lg implements Runnable {
    final /* synthetic */ C0234b f3574a;
    final /* synthetic */ le f3575b;

    lg(le leVar, C0234b c0234b) {
        this.f3575b = leVar;
        this.f3574a = c0234b;
    }

    public final void run() {
        try {
            this.f3575b.f3571a.m3911a(lh.m4174a(this.f3574a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }
}
