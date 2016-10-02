package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;
import com.google.tagmanager.p012a.p013a.C0798d;
import java.util.Arrays;

/* renamed from: com.google.analytics.a.b.c */
public final class C0277c extends C0275a {
    public static final C0277c[] f1422a;
    public int[] f1423b;
    public int f1424c;
    public int f1425d;
    public boolean f1426e;
    public boolean f1427f;

    static {
        f1422a = new C0277c[0];
    }

    public C0277c() {
        this.f1423b = C0798d.f5047e;
        this.f1424c = 0;
        this.f1425d = 0;
        this.f1426e = false;
        this.f1427f = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0277c)) {
            return false;
        }
        C0277c c0277c = (C0277c) obj;
        if (Arrays.equals(this.f1423b, c0277c.f1423b) && this.f1424c == c0277c.f1424c && this.f1425d == c0277c.f1425d && this.f1426e == c0277c.f1426e && this.f1427f == c0277c.f1427f) {
            if (this.s == null) {
                if (c0277c.s == null) {
                    return true;
                }
            } else if (this.s.equals(c0277c.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.f1423b == null) {
            i = 527;
        } else {
            i = 17;
            for (int i4 : this.f1423b) {
                i = (i * 31) + i4;
            }
        }
        int i5 = ((this.f1426e ? 1 : 2) + (((((i * 31) + this.f1424c) * 31) + this.f1425d) * 31)) * 31;
        if (!this.f1427f) {
            i2 = 2;
        }
        i5 = (i5 + i2) * 31;
        if (this.s != null) {
            i3 = this.s.hashCode();
        }
        return i5 + i3;
    }
}
