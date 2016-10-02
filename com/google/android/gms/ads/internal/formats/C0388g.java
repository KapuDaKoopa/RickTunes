package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.aj;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.aa;
import com.google.android.gms.p006b.kr;
import com.google.android.gms.p006b.ku;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p017a.C0317d;
import java.util.Map;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.g */
public final class C0388g extends C0387j {
    private kr f2107e;
    private ku f2108f;
    private final aj f2109g;
    private C0386h f2110h;
    private boolean f2111i;
    private Object f2112j;

    private C0388g(Context context, aj ajVar, aa aaVar) {
        super(context, ajVar, null, aaVar, null, null, null);
        this.f2111i = false;
        this.f2112j = new Object();
        this.f2109g = ajVar;
    }

    public C0388g(Context context, aj ajVar, aa aaVar, kr krVar) {
        this(context, ajVar, aaVar);
        this.f2107e = krVar;
    }

    public C0388g(Context context, aj ajVar, aa aaVar, ku kuVar) {
        this(context, ajVar, aaVar);
        this.f2108f = kuVar;
    }

    public final C0380b m2580a(OnClickListener onClickListener) {
        return null;
    }

    public final void m2581a() {
        ax.m5534b("recordImpression must be called on the main UI thread.");
        synchronized (this.f2112j) {
            this.f2096b = true;
            if (this.f2110h != null) {
                this.f2110h.m2561a();
            } else {
                try {
                    if (this.f2107e != null && !this.f2107e.m4025j()) {
                        this.f2107e.m4024i();
                    } else if (!(this.f2108f == null || this.f2108f.m4052h())) {
                        this.f2108f.m4051g();
                    }
                } catch (Throwable e) {
                    C0501b.m3026a("Failed to call recordImpression", e);
                }
            }
            this.f2109g.m2213w();
        }
    }

    public final void m2582a(View view) {
        synchronized (this.f2112j) {
            this.f2111i = true;
            try {
                if (this.f2107e != null) {
                    this.f2107e.m4017b(C0317d.m1996a((Object) view));
                } else if (this.f2108f != null) {
                    this.f2108f.m4046b(C0317d.m1996a((Object) view));
                }
            } catch (Throwable e) {
                C0501b.m3026a("Failed to call prepareAd", e);
            }
            this.f2111i = false;
        }
    }

    public final void m2583a(View view, Map map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ax.m5534b("performClick must be called on the main UI thread.");
        synchronized (this.f2112j) {
            if (this.f2110h != null) {
                this.f2110h.m2563a(view, map, jSONObject, jSONObject2, jSONObject3);
                this.f2109g.m2204e();
            } else {
                try {
                    if (!(this.f2107e == null || this.f2107e.m4026k())) {
                        this.f2107e.m4015a(C0317d.m1996a((Object) view));
                        this.f2109g.m2204e();
                    }
                    if (!(this.f2108f == null || this.f2108f.m4053i())) {
                        this.f2108f.m4044a(C0317d.m1996a((Object) view));
                        this.f2109g.m2204e();
                    }
                } catch (Throwable e) {
                    C0501b.m3026a("Failed to call performClick", e);
                }
            }
        }
    }

    public final void m2584a(C0386h c0386h) {
        synchronized (this.f2112j) {
            this.f2110h = c0386h;
        }
    }

    public final boolean m2585b() {
        boolean z;
        synchronized (this.f2112j) {
            z = this.f2111i;
        }
        return z;
    }

    public final C0386h m2586c() {
        C0386h c0386h;
        synchronized (this.f2112j) {
            c0386h = this.f2110h;
        }
        return c0386h;
    }

    public final tf m2587d() {
        return null;
    }
}
