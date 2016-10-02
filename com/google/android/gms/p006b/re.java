package com.google.android.gms.p006b;

import android.content.Context;

/* renamed from: com.google.android.gms.b.re */
final class re implements Runnable {
    final /* synthetic */ Context f4046a;
    final /* synthetic */ rd f4047b;

    re(rd rdVar, Context context) {
        this.f4047b = rdVar;
        this.f4046a = context;
    }

    public final void run() {
        synchronized (this.f4047b.f4042b) {
            rd rdVar = this.f4047b;
            rd rdVar2 = this.f4047b;
            rdVar.f4044d = rd.m4439c(this.f4046a);
            this.f4047b.f4042b.notifyAll();
        }
    }
}
