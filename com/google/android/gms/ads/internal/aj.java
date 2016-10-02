package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p001b.C0028m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.formats.C0383d;
import com.google.android.gms.ads.internal.formats.C0384e;
import com.google.android.gms.ads.internal.formats.C0385f;
import com.google.android.gms.ads.internal.formats.C0386h;
import com.google.android.gms.ads.internal.formats.C0388g;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.an;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.df;
import com.google.android.gms.p006b.dj;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.ek;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.kr;
import com.google.android.gms.p006b.ku;
import com.google.android.gms.p006b.mq;
import com.google.android.gms.p006b.nu;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import java.util.List;

@op
public final class aj extends C0349c {
    public aj(Context context, C0402k c0402k, AdSizeParcel adSizeParcel, String str, ke keVar, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, keVar, versionInfoParcel, c0402k);
    }

    private void m2214a(C0383d c0383d) {
        rd.f4041a.post(new al(this, c0383d));
    }

    private void m2215a(C0384e c0384e) {
        rd.f4041a.post(new am(this, c0384e));
    }

    public final void m2216a(C0028m c0028m) {
        ax.m5534b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.f.f1877v = c0028m;
    }

    public final void m2217a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        ax.m5534b("setNativeAdOptions must be called on the main UI thread.");
        this.f.f1878w = nativeAdOptionsParcel;
    }

    public final void m2218a(C0386h c0386h) {
        if (this.f.f1865j.f3934j != null) {
            ar.m2243h().f3976c.m3479a(this.f.f1864i, this.f.f1865j, new an(c0386h), null);
        }
    }

    public final void m2219a(df dfVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void m2220a(ee eeVar) {
        ax.m5534b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.f.f1874s = eeVar;
    }

    public final void m2221a(eh ehVar) {
        ax.m5534b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.f.f1875t = ehVar;
    }

    public final void m2222a(mq mqVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void m2223a(qa qaVar, cz czVar) {
        if (qaVar.f3955d != null) {
            this.f.f1864i = qaVar.f3955d;
        }
        if (qaVar.f3956e != -2) {
            rd.f4041a.post(new ak(this, qaVar));
            return;
        }
        this.f.f1845D = 0;
        as asVar = this.f;
        ar.m2239d();
        asVar.f1863h = nu.m4266a(this.f.f1858c, this, qaVar, this.f.f1859d, null, this.j, this, czVar);
        "AdRenderer: " + this.f.f1863h.getClass().getName();
        C0501b.m3027a(3);
    }

    public final void m2224a(List list) {
        ax.m5534b("setNativeTemplates must be called on the main UI thread.");
        this.f.f1881z = list;
    }

    protected final boolean m2225a(AdRequestParcel adRequestParcel, pz pzVar, boolean z) {
        return this.e.f1814d;
    }

    protected final boolean m2226a(pz pzVar, pz pzVar2) {
        dj djVar = null;
        m2224a(null);
        if (this.f.m2264d()) {
            if (pzVar2.f3937m) {
                try {
                    kr h = pzVar2.f3939o.m3979h();
                    ku i = pzVar2.f3939o.m3980i();
                    String a;
                    List b;
                    String c;
                    if (h != null) {
                        a = h.m4014a();
                        b = h.m4016b();
                        c = h.m4018c();
                        if (h.m4019d() != null) {
                            djVar = h.m4019d();
                        }
                        C0383d c0383d = new C0383d(a, b, c, djVar, h.m4020e(), h.m4021f(), h.m4022g(), h.m4023h(), null, h.m4027l());
                        c0383d.m2509a(new C0388g(this.f.f1858c, this, this.f.f1859d, h));
                        m2214a(c0383d);
                    } else if (i != null) {
                        a = i.m4043a();
                        b = i.m4045b();
                        c = i.m4047c();
                        if (i.m4048d() != null) {
                            djVar = i.m4048d();
                        }
                        C0384e c0384e = new C0384e(a, b, c, djVar, i.m4049e(), i.m4050f(), null, i.m4054j());
                        c0384e.m2533a(new C0388g(this.f.f1858c, this, this.f.f1859d, i));
                        m2215a(c0384e);
                    } else {
                        C0501b.m3025a("No matching mapper for retrieved native ad template.");
                        m2145a(0);
                        return false;
                    }
                } catch (Throwable e) {
                    C0501b.m3026a("Failed to get native ad mapper", e);
                }
            } else {
                C0382i c0382i = pzVar2.f3922B;
                if ((c0382i instanceof C0384e) && this.f.f1875t != null) {
                    m2215a((C0384e) pzVar2.f3922B);
                } else if ((c0382i instanceof C0383d) && this.f.f1874s != null) {
                    m2214a((C0383d) pzVar2.f3922B);
                } else if (!(c0382i instanceof C0385f) || this.f.f1877v == null || this.f.f1877v.get(((C0385f) c0382i).m2559k()) == null) {
                    C0501b.m3025a("No matching listener for retrieved native ad template.");
                    m2145a(0);
                    return false;
                } else {
                    rd.f4041a.post(new an(this, ((C0385f) c0382i).m2559k(), pzVar2));
                }
            }
            return super.m2200a(pzVar, pzVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public final ek m2227b(String str) {
        ax.m5534b("getOnCustomClickListener must be called on the main UI thread.");
        return (ek) this.f.f1876u.get(str);
    }

    public final void m2228b(C0028m c0028m) {
        ax.m5534b("setOnCustomClickListener must be called on the main UI thread.");
        this.f.f1876u = c0028m;
    }

    public final void c_() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void m2229d() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void m2230f() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final C0028m m2231x() {
        ax.m5534b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f.f1877v;
    }
}
