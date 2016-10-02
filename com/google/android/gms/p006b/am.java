package com.google.android.gms.p006b;

import java.util.Map;

/* renamed from: com.google.android.gms.b.am */
final class am implements fk {
    final /* synthetic */ ai f2915a;

    am(ai aiVar) {
        this.f2915a = aiVar;
    }

    public final void m3458a(tf tfVar, Map map) {
        if (this.f2915a.m3444a(map) && map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            this.f2915a.m3443a(Boolean.valueOf(z).booleanValue());
        }
    }
}
