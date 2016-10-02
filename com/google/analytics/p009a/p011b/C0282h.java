package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;
import com.google.tagmanager.p012a.p013a.C0798d;
import java.util.Arrays;

/* renamed from: com.google.analytics.a.b.h */
public final class C0282h extends C0275a {
    public static final C0282h[] f1459a;
    public int[] f1460b;
    public int[] f1461c;
    public int[] f1462d;
    public int[] f1463e;
    public int[] f1464f;
    public int[] f1465g;
    public int[] f1466h;
    public int[] f1467i;
    public int[] f1468j;
    public int[] f1469k;

    static {
        f1459a = new C0282h[0];
    }

    public C0282h() {
        this.f1460b = C0798d.f5047e;
        this.f1461c = C0798d.f5047e;
        this.f1462d = C0798d.f5047e;
        this.f1463e = C0798d.f5047e;
        this.f1464f = C0798d.f5047e;
        this.f1465g = C0798d.f5047e;
        this.f1466h = C0798d.f5047e;
        this.f1467i = C0798d.f5047e;
        this.f1468j = C0798d.f5047e;
        this.f1469k = C0798d.f5047e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0282h)) {
            return false;
        }
        C0282h c0282h = (C0282h) obj;
        if (Arrays.equals(this.f1460b, c0282h.f1460b) && Arrays.equals(this.f1461c, c0282h.f1461c) && Arrays.equals(this.f1462d, c0282h.f1462d) && Arrays.equals(this.f1463e, c0282h.f1463e) && Arrays.equals(this.f1464f, c0282h.f1464f) && Arrays.equals(this.f1465g, c0282h.f1465g) && Arrays.equals(this.f1466h, c0282h.f1466h) && Arrays.equals(this.f1467i, c0282h.f1467i) && Arrays.equals(this.f1468j, c0282h.f1468j) && Arrays.equals(this.f1469k, c0282h.f1469k)) {
            if (this.s == null) {
                if (c0282h.s == null) {
                    return true;
                }
            } else if (this.s.equals(c0282h.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f1460b == null) {
            i = 527;
        } else {
            i = 17;
            for (int i3 : this.f1460b) {
                i = (i * 31) + i3;
            }
        }
        if (this.f1461c == null) {
            i *= 31;
        } else {
            for (int i32 : this.f1461c) {
                i = (i * 31) + i32;
            }
        }
        if (this.f1462d == null) {
            i *= 31;
        } else {
            for (int i322 : this.f1462d) {
                i = (i * 31) + i322;
            }
        }
        if (this.f1463e == null) {
            i *= 31;
        } else {
            for (int i3222 : this.f1463e) {
                i = (i * 31) + i3222;
            }
        }
        if (this.f1464f == null) {
            i *= 31;
        } else {
            for (int i32222 : this.f1464f) {
                i = (i * 31) + i32222;
            }
        }
        if (this.f1465g == null) {
            i *= 31;
        } else {
            for (int i322222 : this.f1465g) {
                i = (i * 31) + i322222;
            }
        }
        if (this.f1466h == null) {
            i *= 31;
        } else {
            for (int i3222222 : this.f1466h) {
                i = (i * 31) + i3222222;
            }
        }
        if (this.f1467i == null) {
            i *= 31;
        } else {
            for (int i32222222 : this.f1467i) {
                i = (i * 31) + i32222222;
            }
        }
        if (this.f1468j == null) {
            i *= 31;
        } else {
            for (int i322222222 : this.f1468j) {
                i = (i * 31) + i322222222;
            }
        }
        if (this.f1469k == null) {
            i *= 31;
        } else {
            for (int i3222222222 : this.f1469k) {
                i = (i * 31) + i3222222222;
            }
        }
        int i4 = i * 31;
        if (this.s != null) {
            i2 = this.s.hashCode();
        }
        return i4 + i2;
    }
}
