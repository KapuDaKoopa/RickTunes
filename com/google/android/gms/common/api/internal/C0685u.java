package com.google.android.gms.common.api.internal;

import android.support.annotation.BinderThread;
import com.google.android.gms.signin.internal.C0684b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C0685u extends C0684b {
    private final WeakReference f4650a;

    C0685u(C0674o c0674o) {
        this.f4650a = new WeakReference(c0674o);
    }

    @BinderThread
    public final void m5259a(SignInResponse signInResponse) {
        C0674o c0674o = (C0674o) this.f4650a.get();
        if (c0674o != null) {
            c0674o.f4618a.m5157a(new C0686v(this, c0674o, c0674o, signInResponse));
        }
    }
}
