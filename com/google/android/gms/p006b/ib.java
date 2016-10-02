package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.b.ib */
final class ib implements Runnable {
    final /* synthetic */ Context f3370a;
    final /* synthetic */ VersionInfoParcel f3371b;
    final /* synthetic */ id f3372c;
    final /* synthetic */ aa f3373d;
    final /* synthetic */ String f3374e;
    final /* synthetic */ ia f3375f;

    ib(ia iaVar, Context context, VersionInfoParcel versionInfoParcel, id idVar, aa aaVar, String str) {
        this.f3375f = iaVar;
        this.f3370a = context;
        this.f3371b = versionInfoParcel;
        this.f3372c = idVar;
        this.f3373d = aaVar;
        this.f3374e = str;
    }

    public final void run() {
        ia iaVar = this.f3375f;
        Context context = this.f3370a;
        VersionInfoParcel versionInfoParcel = this.f3371b;
        id idVar = this.f3372c;
        hy ieVar = new ie(context, versionInfoParcel, this.f3373d);
        idVar.f3383a = ieVar;
        ieVar.m3848a(new ic(iaVar, idVar));
        ieVar.m3851b(this.f3374e);
    }
}
