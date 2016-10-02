package com.google.ads.p004a.p005a;

import com.google.android.gms.p006b.yl;
import com.google.android.gms.p006b.yr;
import com.google.android.gms.p006b.ys;

/* renamed from: com.google.ads.a.a.e */
public final class C0230e extends ys {
    private static volatile C0230e[] f1286c;
    public Long f1287a;
    public Long f1288b;

    public C0230e() {
        this.f1287a = null;
        this.f1288b = null;
        this.S = -1;
    }

    public static C0230e[] a_() {
        if (f1286c == null) {
            synchronized (yr.f4390a) {
                if (f1286c == null) {
                    f1286c = new C0230e[0];
                }
            }
        }
        return f1286c;
    }

    protected final int m1666a() {
        int a = super.m1657a();
        if (this.f1287a != null) {
            a += yl.m4932b(1, this.f1287a.longValue());
        }
        return this.f1288b != null ? a + yl.m4932b(2, this.f1288b.longValue()) : a;
    }

    public final void m1667a(yl ylVar) {
        if (this.f1287a != null) {
            ylVar.m4942a(1, this.f1287a.longValue());
        }
        if (this.f1288b != null) {
            ylVar.m4942a(2, this.f1288b.longValue());
        }
        super.m1658a(ylVar);
    }
}
