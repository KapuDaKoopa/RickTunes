package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.ou */
final class ou implements sx {
    final /* synthetic */ cv f3790a;
    final /* synthetic */ ot f3791b;

    ou(ot otVar, cv cvVar) {
        this.f3791b = otVar;
        this.f3790a = cvVar;
    }

    public final /* synthetic */ void m4320a(Object obj) {
        ji jiVar = (ji) obj;
        this.f3791b.f3787c.m3603a(this.f3790a, "jsf");
        this.f3791b.f3787c.m3604b();
        jiVar.m3841a("/invalidRequest", this.f3791b.f3786b.f3819g);
        jiVar.m3841a("/loadAdURL", this.f3791b.f3786b.f3820h);
        try {
            jiVar.m3842a("AFMA_buildAdURL", this.f3791b.f3789e);
        } catch (Exception e) {
            C0501b.m3027a(6);
        }
    }
}
