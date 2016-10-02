package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class ah extends ap {
    private WeakReference f4554a;

    ah(C0689z c0689z) {
        this.f4554a = new WeakReference(c0689z);
    }

    public final void m5134a() {
        C0689z c0689z = (C0689z) this.f4554a.get();
        if (c0689z != null) {
            C0689z.m5278b(c0689z);
        }
    }
}
