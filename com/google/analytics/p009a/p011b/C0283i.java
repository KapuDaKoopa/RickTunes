package com.google.analytics.p009a.p011b;

import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.tagmanager.p012a.p013a.C0275a;

/* renamed from: com.google.analytics.a.b.i */
public final class C0283i extends C0275a {
    public static final C0283i[] f1470a;
    public String f1471b;
    public C0286b f1472c;
    public C0279e f1473d;

    static {
        f1470a = new C0283i[0];
    }

    public C0283i() {
        this.f1471b = "";
        this.f1472c = null;
        this.f1473d = null;
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
        r2 = r5 instanceof com.google.analytics.p009a.p011b.C0283i;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r5 = (com.google.analytics.p009a.p011b.C0283i) r5;
        r2 = r4.f1471b;
        if (r2 != 0) goto L_0x002f;
    L_0x0011:
        r2 = r5.f1471b;
        if (r2 != 0) goto L_0x002d;
    L_0x0015:
        r2 = r4.f1472c;
        if (r2 != 0) goto L_0x003a;
    L_0x0019:
        r2 = r5.f1472c;
        if (r2 != 0) goto L_0x002d;
    L_0x001d:
        r2 = r4.f1473d;
        if (r2 != 0) goto L_0x0045;
    L_0x0021:
        r2 = r5.f1473d;
        if (r2 != 0) goto L_0x002d;
    L_0x0025:
        r2 = r4.s;
        if (r2 != 0) goto L_0x0050;
    L_0x0029:
        r2 = r5.s;
        if (r2 == 0) goto L_0x0004;
    L_0x002d:
        r0 = r1;
        goto L_0x0004;
    L_0x002f:
        r2 = r4.f1471b;
        r3 = r5.f1471b;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002d;
    L_0x0039:
        goto L_0x0015;
    L_0x003a:
        r2 = r4.f1472c;
        r3 = r5.f1472c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002d;
    L_0x0044:
        goto L_0x001d;
    L_0x0045:
        r2 = r4.f1473d;
        r3 = r5.f1473d;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002d;
    L_0x004f:
        goto L_0x0025;
    L_0x0050:
        r2 = r4.s;
        r3 = r5.s;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x002d;
    L_0x005a:
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.b.i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f1473d == null ? 0 : this.f1473d.hashCode()) + (((this.f1472c == null ? 0 : this.f1472c.hashCode()) + (((this.f1471b == null ? 0 : this.f1471b.hashCode()) + 527) * 31)) * 31)) * 31;
        if (this.s != null) {
            i = this.s.hashCode();
        }
        return hashCode + i;
    }
}
