package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.zb */
public final class zb extends yn {
    private static volatile zb[] f4432d;
    public String f4433b;
    public String f4434c;

    public zb() {
        this.f4433b = "";
        this.f4434c = "";
        this.a = null;
        this.S = -1;
    }

    public static zb[] m4994e() {
        if (f4432d == null) {
            synchronized (yr.f4390a) {
                if (f4432d == null) {
                    f4432d = new zb[0];
                }
            }
        }
        return f4432d;
    }

    protected final int m4995a() {
        int a = super.m4953a();
        if (!this.f4433b.equals("")) {
            a += yl.m4934b(1, this.f4433b);
        }
        return !this.f4434c.equals("") ? a + yl.m4934b(2, this.f4434c) : a;
    }

    public final void m4996a(yl ylVar) {
        if (!this.f4433b.equals("")) {
            ylVar.m4944a(1, this.f4433b);
        }
        if (!this.f4434c.equals("")) {
            ylVar.m4944a(2, this.f4434c);
        }
        super.m4954a(ylVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        if (this.f4433b == null) {
            if (zbVar.f4433b != null) {
                return false;
            }
        } else if (!this.f4433b.equals(zbVar.f4433b)) {
            return false;
        }
        if (this.f4434c == null) {
            if (zbVar.f4434c != null) {
                return false;
            }
        } else if (!this.f4434c.equals(zbVar.f4434c)) {
            return false;
        }
        return (this.a == null || this.a.m4964b()) ? zbVar.a == null || zbVar.a.m4964b() : this.a.equals(zbVar.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f4434c == null ? 0 : this.f4434c.hashCode()) + (((this.f4433b == null ? 0 : this.f4433b.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.a == null || this.a.m4964b())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}
