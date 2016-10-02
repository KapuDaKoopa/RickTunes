package com.google.android.gms.p006b;

import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.C0504w;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.Iterator;

/* renamed from: com.google.android.gms.b.hv */
final class hv {
    C0504w f3353a;
    MutableContextWrapper f3354b;
    go f3355c;
    long f3356d;
    boolean f3357e;
    boolean f3358f;
    final /* synthetic */ hu f3359g;

    hv(hu huVar, gn gnVar) {
        this.f3359g = huVar;
        gn gnVar2 = new gn(gnVar.f3291a.getBaseContext(), gnVar.f3292b, gnVar.f3293c, gnVar.f3294d);
        this.f3354b = gnVar.f3291a;
        this.f3353a = gnVar2.m3760a(huVar.f3351c);
        this.f3355c = new go();
        go goVar = this.f3355c;
        C0504w c0504w = this.f3353a;
        c0504w.m2149a(new gp(goVar));
        c0504w.m2150a(new gv(goVar));
        c0504w.m2192a(new gx(goVar));
        c0504w.m2470a(new gz(goVar));
        c0504w.m2148a(new hb(goVar));
        c0504w.m2152a(new hd(goVar));
    }

    private void m3814a() {
        if (!this.f3357e && this.f3359g.f3350b != null) {
            this.f3358f = this.f3353a.m2163a(this.f3359g.f3350b);
            this.f3357e = true;
            this.f3356d = ar.m2244i().m4887a();
        }
    }

    final void m3815a(AdRequestParcel adRequestParcel) {
        if (adRequestParcel != null) {
            this.f3359g.f3350b = adRequestParcel;
        }
        m3814a();
        Iterator it = this.f3359g.f3349a.iterator();
        while (it.hasNext()) {
            ((hv) it.next()).m3814a();
        }
    }
}
