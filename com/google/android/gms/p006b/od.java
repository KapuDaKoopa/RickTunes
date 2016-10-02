package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.b.od */
final class od implements fk {
    final /* synthetic */ hy f3735a;
    final /* synthetic */ oj f3736b;
    final /* synthetic */ sm f3737c;
    final /* synthetic */ oc f3738d;

    od(oc ocVar, hy hyVar, oj ojVar, sm smVar) {
        this.f3738d = ocVar;
        this.f3735a = hyVar;
        this.f3736b = ojVar;
        this.f3737c = smVar;
    }

    public final void m4294a(tf tfVar, Map map) {
        this.f3735a.m3844b("/nativeAdPreProcess", this.f3736b.f3755a);
        try {
            String str = (String) map.get("success");
            if (!TextUtils.isEmpty(str)) {
                this.f3737c.m3858b(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                return;
            }
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
        this.f3738d.m4291a(0);
        ax.m5532a(this.f3738d.m4293a(), (Object) "Unable to set the ad state error!");
        this.f3737c.m3858b(null);
    }
}
