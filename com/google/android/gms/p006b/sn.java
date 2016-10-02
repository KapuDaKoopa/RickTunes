package com.google.android.gms.p006b;

import java.util.concurrent.TimeUnit;

@op
/* renamed from: com.google.android.gms.b.sn */
public final class sn implements ss {
    private final Object f4107a;
    private final st f4108b;

    public sn(Object obj) {
        this.f4107a = obj;
        this.f4108b = new st();
        this.f4108b.m4537a();
    }

    public final void m4534a(Runnable runnable) {
        this.f4108b.m4538a(runnable);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.f4107a;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f4107a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
