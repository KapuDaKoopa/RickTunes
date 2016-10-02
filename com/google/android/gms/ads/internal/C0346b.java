package com.google.android.gms.ads.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.client.C0368s;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ae;
import com.google.android.gms.ads.internal.client.ar;
import com.google.android.gms.ads.internal.client.aw;
import com.google.android.gms.ads.internal.client.az;
import com.google.android.gms.ads.internal.overlay.ac;
import com.google.android.gms.ads.internal.request.C0345d;
import com.google.android.gms.ads.internal.reward.client.C0484g;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.ai;
import com.google.android.gms.p006b.at;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cv;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.df;
import com.google.android.gms.p006b.ev;
import com.google.android.gms.p006b.mq;
import com.google.android.gms.p006b.nc;
import com.google.android.gms.p006b.nv;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pt;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.qb;
import com.google.android.gms.p006b.qc;
import com.google.android.gms.p006b.qd;
import com.google.android.gms.p006b.qe;
import com.google.android.gms.p006b.qf;
import com.google.android.gms.p006b.qg;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.Collection;
import java.util.HashSet;

@op
/* renamed from: com.google.android.gms.ads.internal.b */
public abstract class C0346b extends ar implements C0260a, ac, C0345d, ev, nv, qf {
    protected cz f1790a;
    protected cv f1791b;
    protected cv f1792c;
    protected boolean f1793d;
    protected final ao f1794e;
    protected final as f1795f;
    protected transient AdRequestParcel f1796g;
    protected final at f1797h;
    protected final C0402k f1798i;

    C0346b(as asVar, C0402k c0402k) {
        this.f1793d = false;
        this.f1795f = asVar;
        this.f1794e = new ao(this);
        this.f1798i = c0402k;
        ar.m2240e().m4458b(this.f1795f.f1858c);
        ar.m2243h().m4364a(this.f1795f.f1858c, this.f1795f.f1860e);
        this.f1797h = ar.m2243h().f3976c;
    }

