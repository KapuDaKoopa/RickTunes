package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: com.google.android.gms.common.api.internal.v */
final class C0686v extends am {
    final /* synthetic */ C0674o f4651a;
    final /* synthetic */ SignInResponse f4652b;
    final /* synthetic */ C0685u f4653c;

    C0686v(C0685u c0685u, ak akVar, C0674o c0674o, SignInResponse signInResponse) {
        this.f4653c = c0685u;
        this.f4651a = c0674o;
        this.f4652b = signInResponse;
        super(akVar);
    }

    public final void m5260a() {
        C0674o c0674o = this.f4651a;
        SignInResponse signInResponse = this.f4652b;
        if (c0674o.m5237b(0)) {
            ConnectionResult a = signInResponse.m5756a();
            if (a.m5057b()) {
                ResolveAccountResponse b = signInResponse.m5757b();
                a = b.m5397b();
                if (a.m5057b()) {
                    c0674o.f4624g = true;
                    c0674o.f4625h = b.m5396a();
                    c0674o.f4626i = b.m5398c();
                    c0674o.f4627j = b.m5399d();
                    c0674o.m5240e();
                    return;
                }
                Log.wtf("GoogleApiClientConnecting", "Sign-in succeeded with resolve account failure: " + a, new Exception());
                c0674o.m5234b(a);
            } else if (c0674o.m5232a(a)) {
                c0674o.m5241f();
                c0674o.m5240e();
            } else {
                c0674o.m5234b(a);
            }
        }
    }
}
