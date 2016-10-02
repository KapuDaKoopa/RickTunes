package com.google.analytics.p009a.p011b;

import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.tagmanager.p012a.p013a.C0275a;
import com.google.tagmanager.p012a.p013a.C0798d;

/* renamed from: com.google.analytics.a.b.g */
public final class C0281g extends C0275a {
    public static final C0281g[] f1441a;
    public String[] f1442b;
    public String[] f1443c;
    public C0286b[] f1444d;
    public C0280f[] f1445e;
    public C0277c[] f1446f;
    public C0277c[] f1447g;
    public C0277c[] f1448h;
    public C0282h[] f1449i;
    public String f1450j;
    public String f1451k;
    public String f1452l;
    public String f1453m;
    public C0276b f1454n;
    public float f1455o;
    public boolean f1456p;
    public String[] f1457q;
    public int f1458r;

    static {
        f1441a = new C0281g[0];
    }

    public C0281g() {
        this.f1442b = C0798d.f5052j;
        this.f1443c = C0798d.f5052j;
        this.f1444d = C0286b.f1478a;
        this.f1445e = C0280f.f1438a;
        this.f1446f = C0277c.f1422a;
        this.f1447g = C0277c.f1422a;
        this.f1448h = C0277c.f1422a;
        this.f1449i = C0282h.f1459a;
        this.f1450j = "";
        this.f1451k = "";
        this.f1452l = "0";
        this.f1453m = "";
        this.f1454n = null;
        this.f1455o = 0.0f;
        this.f1456p = false;
        this.f1457q = C0798d.f5052j;
        this.f1458r = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        if (r5 != r4) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r5 instanceof com.google.analytics.p009a.p011b.C0281g;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r5 = (com.google.analytics.p009a.p011b.C0281g) r5;
        r2 = r4.f1442b;
        r3 = r5.f1442b;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0017:
        r2 = r4.f1443c;
        r3 = r5.f1443c;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0021:
        r2 = r4.f1444d;
        r3 = r5.f1444d;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x002b:
        r2 = r4.f1445e;
        r3 = r5.f1445e;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0035:
        r2 = r4.f1446f;
        r3 = r5.f1446f;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x003f:
        r2 = r4.f1447g;
        r3 = r5.f1447g;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0049:
        r2 = r4.f1448h;
        r3 = r5.f1448h;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x0053:
        r2 = r4.f1449i;
        r3 = r5.f1449i;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x005d:
        r2 = r4.f1450j;
        if (r2 != 0) goto L_0x00ae;
    L_0x0061:
        r2 = r5.f1450j;
        if (r2 != 0) goto L_0x00ab;
    L_0x0065:
        r2 = r4.f1451k;
        if (r2 != 0) goto L_0x00b9;
    L_0x0069:
        r2 = r5.f1451k;
        if (r2 != 0) goto L_0x00ab;
    L_0x006d:
        r2 = r4.f1452l;
        if (r2 != 0) goto L_0x00c4;
    L_0x0071:
        r2 = r5.f1452l;
        if (r2 != 0) goto L_0x00ab;
    L_0x0075:
        r2 = r4.f1453m;
        if (r2 != 0) goto L_0x00cf;
    L_0x0079:
        r2 = r5.f1453m;
        if (r2 != 0) goto L_0x00ab;
    L_0x007d:
        r2 = r4.f1454n;
        if (r2 != 0) goto L_0x00da;
    L_0x0081:
        r2 = r5.f1454n;
        if (r2 != 0) goto L_0x00ab;
    L_0x0085:
        r2 = r4.f1455o;
        r3 = r5.f1455o;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 != 0) goto L_0x00ab;
    L_0x008d:
        r2 = r4.f1456p;
        r3 = r5.f1456p;
        if (r2 != r3) goto L_0x00ab;
    L_0x0093:
        r2 = r4.f1457q;
        r3 = r5.f1457q;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x009d:
        r2 = r4.f1458r;
        r3 = r5.f1458r;
        if (r2 != r3) goto L_0x00ab;
    L_0x00a3:
        r2 = r4.s;
        if (r2 != 0) goto L_0x00e5;
    L_0x00a7:
        r2 = r5.s;
        if (r2 == 0) goto L_0x0004;
    L_0x00ab:
        r0 = r1;
        goto L_0x0004;
    L_0x00ae:
        r2 = r4.f1450j;
        r3 = r5.f1450j;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00b8:
        goto L_0x0065;
    L_0x00b9:
        r2 = r4.f1451k;
        r3 = r5.f1451k;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00c3:
        goto L_0x006d;
    L_0x00c4:
        r2 = r4.f1452l;
        r3 = r5.f1452l;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00ce:
        goto L_0x0075;
    L_0x00cf:
        r2 = r4.f1453m;
        r3 = r5.f1453m;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00d9:
        goto L_0x007d;
    L_0x00da:
        r2 = r4.f1454n;
        r3 = r5.f1454n;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00e4:
        goto L_0x0085;
    L_0x00e5:
        r2 = r4.s;
        r3 = r5.s;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00ab;
    L_0x00ef:
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.b.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f1442b == null) {
            i = 527;
        } else {
            i = 17;
            for (i2 = 0; i2 < this.f1442b.length; i2++) {
                i = (this.f1442b[i2] == null ? 0 : this.f1442b[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1443c == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1443c.length; i2++) {
                i = (this.f1443c[i2] == null ? 0 : this.f1443c[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1444d == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1444d.length; i2++) {
                i = (this.f1444d[i2] == null ? 0 : this.f1444d[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1445e == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1445e.length; i2++) {
                i = (this.f1445e[i2] == null ? 0 : this.f1445e[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1446f == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1446f.length; i2++) {
                i = (this.f1446f[i2] == null ? 0 : this.f1446f[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1447g == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1447g.length; i2++) {
                i = (this.f1447g[i2] == null ? 0 : this.f1447g[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1448h == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1448h.length; i2++) {
                i = (this.f1448h[i2] == null ? 0 : this.f1448h[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1449i == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1449i.length; i2++) {
                i = (this.f1449i[i2] == null ? 0 : this.f1449i[i2].hashCode()) + (i * 31);
            }
        }
        i2 = (this.f1456p ? 1 : 2) + (((((this.f1454n == null ? 0 : this.f1454n.hashCode()) + (((this.f1453m == null ? 0 : this.f1453m.hashCode()) + (((this.f1452l == null ? 0 : this.f1452l.hashCode()) + (((this.f1451k == null ? 0 : this.f1451k.hashCode()) + (((this.f1450j == null ? 0 : this.f1450j.hashCode()) + (i * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + Float.floatToIntBits(this.f1455o)) * 31);
        if (this.f1457q == null) {
            i = i2 * 31;
        } else {
            i = i2;
            for (i2 = 0; i2 < this.f1457q.length; i2++) {
                i = (this.f1457q[i2] == null ? 0 : this.f1457q[i2].hashCode()) + (i * 31);
            }
        }
        i2 = ((i * 31) + this.f1458r) * 31;
        if (this.s != null) {
            i3 = this.s.hashCode();
        }
        return i2 + i3;
    }
}