    private static long m2143b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            C0501b.m3025a("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            C0501b.m3025a("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    public final C0314a m2144a() {
        ax.m5534b("getAdFrame must be called on the main UI thread.");
        return C0317d.m1996a(this.f1795f.f1861f);
    }

    protected final void m2145a(int i) {
        C0501b.m3025a("Failed to load ad: " + i);
        this.f1793d = false;
        if (this.f1795f.f1869n != null) {
            try {
                this.f1795f.f1869n.m2284a(i);
            } catch (Throwable e) {
                C0501b.m3026a("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2927a(i);
            } catch (Throwable e2) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    protected final void m2146a(View view) {
        this.f1795f.f1861f.addView(view, ar.m2242g().m4479d());
    }

    public final void m2147a(AdSizeParcel adSizeParcel) {
        ax.m5534b("setAdSize must be called on the main UI thread.");
        this.f1795f.f1864i = adSizeParcel;
        if (!(this.f1795f.f1865j == null || this.f1795f.f1865j.f3926b == null || this.f1795f.f1845D != 0)) {
            this.f1795f.f1865j.f3926b.m4557a(adSizeParcel);
        }
        if (this.f1795f.f1861f != null) {
            if (this.f1795f.f1861f.getChildCount() > 1) {
                this.f1795f.f1861f.removeView(this.f1795f.f1861f.getNextView());
            }
            this.f1795f.f1861f.setMinimumWidth(adSizeParcel.f1908g);
            this.f1795f.f1861f.setMinimumHeight(adSizeParcel.f1905d);
            this.f1795f.f1861f.requestLayout();
        }
    }

    public final void m2148a(ab abVar) {
        ax.m5534b("setAdListener must be called on the main UI thread.");
        this.f1795f.f1868m = abVar;
    }

    public final void m2149a(ae aeVar) {
        ax.m5534b("setAdListener must be called on the main UI thread.");
        this.f1795f.f1869n = aeVar;
    }

    public final void m2150a(aw awVar) {
        ax.m5534b("setAppEventListener must be called on the main UI thread.");
        this.f1795f.f1870o = awVar;
    }

    public final void m2151a(az azVar) {
        ax.m5534b("setCorrelationIdProvider must be called on the main UI thread");
        this.f1795f.f1871p = azVar;
    }

    public final void m2152a(C0484g c0484g) {
        ax.m5534b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f1795f.f1880y = c0484g;
    }

    protected final void m2153a(RewardItemParcel rewardItemParcel) {
        if (this.f1795f.f1880y != null) {
            try {
                String str = "";
                int i = 0;
                if (rewardItemParcel != null) {
                    str = rewardItemParcel.f2513b;
                    i = rewardItemParcel.f2514c;
                }
                this.f1795f.f1880y.m2928a(new pt(str, i));
            } catch (Throwable e) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public void m2154a(df dfVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void m2155a(mq mqVar) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void m2156a(nc ncVar, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public final void m2157a(qa qaVar) {
        if (!(qaVar.f3953b.f2369n == -1 || TextUtils.isEmpty(qaVar.f3953b.f2381z))) {
            long b = C0346b.m2143b(qaVar.f3953b.f2381z);
            if (b != -1) {
                cv a = this.f1790a.m3600a(b + qaVar.f3953b.f2369n);
                this.f1790a.m3603a(a, "stc");
            }
        }
        cz czVar = this.f1790a;
        String str = qaVar.f3953b.f2381z;
        if (czVar.f3120a) {
            synchronized (czVar.f3121b) {
                czVar.f3122c = str;
            }
        }
        this.f1790a.m3603a(this.f1791b, "arf");
        this.f1792c = this.f1790a.m3599a();
        this.f1790a.m3601a("gqi", qaVar.f3953b.f2348A);
        this.f1795f.f1862g = null;
        this.f1795f.f1866k = qaVar;
        m2158a(qaVar, this.f1790a);
    }

    protected abstract void m2158a(qa qaVar, cz czVar);

    public final void m2159a(String str) {
        ax.m5534b("setUserId must be called on the main UI thread.");
        this.f1795f.m2259a(str);
    }

    public final void m2160a(String str, String str2) {
        if (this.f1795f.f1870o != null) {
            try {
                this.f1795f.f1870o.m2346a(str, str2);
            } catch (Throwable e) {
                C0501b.m3026a("Could not call the AppEventListener.", e);
            }
        }
    }

    public final void m2161a(HashSet hashSet) {
        this.f1795f.m2260a(hashSet);
    }

    public void m2162a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean m2163a(AdRequestParcel adRequestParcel) {
        ax.m5534b("loadAd must be called on the main UI thread.");
        if (C0706q.m5361g(this.f1795f.f1858c) && adRequestParcel.f1894k != null) {
            C0368s c0368s = new C0368s(adRequestParcel);
            c0368s.f2022j = null;
            adRequestParcel = new AdRequestParcel(7, c0368s.f2013a, c0368s.f2014b, c0368s.f2015c, c0368s.f2016d, c0368s.f2017e, c0368s.f2018f, c0368s.f2019g, c0368s.f2020h, c0368s.f2021i, c0368s.f2022j, c0368s.f2023k, c0368s.f2024l, c0368s.f2025m, c0368s.f2026n, c0368s.f2027o, c0368s.f2028p, c0368s.f2029q);
        }
        if (this.f1795f.f1862g == null && this.f1795f.f1863h == null) {
            C0501b.m3027a(4);
            this.f1790a = new cz(((Boolean) ar.m2249n().m3580a(ck.f3042G)).booleanValue(), "load_ad", this.f1795f.f1864i.f1903b);
            this.f1791b = new cv(-1, null, null);
            this.f1792c = new cv(-1, null, null);
            this.f1791b = this.f1790a.m3599a();
            if (!adRequestParcel.f1889f) {
                StringBuilder stringBuilder = new StringBuilder("Use AdRequest.Builder.addTestDevice(\"");
                C0374z.m2455a();
                stringBuilder.append(C0500a.m3011a(this.f1795f.f1858c)).append("\") to get test ads on this device.").toString();
                C0501b.m3027a(4);
            }
            this.f1793d = m2164a(adRequestParcel, this.f1790a);
            return this.f1793d;
        }
        if (this.f1796g != null) {
            C0501b.m3025a("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            C0501b.m3025a("Loading already in progress, saving this object for future refreshes.");
        }
        this.f1796g = adRequestParcel;
        return false;
    }

    protected abstract boolean m2164a(AdRequestParcel adRequestParcel, cz czVar);

    boolean m2165a(pz pzVar) {
        return false;
    }

    protected abstract boolean m2166a(pz pzVar, pz pzVar2);

    public final void m2167b() {
        ax.m5534b("destroy must be called on the main UI thread.");
        this.f1794e.m2232a();
        at atVar = this.f1797h;
        pz pzVar = this.f1795f.f1865j;
        synchronized (atVar.f2928a) {
            ai aiVar = (ai) atVar.f2929b.get(pzVar);
            if (aiVar != null) {
                aiVar.m3453g();
            }
        }
        this.f1795f.m2268h();
    }

    public void m2168b(pz pzVar) {
        this.f1790a.m3603a(this.f1792c, "awr");
        this.f1795f.f1863h = null;
        if (!(pzVar.f3928d == -2 || pzVar.f3928d == 3)) {
            qd h = ar.m2243h();
            Collection a = this.f1795f.m2258a();
            synchronized (h.f3974a) {
                h.f3977d.addAll(a);
            }
        }
        if (pzVar.f3928d == -1) {
            this.f1793d = false;
            return;
        }
        if (m2165a(pzVar)) {
            C0501b.m3027a(3);
        }
        if (pzVar.f3928d != -2) {
            m2145a(pzVar.f3928d);
            return;
        }
        if (this.f1795f.f1843B == null) {
            this.f1795f.f1843B = new qg(this.f1795f.f1857b);
        }
        this.f1797h.m3481a(this.f1795f.f1865j);
        if (m2166a(this.f1795f.f1865j, pzVar)) {
            this.f1795f.f1865j = pzVar;
            this.f1795f.m2267g();
            this.f1790a.m3601a("is_mraid", this.f1795f.f1865j.m4353a() ? "1" : "0");
            this.f1790a.m3601a("is_mediation", this.f1795f.f1865j.f3937m ? "1" : "0");
            if (!(this.f1795f.f1865j.f3926b == null || this.f1795f.f1865j.f3926b.m4579l() == null)) {
                this.f1790a.m3601a("is_video", this.f1795f.f1865j.f3926b.m4579l().m4617c() ? "1" : "0");
            }
            this.f1790a.m3603a(this.f1791b, "ttc");
            if (ar.m2243h().m4370c() != null) {
                ar.m2243h().m4370c().m3587a(this.f1790a);
            }
            if (this.f1795f.m2264d()) {
                m2182o();
            }
        }
    }

    protected boolean m2169b(AdRequestParcel adRequestParcel) {
        ViewParent parent = this.f1795f.f1861f.getParent();
        return (parent instanceof View) && ((View) parent).isShown() && ar.m2240e().m4457a();
    }

    public final void m2170c(AdRequestParcel adRequestParcel) {
        if (m2169b(adRequestParcel)) {
            m2163a(adRequestParcel);
            return;
        }
        C0501b.m3027a(4);
        this.f1794e.m2233a(adRequestParcel);
    }

    protected final void m2171c(pz pzVar) {
        if (pzVar == null) {
            C0501b.m3025a("Ad state was null when trying to ping impression URLs.");
            return;
        }
        C0501b.m3027a(3);
        qb qbVar = this.f1795f.f1867l;
        synchronized (qbVar.f3962c) {
            if (qbVar.f3969j != -1 && qbVar.f3964e == -1) {
                qbVar.f3964e = SystemClock.elapsedRealtime();
                qbVar.f3960a.m4366a(qbVar);
            }
            qe b = qbVar.f3960a.m4369b();
            synchronized (b.f4002d) {
                b.f4005g++;
            }
        }
        if (pzVar.f3929e != null && !pzVar.f3923C) {
            ar.m2240e();
            rd.m4417a(this.f1795f.f1858c, this.f1795f.f1860e.f2539b, pzVar.f3929e);
            pzVar.f3923C = true;
        }
    }

    public final boolean m2172c() {
        ax.m5534b("isLoaded must be called on the main UI thread.");
        return this.f1795f.f1862g == null && this.f1795f.f1863h == null && this.f1795f.f1865j != null;
    }

    public void c_() {
        ax.m5534b("resume must be called on the main UI thread.");
    }

    public void m2173d() {
        ax.m5534b("pause must be called on the main UI thread.");
    }

    public void m2174e() {
        if (this.f1795f.f1865j == null) {
            C0501b.m3025a("Ad state was null when trying to ping click URLs.");
            return;
        }
        C0501b.m3027a(3);
        qb qbVar = this.f1795f.f1867l;
        synchronized (qbVar.f3962c) {
            if (qbVar.f3969j != -1) {
                qc qcVar = new qc();
                qcVar.f3972a = SystemClock.elapsedRealtime();
                qbVar.f3961b.add(qcVar);
                qbVar.f3967h++;
                qe b = qbVar.f3960a.m4369b();
                synchronized (b.f4002d) {
                    b.f4004f++;
                }
                qbVar.f3960a.m4366a(qbVar);
            }
        }
        if (this.f1795f.f1865j.f3927c != null) {
            ar.m2240e();
            rd.m4417a(this.f1795f.f1858c, this.f1795f.f1860e.f2539b, this.f1795f.f1865j.f3927c);
        }
        if (this.f1795f.f1868m != null) {
            try {
                this.f1795f.f1868m.m2281a();
            } catch (Throwable e) {
                C0501b.m3026a("Could not notify onAdClicked event.", e);
            }
        }
    }

    public final void m2175g() {
        ax.m5534b("stopLoading must be called on the main UI thread.");
        this.f1793d = false;
        this.f1795f.m2261a(true);
    }

    public final void m2176h() {
        ax.m5534b("recordManualImpression must be called on the main UI thread.");
        if (this.f1795f.f1865j == null) {
            C0501b.m3025a("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C0501b.m3027a(3);
        if (this.f1795f.f1865j.f3930f != null && !this.f1795f.f1865j.f3924D) {
            ar.m2240e();
            rd.m4417a(this.f1795f.f1858c, this.f1795f.f1860e.f2539b, this.f1795f.f1865j.f3930f);
            this.f1795f.f1865j.f3924D = true;
        }
    }

    public final AdSizeParcel m2177i() {
        ax.m5534b("getAdSize must be called on the main UI thread.");
        return this.f1795f.f1864i == null ? null : new ThinAdSizeParcel(this.f1795f.f1864i);
    }

    public final boolean m2178k() {
        return this.f1793d;
    }

    public final void m2179l() {
        C0501b.m3027a(4);
        if (this.f1795f.f1869n != null) {
            try {
                this.f1795f.f1869n.m2285b();
            } catch (Throwable e) {
                C0501b.m3026a("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2932e();
            } catch (Throwable e2) {
                C0501b.m3026a("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    protected void m2180m() {
        C0501b.m3027a(4);
        if (this.f1795f.f1869n != null) {
            try {
                this.f1795f.f1869n.m2283a();
            } catch (Throwable e) {
                C0501b.m3026a("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2931d();
            } catch (Throwable e2) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    protected final void m2181n() {
        C0501b.m3027a(4);
        if (this.f1795f.f1869n != null) {
            try {
                this.f1795f.f1869n.m2287d();
            } catch (Throwable e) {
                C0501b.m3026a("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2929b();
            } catch (Throwable e2) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    protected void m2182o() {
        C0501b.m3027a(4);
        this.f1793d = false;
        if (this.f1795f.f1869n != null) {
            try {
                this.f1795f.f1869n.m2286c();
            } catch (Throwable e) {
                C0501b.m3026a("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2926a();
            } catch (Throwable e2) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    protected final void m2183p() {
        if (this.f1795f.f1880y != null) {
            try {
                this.f1795f.f1880y.m2930c();
            } catch (Throwable e) {
                C0501b.m3026a("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }
}
