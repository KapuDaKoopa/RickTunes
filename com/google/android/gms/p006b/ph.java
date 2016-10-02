package com.google.android.gms.p006b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.ph */
final class ph {
    final List f3849a;
    final String f3850b;
    final String f3851c;
    final boolean f3852d;
    final boolean f3853e;
    final String f3854f;
    String f3855g;
    int f3856h;
    private final List f3857i;
    private final String f3858j;
    private final String f3859k;

    public ph(int i, Map map) {
        this.f3855g = (String) map.get("url");
        this.f3859k = (String) map.get("base_uri");
        this.f3850b = (String) map.get("post_parameters");
        this.f3852d = ph.m4337a((String) map.get("drt_include"));
        this.f3853e = ph.m4337a((String) map.get("pan_include"));
        this.f3858j = (String) map.get("activation_overlay_url");
        this.f3857i = ph.m4338b((String) map.get("check_packages"));
        this.f3854f = (String) map.get("request_id");
        this.f3851c = (String) map.get("type");
        this.f3849a = ph.m4338b((String) map.get("errors"));
        this.f3856h = i;
    }

    private static boolean m4337a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private static List m4338b(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }
}
