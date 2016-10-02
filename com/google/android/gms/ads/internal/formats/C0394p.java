package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.tf;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.formats.p */
final class C0394p implements fk {
    final /* synthetic */ C0387j f2119a;

    C0394p(C0387j c0387j) {
        this.f2119a = c0387j;
    }

    public final void m2593a(tf tfVar, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f2119a.f2098d);
            this.f2119a.f2095a.m3845b("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }
}
