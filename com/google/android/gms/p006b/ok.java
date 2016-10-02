package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0379a;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.formats.C0383d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ok */
public final class ok implements oi {
    private final boolean f3757a;
    private final boolean f3758b;

    public ok(boolean z, boolean z2) {
        this.f3757a = z;
        this.f3758b = z2;
    }

    public final /* synthetic */ C0382i m4305a(oc ocVar, JSONObject jSONObject) {
        List<ss> a = ocVar.m4289a(jSONObject, "images", true, this.f3757a, this.f3758b);
        Future a2 = ocVar.m4288a(jSONObject, "app_icon", true, this.f3757a);
        Future a3 = ocVar.m4287a(jSONObject);
        List arrayList = new ArrayList();
        for (ss ssVar : a) {
            arrayList.add(ssVar.get());
        }
        return new C0383d(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (dj) a2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"), (C0379a) a3.get(), new Bundle());
    }
}
