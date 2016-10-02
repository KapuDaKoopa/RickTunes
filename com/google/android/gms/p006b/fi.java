package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.overlay.C0410z;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.b.fi */
final class fi implements fk {
    fi() {
    }

    public final void m3718a(tf tfVar, Map map) {
        if ("checkSupport".equals(map.get("action"))) {
            C0501b.m3027a(4);
            C0402k h = tfVar.m4575h();
            if (h != null) {
                C0410z c0410z = h.f2142c;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "checkSupport");
                jSONObject.put("supports", false);
                tfVar.m3845b("appStreaming", jSONObject);
                return;
            } catch (Throwable th) {
                return;
            }
        }
        C0421k i = tfVar.m4576i();
        if (i != null) {
            i.m2701o();
        }
    }
}
