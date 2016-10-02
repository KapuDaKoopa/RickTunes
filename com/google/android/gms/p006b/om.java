package com.google.android.gms.p006b;

import android.support.v4.p001b.C0028m;
import com.google.android.gms.ads.internal.formats.C0379a;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.formats.C0385f;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.om */
public final class om implements oi {
    private final boolean f3761a;

    public om(boolean z) {
        this.f3761a = z;
    }

    private static C0028m m4307a(C0028m c0028m) {
        C0028m c0028m2 = new C0028m();
        for (int i = 0; i < c0028m.size(); i++) {
            c0028m2.put(c0028m.m8b(i), ((Future) c0028m.m9c(i)).get());
        }
        return c0028m2;
    }

    public final /* synthetic */ C0382i m4308a(oc ocVar, JSONObject jSONObject) {
        C0028m c0028m = new C0028m();
        C0028m c0028m2 = new C0028m();
        Future a = ocVar.m4287a(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                c0028m2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                c0028m.put(jSONObject2.getString("name"), ocVar.m4290a(jSONObject2, "image_value", this.f3761a));
            } else {
                C0501b.m3025a("Unknown custom asset type: " + string);
            }
        }
        return new C0385f(jSONObject.getString("custom_template_id"), om.m4307a(c0028m), c0028m2, (C0379a) a.get());
    }
}
