package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.yp */
public final class yp implements Cloneable {
    private static final yq f4382a;
    private boolean f4383b;
    private int[] f4384c;
    private yq[] f4385d;
    private int f4386e;

    static {
        f4382a = new yq();
    }

    yp() {
        this(10);
    }

    private yp(int i) {
        this.f4383b = false;
        int b = yp.m4960b(i * 4) / 4;
        this.f4384c = new int[b];
        this.f4385d = new yq[b];
        this.f4386e = 0;
    }

    private static int m4960b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    private void m4961d() {
        int i = this.f4386e;
        int[] iArr = this.f4384c;
        yq[] yqVarArr = this.f4385d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            yq yqVar = yqVarArr[i3];
            if (yqVar != f4382a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    yqVarArr[i2] = yqVar;
                    yqVarArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4383b = false;
        this.f4386e = i2;
    }

    final int m4962a() {
        if (this.f4383b) {
            m4961d();
        }
        return this.f4386e;
    }

    final yq m4963a(int i) {
        if (this.f4383b) {
            m4961d();
        }
        return this.f4385d[i];
    }

    public final boolean m4964b() {
        return m4962a() == 0;
    }

    public final yp m4965c() {
        int i = 0;
        int a = m4962a();
        yp ypVar = new yp(a);
        System.arraycopy(this.f4384c, 0, ypVar.f4384c, 0, a);
        while (i < a) {
            if (this.f4385d[i] != null) {
                ypVar.f4385d[i] = this.f4385d[i].m4969b();
            }
            i++;
        }
        ypVar.f4386e = a;
        return ypVar;
    }

    public final /* synthetic */ Object clone() {
        return m4965c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        if (m4962a() != ypVar.m4962a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f4384c;
        int[] iArr2 = ypVar.f4384c;
        int i2 = this.f4386e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            yq[] yqVarArr = this.f4385d;
            yq[] yqVarArr2 = ypVar.f4385d;
            i2 = this.f4386e;
            for (i = 0; i < i2; i++) {
                if (!yqVarArr[i].equals(yqVarArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4383b) {
            m4961d();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.f4386e; i2++) {
            i = (((i * 31) + this.f4384c[i2]) * 31) + this.f4385d[i2].hashCode();
        }
        return i;
    }
}
