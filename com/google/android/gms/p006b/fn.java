package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.b.fn */
final class fn implements Runnable {
    final /* synthetic */ JSONObject f3232a;
    final /* synthetic */ fm f3233b;

    fn(fm fmVar, JSONObject jSONObject) {
        this.f3233b = fmVar;
        this.f3232a = jSONObject;
    }

    public final void run() {
        this.f3233b.f3230b.m3845b("fetchHttpRequestCompleted", this.f3232a);
        C0501b.m3027a(3);
    }
}
