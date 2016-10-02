package com.google.android.gms.p006b;

import java.util.concurrent.Future;

@op
/* renamed from: com.google.android.gms.b.qi */
public abstract class qi implements rp {
    private final Runnable f2245a;
    private boolean f2246b;
    volatile Thread f2247j;

    public qi() {
        this.f2245a = new qj(this);
        this.f2246b = false;
    }

    public qi(byte b) {
        this.f2245a = new qj(this);
        this.f2246b = true;
    }

    public abstract void m2705a();

    public abstract void m2706b();

    public final void m2707d() {
        m2706b();
        if (this.f2247j != null) {
            this.f2247j.interrupt();
        }
    }

    public final /* synthetic */ Object m2708e() {
        return m2709g();
    }

    public final Future m2709g() {
        return this.f2246b ? qx.m4393a(1, this.f2245a) : qx.m4394a(this.f2245a);
    }
}
