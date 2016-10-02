package com.google.android.gms.p006b;

import android.location.Location;
import com.google.android.gms.ads.mediation.C0508a;
import java.util.Date;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.kx */
public final class kx implements C0508a {
    private final Date f3546a;
    private final int f3547b;
    private final Set f3548c;
    private final boolean f3549d;
    private final Location f3550e;
    private final int f3551f;
    private final boolean f3552g;

    public kx(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2) {
        this.f3546a = date;
        this.f3547b = i;
        this.f3548c = set;
        this.f3550e = location;
        this.f3549d = z;
        this.f3551f = i2;
        this.f3552g = z2;
    }

    public final Date m4068a() {
        return this.f3546a;
    }

    public final int m4069b() {
        return this.f3547b;
    }

    public final Set m4070c() {
        return this.f3548c;
    }

    public final Location m4071d() {
        return this.f3550e;
    }

    public final int m4072e() {
        return this.f3551f;
    }

    public final boolean m4073f() {
        return this.f3549d;
    }

    public final boolean m4074g() {
        return this.f3552g;
    }
}
