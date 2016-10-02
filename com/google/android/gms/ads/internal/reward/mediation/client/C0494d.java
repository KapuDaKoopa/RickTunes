package com.google.android.gms.ads.internal.reward.mediation.client;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.p007b.C0325a;
import com.google.android.gms.ads.p007b.p008a.C0238a;
import com.google.android.gms.ads.p007b.p008a.C0324b;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0317d;

@op
/* renamed from: com.google.android.gms.ads.internal.reward.mediation.client.d */
public final class C0494d implements C0324b {
    private final C0491a f2516a;

    public C0494d(C0491a c0491a) {
        this.f2516a = c0491a;
    }

    public final void m2973a(C0238a c0238a) {
        ax.m5534b("onInitializationSucceeded must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2953a(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onInitializationSucceeded.", e);
        }
    }

    public final void m2974a(C0238a c0238a, int i) {
        ax.m5534b("onAdFailedToLoad must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2957b(C0317d.m1996a((Object) c0238a), i);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void m2975a(C0238a c0238a, C0325a c0325a) {
        ax.m5534b("onRewarded must be called on the main UI thread.");
        C0501b.m3027a(3);
        if (c0325a != null) {
            try {
                this.f2516a.m2955a(C0317d.m1996a((Object) c0238a), new RewardItemParcel(c0325a));
                return;
            } catch (Throwable e) {
                C0501b.m3026a("Could not call onRewarded.", e);
                return;
            }
        }
        this.f2516a.m2955a(C0317d.m1996a((Object) c0238a), new RewardItemParcel(c0238a.getClass().getName(), 1));
    }

    public final void m2976b(C0238a c0238a) {
        ax.m5534b("onAdLoaded must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2956b(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLoaded.", e);
        }
    }

    public final void m2977c(C0238a c0238a) {
        ax.m5534b("onAdOpened must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2958c(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdOpened.", e);
        }
    }

    public final void m2978d(C0238a c0238a) {
        ax.m5534b("onVideoStarted must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2959d(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onVideoStarted.", e);
        }
    }

    public final void m2979e(C0238a c0238a) {
        ax.m5534b("onAdClosed must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2960e(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClosed.", e);
        }
    }

    public final void m2980f(C0238a c0238a) {
        ax.m5534b("onAdLeftApplication must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f2516a.m2962g(C0317d.m1996a((Object) c0238a));
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLeftApplication.", e);
        }
    }
}
