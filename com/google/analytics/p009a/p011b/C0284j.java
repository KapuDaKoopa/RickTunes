package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;

/* renamed from: com.google.analytics.a.b.j */
public final class C0284j extends C0275a {
    public static final C0284j[] f1474a;
    public C0283i[] f1475b;
    public C0281g f1476c;
    public String f1477d;

    static {
        f1474a = new C0284j[0];
    }

    public C0284j() {
        this.f1475b = C0283i.f1470a;
        this.f1476c = null;
        this.f1477d = "";
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
        r2 = r5 instanceof com.google.analytics.p009a.p011b.C0284j;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r5 = (com.google.analytics.p009a.p011b.C0284j) r5;
        r2 = r4.f1475b;
        r3 = r5.f1475b;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 == 0) goto L_0x002f;
    L_0x0017:
        r2 = r4.f1476c;
        if (r2 != 0) goto L_0x0031;
    L_0x001b:
        r2 = r5.f1476c;
        if (r2 != 0) goto L_0x002f;
    L_0x001f:
        r2 = r4.f1477d;
        if (r2 != 0) goto L_0x003c;
    L_0x0023:
        r2 = r5.f1477d;
        if (r2 != 0) goto L_0x002f;
    L_0x0027:
        r2 = r4.s;
        if (r2 != 0) goto L_0x0047;
    L_0x002b:
        r2 = r5.s;
        if (r2 == 0) goto L_0x0004;
    L_0x002f:
        r0 = r1;
        goto L_0x0004;
    L_0x0031:
        r2 = r4.f1476c;
        r3 = r5.f1476c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002f;
    L_0x003b:
        goto L_0x001f;
    L_0x003c:
        r2 = r4.f1477d;
        r3 = r5.f1477d;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002f;
    L_0x0046:
        goto L_0x0027;
    L_0x0047:
        r2 = r4.s;
        r3 = r5.s;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002f;
    L_0x0051:
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.b.j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f1475b == null) {
            i = 527;
        } else {
            i = 17;
            for (i2 = 0; i2 < this.f1475b.length; i2++) {
                i = (this.f1475b[i2] == null ? 0 : this.f1475b[i2].hashCode()) + (i * 31);
            }
        }
        i2 = ((this.f1477d == null ? 0 : this.f1477d.hashCode()) + (((this.f1476c == null ? 0 : this.f1476c.hashCode()) + (i * 31)) * 31)) * 31;
        if (this.s != null) {
            i3 = this.s.hashCode();
        }
        return i2 + i3;
    }
}
