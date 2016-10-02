package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.C0384e;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.ti;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class ad implements ti {
    final /* synthetic */ C0384e f1777a;
    final /* synthetic */ String f1778b;
    final /* synthetic */ tf f1779c;

    ad(C0384e c0384e, String str, tf tfVar) {
        this.f1777a = c0384e;
        this.f1778b = str;
        this.f1779c = tfVar;
    }

    public final void m2103a(tf tfVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f1777a.m2532a());
            jSONObject.put("body", this.f1777a.m2535c());
            jSONObject.put("call_to_action", this.f1777a.m2537e());
            jSONObject.put("advertiser", this.f1777a.m2538f());
            jSONObject.put("logo", ab.m2095a(this.f1777a.m2536d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = this.f1777a.m2534b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(ab.m2095a(ab.m2092a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", ab.m2096a(this.f1777a.m2540h(), this.f1778b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            this.f1779c.m4562a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            C0501b.m3026a("Exception occurred when loading assets", e);
        }
    }
}
