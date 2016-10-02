package com.google.analytics.p014b.p015a.p016a;

import com.google.tagmanager.p012a.p013a.C0275a;
import com.google.tagmanager.p012a.p013a.C0798d;

/* renamed from: com.google.analytics.b.a.a.b */
public final class C0286b extends C0275a {
    public static final C0286b[] f1478a;
    public int f1479b;
    public String f1480c;
    public C0286b[] f1481d;
    public C0286b[] f1482e;
    public C0286b[] f1483f;
    public String f1484g;
    public String f1485h;
    public long f1486i;
    public boolean f1487j;
    public C0286b[] f1488k;
    public String f1489l;
    public int[] f1490m;
    public boolean f1491n;

    static {
        f1478a = new C0286b[0];
    }

    public C0286b() {
        this.f1479b = 1;
        this.f1480c = "";
        this.f1481d = f1478a;
        this.f1482e = f1478a;
        this.f1483f = f1478a;
        this.f1484g = "";
        this.f1485h = "";
        this.f1486i = 0;
        this.f1487j = false;
        this.f1488k = f1478a;
        this.f1489l = "";
        this.f1490m = C0798d.f5047e;
        this.f1491n = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        if (r7 != r6) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r7 instanceof com.google.analytics.p014b.p015a.p016a.C0286b;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r7 = (com.google.analytics.p014b.p015a.p016a.C0286b) r7;
        r2 = r6.f1479b;
        r3 = r7.f1479b;
        if (r2 != r3) goto L_0x0081;
    L_0x0013:
        r2 = r6.f1480c;
        if (r2 != 0) goto L_0x0083;
    L_0x0017:
        r2 = r7.f1480c;
        if (r2 != 0) goto L_0x0081;
    L_0x001b:
        r2 = r6.f1481d;
        r3 = r7.f1481d;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x0081;
    L_0x0025:
        r2 = r6.f1482e;
        r3 = r7.f1482e;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x0081;
    L_0x002f:
        r2 = r6.f1483f;
        r3 = r7.f1483f;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x0081;
    L_0x0039:
        r2 = r6.f1484g;
        if (r2 != 0) goto L_0x008e;
    L_0x003d:
        r2 = r7.f1484g;
        if (r2 != 0) goto L_0x0081;
    L_0x0041:
        r2 = r6.f1485h;
        if (r2 != 0) goto L_0x0099;
    L_0x0045:
        r2 = r7.f1485h;
        if (r2 != 0) goto L_0x0081;
    L_0x0049:
        r2 = r6.f1486i;
        r4 = r7.f1486i;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0081;
    L_0x0051:
        r2 = r6.f1487j;
        r3 = r7.f1487j;
        if (r2 != r3) goto L_0x0081;
    L_0x0057:
        r2 = r6.f1488k;
        r3 = r7.f1488k;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x0081;
    L_0x0061:
        r2 = r6.f1489l;
        if (r2 != 0) goto L_0x00a4;
    L_0x0065:
        r2 = r7.f1489l;
        if (r2 != 0) goto L_0x0081;
    L_0x0069:
        r2 = r6.f1490m;
        r3 = r7.f1490m;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x0081;
    L_0x0073:
        r2 = r6.f1491n;
        r3 = r7.f1491n;
        if (r2 != r3) goto L_0x0081;
    L_0x0079:
        r2 = r6.s;
        if (r2 != 0) goto L_0x00af;
    L_0x007d:
        r2 = r7.s;
        if (r2 == 0) goto L_0x0004;
    L_0x0081:
        r0 = r1;
        goto L_0x0004;
    L_0x0083:
        r2 = r6.f1480c;
        r3 = r7.f1480c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0081;
    L_0x008d:
        goto L_0x001b;
    L_0x008e:
        r2 = r6.f1484g;
        r3 = r7.f1484g;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0081;
    L_0x0098:
        goto L_0x0041;
    L_0x0099:
        r2 = r6.f1485h;
        r3 = r7.f1485h;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0081;
    L_0x00a3:
        goto L_0x0049;
    L_0x00a4:
        r2 = r6.f1489l;
        r3 = r7.f1489l;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0081;
    L_0x00ae:
        goto L_0x0069;
    L_0x00af:
        r2 = r6.s;
        r3 = r7.s;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0081;
    L_0x00b9:
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.b.a.a.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int hashCode = (this.f1480c == null ? 0 : this.f1480c.hashCode()) + ((this.f1479b + 527) * 31);
        if (this.f1481d == null) {
            i = hashCode * 31;
        } else {
            i = hashCode;
            for (hashCode = 0; hashCode < this.f1481d.length; hashCode++) {
                i = (this.f1481d[hashCode] == null ? 0 : this.f1481d[hashCode].hashCode()) + (i * 31);
            }
        }
        if (this.f1482e == null) {
            i *= 31;
        } else {
            for (hashCode = 0; hashCode < this.f1482e.length; hashCode++) {
                i = (this.f1482e[hashCode] == null ? 0 : this.f1482e[hashCode].hashCode()) + (i * 31);
            }
        }
        if (this.f1483f == null) {
            i *= 31;
        } else {
            for (hashCode = 0; hashCode < this.f1483f.length; hashCode++) {
                i = (this.f1483f[hashCode] == null ? 0 : this.f1483f[hashCode].hashCode()) + (i * 31);
            }
        }
        hashCode = (this.f1487j ? 1 : 2) + (((((this.f1485h == null ? 0 : this.f1485h.hashCode()) + (((this.f1484g == null ? 0 : this.f1484g.hashCode()) + (i * 31)) * 31)) * 31) + ((int) (this.f1486i ^ (this.f1486i >>> 32)))) * 31);
        if (this.f1488k == null) {
            i = hashCode * 31;
        } else {
            i = hashCode;
            for (hashCode = 0; hashCode < this.f1488k.length; hashCode++) {
                i = (this.f1488k[hashCode] == null ? 0 : this.f1488k[hashCode].hashCode()) + (i * 31);
            }
        }
        hashCode = (this.f1489l == null ? 0 : this.f1489l.hashCode()) + (i * 31);
        if (this.f1490m == null) {
            i = hashCode * 31;
        } else {
            i = hashCode;
            for (int i4 : this.f1490m) {
                i = (i * 31) + i4;
            }
        }
        hashCode = i * 31;
        if (!this.f1491n) {
            i2 = 2;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.s != null) {
            i3 = this.s.hashCode();
        }
        return hashCode + i3;
    }
}
