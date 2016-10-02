package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
public final class C0591j {
    static int f2841a;
    private int f2842b;

    static {
        f2841a = 31;
    }

    public C0591j() {
        this.f2842b = 1;
    }

    public final int m3378a() {
        return this.f2842b;
    }

    public final C0591j m3379a(Object obj) {
        this.f2842b = (obj == null ? 0 : obj.hashCode()) + (this.f2842b * f2841a);
        return this;
    }

    public final C0591j m3380a(boolean z) {
        this.f2842b = (z ? 1 : 0) + (this.f2842b * f2841a);
        return this;
    }
}
