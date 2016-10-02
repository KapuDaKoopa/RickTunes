package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.Status;

final class ad implements C0465m {
    final /* synthetic */ aw f4544a;
    final /* synthetic */ C0689z f4545b;

    ad(C0689z c0689z, aw awVar) {
        this.f4545b = c0689z;
        this.f4544a = awVar;
    }

    public final void m5129a(ConnectionResult connectionResult) {
        this.f4544a.m3343a(new Status(8));
    }
}
