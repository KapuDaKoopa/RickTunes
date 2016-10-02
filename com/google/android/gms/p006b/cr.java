package com.google.android.gms.p006b;

import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.cr */
public abstract class cr {
    @op
    public static final cr f3104a;
    @op
    public static final cr f3105b;
    @op
    public static final cr f3106c;

    static {
        f3104a = new cs();
        f3105b = new ct();
        f3106c = new cu();
    }

    public abstract String m3590a(String str, String str2);

    public final void m3591a(Map map, String str, String str2) {
        map.put(str, m3590a((String) map.get(str), str2));
    }
}
