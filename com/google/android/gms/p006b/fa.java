package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fa */
final class fa implements fk {
    fa() {
    }

    public final void m3710a(tf tfVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C0501b.m3025a("URL missing from httpTrack GMSG.");
        } else {
            new sg(tfVar.getContext(), tfVar.m4582o().f2539b, str).m2709g();
        }
    }
}
