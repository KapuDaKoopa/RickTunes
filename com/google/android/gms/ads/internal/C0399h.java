package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.da;
import com.google.android.gms.p006b.dc;
import com.google.android.gms.p006b.nu;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.tf;

/* renamed from: com.google.android.gms.ads.internal.h */
final class C0399h implements Runnable {
    final /* synthetic */ qa f2133a;
    final /* synthetic */ cz f2134b;
    final /* synthetic */ C0377e f2135c;

    C0399h(C0377e c0377e, qa qaVar, cz czVar) {
        this.f2135c = c0377e;
        this.f2133a = qaVar;
        this.f2134b = czVar;
    }

    public final void run() {
        if (this.f2133a.f3953b.f2374s && this.f2135c.f.f1879x != null) {
            String str = null;
            if (this.f2133a.f3953b.f2357b != null) {
                ar.m2240e();
                str = rd.m4408a(this.f2133a.f3953b.f2357b);
            }
            dc daVar = new da(this.f2135c, str, this.f2133a.f3953b.f2358c);
            this.f2135c.f.f1845D = 1;
            try {
                this.f2135c.d = false;
                this.f2135c.f.f1879x.m3624a(daVar);
                return;
            } catch (Throwable e) {
                C0501b.m3026a("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.f2135c.d = true;
            }
        }
        C0403l c0403l = new C0403l();
        tf a = this.f2135c.m2469a(this.f2133a, c0403l);
        c0403l.f2143a = new C0405n(this.f2133a, a);
        a.setOnTouchListener(new C0400i(this, c0403l));
        a.setOnClickListener(new C0401j(this, c0403l));
        this.f2135c.f.f1845D = 0;
        as asVar = this.f2135c.f;
        ar.m2239d();
        asVar.f1863h = nu.m4266a(this.f2135c.f.f1858c, this.f2135c, this.f2133a, this.f2135c.f.f1859d, a, this.f2135c.j, this.f2135c, this.f2134b);
    }
}
