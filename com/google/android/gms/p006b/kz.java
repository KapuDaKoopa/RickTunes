package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.C0245j;
import com.google.android.gms.ads.mediation.C0518e;
import com.google.android.gms.ads.mediation.C0519g;
import com.google.android.gms.ads.mediation.C0520i;
import com.google.android.gms.common.internal.ax;

@op
/* renamed from: com.google.android.gms.b.kz */
public final class kz implements C0518e, C0519g, C0520i {
    C0245j f3555a;
    private final kk f3556b;

    public kz(kk kkVar) {
        this.f3556b = kkVar;
    }

    public final void m4096a() {
        ax.m5534b("onAdLoaded must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3916e();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLoaded.", e);
        }
    }

    public final void m4097a(int i) {
        ax.m5534b("onAdFailedToLoad must be called on the main UI thread.");
        "Adapter called onAdFailedToLoad with error. " + i;
        C0501b.m3027a(3);
        try {
            this.f3556b.m3911a(i);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void m4098a(C0245j c0245j) {
        ax.m5534b("onAdLoaded must be called on the main UI thread.");
        C0501b.m3027a(3);
        this.f3555a = c0245j;
        try {
            this.f3556b.m3916e();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLoaded.", e);
        }
    }

    public final void m4099b() {
        ax.m5534b("onAdOpened must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3915d();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdOpened.", e);
        }
    }

    public final void m4100b(int i) {
        ax.m5534b("onAdFailedToLoad must be called on the main UI thread.");
        "Adapter called onAdFailedToLoad with error " + i + ".";
        C0501b.m3027a(3);
        try {
            this.f3556b.m3911a(i);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void m4101c() {
        ax.m5534b("onAdClosed must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3913b();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClosed.", e);
        }
    }

    public final void m4102c(int i) {
        ax.m5534b("onAdFailedToLoad must be called on the main UI thread.");
        "Adapter called onAdFailedToLoad with error " + i + ".";
        C0501b.m3027a(3);
        try {
            this.f3556b.m3911a(i);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void m4103d() {
        ax.m5534b("onAdLeftApplication must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3914c();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void m4104e() {
        ax.m5534b("onAdClicked must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3910a();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClicked.", e);
        }
    }

    public final void m4105f() {
        ax.m5534b("onAdLoaded must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3916e();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLoaded.", e);
        }
    }

    public final void m4106g() {
        ax.m5534b("onAdOpened must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3915d();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdOpened.", e);
        }
    }

    public final void m4107h() {
        ax.m5534b("onAdClosed must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3913b();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClosed.", e);
        }
    }

    public final void m4108i() {
        ax.m5534b("onAdLeftApplication must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3914c();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void m4109j() {
        ax.m5534b("onAdClicked must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3910a();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClicked.", e);
        }
    }

    public final void m4110k() {
        ax.m5534b("onAdOpened must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3915d();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdOpened.", e);
        }
    }

    public final void m4111l() {
        ax.m5534b("onAdClosed must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3913b();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClosed.", e);
        }
    }

    public final void m4112m() {
        ax.m5534b("onAdLeftApplication must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3914c();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void m4113n() {
        ax.m5534b("onAdClicked must be called on the main UI thread.");
        C0501b.m3027a(3);
        try {
            this.f3556b.m3910a();
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onAdClicked.", e);
        }
    }
}
