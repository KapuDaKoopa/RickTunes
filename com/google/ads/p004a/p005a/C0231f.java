package com.google.ads.p004a.p005a;

import com.google.android.gms.p006b.yl;
import com.google.android.gms.p006b.ys;

/* renamed from: com.google.ads.a.a.f */
public final class C0231f extends ys {
    public Long f1289a;
    public Integer f1290b;
    public Boolean f1291c;
    public Integer f1292d;

    protected final int m1668a() {
        int a = super.m1657a();
        if (this.f1289a != null) {
            a += yl.m4932b(1, this.f1289a.longValue());
        }
        if (this.f1290b != null) {
            a += yl.m4931b(2, this.f1290b.intValue());
        }
        if (this.f1291c != null) {
            this.f1291c.booleanValue();
            a += yl.m4930b(3) + 1;
        }
        return this.f1292d != null ? a + yl.m4931b(4, this.f1292d.intValue()) : a;
    }

    public final void m1669a(yl ylVar) {
        if (this.f1289a != null) {
            ylVar.m4942a(1, this.f1289a.longValue());
        }
        if (this.f1290b != null) {
            ylVar.m4941a(2, this.f1290b.intValue());
        }
        if (this.f1291c != null) {
            ylVar.m4945a(3, this.f1291c.booleanValue());
        }
        if (this.f1292d != null) {
            ylVar.m4941a(4, this.f1292d.intValue());
        }
        super.m1658a(ylVar);
    }
}
