package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0654a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.y */
public final class C0688y implements ak {
    private final al f4655a;

    public C0688y(al alVar) {
        this.f4655a = alVar;
    }

    public final C0586c m5264a(C0586c c0586c) {
        this.f4655a.f4567m.f4656a.add(c0586c);
        return c0586c;
    }

    public final void m5265a() {
        for (C0467c g : this.f4655a.f4560f.values()) {
            g.m2868g();
        }
        this.f4655a.f4567m.f4659d = Collections.emptySet();
    }

    public final void m5266a(int i) {
    }

    public final void m5267a(Bundle bundle) {
    }

    public final void m5268a(ConnectionResult connectionResult, C0654a c0654a, int i) {
    }

    public final C0586c m5269b(C0586c c0586c) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean m5270b() {
        return true;
    }

    public final void m5271c() {
        al alVar = this.f4655a;
        alVar.f4555a.lock();
        try {
            alVar.f4565k = new C0674o(alVar, alVar.f4562h, alVar.f4563i, alVar.f4558d, alVar.f4564j, alVar.f4555a, alVar.f4557c);
            alVar.f4565k.m5136a();
            alVar.f4556b.signalAll();
        } finally {
            alVar.f4555a.unlock();
        }
    }
}
