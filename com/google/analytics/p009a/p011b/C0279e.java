package com.google.analytics.p009a.p011b;

import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.tagmanager.p012a.p013a.C0275a;
import java.util.Arrays;

/* renamed from: com.google.analytics.a.b.e */
public final class C0279e extends C0275a {
    public static final C0279e[] f1434a;
    public C0286b[] f1435b;
    public C0286b[] f1436c;
    public C0278d[] f1437d;

    static {
        f1434a = new C0279e[0];
    }

    public C0279e() {
        this.f1435b = C0286b.f1478a;
        this.f1436c = C0286b.f1478a;
        this.f1437d = C0278d.f1428a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0279e)) {
            return false;
        }
        C0279e c0279e = (C0279e) obj;
        if (Arrays.equals(this.f1435b, c0279e.f1435b) && Arrays.equals(this.f1436c, c0279e.f1436c) && Arrays.equals(this.f1437d, c0279e.f1437d)) {
            if (this.s == null) {
                if (c0279e.s == null) {
                    return true;
                }
            } else if (this.s.equals(c0279e.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f1435b == null) {
            i = 527;
        } else {
            i = 17;
            for (i2 = 0; i2 < this.f1435b.length; i2++) {
                i = (this.f1435b[i2] == null ? 0 : this.f1435b[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1436c == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1436c.length; i2++) {
                i = (this.f1436c[i2] == null ? 0 : this.f1436c[i2].hashCode()) + (i * 31);
            }
        }
        if (this.f1437d == null) {
            i *= 31;
        } else {
            for (i2 = 0; i2 < this.f1437d.length; i2++) {
                i = (this.f1437d[i2] == null ? 0 : this.f1437d[i2].hashCode()) + (i * 31);
            }
        }
        i2 = i * 31;
        if (this.s != null) {
            i3 = this.s.hashCode();
        }
        return i2 + i3;
    }
}
