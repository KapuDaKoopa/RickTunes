package com.google.ads.p004a.p005a;

import com.google.android.gms.p006b.yl;
import com.google.android.gms.p006b.ys;

/* renamed from: com.google.ads.a.a.g */
public final class C0232g extends ys {
    public Long f1293a;
    public String f1294b;
    public byte[] f1295c;

    protected final int m1670a() {
        int a = super.m1657a();
        if (this.f1293a != null) {
            a += yl.m4932b(1, this.f1293a.longValue());
        }
        if (this.f1294b != null) {
            a += yl.m4934b(3, this.f1294b);
        }
        return this.f1295c != null ? a + yl.m4935b(4, this.f1295c) : a;
    }

    public final void m1671a(yl ylVar) {
        if (this.f1293a != null) {
            ylVar.m4942a(1, this.f1293a.longValue());
        }
        if (this.f1294b != null) {
            ylVar.m4944a(3, this.f1294b);
        }
        if (this.f1295c != null) {
            ylVar.m4946a(4, this.f1295c);
        }
        super.m1658a(ylVar);
    }
}
