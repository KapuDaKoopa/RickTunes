package com.google.android.gms.p006b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@op
/* renamed from: com.google.android.gms.b.sy */
public class sy implements su {
    private final Object f3427a;
    protected int f3428b;
    protected final BlockingQueue f3429c;
    protected Object f3430d;

    public sy() {
        this.f3427a = new Object();
        this.f3428b = 0;
        this.f3429c = new LinkedBlockingQueue();
    }

    public final void m3884a(sx sxVar, sv svVar) {
        synchronized (this.f3427a) {
            if (this.f3428b == 1) {
                sxVar.m2824a(this.f3430d);
            } else if (this.f3428b == -1) {
                svVar.m2826a();
            } else if (this.f3428b == 0) {
                this.f3429c.add(new sz(this, sxVar, svVar));
            }
        }
    }

    public final void m3885a(Object obj) {
        synchronized (this.f3427a) {
            if (this.f3428b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f3430d = obj;
            this.f3428b = 1;
            for (sz szVar : this.f3429c) {
                szVar.f4120a.m2824a(obj);
            }
            this.f3429c.clear();
        }
    }

    public final void m3886d() {
        synchronized (this.f3427a) {
            if (this.f3428b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f3428b = -1;
            for (sz szVar : this.f3429c) {
                szVar.f4121b.m2826a();
            }
            this.f3429c.clear();
        }
    }

    public final int m3887e() {
        return this.f3428b;
    }
}
