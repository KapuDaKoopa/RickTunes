package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;

/* renamed from: com.google.analytics.a.b.f */
public final class C0280f extends C0275a {
    public static final C0280f[] f1438a;
    public int f1439b;
    public int f1440c;

    static {
        f1438a = new C0280f[0];
    }

    public C0280f() {
        this.f1439b = 0;
        this.f1440c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0280f)) {
            return false;
        }
        C0280f c0280f = (C0280f) obj;
        if (this.f1439b == c0280f.f1439b && this.f1440c == c0280f.f1440c) {
            if (this.s == null) {
                if (c0280f.s == null) {
                    return true;
                }
            } else if (this.s.equals(c0280f.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.s == null ? 0 : this.s.hashCode()) + ((((this.f1439b + 527) * 31) + this.f1440c) * 31);
    }
}
