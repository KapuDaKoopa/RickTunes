package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.qj */
final class qj implements Runnable {
    final /* synthetic */ qi f4013a;

    qj(qi qiVar) {
        this.f4013a = qiVar;
    }

    public final void run() {
        this.f4013a.f2247j = Thread.currentThread();
        this.f4013a.m2705a();
    }
}
