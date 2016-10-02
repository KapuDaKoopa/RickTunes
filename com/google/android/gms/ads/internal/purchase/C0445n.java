package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.n */
public final class C0445n {
    private final String f2313a;

    public C0445n(String str) {
        this.f2313a = str;
    }

    public final boolean m2803a(String str, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        ar.m2250o();
        String b = C0443k.m2801b(intent);
        ar.m2250o();
        Object stringExtra = intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (b == null || stringExtra == null) {
            return false;
        }
        ar.m2250o();
        if (str.equals(C0443k.m2800a(b))) {
            if (this.f2313a != null) {
                boolean z;
                Object obj = this.f2313a;
                if (TextUtils.isEmpty(b) || TextUtils.isEmpty(obj) || TextUtils.isEmpty(stringExtra)) {
                    C0501b.m3027a(6);
                    z = false;
                } else {
                    z = C0446o.m2805a(C0446o.m2804a(obj), b, stringExtra);
                }
                if (!z) {
                    C0501b.m3025a("Fail to verify signature.");
                    return false;
                }
            }
            return true;
        }
        C0501b.m3025a("Developer payload not match.");
        return false;
    }
}
