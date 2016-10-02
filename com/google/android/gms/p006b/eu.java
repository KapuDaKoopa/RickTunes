package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.eu */
public final class eu implements fk {
    private final ev f3160a;

    public eu(ev evVar) {
        this.f3160a = evVar;
    }

    public final void m3704a(tf tfVar, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            C0501b.m3025a("App event with no name parameter.");
        } else {
            this.f3160a.m2140a(str, (String) map.get("info"));
        }
    }
}
