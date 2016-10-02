package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.aq;
import com.google.android.gms.p006b.at;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.tf;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.f */
final class C0378f implements fk {
    final /* synthetic */ C0377e f2046a;

    C0378f(C0377e c0377e) {
        this.f2046a = c0377e;
    }

    public final void m2478a(tf tfVar, Map map) {
        if (this.f2046a.f.f1865j != null) {
            at atVar = this.f2046a.h;
            AdSizeParcel adSizeParcel = this.f2046a.f.f1864i;
            pz pzVar = this.f2046a.f.f1865j;
            atVar.m3479a(adSizeParcel, pzVar, new aq(tfVar.m4564b(), pzVar), tfVar);
            return;
        }
        C0501b.m3025a("Request to enable ActiveView before adState is available.");
    }
}
