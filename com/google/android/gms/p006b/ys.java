package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ys */
public abstract class ys {
    protected volatile int f1240S;

    public ys() {
        this.f1240S = -1;
    }

    public static final byte[] m1656a(ys ysVar) {
        byte[] bArr = new byte[ysVar.m1661d()];
        try {
            yl a = yl.m4928a(bArr, bArr.length);
            ysVar.m1658a(a);
            if (a.f4376a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public int m1657a() {
        return 0;
    }

    public void m1658a(yl ylVar) {
    }

    public ys m1659b() {
        return (ys) super.clone();
    }

    public final int m1660c() {
        if (this.f1240S < 0) {
            m1661d();
        }
        return this.f1240S;
    }

    public /* synthetic */ Object clone() {
        return m1659b();
    }

    public final int m1661d() {
        int a = m1657a();
        this.f1240S = a;
        return a;
    }

    public String toString() {
        return yt.m4979a(this);
    }
}
