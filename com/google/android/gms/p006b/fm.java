package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.b.fm */
final class fm implements Runnable {
    final /* synthetic */ Map f3229a;
    final /* synthetic */ tf f3230b;
    final /* synthetic */ fl f3231c;

    fm(fl flVar, Map map, tf tfVar) {
        this.f3231c = flVar;
        this.f3229a = map;
        this.f3230b = tfVar;
    }

    public final void run() {
        C0501b.m3027a(3);
        JSONObject a = this.f3231c.m3723a((String) this.f3229a.get("http_request"));
        if (a == null) {
            C0501b.m3027a(6);
        } else {
            rd.f4041a.post(new fn(this, a));
        }
    }
}
