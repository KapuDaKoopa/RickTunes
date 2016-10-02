package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.C0408w;
import com.google.android.gms.ads.internal.overlay.C0410z;
import com.google.android.gms.ads.internal.overlay.aa;
import com.google.android.gms.ads.internal.overlay.ae;
import com.google.android.gms.p006b.ew;
import com.google.android.gms.p006b.gl;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.k */
public final class C0402k {
    public final gl f2140a;
    public final C0408w f2141b;
    public final C0410z f2142c;

    private C0402k(gl glVar, C0408w c0408w, C0410z c0410z) {
        this.f2140a = glVar;
        this.f2141b = c0408w;
        this.f2142c = c0410z;
    }

    public static C0402k m2603a() {
        return new C0402k(new ew(), new aa(), new ae());
    }
}
