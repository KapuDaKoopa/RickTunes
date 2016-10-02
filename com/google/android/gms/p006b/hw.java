package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.C0504w;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ae;
import com.google.android.gms.ads.internal.client.ar;
import com.google.android.gms.ads.internal.client.aw;
import com.google.android.gms.ads.internal.client.az;
import com.google.android.gms.ads.internal.reward.client.C0484g;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p017a.C0314a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@op
/* renamed from: com.google.android.gms.b.hw */
public final class hw extends ar {
    private String f3360a;
    private gn f3361b;
    private C0504w f3362c;
    private hn f3363d;
    private nc f3364e;
    private String f3365f;

    public hw(Context context, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        this(str, new gn(context.getApplicationContext(), keVar, versionInfoParcel, c0402k));
    }

    private hw(String str, gn gnVar) {
        Throwable e;
        this.f3360a = str;
        this.f3361b = gnVar;
        this.f3363d = new hn();
        hp p = com.google.android.gms.ads.internal.ar.m2251p();
        if (p.f3339c == null) {
            p.f3339c = gnVar;
            if (p.f3339c != null) {
                hq hqVar;
                SharedPreferences sharedPreferences = p.f3339c.f3291a.getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (p.f3338b.size() > 0) {
                    hqVar = (hq) p.f3338b.remove();
                    hu huVar = (hu) p.f3337a.get(hqVar);
                    hp.m3802a("Flushing interstitial queue for %s.", hqVar);
                    while (huVar.f3349a.size() > 0) {
                        huVar.m3813a().f3353a.m3044C();
                    }
                    p.f3337a.remove(hqVar);
                }
                Map hashMap = new HashMap();
                for (Entry entry : sharedPreferences.getAll().entrySet()) {
                    try {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            hx hxVar = new hx((String) entry.getValue());
                            hqVar = new hq(hxVar.f3366a, hxVar.f3367b, hxVar.f3368c);
                            if (!p.f3337a.containsKey(hqVar)) {
                                p.f3337a.put(hqVar, new hu(hxVar.f3366a, hxVar.f3367b, hxVar.f3368c));
                                hashMap.put(hqVar.toString(), hqVar);
                                hp.m3802a("Restored interstitial queue for %s.", hqVar);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        C0501b.m3026a("Malformed preferences value for InterstitialAdPool.", e);
                    } catch (ClassCastException e3) {
                        e = e3;
                        C0501b.m3026a("Malformed preferences value for InterstitialAdPool.", e);
                    }
                }
                for (Object obj : hp.m3803a(sharedPreferences.getString("PoolKeys", ""))) {
                    hqVar = (hq) hashMap.get(obj);
                    if (p.f3337a.containsKey(hqVar)) {
                        p.f3338b.add(hqVar);
                    }
                }
            }
        }
    }

    private void m3816l() {
        if (this.f3362c == null) {
            this.f3362c = this.f3361b.m3760a(this.f3360a);
            this.f3363d.m3796a(this.f3362c);
            m3817m();
        }
    }

    private void m3817m() {
        if (this.f3362c != null && this.f3364e != null) {
            this.f3362c.m2193a(this.f3364e, this.f3365f);
        }
    }

    public final C0314a m3818a() {
        return this.f3362c != null ? this.f3362c.m2144a() : null;
    }

    public final void m3819a(AdSizeParcel adSizeParcel) {
        if (this.f3362c != null) {
            this.f3362c.m2147a(adSizeParcel);
        }
    }

    public final void m3820a(ab abVar) {
        this.f3363d.f3333e = abVar;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3821a(ae aeVar) {
        this.f3363d.f3329a = aeVar;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3822a(aw awVar) {
        this.f3363d.f3330b = awVar;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3823a(az azVar) {
        m3816l();
        if (this.f3362c != null) {
            this.f3362c.m2151a(azVar);
        }
    }

    public final void m3824a(C0484g c0484g) {
        this.f3363d.f3334f = c0484g;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3825a(df dfVar) {
        this.f3363d.f3332d = dfVar;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3826a(mq mqVar) {
        this.f3363d.f3331c = mqVar;
        if (this.f3362c != null) {
            this.f3363d.m3796a(this.f3362c);
        }
    }

    public final void m3827a(nc ncVar, String str) {
        this.f3364e = ncVar;
        this.f3365f = str;
        m3817m();
    }

    public final void m3828a(String str) {
    }

    public final void m3829a(boolean z) {
        m3816l();
        if (this.f3362c != null) {
            this.f3362c.m2162a(z);
        }
    }

    public final boolean m3830a(AdRequestParcel adRequestParcel) {
        boolean z = false;
        Bundle bundle = adRequestParcel.f1896m;
        if (bundle != null) {
            bundle = bundle.getBundle(AdMobAdapter.class.getCanonicalName());
            if (bundle != null) {
                z = bundle.keySet().contains("gw");
            }
        }
        if (z) {
            m3816l();
        }
        if (adRequestParcel.f1893j != null) {
            m3816l();
        }
        if (this.f3362c != null) {
            return this.f3362c.m2163a(adRequestParcel);
        }
        hu huVar;
        hv a;
        hp p = com.google.android.gms.ads.internal.ar.m2251p();
        String str = this.f3360a;
        int i = new pj(p.f3339c.f3291a).m4344a().f3872m;
        hq hqVar = new hq(adRequestParcel, str, i);
        hu huVar2 = (hu) p.f3337a.get(hqVar);
        if (huVar2 == null) {
            hp.m3802a("Interstitial pool created at %s.", hqVar);
            huVar2 = new hu(adRequestParcel, str, i);
            p.f3337a.put(hqVar, huVar2);
            huVar = huVar2;
        } else {
            huVar = huVar2;
        }
        p.f3338b.remove(hqVar);
        p.f3338b.add(hqVar);
        hqVar.f3340a = true;
        while (true) {
            if (p.f3338b.size() <= ((Integer) com.google.android.gms.ads.internal.ar.m2249n().m3580a(ck.ag)).intValue()) {
                break;
            }
            hq hqVar2 = (hq) p.f3338b.remove();
            hu huVar3 = (hu) p.f3337a.get(hqVar2);
            hp.m3802a("Evicting interstitial queue for %s.", hqVar2);
            while (huVar3.f3349a.size() > 0) {
                huVar3.m3813a().f3353a.m3044C();
            }
            p.f3337a.remove(hqVar2);
        }
        while (huVar.f3349a.size() > 0) {
            a = huVar.m3813a();
            if (a.f3357e) {
                if (com.google.android.gms.ads.internal.ar.m2244i().m4887a() - a.f3356d > 1000 * ((long) ((Integer) com.google.android.gms.ads.internal.ar.m2249n().m3580a(ck.ai)).intValue())) {
                    hp.m3802a("Expired interstitial at %s.", hqVar);
                }
            }
            hp.m3802a("Pooled interstitial returned at %s.", hqVar);
            break;
        }
        a = null;
        if (a != null) {
            if (!a.f3357e) {
                a.m3815a(adRequestParcel);
            }
            this.f3362c = a.f3353a;
            a.f3354b.setBaseContext(this.f3361b.f3291a.getBaseContext());
            go goVar = a.f3355c;
            hn hnVar = this.f3363d;
            Handler handler = rd.f4041a;
            for (hm hlVar : goVar.f3295a) {
                handler.post(new hl(goVar, hlVar, hnVar));
            }
            this.f3363d.m3796a(this.f3362c);
            m3817m();
            return a.f3358f;
        }
        this.f3362c = this.f3361b.m3760a(this.f3360a);
        this.f3363d.m3796a(this.f3362c);
        m3817m();
        return this.f3362c.m2163a(adRequestParcel);
    }

    public final void m3831b() {
        if (this.f3362c != null) {
            this.f3362c.m2167b();
        }
    }

    public final boolean m3832c() {
        return this.f3362c != null && this.f3362c.m2172c();
    }

    public final void c_() {
        if (this.f3362c != null) {
            this.f3362c.c_();
        }
    }

    public final void m3833d() {
        if (this.f3362c != null) {
            this.f3362c.m2203d();
        }
    }

    public final void m3834f() {
        if (this.f3362c != null) {
            this.f3362c.m3053f();
        } else {
            C0501b.m3025a("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    public final void m3835g() {
        if (this.f3362c != null) {
            this.f3362c.m2175g();
        }
    }

    public final void m3836h() {
        if (this.f3362c != null) {
            this.f3362c.m2176h();
        } else {
            C0501b.m3025a("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final AdSizeParcel m3837i() {
        return this.f3362c != null ? this.f3362c.m2177i() : null;
    }

    public final String m3838j() {
        return this.f3362c != null ? this.f3362c.m2206j() : null;
    }

    public final boolean m3839k() {
        return this.f3362c != null && this.f3362c.m2178k();
    }
}
