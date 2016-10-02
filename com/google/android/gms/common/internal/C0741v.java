package com.google.android.gms.common.internal;

import android.support.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.v */
public final class C0741v extends C0732o {
    final /* synthetic */ C0469n f4870e;

    @BinderThread
    public C0741v(C0469n c0469n, int i) {
        this.f4870e = c0469n;
        super(c0469n, i, null);
    }

    protected final void m5611a(ConnectionResult connectionResult) {
        this.f4870e.f2491q.m5242a(connectionResult);
        this.f4870e.m2891a(connectionResult);
    }

    protected final boolean m5612a() {
        this.f4870e.f2491q.m5242a(ConnectionResult.f4498a);
        return true;
    }
}
