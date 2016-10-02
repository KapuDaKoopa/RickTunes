package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.sh */
public final class sh {
    private long f4097a;
    private long f4098b;
    private Object f4099c;

    public sh(long j) {
        this.f4098b = Long.MIN_VALUE;
        this.f4099c = new Object();
        this.f4097a = j;
    }

    public final boolean m4526a() {
        boolean z;
        synchronized (this.f4099c) {
            long b = ar.m2244i().m4888b();
            if (this.f4098b + this.f4097a > b) {
                z = false;
            } else {
                this.f4098b = b;
                z = true;
            }
        }
        return z;
    }
}
