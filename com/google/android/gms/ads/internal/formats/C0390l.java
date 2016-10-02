package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.ti;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.formats.l */
final class C0390l implements ti {
    final /* synthetic */ Map f2114a;
    final /* synthetic */ C0389k f2115b;

    C0390l(C0389k c0389k, Map map) {
        this.f2115b = c0389k;
        this.f2114a = map;
    }

    public final void m2589a(tf tfVar, boolean z) {
        this.f2115b.f2113a.f2098d = (String) this.f2114a.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.f2115b.f2113a.f2098d);
            this.f2115b.f2113a.f2095a.m3845b("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }
}
