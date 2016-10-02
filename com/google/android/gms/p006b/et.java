package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.et */
public final class et implements xr {
    private int f3156a;
    private int f3157b;
    private final int f3158c;
    private final float f3159d;

    public et() {
        this((byte) 0);
    }

    private et(byte b) {
        this.f3156a = 2500;
        this.f3158c = 1;
        this.f3159d = 1.0f;
    }

    public final int m3701a() {
        return this.f3156a;
    }

    public final void m3702a(xy xyVar) {
        this.f3157b++;
        this.f3156a = (int) (((float) this.f3156a) + (((float) this.f3156a) * this.f3159d));
        if ((this.f3157b <= this.f3158c ? 1 : null) == null) {
            throw xyVar;
        }
    }

    public final int m3703b() {
        return this.f3157b;
    }
}
