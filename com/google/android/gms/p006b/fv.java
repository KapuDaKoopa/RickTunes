package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.fv */
public final class fv implements fk {
    public final HashMap f3249a;

    public fv() {
        this.f3249a = new HashMap();
    }

    public final void m3726a(tf tfVar, Map map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        C0501b.m3027a(3);
        sm smVar = (sm) this.f3249a.get(str);
        if (smVar == null) {
            C0501b.m3027a(6);
            return;
        }
        try {
            smVar.m3858b(new JSONObject(str2));
        } catch (JSONException e) {
            C0501b.m3027a(6);
            smVar.m3858b(null);
        } finally {
            this.f3249a.remove(str);
        }
    }

    public final void m3727a(String str) {
        sm smVar = (sm) this.f3249a.get(str);
        if (smVar == null) {
            C0501b.m3027a(6);
            return;
        }
        if (!smVar.isDone()) {
            smVar.cancel(true);
        }
        this.f3249a.remove(str);
    }
}
