package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0428r;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.fu;
import com.google.android.gms.p006b.ga;
import com.google.android.gms.p006b.gb;
import com.google.android.gms.p006b.ji;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rg;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.tm;

@op
/* renamed from: com.google.android.gms.ads.internal.w */
public final class C0504w extends C0377e implements fu, gb {
    protected transient boolean f2562l;
    private boolean f2563m;
    private float f2564n;
    private String f2565o;

    public C0504w(Context context, AdSizeParcel adSizeParcel, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        super(context, adSizeParcel, str, keVar, versionInfoParcel, c0402k);
        this.f2562l = false;
        this.f2565o = "background" + hashCode() + ".png";
    }

    private void m3040a(Bundle bundle) {
        ar.m2240e();
        rd.m4436b(this.f.f1858c, this.f.f1860e.f2539b, "gmob-apps", bundle, false);
    }

    protected final boolean m3043B() {
        if (!(this.f.f1858c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f.f1858c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
    }

    public final void m3044C() {
        new C0505x(this, this.f2565o).m2709g();
        if (this.f.m2264d()) {
            this.f.m2262b();
            this.f.f1865j = null;
            this.f.f1847F = false;
            this.f2562l = false;
        }
    }

    public final void m3045D() {
        if (!(this.f.f1865j == null || this.f.f1865j.f3947w == null)) {
            ar.m2240e();
            rd.m4417a(this.f.f1858c, this.f.f1860e.f2539b, this.f.f1865j.f3947w);
        }
        m2183p();
    }

    protected final tf m3046a(qa qaVar, C0403l c0403l) {
        ar.m2241f();
        tf a = tm.m4623a(this.f.f1858c, this.f.f1864i, false, false, this.f.f1859d, this.f.f1860e, this.a, this.i);
        a.m4579l().m4606a(this, null, this, this, ((Boolean) ar.m2249n().m3580a(ck.f3057V)).booleanValue(), this, this, c0403l, null);
        m2471a((ji) a);
        a.m4567b(qaVar.f3952a.f2344w);
        a.m4579l().m4611a("/reward", new ga(this));
        return a;
    }

    public final void m3047a(boolean z, float f) {
        this.f2563m = z;
        this.f2564n = f;
    }

    public final boolean m3048a(AdRequestParcel adRequestParcel, cz czVar) {
        if (this.f.f1865j == null) {
            return super.m2197a(adRequestParcel, czVar);
        }
        C0501b.m3025a("An interstitial is already loading. Aborting.");
        return false;
    }

    protected final boolean m3049a(AdRequestParcel adRequestParcel, pz pzVar, boolean z) {
        if (this.f.m2264d() && pzVar.f3926b != null) {
            ar.m2242g();
            rg.m4459a(pzVar.f3926b);
        }
        return this.e.f1814d;
    }

    public final boolean m3050a(pz pzVar, pz pzVar2) {
        if (!super.m2473a(pzVar, pzVar2)) {
            return false;
        }
        if (!(this.f.m2264d() || this.f.f1844C == null || pzVar2.f3934j == null)) {
            this.h.m3478a(this.f.f1864i, pzVar2, this.f.f1844C);
        }
        return true;
    }

    public final void m3051b(RewardItemParcel rewardItemParcel) {
        if (this.f.f1865j != null) {
            if (this.f.f1865j.f3948x != null) {
                ar.m2240e();
                rd.m4417a(this.f.f1858c, this.f.f1860e.f2539b, this.f.f1865j.f3948x);
            }
            if (this.f.f1865j.f3946v != null) {
                rewardItemParcel = this.f.f1865j.f3946v;
            }
        }
        m2153a(rewardItemParcel);
    }

    public final void m3052b(boolean z) {
        this.f.f1847F = z;
    }

    public final void e_() {
        m2213w();
        super.e_();
    }

    public final void m3053f() {
        ax.m5534b("showInterstitial must be called on the main UI thread.");
        if (this.f.f1865j == null) {
            C0501b.m3025a("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) ar.m2249n().m3580a(ck.an)).booleanValue()) {
            Bundle bundle;
            String packageName = this.f.f1858c.getApplicationContext() != null ? this.f.f1858c.getApplicationContext().getPackageName() : this.f.f1858c.getPackageName();
            if (!this.f2562l) {
                C0501b.m3025a("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m3040a(bundle);
            }
            ar.m2240e();
            if (!rd.m4447f(this.f.f1858c)) {
                C0501b.m3025a("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                m3040a(bundle);
            }
        }
        if (!this.f.m2265e()) {
            if (this.f.f1865j.f3937m) {
                try {
                    this.f.f1865j.f3939o.m3973b();
                } catch (Throwable e) {
                    C0501b.m3026a("Could not show interstitial.", e);
                    m3044C();
                }
            } else if (this.f.f1865j.f3926b == null) {
                C0501b.m3025a("The interstitial failed to load.");
            } else if (this.f.f1865j.f3926b.m4583p()) {
                C0501b.m3025a("The interstitial is already showing.");
            } else {
                Bitmap g;
                this.f.f1865j.f3926b.m4563a(true);
                if (this.f.f1865j.f3934j != null) {
                    this.h.m3477a(this.f.f1864i, this.f.f1865j);
                }
                if (this.f.f1847F) {
                    ar.m2240e();
                    g = rd.m4449g(this.f.f1858c);
                } else {
                    g = null;
                }
                if (!((Boolean) ar.m2249n().m3580a(ck.aE)).booleanValue() || g == null) {
                    InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.f.f1847F, m3043B(), null, false, 0.0f);
                    int q = this.f.f1865j.f3926b.m4584q();
                    if (q == -1) {
                        q = this.f.f1865j.f3931g;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f.f1865j.f3926b, q, this.f.f1860e, this.f.f1865j.f3921A, interstitialAdParameterParcel);
                    ar.m2238c();
                    C0428r.m2712a(this.f.f1858c, adOverlayInfoParcel, true);
                    return;
                }
                new C0506y(this, g, this.f2565o).m2709g();
            }
        }
    }

    protected final void m3054m() {
        m3044C();
        super.m2180m();
    }

    protected final void m3055o() {
        super.m2182o();
        this.f2562l = true;
    }
}
