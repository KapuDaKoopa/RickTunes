package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.yx */
public final class yx extends yn {
    public String[] f4401b;
    public String[] f4402c;
    public int[] f4403d;
    public long[] f4404e;

    public yx() {
        this.f4401b = yv.f4398f;
        this.f4402c = yv.f4398f;
        this.f4403d = yv.f4393a;
        this.f4404e = yv.f4394b;
        this.a = null;
        this.S = -1;
    }

    protected final int m4986a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.m4953a();
        if (this.f4401b == null || this.f4401b.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f4401b) {
                if (str != null) {
                    i3++;
                    i2 += yl.m4926a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.f4402c != null && this.f4402c.length > 0) {
            i3 = 0;
            a = 0;
            for (String str2 : this.f4402c) {
                if (str2 != null) {
                    a++;
                    i3 += yl.m4926a(str2);
                }
            }
            i = (i + i3) + (a * 1);
        }
        if (this.f4403d != null && this.f4403d.length > 0) {
            i3 = 0;
            for (int a2 : this.f4403d) {
                i3 += yl.m4923a(a2);
            }
            i = (i + i3) + (this.f4403d.length * 1);
        }
        if (this.f4404e == null || this.f4404e.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.f4404e.length) {
            i2 += yl.m4936b(this.f4404e[i4]);
            i4++;
        }
        return (i + i2) + (this.f4404e.length * 1);
    }

    public final void m4987a(yl ylVar) {
        int i = 0;
        if (this.f4401b != null && this.f4401b.length > 0) {
            for (String str : this.f4401b) {
                if (str != null) {
                    ylVar.m4944a(1, str);
                }
            }
        }
        if (this.f4402c != null && this.f4402c.length > 0) {
            for (String str2 : this.f4402c) {
                if (str2 != null) {
                    ylVar.m4944a(2, str2);
                }
            }
        }
        if (this.f4403d != null && this.f4403d.length > 0) {
            for (int a : this.f4403d) {
                ylVar.m4941a(3, a);
            }
        }
        if (this.f4404e != null && this.f4404e.length > 0) {
            while (i < this.f4404e.length) {
                ylVar.m4942a(4, this.f4404e[i]);
                i++;
            }
        }
        super.m4954a(ylVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yx)) {
            return false;
        }
        yx yxVar = (yx) obj;
        return !yr.m4977a(this.f4401b, yxVar.f4401b) ? false : !yr.m4977a(this.f4402c, yxVar.f4402c) ? false : !yr.m4975a(this.f4403d, yxVar.f4403d) ? false : !yr.m4976a(this.f4404e, yxVar.f4404e) ? false : (this.a == null || this.a.m4964b()) ? yxVar.a == null || yxVar.a.m4964b() : this.a.equals(yxVar.a);
    }

    public final int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + yr.m4972a(this.f4401b)) * 31) + yr.m4972a(this.f4402c)) * 31) + yr.m4970a(this.f4403d)) * 31) + yr.m4971a(this.f4404e)) * 31;
        int hashCode2 = (this.a == null || this.a.m4964b()) ? 0 : this.a.hashCode();
        return hashCode2 + hashCode;
    }
}
