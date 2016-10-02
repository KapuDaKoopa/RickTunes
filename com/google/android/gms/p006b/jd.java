package com.google.android.gms.p006b;

import com.google.android.gms.common.internal.ax;

/* renamed from: com.google.android.gms.b.jd */
public final class jd extends sy {
    ix f3438a;
    private final Object f3439e;
    private boolean f3440f;
    private int f3441g;

    public jd(ix ixVar) {
        this.f3439e = new Object();
        this.f3438a = ixVar;
        this.f3440f = false;
        this.f3441g = 0;
    }

    private void m3893f() {
        synchronized (this.f3439e) {
            ax.m5531a(this.f3441g >= 0);
            if (this.f3440f && this.f3441g == 0) {
                qk.m4383a();
                m3884a(new jg(this), new sw());
            } else {
                qk.m4383a();
            }
        }
    }

    public final iz m3894a() {
        iz izVar = new iz(this);
        synchronized (this.f3439e) {
            m3884a(new je(this, izVar), new jf(this, izVar));
            ax.m5531a(this.f3441g >= 0);
            this.f3441g++;
        }
        return izVar;
    }

    protected final void m3895b() {
        synchronized (this.f3439e) {
            ax.m5531a(this.f3441g > 0);
            qk.m4383a();
            this.f3441g--;
            m3893f();
        }
    }

    public final void m3896c() {
        boolean z = true;
        synchronized (this.f3439e) {
            if (this.f3441g < 0) {
                z = false;
            }
            ax.m5531a(z);
            qk.m4383a();
            this.f3440f = true;
            m3893f();
        }
    }
}
