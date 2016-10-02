package com.google.android.gms.p006b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.b.gh */
final class gh implements Runnable {
    final /* synthetic */ String f3272a;
    final /* synthetic */ String f3273b;
    final /* synthetic */ int f3274c;
    final /* synthetic */ int f3275d;
    final /* synthetic */ boolean f3276e;
    final /* synthetic */ gg f3277f;

    gh(gg ggVar, String str, String str2, int i, int i2) {
        this.f3277f = ggVar;
        this.f3272a = str;
        this.f3273b = str2;
        this.f3274c = i;
        this.f3275d = i2;
        this.f3276e = false;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f3272a);
        hashMap.put("cachedSrc", this.f3273b);
        hashMap.put("bytesLoaded", Integer.toString(this.f3274c));
        hashMap.put("totalBytes", Integer.toString(this.f3275d));
        hashMap.put("cacheReady", this.f3276e ? "1" : "0");
        gg.m3751a(this.f3277f, "onPrecacheEvent", hashMap);
    }
}
