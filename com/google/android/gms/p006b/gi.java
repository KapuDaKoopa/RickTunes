package com.google.android.gms.p006b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.b.gi */
final class gi implements Runnable {
    final /* synthetic */ String f3278a;
    final /* synthetic */ String f3279b;
    final /* synthetic */ int f3280c;
    final /* synthetic */ gg f3281d;

    gi(gg ggVar, String str, String str2, int i) {
        this.f3281d = ggVar;
        this.f3278a = str;
        this.f3279b = str2;
        this.f3280c = i;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f3278a);
        hashMap.put("cachedSrc", this.f3279b);
        hashMap.put("totalBytes", Integer.toString(this.f3280c));
        gg.m3751a(this.f3281d, "onPrecacheEvent", hashMap);
    }
}
