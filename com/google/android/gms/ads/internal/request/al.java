package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.tf;
import java.util.Map;

public final class al implements fk {
    public final void m2831a(tf tfVar, Map map) {
        String str = (String) map.get("request_id");
        C0501b.m3025a("Invalid request: " + ((String) map.get("errors")));
        ad.f2428f.m3727a(str);
    }
}
