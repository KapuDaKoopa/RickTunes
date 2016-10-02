package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.ft */
public final class ft implements fk {
    private final fu f3248a;

    public ft(fu fuVar) {
        this.f3248a = fuVar;
    }

    public final void m3725a(tf tfVar, Map map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.f3248a.m3037b(equals);
                this.f3248a.m3036a(equals2, parseFloat);
            }
        } catch (NumberFormatException e) {
            C0501b.m3027a(6);
        }
        parseFloat = 0.0f;
        this.f3248a.m3037b(equals);
        this.f3248a.m3036a(equals2, parseFloat);
    }
}
