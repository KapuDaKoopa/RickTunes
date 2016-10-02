package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.overlay.C0347t;
import com.google.android.gms.ads.internal.overlay.C0410z;
import com.google.android.gms.ads.internal.purchase.C0348m;
import com.google.android.gms.ads.internal.purchase.C0435c;
import com.google.android.gms.ads.internal.purchase.C0437e;
import com.google.android.gms.ads.internal.purchase.C0439g;
import com.google.android.gms.ads.internal.purchase.C0440h;
import com.google.android.gms.ads.internal.purchase.C0445n;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.request.C0448a;
import com.google.android.gms.ads.internal.request.C0453e;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.request.ad;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.bg;
import com.google.android.gms.p006b.bj;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.fs;
import com.google.android.gms.p006b.jq;
import com.google.android.gms.p006b.jx;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.mj;
import com.google.android.gms.p006b.mn;
import com.google.android.gms.p006b.mq;
import com.google.android.gms.p006b.nc;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qb;
import com.google.android.gms.p006b.qc;
import com.google.android.gms.p006b.qd;
import com.google.android.gms.p006b.qe;
import com.google.android.gms.p006b.qg;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rg;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@op
/* renamed from: com.google.android.gms.ads.internal.c */
public abstract class C0349c extends C0346b implements C0347t, C0348m, fs, jq {
    protected final ke f1799j;
    protected transient boolean f1800k;
    private final Messenger f1801l;

    public C0349c(Context context, AdSizeParcel adSizeParcel, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        this(new as(context, adSizeParcel, str, versionInfoParcel), keVar, c0402k);
    }

    private C0349c(as asVar, ke keVar, C0402k c0402k) {
        super(asVar, c0402k);
        this.f1799j = keVar;
        this.f1801l = new Messenger(new mj(this.f.f1858c));
        this.f1800k = false;
    }

