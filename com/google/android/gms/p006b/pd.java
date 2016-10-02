package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.pd */
final class pd implements fk {
    final /* synthetic */ pc f3821a;

    pd(pc pcVar) {
        this.f3821a = pcVar;
    }

    public final void m4330a(tf tfVar, Map map) {
        synchronized (this.f3821a.f3813a) {
            if (this.f3821a.f3816d.isDone()) {
            } else if (this.f3821a.f3814b.equals(map.get("request_id"))) {
                Object phVar = new ph(1, map);
                C0501b.m3025a("Invalid " + phVar.f3851c + " request error: " + phVar.f3849a);
                this.f3821a.f3816d.m3858b(phVar);
            }
        }
    }
}
