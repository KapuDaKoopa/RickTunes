package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0449z;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.pa */
final class pa implements Runnable {
    final /* synthetic */ AdRequestInfoParcel f3809a;
    final /* synthetic */ C0449z f3810b;
    final /* synthetic */ or f3811c;

    pa(or orVar, AdRequestInfoParcel adRequestInfoParcel, C0449z c0449z) {
        this.f3811c = orVar;
        this.f3809a = adRequestInfoParcel;
        this.f3810b = c0449z;
    }

    public final void run() {
        AdResponseParcel a;
        try {
            a = this.f3811c.m4318a(this.f3809a);
        } catch (Throwable e) {
            ar.m2243h().m4367a(e, true);
            C0501b.m3026a("Could not fetch ad response due to an Exception.", e);
            a = null;
        }
        if (a == null) {
            a = new AdResponseParcel(0);
        }
        try {
            this.f3810b.m2810a(a);
        } catch (Throwable e2) {
            C0501b.m3026a("Fail to forward ad response.", e2);
        }
    }
}
