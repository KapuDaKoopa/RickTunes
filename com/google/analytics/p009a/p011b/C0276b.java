package com.google.analytics.p009a.p011b;

import com.google.tagmanager.p012a.p013a.C0275a;

/* renamed from: com.google.analytics.a.b.b */
public final class C0276b extends C0275a {
    public static final C0276b[] f1418a;
    public int f1419b;
    public int f1420c;
    public int f1421d;

    static {
        f1418a = new C0276b[0];
    }

    public C0276b() {
        this.f1419b = 1;
        this.f1420c = 0;
        this.f1421d = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0276b)) {
            return false;
        }
        C0276b c0276b = (C0276b) obj;
        if (this.f1419b == c0276b.f1419b && this.f1420c == c0276b.f1420c && this.f1421d == c0276b.f1421d) {
            if (this.s == null) {
                if (c0276b.s == null) {
                    return true;
                }
            } else if (this.s.equals(c0276b.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.s == null ? 0 : this.s.hashCode()) + ((((((this.f1419b + 527) * 31) + this.f1420c) * 31) + this.f1421d) * 31);
    }
}
