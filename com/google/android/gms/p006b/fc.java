package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fc */
final class fc implements fk {
    fc() {
    }

    public final void m3712a(tf tfVar, Map map) {
        String str = (String) map.get("ty");
        String str2 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt((String) map.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            aa n = tfVar.m4581n();
            if (n != null) {
                n.m3416a().m2985a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            C0501b.m3025a("Could not parse touch parameters from gmsg.");
        }
    }
}
