package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0379a;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.formats.C0384e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ol */
public final class ol implements oi {
    private final boolean f3759a;
    private final boolean f3760b;

    public ol(boolean z, boolean z2) {
        this.f3759a = z;
        this.f3760b = z2;
    }

    public final /* synthetic */ C0382i m4306a(oc ocVar, JSONObject jSONObject) {
        List<ss> a = ocVar.m4289a(jSONObject, "images", true, this.f3759a, this.f3760b);
        Future a2 = ocVar.m4288a(jSONObject, "secondary_image", false, this.f3759a);
        Future a3 = ocVar.m4287a(jSONObject);
        List arrayList = new ArrayList();
        for (ss ssVar : a) {
            arrayList.add(ssVar.get());
        }
        return new C0384e(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (dj) a2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), (C0379a) a3.get(), new Bundle());
    }
}
