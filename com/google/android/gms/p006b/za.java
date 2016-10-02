package com.google.android.gms.p006b;

import java.util.Arrays;

/* renamed from: com.google.android.gms.b.za */
public final class za extends yn {
    public long f4412b;
    public long f4413c;
    public long f4414d;
    public String f4415e;
    public int f4416f;
    public int f4417g;
    public boolean f4418h;
    public zb[] f4419i;
    public yy f4420j;
    public byte[] f4421k;
    public byte[] f4422l;
    public byte[] f4423m;
    public yx f4424n;
    public String f4425o;
    public long f4426p;
    public yz f4427q;
    public byte[] f4428r;
    public int f4429s;
    public int[] f4430t;
    public long f4431u;

    public za() {
        this.f4412b = 0;
        this.f4413c = 0;
        this.f4414d = 0;
        this.f4415e = "";
        this.f4416f = 0;
        this.f4417g = 0;
        this.f4418h = false;
        this.f4419i = zb.m4994e();
        this.f4420j = null;
        this.f4421k = yv.f4400h;
        this.f4422l = yv.f4400h;
        this.f4423m = yv.f4400h;
        this.f4424n = null;
        this.f4425o = "";
        this.f4426p = 180000;
        this.f4427q = null;
        this.f4428r = yv.f4400h;
        this.f4429s = 0;
        this.f4430t = yv.f4393a;
        this.f4431u = 0;
        this.a = null;
        this.S = -1;
    }

