package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.gd */
public final class gd extends qi {
    final tf f3264a;
    final gg f3265b;
    private final String f3266c;

    gd(tf tfVar, gg ggVar, String str) {
        this.f3264a = tfVar;
        this.f3265b = ggVar;
        this.f3266c = str;
        ar.m2255t().m3749a(this);
    }

    public final void m3744a() {
        try {
            this.f3265b.m3755a(this.f3266c);
        } finally {
            rd.f4041a.post(new ge(this));
        }
    }

    public final void m3745b() {
        this.f3265b.m3752a();
    }
}
