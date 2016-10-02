package com.google.android.gms.p006b;

import com.google.ads.C0234b;
import com.google.ads.mediation.C0267k;
import com.google.ads.mediation.C0268m;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.le */
public final class le implements C0267k, C0268m {
    final kk f3571a;

    public le(kk kkVar) {
        this.f3571a = kkVar;
    }

    public final void m4172a(C0234b c0234b) {
        "Adapter called onFailedToReceiveAd with error. " + c0234b;
        C0501b.m3027a(3);
        C0374z.m2455a();
        if (C0500a.m3020b()) {
            try {
                this.f3571a.m3911a(lh.m4174a(c0234b));
                return;
            } catch (Throwable e) {
                C0501b.m3026a("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        C0501b.m3025a("onFailedToReceiveAd must be called on the main UI thread.");
        C0500a.f2543a.post(new lg(this, c0234b));
    }

    public final void m4173b(C0234b c0234b) {
        "Adapter called onFailedToReceiveAd with error " + c0234b + ".";
        C0501b.m3027a(3);
        C0374z.m2455a();
        if (C0500a.m3020b()) {
            try {
                this.f3571a.m3911a(lh.m4174a(c0234b));
                return;
            } catch (Throwable e) {
                C0501b.m3026a("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        C0501b.m3025a("onFailedToReceiveAd must be called on the main UI thread.");
        C0500a.f2543a.post(new lf(this, c0234b));
    }
}
