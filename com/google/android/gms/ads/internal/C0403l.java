package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.l */
public final class C0403l {
    C0404m f2143a;
    boolean f2144b;
    private boolean f2145c;

    public C0403l() {
        this.f2145c = ((Boolean) ar.m2249n().m3580a(ck.f3070i)).booleanValue();
    }

    public C0403l(byte b) {
        this.f2145c = false;
    }

    public final void m2604a(String str) {
        C0501b.m3027a(3);
        if (this.f2143a != null) {
            this.f2143a.m2606a(str);
        }
    }

    public final boolean m2605a() {
        return !this.f2145c || this.f2144b;
    }
}
