package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;
import java.util.Arrays;
import java.util.List;

@op
public final class AdRequestParcel implements SafeParcelable {
    public static final C0369t CREATOR;
    public final int f1884a;
    public final long f1885b;
    public final Bundle f1886c;
    public final int f1887d;
    public final List f1888e;
    public final boolean f1889f;
    public final int f1890g;
    public final boolean f1891h;
    public final String f1892i;
    public final SearchAdRequestParcel f1893j;
    public final Location f1894k;
    public final String f1895l;
    public final Bundle f1896m;
    public final Bundle f1897n;
    public final List f1898o;
    public final String f1899p;
    public final String f1900q;
    public final boolean f1901r;

    static {
        CREATOR = new C0369t();
    }

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3) {
        this.f1884a = i;
        this.f1885b = j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1886c = bundle;
        this.f1887d = i2;
        this.f1888e = list;
        this.f1889f = z;
        this.f1890g = i3;
        this.f1891h = z2;
        this.f1892i = str;
        this.f1893j = searchAdRequestParcel;
        this.f1894k = location;
        this.f1895l = str2;
        this.f1896m = bundle2;
        this.f1897n = bundle3;
        this.f1898o = list2;
        this.f1899p = str3;
        this.f1900q = str4;
        this.f1901r = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.f1884a == adRequestParcel.f1884a && this.f1885b == adRequestParcel.f1885b && av.m5525a(this.f1886c, adRequestParcel.f1886c) && this.f1887d == adRequestParcel.f1887d && av.m5525a(this.f1888e, adRequestParcel.f1888e) && this.f1889f == adRequestParcel.f1889f && this.f1890g == adRequestParcel.f1890g && this.f1891h == adRequestParcel.f1891h && av.m5525a(this.f1892i, adRequestParcel.f1892i) && av.m5525a(this.f1893j, adRequestParcel.f1893j) && av.m5525a(this.f1894k, adRequestParcel.f1894k) && av.m5525a(this.f1895l, adRequestParcel.f1895l) && av.m5525a(this.f1896m, adRequestParcel.f1896m) && av.m5525a(this.f1897n, adRequestParcel.f1897n) && av.m5525a(this.f1898o, adRequestParcel.f1898o) && av.m5525a(this.f1899p, adRequestParcel.f1899p) && av.m5525a(this.f1900q, adRequestParcel.f1900q) && this.f1901r == adRequestParcel.f1901r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1884a), Long.valueOf(this.f1885b), this.f1886c, Integer.valueOf(this.f1887d), this.f1888e, Boolean.valueOf(this.f1889f), Integer.valueOf(this.f1890g), Boolean.valueOf(this.f1891h), this.f1892i, this.f1893j, this.f1894k, this.f1895l, this.f1896m, this.f1897n, this.f1898o, this.f1899p, this.f1900q, Boolean.valueOf(this.f1901r)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0369t.m2443a(this, parcel, i);
    }
}
