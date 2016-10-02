package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.jo */
public final class jo {
    public final String f3451a;
    public final String f3452b;
    public final List f3453c;
    public final String f3454d;
    public final String f3455e;
    public final List f3456f;
    public final List f3457g;
    public final String f3458h;
    public final List f3459i;
    public final List f3460j;
    public final String f3461k;
    public final String f3462l;
    public final String f3463m;
    public final List f3464n;
    public final String f3465o;

    public jo(JSONObject jSONObject) {
        String str = null;
        this.f3452b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f3453c = Collections.unmodifiableList(arrayList);
        this.f3454d = jSONObject.optString("allocation_id", null);
        ar.m2253r();
        this.f3456f = jx.m3943a(jSONObject, "clickurl");
        ar.m2253r();
        this.f3457g = jx.m3943a(jSONObject, "imp_urls");
        ar.m2253r();
        this.f3459i = jx.m3943a(jSONObject, "video_start_urls");
        ar.m2253r();
        this.f3460j = jx.m3943a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f3451a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f3458h = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f3455e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f3461k = jSONObject.optString("html_template", null);
        this.f3462l = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.f3463m = optJSONObject != null ? optJSONObject.toString() : null;
        ar.m2253r();
        this.f3464n = jx.m3943a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.f3465o = str;
    }
}
