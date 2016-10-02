package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.q */
public abstract class C0731q {
    private Object f4856a;
    private boolean f4857b;
    final /* synthetic */ C0469n f4858d;

    public C0731q(C0469n c0469n, Object obj) {
        this.f4858d = c0469n;
        this.f4856a = obj;
        this.f4857b = false;
    }

    protected abstract void m5553a(Object obj);

    public final void m5554b() {
        synchronized (this) {
            Object obj = this.f4856a;
            if (this.f4857b) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                m5553a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f4857b = true;
        }
        m5555c();
    }

    public final void m5555c() {
        m5556d();
        synchronized (this.f4858d.f2493s) {
            this.f4858d.f2493s.remove(this);
        }
    }

    public final void m5556d() {
        synchronized (this) {
            this.f4856a = null;
        }
    }
}
