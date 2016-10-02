package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.kc */
final class kc implements Runnable {
    final /* synthetic */ jv f3537a;
    final /* synthetic */ kb f3538b;

    kc(kb kbVar, jv jvVar) {
        this.f3538b = kbVar;
        this.f3537a = jvVar;
    }

    public final void run() {
        try {
            this.f3537a.f3504c.m3974c();
        } catch (Throwable e) {
            C0501b.m3026a("Could not destroy mediation adapter.", e);
        }
    }
}
