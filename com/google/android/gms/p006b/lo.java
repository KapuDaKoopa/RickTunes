package com.google.android.gms.p006b;

import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.lo */
public final class lo {
    final tf f3609a;
    final boolean f3610b;
    final String f3611c;

    public lo(tf tfVar, Map map) {
        this.f3609a = tfVar;
        this.f3611c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f3610b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f3610b = true;
        }
    }
}