    protected final int m4992a() {
        int i;
        int i2 = 0;
        int a = super.m4953a();
        if (this.f4412b != 0) {
            a += yl.m4932b(1, this.f4412b);
        }
        if (!this.f4415e.equals("")) {
            a += yl.m4934b(2, this.f4415e);
        }
        if (this.f4419i != null && this.f4419i.length > 0) {
            i = a;
            for (ys ysVar : this.f4419i) {
                if (ysVar != null) {
                    i += yl.m4933b(3, ysVar);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f4421k, yv.f4400h)) {
            a += yl.m4935b(6, this.f4421k);
        }
        if (this.f4424n != null) {
            a += yl.m4933b(7, this.f4424n);
        }
        if (!Arrays.equals(this.f4422l, yv.f4400h)) {
            a += yl.m4935b(8, this.f4422l);
        }
        if (this.f4420j != null) {
            a += yl.m4933b(9, this.f4420j);
        }
        if (this.f4418h) {
            boolean z = this.f4418h;
            a += yl.m4930b(10) + 1;
        }
        if (this.f4416f != 0) {
            a += yl.m4931b(11, this.f4416f);
        }
        if (this.f4417g != 0) {
            a += yl.m4931b(12, this.f4417g);
        }
        if (!Arrays.equals(this.f4423m, yv.f4400h)) {
            a += yl.m4935b(13, this.f4423m);
        }
        if (!this.f4425o.equals("")) {
            a += yl.m4934b(14, this.f4425o);
        }
        if (this.f4426p != 180000) {
            a += yl.m4936b(yl.m4938c(this.f4426p)) + yl.m4930b(15);
        }
        if (this.f4427q != null) {
            a += yl.m4933b(16, this.f4427q);
        }
        if (this.f4413c != 0) {
            a += yl.m4932b(17, this.f4413c);
        }
        if (!Arrays.equals(this.f4428r, yv.f4400h)) {
            a += yl.m4935b(18, this.f4428r);
        }
        if (this.f4429s != 0) {
            a += yl.m4931b(19, this.f4429s);
        }
        if (this.f4430t != null && this.f4430t.length > 0) {
            i = 0;
            while (i2 < this.f4430t.length) {
                i += yl.m4923a(this.f4430t[i2]);
                i2++;
            }
            a = (a + i) + (this.f4430t.length * 2);
        }
        if (this.f4414d != 0) {
            a += yl.m4932b(21, this.f4414d);
        }
        return this.f4431u != 0 ? a + yl.m4932b(22, this.f4431u) : a;
    }

    public final void m4993a(yl ylVar) {
        int i = 0;
        if (this.f4412b != 0) {
            ylVar.m4942a(1, this.f4412b);
        }
        if (!this.f4415e.equals("")) {
            ylVar.m4944a(2, this.f4415e);
        }
        if (this.f4419i != null && this.f4419i.length > 0) {
            for (ys ysVar : this.f4419i) {
                if (ysVar != null) {
                    ylVar.m4943a(3, ysVar);
                }
            }
        }
        if (!Arrays.equals(this.f4421k, yv.f4400h)) {
            ylVar.m4946a(6, this.f4421k);
        }
        if (this.f4424n != null) {
            ylVar.m4943a(7, this.f4424n);
        }
        if (!Arrays.equals(this.f4422l, yv.f4400h)) {
            ylVar.m4946a(8, this.f4422l);
        }
        if (this.f4420j != null) {
            ylVar.m4943a(9, this.f4420j);
        }
        if (this.f4418h) {
            ylVar.m4945a(10, this.f4418h);
        }
        if (this.f4416f != 0) {
            ylVar.m4941a(11, this.f4416f);
        }
        if (this.f4417g != 0) {
            ylVar.m4941a(12, this.f4417g);
        }
        if (!Arrays.equals(this.f4423m, yv.f4400h)) {
            ylVar.m4946a(13, this.f4423m);
        }
        if (!this.f4425o.equals("")) {
            ylVar.m4944a(14, this.f4425o);
        }
        if (this.f4426p != 180000) {
            long j = this.f4426p;
            ylVar.m4951c(15, 0);
            ylVar.m4947a(yl.m4938c(j));
        }
        if (this.f4427q != null) {
            ylVar.m4943a(16, this.f4427q);
        }
        if (this.f4413c != 0) {
            ylVar.m4942a(17, this.f4413c);
        }
        if (!Arrays.equals(this.f4428r, yv.f4400h)) {
            ylVar.m4946a(18, this.f4428r);
        }
        if (this.f4429s != 0) {
            ylVar.m4941a(19, this.f4429s);
        }
        if (this.f4430t != null && this.f4430t.length > 0) {
            while (i < this.f4430t.length) {
                ylVar.m4941a(20, this.f4430t[i]);
                i++;
            }
        }
        if (this.f4414d != 0) {
            ylVar.m4942a(21, this.f4414d);
        }
        if (this.f4431u != 0) {
            ylVar.m4942a(22, this.f4431u);
        }
        super.m4954a(ylVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        if (this.f4412b != zaVar.f4412b) {
            return false;
        }
        if (this.f4413c != zaVar.f4413c) {
            return false;
        }
        if (this.f4414d != zaVar.f4414d) {
            return false;
        }
        if (this.f4415e == null) {
            if (zaVar.f4415e != null) {
                return false;
            }
        } else if (!this.f4415e.equals(zaVar.f4415e)) {
            return false;
        }
        if (this.f4416f != zaVar.f4416f) {
            return false;
        }
        if (this.f4417g != zaVar.f4417g) {
            return false;
        }
        if (this.f4418h != zaVar.f4418h) {
            return false;
        }
        if (!yr.m4977a(this.f4419i, zaVar.f4419i)) {
            return false;
        }
        if (this.f4420j == null) {
            if (zaVar.f4420j != null) {
                return false;
            }
        } else if (!this.f4420j.equals(zaVar.f4420j)) {
            return false;
        }
        if (!Arrays.equals(this.f4421k, zaVar.f4421k)) {
            return false;
        }
        if (!Arrays.equals(this.f4422l, zaVar.f4422l)) {
            return false;
        }
        if (!Arrays.equals(this.f4423m, zaVar.f4423m)) {
            return false;
        }
        if (this.f4424n == null) {
            if (zaVar.f4424n != null) {
                return false;
            }
        } else if (!this.f4424n.equals(zaVar.f4424n)) {
            return false;
        }
        if (this.f4425o == null) {
            if (zaVar.f4425o != null) {
                return false;
            }
        } else if (!this.f4425o.equals(zaVar.f4425o)) {
            return false;
        }
        if (this.f4426p != zaVar.f4426p) {
            return false;
        }
        if (this.f4427q == null) {
            if (zaVar.f4427q != null) {
                return false;
            }
        } else if (!this.f4427q.equals(zaVar.f4427q)) {
            return false;
        }
        return !Arrays.equals(this.f4428r, zaVar.f4428r) ? false : this.f4429s != zaVar.f4429s ? false : !yr.m4975a(this.f4430t, zaVar.f4430t) ? false : this.f4431u != zaVar.f4431u ? false : (this.a == null || this.a.m4964b()) ? zaVar.a == null || zaVar.a.m4964b() : this.a.equals(zaVar.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f4427q == null ? 0 : this.f4427q.hashCode()) + (((((this.f4425o == null ? 0 : this.f4425o.hashCode()) + (((this.f4424n == null ? 0 : this.f4424n.hashCode()) + (((((((((this.f4420j == null ? 0 : this.f4420j.hashCode()) + (((((this.f4418h ? 1231 : 1237) + (((((((this.f4415e == null ? 0 : this.f4415e.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f4412b ^ (this.f4412b >>> 32)))) * 31) + ((int) (this.f4413c ^ (this.f4413c >>> 32)))) * 31) + ((int) (this.f4414d ^ (this.f4414d >>> 32)))) * 31)) * 31) + this.f4416f) * 31) + this.f4417g) * 31)) * 31) + yr.m4972a(this.f4419i)) * 31)) * 31) + Arrays.hashCode(this.f4421k)) * 31) + Arrays.hashCode(this.f4422l)) * 31) + Arrays.hashCode(this.f4423m)) * 31)) * 31)) * 31) + ((int) (this.f4426p ^ (this.f4426p >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.f4428r)) * 31) + this.f4429s) * 31) + yr.m4970a(this.f4430t)) * 31) + ((int) (this.f4431u ^ (this.f4431u >>> 32)))) * 31;
        if (!(this.a == null || this.a.m4964b())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}
