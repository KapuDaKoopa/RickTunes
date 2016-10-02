package com.google.android.gms.p006b;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.cb */
public abstract class cb {
    final String f3025a;
    final Object f3026b;
    private final int f3027c;

    private cb(int i, String str, Object obj) {
        this.f3027c = i;
        this.f3025a = str;
        this.f3026b = obj;
        ar.m2248m().f3028a.add(this);
    }

    public static cb m3568a(int i, String str) {
        cb a = cb.m3571a(i, str, null);
        ar.m2248m().f3029b.add(a);
        return a;
    }

    public static cb m3569a(int i, String str, int i2) {
        return new cd(i, str, Integer.valueOf(i2));
    }

    public static cb m3570a(int i, String str, Boolean bool) {
        return new cc(i, str, bool);
    }

    public static cb m3571a(int i, String str, String str2) {
        return new cf(i, str, str2);
    }

    public static cb m3572a(String str) {
        cb a = cb.m3571a(0, str, null);
        ar.m2248m().f3030c.add(a);
        return a;
    }

    public static cb m3573a(String str, long j) {
        return new ce(str, Long.valueOf(j));
    }

    protected abstract Object m3574a(SharedPreferences sharedPreferences);
}
