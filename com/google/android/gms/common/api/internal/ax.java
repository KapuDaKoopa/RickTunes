package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0660i;

final class ax implements C0465m {
    public final int f4576a;
    public final C0660i f4577b;
    public final C0465m f4578c;
    final /* synthetic */ zzw f4579d;

    public ax(zzw com_google_android_gms_common_api_internal_zzw, int i, C0660i c0660i, C0465m c0465m) {
        this.f4579d = com_google_android_gms_common_api_internal_zzw;
        this.f4576a = i;
        this.f4577b = c0660i;
        this.f4578c = c0465m;
        c0660i.m5087a((C0465m) this);
    }

    public final void m5177a(ConnectionResult connectionResult) {
        this.f4579d.f4534f.post(new ay(this.f4579d, this.f4576a, connectionResult));
    }
}
