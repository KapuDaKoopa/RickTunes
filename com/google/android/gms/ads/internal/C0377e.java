package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.df;
import com.google.android.gms.p006b.ji;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.lw;
import com.google.android.gms.p006b.nu;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.tm;

@op
/* renamed from: com.google.android.gms.ads.internal.e */
public abstract class C0377e extends C0349c implements C0376r, lw {
    public C0377e(Context context, AdSizeParcel adSizeParcel, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        super(context, adSizeParcel, str, keVar, versionInfoParcel, c0402k);
    }

    public final void m2468A() {
        m2180m();
    }

    protected tf m2469a(qa qaVar, C0403l c0403l) {
        ji jiVar;
        View nextView = this.f.f1861f.getNextView();
        if (nextView instanceof tf) {
            C0501b.m3027a(3);
            jiVar = (tf) nextView;
            jiVar.m4556a(this.f.f1858c, this.f.f1864i, this.a);
        } else {
            if (nextView != null) {
                this.f.f1861f.removeView(nextView);
            }
            ar.m2241f();
            jiVar = tm.m4623a(this.f.f1858c, this.f.f1864i, false, false, this.f.f1859d, this.f.f1860e, this.a, this.i);
            if (this.f.f1864i.f1909h == null) {
                m2146a(jiVar.m4564b());
            }
        }
        jiVar.m4579l().m4606a(this, this, this, this, false, this, null, c0403l, this);
        m2471a(jiVar);
        jiVar.m4567b(qaVar.f3952a.f2344w);
        return jiVar;
    }

    public final void m2470a(df dfVar) {
        ax.m5534b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f.f1879x = dfVar;
    }

    protected final void m2471a(ji jiVar) {
        jiVar.m3841a("/trackActiveViewUnit", new C0378f(this));
    }

    protected final void m2472a(qa qaVar, cz czVar) {
        if (qaVar.f3956e != -2) {
            rd.f4041a.post(new C0398g(this, qaVar));
            return;
        }
        if (qaVar.f3955d != null) {
            this.f.f1864i = qaVar.f3955d;
        }
        if (!qaVar.f3953b.f2363h || qaVar.f3953b.f2350C) {
            rd.f4041a.post(new C0399h(this, qaVar, czVar));
            return;
        }
        this.f.f1845D = 0;
        as asVar = this.f;
        ar.m2239d();
        asVar.f1863h = nu.m4266a(this.f.f1858c, this, qaVar, this.f.f1859d, null, this.j, this, czVar);
    }

    protected boolean m2473a(pz pzVar, pz pzVar2) {
        if (this.f.m2264d() && this.f.f1861f != null) {
            this.f.f1861f.m2269a().f4052b = pzVar2.f3921A;
        }
        return super.m2200a(pzVar, pzVar2);
    }

    public final void m2474b(View view) {
        this.f.f1844C = view;
        m2201b(new pz(this.f.f1866k));
    }

    public final void m2475x() {
        m2204e();
    }

    public final void m2476y() {
        m2213w();
        m2176h();
    }

    public final void m2477z() {
        m2181n();
    }
}
