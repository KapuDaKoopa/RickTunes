package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.ow */
final class ow implements Runnable {
    final /* synthetic */ Context f3793a;
    final /* synthetic */ AdRequestInfoParcel f3794b;
    final /* synthetic */ pc f3795c;
    final /* synthetic */ cz f3796d;
    final /* synthetic */ cv f3797e;
    final /* synthetic */ String f3798f;
    final /* synthetic */ by f3799g;

    ow(Context context, AdRequestInfoParcel adRequestInfoParcel, pc pcVar, cz czVar, cv cvVar, String str, by byVar) {
        this.f3793a = context;
        this.f3794b = adRequestInfoParcel;
        this.f3795c = pcVar;
        this.f3796d = czVar;
        this.f3797e = cvVar;
        this.f3798f = str;
        this.f3799g = byVar;
    }

    public final void run() {
        ar.m2241f();
        tf a = tm.m4622a(this.f3793a, new AdSizeParcel(), null, this.f3794b.f2332k);
        if (ar.m2243h().m4376i()) {
            a.clearCache(true);
        }
        a.m4553a().setWillNotDraw(true);
        this.f3795c.f3817e = a;
        this.f3796d.m3603a(this.f3797e, "rwc");
        ti a2 = new oy(this.f3796d, this.f3796d.m3599a(), this.f3798f);
        tg l = a.m4579l();
        l.m4611a("/invalidRequest", this.f3795c.f3819g);
        l.m4611a("/loadAdURL", this.f3795c.f3820h);
        l.m4611a("/log", ey.f3169i);
        l.m4609a(a2);
        C0501b.m3027a(3);
        a.loadUrl(this.f3799g.f3010a);
    }
}
