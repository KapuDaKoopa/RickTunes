package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.xf;
import com.google.android.gms.p006b.xg;

/* renamed from: com.google.android.gms.auth.api.signin.internal.x */
public final class C0603x {
    final long f2851a;
    final xf f2852b;
    private final String f2853c;

    public C0603x(String str, long j) {
        this(str, j, xg.m4890d());
    }

    private C0603x(String str, long j, xf xfVar) {
        this.f2853c = ax.m5529a(str);
        ax.m5535b(j > 0);
        this.f2851a = j;
        this.f2852b = (xf) ax.m5527a((Object) xfVar);
    }
}
