package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@op
/* renamed from: com.google.android.gms.b.il */
public final class il {
    final Object f3399a;
    final Context f3400b;
    final String f3401c;
    final VersionInfoParcel f3402d;
    ix f3403e;
    jd f3404f;
    int f3405g;
    private ix f3406h;

    public il(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f3399a = new Object();
        this.f3405g = 1;
        this.f3401c = str;
        this.f3400b = context.getApplicationContext();
        this.f3402d = versionInfoParcel;
        this.f3403e = new iy();
        this.f3406h = new iy();
    }

    public il(Context context, VersionInfoParcel versionInfoParcel, String str, ix ixVar, ix ixVar2) {
        this(context, versionInfoParcel, str);
        this.f3403e = ixVar;
        this.f3406h = ixVar2;
    }

    protected final jd m3874a() {
        jd jdVar = new jd(this.f3406h);
        rd.m4419a(new im(this, jdVar));
        jdVar.m3884a(new iu(this, jdVar), new iv(this, jdVar));
        return jdVar;
    }

    public final iz m3875b() {
        iz a;
        synchronized (this.f3399a) {
            if (this.f3404f == null || this.f3404f.m3887e() == -1) {
                this.f3405g = 2;
                this.f3404f = m3874a();
                a = this.f3404f.m3894a();
            } else if (this.f3405g == 0) {
                a = this.f3404f.m3894a();
            } else if (this.f3405g == 1) {
                this.f3405g = 2;
                m3874a();
                a = this.f3404f.m3894a();
            } else if (this.f3405g == 2) {
                a = this.f3404f.m3894a();
            } else {
                a = this.f3404f.m3894a();
            }
        }
        return a;
    }
}
