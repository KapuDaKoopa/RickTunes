package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.jp */
public final class jp {
    public final List f3466a;
    public final long f3467b;
    public final List f3468c;
    public final List f3469d;
    public final List f3470e;
    public final String f3471f;
    public final long f3472g;
    public final String f3473h;
    public final int f3474i;
    public final int f3475j;
    public final long f3476k;
    public int f3477l;
    public int f3478m;

    public jp(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (C0501b.m3027a(2)) {
            "Mediation Response JSON: " + jSONObject.toString(2);
            qk.m4383a();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            jo joVar = new jo(jSONArray.getJSONObject(i2));
            arrayList.add(joVar);
            if (i < 0 && jp.m3909a(joVar)) {
                i = i2;
            }
        }
        this.f3477l = i;
        this.f3478m = jSONArray.length();
        this.f3466a = Collections.unmodifiableList(arrayList);
        this.f3471f = jSONObject.getString("qdata");
        this.f3475j = jSONObject.optInt("fs_model_type", -1);
        this.f3476k = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f3467b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            ar.m2253r();
            this.f3468c = jx.m3943a(optJSONObject, "click_urls");
            ar.m2253r();
            this.f3469d = jx.m3943a(optJSONObject, "imp_urls");
            ar.m2253r();
            this.f3470e = jx.m3943a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f3472g = optLong > 0 ? optLong * 1000 : -1;
            RewardItemParcel a = RewardItemParcel.m2952a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f3473h = null;
                this.f3474i = 0;
                return;
            }
            this.f3473h = a.f2513b;
            this.f3474i = a.f2514c;
            return;
        }
        this.f3467b = -1;
        this.f3468c = null;
        this.f3469d = null;
        this.f3470e = null;
        this.f3472g = -1;
        this.f3473h = null;
        this.f3474i = 0;
    }

    private static boolean m3909a(jo joVar) {
        for (String equals : joVar.f3453c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
