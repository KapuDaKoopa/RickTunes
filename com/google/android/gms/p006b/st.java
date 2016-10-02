package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0500a;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.st */
final class st {
    final Object f4116a;
    final List f4117b;
    boolean f4118c;
    private final List f4119d;

    public st() {
        this.f4116a = new Object();
        this.f4119d = new ArrayList();
        this.f4117b = new ArrayList();
        this.f4118c = false;
    }

    static void m4536b(Runnable runnable) {
        C0500a.f2543a.post(runnable);
    }

    public final void m4537a() {
        synchronized (this.f4116a) {
            if (this.f4118c) {
                return;
            }
            for (Runnable a : this.f4119d) {
                qx.m4394a(a);
            }
            for (Runnable a2 : this.f4117b) {
                st.m4536b(a2);
            }
            this.f4119d.clear();
            this.f4117b.clear();
            this.f4118c = true;
        }
    }

    public final void m4538a(Runnable runnable) {
        synchronized (this.f4116a) {
            if (this.f4118c) {
                qx.m4394a(runnable);
            } else {
                this.f4119d.add(runnable);
            }
        }
    }
}
