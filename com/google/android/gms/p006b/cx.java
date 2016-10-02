package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.cx */
final class cx implements Runnable {
    final /* synthetic */ ue f3116a;
    final /* synthetic */ cw f3117b;

    cx(cw cwVar, ue ueVar) {
        this.f3117b = cwVar;
        this.f3116a = ueVar;
    }

    public final void run() {
        try {
            this.f3117b.f3112c.put(this.f3116a);
        } catch (InterruptedException e) {
        }
    }
}
