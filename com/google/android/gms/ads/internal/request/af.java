package com.google.android.gms.ads.internal.request;

import org.json.JSONObject;

final class af implements Runnable {
    final /* synthetic */ JSONObject f2437a;
    final /* synthetic */ String f2438b;
    final /* synthetic */ ad f2439c;

    af(ad adVar, JSONObject jSONObject, String str) {
        this.f2439c = adVar;
        this.f2437a = jSONObject;
        this.f2438b = str;
    }

    public final void run() {
        this.f2439c.f2434m = ad.f2426d.m3875b();
        this.f2439c.f2434m.m3884a(new ag(this), new ah(this));
    }
}
