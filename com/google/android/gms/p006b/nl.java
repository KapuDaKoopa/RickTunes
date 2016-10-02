package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import java.util.concurrent.atomic.AtomicBoolean;

@op
/* renamed from: com.google.android.gms.b.nl */
public abstract class nl implements rp, ti {
    protected final nv f3670a;
    protected final Context f3671b;
    protected final tf f3672c;
    protected final qa f3673d;
    protected AdResponseParcel f3674e;
    protected final Object f3675f;
    AtomicBoolean f3676g;
    private Runnable f3677h;

    protected nl(Context context, qa qaVar, tf tfVar, nv nvVar) {
        this.f3675f = new Object();
        this.f3676g = new AtomicBoolean(true);
        this.f3671b = context;
        this.f3673d = qaVar;
        this.f3674e = this.f3673d.f3953b;
        this.f3672c = tfVar;
        this.f3670a = nvVar;
    }

    protected abstract void m4239a();

    protected void m4240a(int i) {
        if (i != -2) {
            this.f3674e = new AdResponseParcel(i, this.f3674e.f2366k);
        }
        this.f3672c.m4572e();
        nv nvVar = this.f3670a;
        AdRequestInfoParcel adRequestInfoParcel = this.f3673d.f3952a;
        int i2 = i;
        nv nvVar2 = nvVar;
        nvVar2.m2141b(new pz(adRequestInfoParcel.f2324c, this.f3672c, this.f3674e.f2359d, i2, this.f3674e.f2361f, this.f3674e.f2365j, this.f3674e.f2367l, this.f3674e.f2366k, adRequestInfoParcel.f2330i, this.f3674e.f2363h, null, null, null, null, null, this.f3674e.f2364i, this.f3673d.f3955d, this.f3674e.f2362g, this.f3673d.f3957f, this.f3674e.f2369n, this.f3674e.f2370o, this.f3673d.f3959h, null, this.f3674e.f2351D, this.f3674e.f2352E, this.f3674e.f2353F, this.f3674e.f2354G));
    }

    public final void m4241a(tf tfVar, boolean z) {
        C0501b.m3027a(3);
        if (this.f3676g.getAndSet(false)) {
            m4240a(z ? m4242b() : -1);
            rd.f4041a.removeCallbacks(this.f3677h);
        }
    }

    protected int m4242b() {
        return -2;
    }

    public void m4243d() {
        if (this.f3676g.getAndSet(false)) {
            this.f3672c.stopLoading();
            ar.m2242g();
            rg.m4459a(this.f3672c);
            m4240a(-1);
            rd.f4041a.removeCallbacks(this.f3677h);
        }
    }

    public final /* synthetic */ Object m4244e() {
        ax.m5534b("Webview render task needs to be called on UI thread.");
        this.f3677h = new nm(this);
        rd.f4041a.postDelayed(this.f3677h, ((Long) ar.m2249n().m3580a(ck.ay)).longValue());
        m4239a();
        return null;
    }
}
