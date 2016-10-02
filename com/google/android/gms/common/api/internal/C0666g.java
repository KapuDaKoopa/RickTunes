package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.internal.ax;

/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C0666g implements C0464l, C0465m {
    public final C0654a f4594a;
    al f4595b;
    private final int f4596c;

    public C0666g(C0654a c0654a, int i) {
        this.f4594a = c0654a;
        this.f4596c = i;
    }

    private void m5184a() {
        ax.m5528a(this.f4595b, (Object) "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public final void m5185a(int i) {
        m5184a();
        this.f4595b.m5155a(i);
    }

    public final void m5186a(Bundle bundle) {
        m5184a();
        al alVar = this.f4595b;
        alVar.f4555a.lock();
        try {
            alVar.f4565k.m5138a(bundle);
        } finally {
            alVar.f4555a.unlock();
        }
    }

    public final void m5187a(ConnectionResult connectionResult) {
        m5184a();
        al alVar = this.f4595b;
        C0654a c0654a = this.f4594a;
        int i = this.f4596c;
        alVar.f4555a.lock();
        try {
            alVar.f4565k.m5139a(connectionResult, c0654a, i);
        } finally {
            alVar.f4555a.unlock();
        }
    }
}
