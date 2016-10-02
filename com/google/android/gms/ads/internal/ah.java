package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.bd;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;

@op
public final class ah extends bd {
    private static final Object f1785a;
    private static ah f1786b;
    private final Object f1787c;
    private boolean f1788d;
    private float f1789e;

    static {
        f1785a = new Object();
    }

    public static ah m2110b() {
        ah ahVar;
        synchronized (f1785a) {
            ahVar = f1786b;
        }
        return ahVar;
    }

    public final void m2111a() {
        synchronized (f1785a) {
            if (this.f1788d) {
                C0501b.m3025a("Mobile ads is initialized already.");
                return;
            }
            this.f1788d = true;
        }
    }

    public final void m2112a(float f) {
        synchronized (this.f1787c) {
            this.f1789e = f;
        }
    }

    public final float m2113c() {
        float f;
        synchronized (this.f1787c) {
            f = this.f1789e;
        }
        return f;
    }

    public final boolean m2114d() {
        boolean z;
        synchronized (this.f1787c) {
            z = this.f1789e >= 0.0f;
        }
        return z;
    }
}
