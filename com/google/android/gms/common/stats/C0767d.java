package com.google.android.gms.common.stats;

import com.google.android.gms.p006b.wa;

/* renamed from: com.google.android.gms.common.stats.d */
public final class C0767d {
    public static wa f4970a;
    public static wa f4971b;
    public static wa f4972c;
    public static wa f4973d;
    public static wa f4974e;
    public static wa f4975f;

    static {
        f4970a = wa.m4842a("gms:common:stats:connections:level", Integer.valueOf(C0768e.f4977b));
        f4971b = wa.m4844a("gms:common:stats:connections:ignored_calling_processes", "");
        f4972c = wa.m4844a("gms:common:stats:connections:ignored_calling_services", "");
        f4973d = wa.m4844a("gms:common:stats:connections:ignored_target_processes", "");
        f4974e = wa.m4844a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        f4975f = wa.m4843a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }
}
