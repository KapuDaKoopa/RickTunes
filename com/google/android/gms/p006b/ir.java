package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.ir */
final class ir implements fk {
    final /* synthetic */ hy f3415a;
    final /* synthetic */ sj f3416b;
    final /* synthetic */ im f3417c;

    ir(im imVar, hy hyVar, sj sjVar) {
        this.f3417c = imVar;
        this.f3415a = hyVar;
        this.f3416b = sjVar;
    }

    public final void m3878a(tf tfVar, Map map) {
        synchronized (this.f3417c.f3408b.f3399a) {
            C0501b.m3027a(4);
            if (this.f3417c.f3408b.f3405g == 0) {
                C0501b.m3027a(4);
                this.f3417c.f3408b.f3405g = 2;
                this.f3417c.f3408b.m3874a();
            }
            this.f3415a.m3844b("/requestReload", (fk) this.f3416b.f4100a);
        }
    }
}
