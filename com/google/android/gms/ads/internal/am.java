package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.C0384e;
import com.google.android.gms.ads.internal.util.client.C0501b;

final class am implements Runnable {
    final /* synthetic */ C0384e f1806a;
    final /* synthetic */ aj f1807b;

    am(aj ajVar, C0384e c0384e) {
        this.f1807b = ajVar;
        this.f1806a = c0384e;
    }

    public final void run() {
        try {
            this.f1807b.f.f1875t.m3688a(this.f1806a);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
