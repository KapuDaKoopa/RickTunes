package com.google.ads;

import com.google.android.gms.ads.C0333f;

@Deprecated
/* renamed from: com.google.ads.d */
public final class C0236d {
    public static final C0236d f1307a;
    public static final C0236d f1308b;
    public static final C0236d f1309c;
    public static final C0236d f1310d;
    public static final C0236d f1311e;
    public static final C0236d f1312f;
    private final C0333f f1313g;

    static {
        f1307a = new C0236d(-1, -2);
        f1308b = new C0236d(320, 50);
        f1309c = new C0236d(300, 250);
        f1310d = new C0236d(468, 60);
        f1311e = new C0236d(728, 90);
        f1312f = new C0236d(160, 600);
    }

    private C0236d(int i, int i2) {
        this(new C0333f(i, i2));
    }

    public C0236d(C0333f c0333f) {
        this.f1313g = c0333f;
    }

    public final int m1672a() {
        return this.f1313g.m2043b();
    }

    public final int m1673b() {
        return this.f1313g.m2041a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0236d)) {
            return false;
        }
        return this.f1313g.equals(((C0236d) obj).f1313g);
    }

    public final int hashCode() {
        return this.f1313g.hashCode();
    }

    public final String toString() {
        return this.f1313g.toString();
    }
}
