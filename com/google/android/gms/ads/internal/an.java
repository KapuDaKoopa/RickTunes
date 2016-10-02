package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.C0385f;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.en;
import com.google.android.gms.p006b.pz;

final class an implements Runnable {
    final /* synthetic */ String f1808a;
    final /* synthetic */ pz f1809b;
    final /* synthetic */ aj f1810c;

    an(aj ajVar, String str, pz pzVar) {
        this.f1810c = ajVar;
        this.f1808a = str;
        this.f1809b = pzVar;
    }

    public final void run() {
        try {
            ((en) this.f1810c.f.f1877v.get(this.f1808a)).m3692a((C0385f) this.f1809b.f3922B);
        } catch (Throwable e) {
            C0501b.m3026a("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
