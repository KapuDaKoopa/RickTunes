package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.b.ox */
final class ox implements Runnable {
    final /* synthetic */ oq f3800a;
    final /* synthetic */ Context f3801b;
    final /* synthetic */ pc f3802c;
    final /* synthetic */ AdRequestInfoParcel f3803d;

    ox(oq oqVar, Context context, pc pcVar, AdRequestInfoParcel adRequestInfoParcel) {
        this.f3800a = oqVar;
        this.f3801b = context;
        this.f3802c = pcVar;
        this.f3803d = adRequestInfoParcel;
    }

    public final void run() {
        pm pmVar = this.f3800a.f3768c;
        Context context = this.f3801b;
        pc pcVar = this.f3802c;
        VersionInfoParcel versionInfoParcel = this.f3803d.f2332k;
        pmVar.m4346a(pcVar);
    }
}