    private C0448a m2191a(AdRequestParcel adRequestParcel, Bundle bundle) {
        PackageInfo packageInfo;
        int i;
        ApplicationInfo applicationInfo = this.f.f1858c.getApplicationInfo();
        try {
            packageInfo = this.f.f1858c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f.f1858c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.f.f1861f == null || this.f.f1861f.getParent() == null)) {
            int[] iArr = new int[2];
            this.f.f1861f.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = this.f.f1861f.getWidth();
            int height = this.f.f1861f.getHeight();
            i = 0;
            if (this.f.f1861f.isShown() && i2 + width > 0 && i3 + height > 0 && i2 <= displayMetrics.widthPixels && i3 <= displayMetrics.heightPixels) {
                i = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i2);
            bundle2.putInt("y", i3);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i);
        }
        String a = ar.m2243h().m4360a();
        this.f.f1867l = new qb(a, this.f.f1857b);
        qb qbVar = this.f.f1867l;
        synchronized (qbVar.f3962c) {
            qbVar.f3968i = SystemClock.elapsedRealtime();
            qe b = qbVar.f3960a.m4369b();
            long j = qbVar.f3968i;
            synchronized (b.f4002d) {
                if (b.f4000b == -1) {
                    b.f4000b = j;
                    b.f3999a = b.f4000b;
                } else {
                    b.f3999a = j;
                }
                if (adRequestParcel.f1886c == null || adRequestParcel.f1886c.getInt("gw", 2) != 1) {
                    b.f4001c++;
                }
            }
        }
        ar.m2240e();
        String a2 = rd.m4403a(this.f.f1858c, this.f.f1861f, this.f.f1864i);
        long j2 = 0;
        if (this.f.f1871p != null) {
            try {
                j2 = this.f.f1871p.m2278a();
            } catch (RemoteException e2) {
                C0501b.m3025a("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a3 = ar.m2243h().m4358a(this.f.f1858c, this, a);
        List arrayList = new ArrayList();
        for (i = 0; i < this.f.f1877v.size(); i++) {
            arrayList.add(this.f.f1877v.m8b(i));
        }
        boolean z = this.f.f1872q != null;
        boolean z2 = this.f.f1873r != null && ar.m2243h().m4377j();
        C0410z c0410z = this.i.f2142c;
        AdSizeParcel adSizeParcel = this.f.f1864i;
        String str = this.f.f1857b;
        String str2 = ar.m2243h().f3975b;
        VersionInfoParcel versionInfoParcel = this.f.f1860e;
        List list = this.f.f1881z;
        boolean e3 = ar.m2243h().m4372e();
        Messenger messenger = this.f1801l;
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        List a4 = ck.m3581a();
        String str3 = this.f.f1856a;
        NativeAdOptionsParcel nativeAdOptionsParcel = this.f.f1878w;
        CapabilityParcel capabilityParcel = new CapabilityParcel(z, z2);
        String f2 = this.f.m2266f();
        ar.m2240e();
        float d = rd.m4443d();
        ar.m2240e();
        int i6 = rd.m4451i(this.f.f1858c);
        ar.m2240e();
        return new C0448a(bundle2, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, a, str2, versionInfoParcel, a3, list, arrayList, bundle, e3, messenger, i4, i5, f, a2, j2, uuid, a4, str3, nativeAdOptionsParcel, capabilityParcel, f2, d, i6, rd.m4431b(this.f.f1861f));
    }

    public void m2192a(mq mqVar) {
        ax.m5534b("setInAppPurchaseListener must be called on the main UI thread.");
        this.f.f1872q = mqVar;
    }

    public final void m2193a(nc ncVar, String str) {
        ax.m5534b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f.f1842A = new C0445n(str);
        this.f.f1873r = ncVar;
        if (!ar.m2243h().m4371d() && ncVar != null) {
            new C0435c(this.f.f1858c, this.f.f1873r, this.f.f1842A).m2709g();
        }
    }

    protected void m2194a(pz pzVar, boolean z) {
        if (pzVar == null) {
            C0501b.m3025a("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.m2171c(pzVar);
        if (!(pzVar.f3941q == null || pzVar.f3941q.f3469d == null)) {
            ar.m2253r();
            jx.m3944a(this.f.f1858c, this.f.f1860e.f2539b, pzVar, this.f.f1857b, z, pzVar.f3941q.f3469d);
        }
        if (pzVar.f3938n != null && pzVar.f3938n.f3457g != null) {
            ar.m2253r();
            jx.m3944a(this.f.f1858c, this.f.f1860e.f2539b, pzVar, this.f.f1857b, z, pzVar.f3938n.f3457g);
        }
    }

    public final void m2195a(String str, ArrayList arrayList) {
        mn c0437e = new C0437e(str, arrayList, this.f.f1858c, this.f.f1860e.f2539b);
        if (this.f.f1872q == null) {
            C0501b.m3025a("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            C0374z.m2455a();
            if (!C0500a.m3021b(this.f.f1858c)) {
                C0501b.m3025a("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.f.f1873r == null) {
                C0501b.m3025a("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.f.f1842A == null) {
                C0501b.m3025a("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.f.f1846E) {
                C0501b.m3025a("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.f.f1846E = true;
                try {
                    if (this.f.f1873r.m4230a(str)) {
                        ar.m2250o();
                        Context context = this.f.f1858c;
                        boolean z = this.f.f1860e.f2542e;
                        GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel = new GInAppPurchaseManagerInfoParcel(this.f.f1858c, this.f.f1842A, c0437e, this);
                        Intent intent = new Intent();
                        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
                        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
                        GInAppPurchaseManagerInfoParcel.m2746a(intent, gInAppPurchaseManagerInfoParcel);
                        ar.m2240e();
                        rd.m4414a(context, intent);
                        return;
                    }
                    this.f.f1846E = false;
                    return;
                } catch (RemoteException e) {
                    C0501b.m3025a("Could not start In-App purchase.");
                    this.f.f1846E = false;
                    return;
                }
            }
        }
        try {
            this.f.f1872q.m3774a(c0437e);
        } catch (RemoteException e2) {
            C0501b.m3025a("Could not start In-App purchase.");
        }
    }

    public final void m2196a(String str, boolean z, int i, Intent intent, C0439g c0439g) {
        try {
            if (this.f.f1873r != null) {
                this.f.f1873r.m4229a(new C0440h(this.f.f1858c, str, z, i, intent, c0439g));
            }
        } catch (RemoteException e) {
            C0501b.m3025a("Fail to invoke PlayStorePurchaseListener.");
        }
        rd.f4041a.postDelayed(new C0375d(this, intent), 500);
    }

    public boolean m2197a(AdRequestParcel adRequestParcel, cz czVar) {
        Bundle bundle = null;
        if (!m2207q()) {
            return false;
        }
        bj a = ar.m2243h().m4359a(this.f.f1858c);
        if (a != null) {
            String str;
            String str2;
            if (a.m3521d()) {
                a.m3520c();
            }
            bg b = a.m3519b();
            if (b != null) {
                str = b.f2958f;
                str2 = b.f2959g;
                "In AdManager: loadAd, " + b.toString();
                C0501b.m3027a(3);
                if (str != null) {
                    ar.m2243h().m4363a(str);
                }
            } else {
                str = ar.m2243h().m4374g();
                str2 = null;
            }
            if (str != null) {
                bundle = new Bundle(1);
                bundle.putString("fingerprint", str);
                if (!str.equals(str2)) {
                    bundle.putString("v_fp", str2);
                }
            }
        }
        this.e.m2232a();
        this.f.f1845D = 0;
        C0448a a2 = m2191a(adRequestParcel, bundle);
        czVar.m3601a("seq_num", a2.f2402g);
        czVar.m3601a("request_id", a2.f2417v);
        czVar.m3601a("session_id", a2.f2403h);
        if (a2.f2401f != null) {
            czVar.m3601a("app_version", String.valueOf(a2.f2401f.versionCode));
        }
        as asVar = this.f;
        ar.m2236a();
        Context context = this.f.f1858c;
        qi adVar = a2.f2397b.f1886c.getBundle("sdk_less_server_data") != null ? new ad(context, a2, this) : new C0453e(context, a2, this.f.f1859d, this);
        adVar.m2709g();
        asVar.f1862g = adVar;
        return true;
    }

    protected boolean m2198a(AdRequestParcel adRequestParcel, pz pzVar, boolean z) {
        if (!z && this.f.m2264d()) {
            if (pzVar.f3932h > 0) {
                this.e.m2234a(adRequestParcel, pzVar.f3932h);
            } else if (pzVar.f3941q != null && pzVar.f3941q.f3472g > 0) {
                this.e.m2234a(adRequestParcel, pzVar.f3941q.f3472g);
            } else if (!pzVar.f3937m && pzVar.f3928d == 2) {
                this.e.m2233a(adRequestParcel);
            }
        }
        return this.e.f1814d;
    }

    final boolean m2199a(pz pzVar) {
        AdRequestParcel adRequestParcel;
        boolean z = false;
        if (this.g != null) {
            adRequestParcel = this.g;
            this.g = null;
        } else {
            adRequestParcel = pzVar.f3925a;
            if (adRequestParcel.f1886c != null) {
                z = adRequestParcel.f1886c.getBoolean("_noRefresh", false);
            }
        }
        return m2198a(adRequestParcel, pzVar, z);
    }

    protected boolean m2200a(pz pzVar, pz pzVar2) {
        int i;
        int i2 = 0;
        if (!(pzVar == null || pzVar.f3942r == null)) {
            pzVar.f3942r.m3920a(null);
        }
        if (pzVar2.f3942r != null) {
            pzVar2.f3942r.m3920a((jq) this);
        }
        if (pzVar2.f3941q != null) {
            i = pzVar2.f3941q.f3477l;
            i2 = pzVar2.f3941q.f3478m;
        } else {
            i = 0;
        }
        qg qgVar = this.f.f1843B;
        synchronized (qgVar.f4006a) {
            qgVar.f4007b = i;
            qgVar.f4008c = i2;
            qd qdVar = qgVar.f4009d;
            String str = qgVar.f4010e;
            synchronized (qdVar.f3974a) {
                qdVar.f3978e.put(str, qgVar);
            }
        }
        return true;
    }

    public final void m2201b(pz pzVar) {
        super.m2168b(pzVar);
        if (pzVar.f3928d == 3 && pzVar.f3941q != null && pzVar.f3941q.f3470e != null) {
            C0501b.m3027a(3);
            ar.m2253r();
            jx.m3944a(this.f.f1858c, this.f.f1860e.f2539b, pzVar, this.f.f1857b, false, pzVar.f3941q.f3470e);
        }
    }

    protected final boolean m2202b(AdRequestParcel adRequestParcel) {
        return super.m2169b(adRequestParcel) && !this.f1800k;
    }

    public void c_() {
        ax.m5534b("resume must be called on the main UI thread.");
        if (!(this.f.f1865j == null || this.f.f1865j.f3926b == null || !this.f.m2264d())) {
            ar.m2242g();
            rg.m4460b(this.f.f1865j.f3926b);
        }
        if (!(this.f.f1865j == null || this.f.f1865j.f3939o == null)) {
            try {
                this.f.f1865j.f3939o.m3976e();
            } catch (RemoteException e) {
                C0501b.m3025a("Could not resume mediation adapter.");
            }
        }
        ao aoVar = this.e;
        aoVar.f1815e = false;
        if (aoVar.f1814d) {
            aoVar.f1814d = false;
            aoVar.m2234a(aoVar.f1813c, aoVar.f1816f);
        }
        this.h.m3483c(this.f.f1865j);
    }

    public void m2203d() {
        ax.m5534b("pause must be called on the main UI thread.");
        if (!(this.f.f1865j == null || this.f.f1865j.f3926b == null || !this.f.m2264d())) {
            ar.m2242g();
            rg.m4459a(this.f.f1865j.f3926b);
        }
        if (!(this.f.f1865j == null || this.f.f1865j.f3939o == null)) {
            try {
                this.f.f1865j.f3939o.m3975d();
            } catch (RemoteException e) {
                C0501b.m3025a("Could not pause mediation adapter.");
            }
        }
        this.h.m3482b(this.f.f1865j);
        ao aoVar = this.e;
        aoVar.f1815e = true;
        if (aoVar.f1814d) {
            aoVar.f1811a.m2235a(aoVar.f1812b);
        }
    }

    public final void d_() {
        this.h.m3481a(this.f.f1865j);
        this.f1800k = false;
        m2180m();
        qb qbVar = this.f.f1867l;
        synchronized (qbVar.f3962c) {
            if (!(qbVar.f3969j == -1 || qbVar.f3961b.isEmpty())) {
                qc qcVar = (qc) qbVar.f3961b.getLast();
                if (qcVar.f3973b == -1) {
                    qcVar.f3973b = SystemClock.elapsedRealtime();
                    qbVar.f3960a.m4366a(qbVar);
                }
            }
        }
    }

    public final void m2204e() {
        if (this.f.f1865j == null) {
            C0501b.m3025a("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f.f1865j.f3941q == null || this.f.f1865j.f3941q.f3468c == null)) {
            ar.m2253r();
            jx.m3944a(this.f.f1858c, this.f.f1860e.f2539b, this.f.f1865j, this.f.f1857b, false, this.f.f1865j.f3941q.f3468c);
        }
        if (!(this.f.f1865j.f3938n == null || this.f.f1865j.f3938n.f3456f == null)) {
            ar.m2253r();
            jx.m3944a(this.f.f1858c, this.f.f1860e.f2539b, this.f.f1865j, this.f.f1857b, false, this.f.f1865j.f3938n.f3456f);
        }
        super.m2174e();
    }

    public void e_() {
        this.f1800k = true;
        m2181n();
    }

    public void m2205f() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public final void f_() {
        this.h.m3482b(this.f.f1865j);
    }

    public final void g_() {
        this.h.m3483c(this.f.f1865j);
    }

    public final String m2206j() {
        return this.f.f1865j == null ? null : this.f.f1865j.f3940p;
    }

    protected boolean m2207q() {
        ar.m2240e();
        if (rd.m4425a(this.f.f1858c.getPackageManager(), this.f.f1858c.getPackageName(), "android.permission.INTERNET")) {
            ar.m2240e();
            if (rd.m4423a(this.f.f1858c)) {
                return true;
            }
        }
        return false;
    }

    public final void m2208r() {
        m2204e();
    }

    public final void m2209s() {
        d_();
    }

    public final void m2210t() {
        m2179l();
    }

    public final void m2211u() {
        e_();
    }

    public final void m2212v() {
        if (this.f.f1865j != null) {
            C0501b.m3025a("Mediation adapter " + this.f.f1865j.f3940p + " refreshed, but mediation adapters should never refresh.");
        }
        m2194a(this.f.f1865j, true);
        m2182o();
    }

    public final void m2213w() {
        m2194a(this.f.f1865j, false);
    }
}
