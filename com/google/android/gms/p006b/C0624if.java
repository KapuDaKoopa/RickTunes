package com.google.android.gms.p006b;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.b.if */
final class C0624if implements Runnable {
    final /* synthetic */ String f3385a;
    final /* synthetic */ JSONObject f3386b;
    final /* synthetic */ ie f3387c;

    C0624if(ie ieVar, String str, JSONObject jSONObject) {
        this.f3387c = ieVar;
        this.f3385a = str;
        this.f3386b = jSONObject;
    }

    public final void run() {
        this.f3387c.f3384a.m4562a(this.f3385a, this.f3386b);
    }
}
