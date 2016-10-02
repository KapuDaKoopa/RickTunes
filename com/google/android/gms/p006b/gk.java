package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.C0724g;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.gk */
public final class gk implements fk {
    public final void m3756a(tf tfVar, Map map) {
        ar.m2255t();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                C0501b.m3025a("Precache video action is missing the src parameter.");
                return;
            }
            try {
                Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
            }
            if (map.containsKey("mimetype")) {
                map.get("mimetype");
            }
            if (gf.m3747b(tfVar)) {
                C0501b.m3025a("Precache task already running.");
                return;
            }
            C0724g.m5550a(tfVar.m4575h());
            new gd(tfVar, tfVar.m4575h().f2140a.m3705a(tfVar), str).m2709g();
        } else if (!gf.m3746a(tfVar)) {
            C0501b.m3025a("Precache abort but no preload task running.");
        }
    }
}
