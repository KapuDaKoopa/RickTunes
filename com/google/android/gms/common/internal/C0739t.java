package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0676n;

/* renamed from: com.google.android.gms.common.internal.t */
public final class C0739t implements C0676n {
    final /* synthetic */ C0469n f4867a;

    public C0739t(C0469n c0469n) {
        this.f4867a = c0469n;
    }

    public final void m5608a(ConnectionResult connectionResult) {
        if (connectionResult.m5057b()) {
            this.f4867a.m2893a(null, this.f4867a.f2496v);
        } else if (this.f4867a.f2499y != null) {
            this.f4867a.f2499y.m2856a(connectionResult);
        }
    }
}
