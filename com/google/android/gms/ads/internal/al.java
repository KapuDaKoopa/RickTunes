package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.C0383d;
import com.google.android.gms.ads.internal.util.client.C0501b;

final class al implements Runnable {
    final /* synthetic */ C0383d f1804a;
    final /* synthetic */ aj f1805b;

    al(aj ajVar, C0383d c0383d) {
        this.f1805b = ajVar;
        this.f1804a = c0383d;
    }

    public final void run() {
        try {
            this.f1805b.f.f1874s.m3686a(this.f1804a);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
