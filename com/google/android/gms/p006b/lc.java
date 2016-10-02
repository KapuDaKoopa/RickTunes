package com.google.android.gms.p006b;

import android.location.Location;
import com.google.android.gms.ads.formats.C0336c;
import com.google.android.gms.ads.formats.C0337d;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.C0521m;
import java.util.Date;
import java.util.List;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.lc */
public final class lc implements C0521m {
    private final Date f3560a;
    private final int f3561b;
    private final Set f3562c;
    private final boolean f3563d;
    private final Location f3564e;
    private final int f3565f;
    private final NativeAdOptionsParcel f3566g;
    private final List f3567h;
    private final boolean f3568i;

    public lc(Date date, int i, Set set, Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List list, boolean z2) {
        this.f3560a = date;
        this.f3561b = i;
        this.f3562c = set;
        this.f3564e = location;
        this.f3563d = z;
        this.f3565f = i2;
        this.f3566g = nativeAdOptionsParcel;
        this.f3567h = list;
        this.f3568i = z2;
    }

    public final Date m4141a() {
        return this.f3560a;
    }

    public final int m4142b() {
        return this.f3561b;
    }

    public final Set m4143c() {
        return this.f3562c;
    }

    public final Location m4144d() {
        return this.f3564e;
    }

    public final int m4145e() {
        return this.f3565f;
    }

    public final boolean m4146f() {
        return this.f3563d;
    }

    public final boolean m4147g() {
        return this.f3568i;
    }

    public final C0336c m4148h() {
        if (this.f3566g == null) {
            return null;
        }
        C0337d c0337d = new C0337d();
        c0337d.f1763a = this.f3566g.f2048b;
        c0337d.f1764b = this.f3566g.f2049c;
        c0337d.f1765c = this.f3566g.f2050d;
        return c0337d.m2054a();
    }

    public final boolean m4149i() {
        return this.f3567h != null && this.f3567h.contains("2");
    }

    public final boolean m4150j() {
        return this.f3567h != null && this.f3567h.contains("1");
    }
}
