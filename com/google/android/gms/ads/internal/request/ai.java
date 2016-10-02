package com.google.android.gms.ads.internal.request;

final class ai implements Runnable {
    final /* synthetic */ ad f2442a;

    ai(ad adVar) {
        this.f2442a = adVar;
    }

    public final void run() {
        if (this.f2442a.f2434m != null) {
            this.f2442a.f2434m.m3888a();
            this.f2442a.f2434m = null;
        }
    }
}
