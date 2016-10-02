package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;
import java.util.Collections;
import java.util.List;

@op
public final class AdResponseParcel implements SafeParcelable {
    public static final C0473u CREATOR;
    public String f2348A;
    public boolean f2349B;
    public boolean f2350C;
    public RewardItemParcel f2351D;
    public List f2352E;
    public List f2353F;
    public boolean f2354G;
    private AdRequestInfoParcel f2355H;
    public final int f2356a;
    public final String f2357b;
    public String f2358c;
    public final List f2359d;
    public final int f2360e;
    public final List f2361f;
    public final long f2362g;
    public final boolean f2363h;
    public final long f2364i;
    public final List f2365j;
    public final long f2366k;
    public final int f2367l;
    public final String f2368m;
    public final long f2369n;
    public final String f2370o;
    public final boolean f2371p;
    public final String f2372q;
    public final String f2373r;
    public final boolean f2374s;
    public final boolean f2375t;
    public final boolean f2376u;
    public final boolean f2377v;
    public final boolean f2378w;
    public final int f2379x;
    public LargeParcelTeleporter f2380y;
    public String f2381z;

    static {
        CREATOR = new C0473u();
    }

    public AdResponseParcel(int i) {
        this(16, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null, null, false, false, null, null, null, false);
    }

    public AdResponseParcel(int i, long j) {
        this(16, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null, null, false, false, null, null, null, false);
    }

    AdResponseParcel(int i, String str, String str2, List list, int i2, List list2, long j, boolean z, long j2, List list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, LargeParcelTeleporter largeParcelTeleporter, String str7, String str8, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z10) {
        this.f2356a = i;
        this.f2357b = str;
        this.f2358c = str2;
        this.f2359d = list != null ? Collections.unmodifiableList(list) : null;
        this.f2360e = i2;
        this.f2361f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f2362g = j;
        this.f2363h = z;
        this.f2364i = j2;
        this.f2365j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f2366k = j3;
        this.f2367l = i3;
        this.f2368m = str3;
        this.f2369n = j4;
        this.f2370o = str4;
        this.f2371p = z2;
        this.f2372q = str5;
        this.f2373r = str6;
        this.f2374s = z3;
        this.f2375t = z4;
        this.f2376u = z5;
        this.f2377v = z6;
        this.f2378w = z7;
        this.f2379x = i4;
        this.f2380y = largeParcelTeleporter;
        this.f2381z = str7;
        this.f2348A = str8;
        if (this.f2358c == null && this.f2380y != null) {
            StringParcel stringParcel = (StringParcel) this.f2380y.m2808a(StringParcel.CREATOR);
            if (!(stringParcel == null || TextUtils.isEmpty(stringParcel.m2809a()))) {
                this.f2358c = stringParcel.m2809a();
            }
        }
        this.f2349B = z8;
        this.f2350C = z9;
        this.f2351D = rewardItemParcel;
        this.f2352E = list4;
        this.f2353F = list5;
        this.f2354G = z10;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List list, List list2, long j, boolean z, long j2, List list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, String str7, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z10) {
        this(16, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i2, null, null, str7, z8, z9, rewardItemParcel, list4, list5, z10);
        this.f2355H = adRequestInfoParcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List list, List list2, long j, boolean z, List list3, long j2, int i, String str3, long j3, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, int i2, String str6, boolean z6, boolean z7, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z8) {
        this(16, str, str2, list, -2, list2, j, z, -1, list3, j2, i, str3, j3, str4, false, null, str5, z2, z3, z4, z5, false, i2, null, null, str6, z6, z7, rewardItemParcel, list4, list5, z8);
        this.f2355H = adRequestInfoParcel;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (!(this.f2355H == null || this.f2355H.f2322a < 9 || TextUtils.isEmpty(this.f2358c))) {
            this.f2380y = new LargeParcelTeleporter(new StringParcel(this.f2358c));
            this.f2358c = null;
        }
        C0473u.m2912a(this, parcel, i);
    }
}
