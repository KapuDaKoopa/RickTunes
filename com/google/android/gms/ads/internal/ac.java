package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.C0383d;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.ti;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class ac implements ti {
    final /* synthetic */ C0383d f1774a;
    final /* synthetic */ String f1775b;
    final /* synthetic */ tf f1776c;

    ac(C0383d c0383d, String str, tf tfVar) {
        this.f1774a = c0383d;
        this.f1775b = str;
        this.f1776c = tfVar;
    }

    public final void m2102a(tf tfVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f1774a.m2508a());
            jSONObject.put("body", this.f1774a.m2511c());
            jSONObject.put("call_to_action", this.f1774a.m2513e());
            jSONObject.put("price", this.f1774a.m2516h());
            jSONObject.put("star_rating", String.valueOf(this.f1774a.m2514f()));
            jSONObject.put("store", this.f1774a.m2515g());
            jSONObject.put("icon", ab.m2095a(this.f1774a.m2512d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = this.f1774a.m2510b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(ab.m2095a(ab.m2092a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", ab.m2096a(this.f1774a.m2521m(), this.f1775b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            this.f1776c.m4562a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            C0501b.m3026a("Exception occurred when loading assets", e);
        }
    }
}
