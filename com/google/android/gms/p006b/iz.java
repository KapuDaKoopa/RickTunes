package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.iz */
public final class iz extends sy {
    final jd f3431a;
    private final Object f3432e;
    private boolean f3433f;

    public iz(jd jdVar) {
        this.f3432e = new Object();
        this.f3431a = jdVar;
    }

    public final void m3888a() {
        synchronized (this.f3432e) {
            if (this.f3433f) {
                return;
            }
            this.f3433f = true;
            m3884a(new ja(this), new sw());
            m3884a(new jb(this), new jc(this));
        }
    }
}
