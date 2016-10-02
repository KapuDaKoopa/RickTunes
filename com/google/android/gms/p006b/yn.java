package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.yn */
public abstract class yn extends ys {
    protected yp f4377a;

    private yn m4952e() {
        yn ynVar = (yn) super.m1659b();
        yr.m4974a(this, ynVar);
        return ynVar;
    }

    protected int m4953a() {
        int i = 0;
        if (this.f4377a == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f4377a.m4962a()) {
            i2 += this.f4377a.m4963a(i).m4967a();
            i++;
        }
        return i2;
    }

    public void m4954a(yl ylVar) {
        if (this.f4377a != null) {
            for (int i = 0; i < this.f4377a.m4962a(); i++) {
                this.f4377a.m4963a(i).m4968a(ylVar);
            }
        }
    }

    public final /* synthetic */ ys m4955b() {
        return m4952e();
    }

    public /* synthetic */ Object clone() {
        return m4952e();
    }
}
