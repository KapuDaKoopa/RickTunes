package com.google.android.gms.ads.internal.request;

import com.google.android.gms.p006b.op;
import java.lang.ref.WeakReference;

@op
/* renamed from: com.google.android.gms.ads.internal.request.t */
public final class C0472t extends aa {
    private final WeakReference f2502a;

    public C0472t(C0452k c0452k) {
        this.f2502a = new WeakReference(c0452k);
    }

    public final void m2910a(AdResponseParcel adResponseParcel) {
        C0452k c0452k = (C0452k) this.f2502a.get();
        if (c0452k != null) {
            c0452k.m2833a(adResponseParcel);
        }
    }
}
