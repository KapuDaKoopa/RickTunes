package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;

/* renamed from: com.google.analytics.a.b.d */
public final class C0278d extends C0275a {
    public static final C0278d[] f1428a;
    public String f1429b;
    public long f1430c;
    public long f1431d;
    public boolean f1432e;
    public long f1433f;

    static {
        f1428a = new C0278d[0];
    }

    public C0278d() {
        this.f1429b = "";
        this.f1430c = 0;
        this.f1431d = 2147483647L;
        this.f1432e = false;
        this.f1433f = 0;
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
        r2 = r7 instanceof com.google.analytics.p009a.p011b.C0278d;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r7 = (com.google.analytics.p009a.p011b.C0278d) r7;
        r2 = r6.f1429b;
        if (r2 != 0) goto L_0x003d;
    L_0x0011:
        r2 = r7.f1429b;
        if (r2 != 0) goto L_0x003b;
    L_0x0015:
        r2 = r6.f1430c;
        r4 = r7.f1430c;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x003b;
    L_0x001d:
        r2 = r6.f1431d;
        r4 = r7.f1431d;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x003b;
    L_0x0025:
        r2 = r6.f1432e;
        r3 = r7.f1432e;
        if (r2 != r3) goto L_0x003b;
    L_0x002b:
        r2 = r6.f1433f;
        r4 = r7.f1433f;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x003b;
    L_0x0033:
        r2 = r6.s;
        if (r2 != 0) goto L_0x0048;
    L_0x0037:
        r2 = r7.s;
        if (r2 == 0) goto L_0x0004;
    L_0x003b:
        r0 = r1;
        goto L_0x0004;
    L_0x003d:
        r2 = r6.f1429b;
        r3 = r7.f1429b;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0047:
        goto L_0x0015;
    L_0x0048:
        r2 = r6.s;
        r3 = r7.s;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0052:
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.b.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f1432e ? 1 : 2) + (((((((this.f1429b == null ? 0 : this.f1429b.hashCode()) + 527) * 31) + ((int) (this.f1430c ^ (this.f1430c >>> 32)))) * 31) + ((int) (this.f1431d ^ (this.f1431d >>> 32)))) * 31)) * 31) + ((int) (this.f1433f ^ (this.f1433f >>> 32)))) * 31;
        if (this.s != null) {
            i = this.s.hashCode();
        }
        return hashCode + i;
    }
}
