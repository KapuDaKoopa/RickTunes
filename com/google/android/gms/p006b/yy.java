package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.yy */
public final class yy extends yn {
    public int f4405b;
    public String f4406c;
    public String f4407d;

    public yy() {
        this.f4405b = 0;
        this.f4406c = "";
        this.f4407d = "";
        this.a = null;
        this.S = -1;
    }

    protected final int m4988a() {
        int a = super.m4953a();
        if (this.f4405b != 0) {
            a += yl.m4931b(1, this.f4405b);
        }
        if (!this.f4406c.equals("")) {
            a += yl.m4934b(2, this.f4406c);
        }
        return !this.f4407d.equals("") ? a + yl.m4934b(3, this.f4407d) : a;
    }

    public final void m4989a(yl ylVar) {
        if (this.f4405b != 0) {
            ylVar.m4941a(1, this.f4405b);
        }
        if (!this.f4406c.equals("")) {
            ylVar.m4944a(2, this.f4406c);
        }
        if (!this.f4407d.equals("")) {
            ylVar.m4944a(3, this.f4407d);
        }
        super.m4954a(ylVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        if (this.f4405b != yyVar.f4405b) {
            return false;
        }
        if (this.f4406c == null) {
            if (yyVar.f4406c != null) {
                return false;
            }
        } else if (!this.f4406c.equals(yyVar.f4406c)) {
            return false;
        }
        if (this.f4407d == null) {
            if (yyVar.f4407d != null) {
                return false;
            }
        } else if (!this.f4407d.equals(yyVar.f4407d)) {
            return false;
        }
        return (this.a == null || this.a.m4964b()) ? yyVar.a == null || yyVar.a.m4964b() : this.a.equals(yyVar.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f4407d == null ? 0 : this.f4407d.hashCode()) + (((this.f4406c == null ? 0 : this.f4406c.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f4405b) * 31)) * 31)) * 31;
        if (!(this.a == null || this.a.m4964b())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}
