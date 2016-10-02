package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.nw */
public class nw extends nl implements ti {
    nw(Context context, qa qaVar, tf tfVar, nv nvVar) {
        super(context, qaVar, tfVar, nvVar);
    }

    protected final void m4267a() {
        if (this.e.f2360e == -2) {
            this.c.m4579l().m4609a((ti) this);
            m4268c();
            C0501b.m3027a(3);
            tf tfVar = this.c;
            ar.m2240e();
            tfVar.loadDataWithBaseURL(rd.m4408a(this.e.f2357b), this.e.f2358c, "text/html", "UTF-8", null);
        }
    }

    protected void m4268c() {
    }
}
