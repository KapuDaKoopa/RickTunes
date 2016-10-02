package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

final class ap implements Runnable {
    final /* synthetic */ WeakReference f1817a;
    final /* synthetic */ ao f1818b;

    ap(ao aoVar, WeakReference weakReference) {
        this.f1818b = aoVar;
        this.f1817a = weakReference;
    }

    public final void run() {
        this.f1818b.f1814d = false;
        C0346b c0346b = (C0346b) this.f1817a.get();
        if (c0346b != null) {
            c0346b.m2170c(this.f1818b.f1813c);
        }
    }
}
