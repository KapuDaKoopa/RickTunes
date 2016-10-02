package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.aa;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.jp;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.qx;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rp;
import com.google.android.gms.p006b.su;
import com.google.android.gms.p006b.sy;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.ads.internal.request.e */
public final class C0453e extends qi implements C0452k {
    final C0448a f2446a;
    final Object f2447b;
    final Context f2448c;
    Runnable f2449d;
    rp f2450e;
    AdResponseParcel f2451f;
    jp f2452g;
    private final C0345d f2453h;
    private final aa f2454i;
    private AdRequestInfoParcel f2455k;

    public C0453e(Context context, C0448a c0448a, aa aaVar, C0345d c0345d) {
        this.f2447b = new Object();
        this.f2453h = c0345d;
        this.f2448c = context;
        this.f2446a = c0448a;
        this.f2454i = aaVar;
    }

    private AdSizeParcel m2834a(AdRequestInfoParcel adRequestInfoParcel) {
        if (this.f2451f.f2368m == null) {
            throw new C0456h("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f2451f.f2368m.split("x");
        if (split.length != 2) {
            throw new C0456h("Invalid ad size format from the ad response: " + this.f2451f.f2368m, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f2325d.f1909h) {
                float f = this.f2448c.getResources().getDisplayMetrics().density;
                int i = adSizeParcel.f1907f == -1 ? (int) (((float) adSizeParcel.f1908g) / f) : adSizeParcel.f1907f;
                int i2 = adSizeParcel.f1904c == -2 ? (int) (((float) adSizeParcel.f1905d) / f) : adSizeParcel.f1904c;
                if (parseInt == i && parseInt2 == i2) {
                    return new AdSizeParcel(adSizeParcel, adRequestInfoParcel.f2325d.f1909h);
                }
            }
            throw new C0456h("The ad size from the ad response was not one of the requested sizes: " + this.f2451f.f2368m, 0);
        } catch (NumberFormatException e) {
            throw new C0456h("Invalid ad size number from the ad response: " + this.f2451f.f2368m, 0);
        }
    }

    public final void m2835a() {
        C0501b.m3027a(3);
        this.f2449d = new C0454f(this);
        rd.f4041a.postDelayed(this.f2449d, ((Long) ar.m2249n().m3580a(ck.ax)).longValue());
        su syVar = new sy();
        long b = ar.m2244i().m4888b();
        qx.m4394a(new C0455g(this, syVar));
        this.f2455k = new AdRequestInfoParcel(this.f2446a, this.f2454i.m3416a().m2983a(this.f2448c), b);
        syVar.m3883a(this.f2455k);
    }

    final void m2836a(int i, String str) {
        if (i == 3 || i == -1) {
            C0501b.m3027a(4);
        } else {
            C0501b.m3025a(str);
        }
        if (this.f2451f == null) {
            this.f2451f = new AdResponseParcel(i);
        } else {
            this.f2451f = new AdResponseParcel(i, this.f2451f.f2366k);
        }
        this.f2453h.m2139a(new qa(this.f2455k != null ? this.f2455k : new AdRequestInfoParcel(this.f2446a, null, -1), this.f2451f, this.f2452g, null, i, -1, this.f2451f.f2369n, null));
    }

    public final void m2837a(AdResponseParcel adResponseParcel) {
        C0501b.m3027a(3);
        this.f2451f = adResponseParcel;
        long b = ar.m2244i().m4888b();
        synchronized (this.f2447b) {
            this.f2450e = null;
        }
        if (this.f2451f.f2360e == -2 || this.f2451f.f2360e == -3) {
            try {
                JSONObject jSONObject;
                if (this.f2451f.f2360e != -3) {
                    if (TextUtils.isEmpty(this.f2451f.f2358c)) {
                        throw new C0456h("No fill from ad server.", 3);
                    }
                    ar.m2243h().m4362a(this.f2448c, this.f2451f.f2376u);
                    if (this.f2451f.f2363h) {
                        this.f2452g = new jp(this.f2451f.f2358c);
                    }
                }
                AdSizeParcel a = this.f2455k.f2325d.f1909h != null ? m2834a(this.f2455k) : null;
                ar.m2243h().m4368a(this.f2451f.f2377v);
                if (!TextUtils.isEmpty(this.f2451f.f2373r)) {
                    try {
                        jSONObject = new JSONObject(this.f2451f.f2373r);
                    } catch (Exception e) {
                        C0501b.m3027a(6);
                    }
                    this.f2453h.m2139a(new qa(this.f2455k, this.f2451f, this.f2452g, a, -2, b, this.f2451f.f2369n, jSONObject));
                    rd.f4041a.removeCallbacks(this.f2449d);
                    return;
                }
                jSONObject = null;
                this.f2453h.m2139a(new qa(this.f2455k, this.f2451f, this.f2452g, a, -2, b, this.f2451f.f2369n, jSONObject));
                rd.f4041a.removeCallbacks(this.f2449d);
                return;
            } catch (JSONException e2) {
                throw new C0456h("Could not parse mediation config: " + this.f2451f.f2358c, 0);
            } catch (C0456h e3) {
                m2836a(e3.m2839a(), e3.getMessage());
                rd.f4041a.removeCallbacks(this.f2449d);
                return;
            }
        }
        throw new C0456h("There was a problem getting an ad response. ErrorCode: " + this.f2451f.f2360e, this.f2451f.f2360e);
    }

    public final void m2838b() {
        synchronized (this.f2447b) {
            if (this.f2450e != null) {
                this.f2450e.m2703d();
            }
        }
    }
}
