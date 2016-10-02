package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;
import java.util.Collections;
import java.util.List;

@op
public final class AdRequestInfoParcel implements SafeParcelable {
    public static final C0471s CREATOR;
    public final List f2315A;
    public final long f2316B;
    public final CapabilityParcel f2317C;
    public final String f2318D;
    public final float f2319E;
    public final int f2320F;
    public final int f2321G;
    public final int f2322a;
    public final Bundle f2323b;
    public final AdRequestParcel f2324c;
    public final AdSizeParcel f2325d;
    public final String f2326e;
    public final ApplicationInfo f2327f;
    public final PackageInfo f2328g;
    public final String f2329h;
    public final String f2330i;
    public final String f2331j;
    public final VersionInfoParcel f2332k;
    public final Bundle f2333l;
    public final int f2334m;
    public final List f2335n;
    public final Bundle f2336o;
    public final boolean f2337p;
    public final Messenger f2338q;
    public final int f2339r;
    public final int f2340s;
    public final float f2341t;
    public final String f2342u;
    public final long f2343v;
    public final String f2344w;
    public final List f2345x;
    public final String f2346y;
    public final NativeAdOptionsParcel f2347z;

    static {
        CREATOR = new C0471s();
    }

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List list, Bundle bundle3, boolean z, Messenger messenger, int i3, int i4, float f, String str5, long j, String str6, List list2, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, List list3, long j2, CapabilityParcel capabilityParcel, String str8, float f2, int i5, int i6) {
        this.f2322a = i;
        this.f2323b = bundle;
        this.f2324c = adRequestParcel;
        this.f2325d = adSizeParcel;
        this.f2326e = str;
        this.f2327f = applicationInfo;
        this.f2328g = packageInfo;
        this.f2329h = str2;
        this.f2330i = str3;
        this.f2331j = str4;
        this.f2332k = versionInfoParcel;
        this.f2333l = bundle2;
        this.f2334m = i2;
        this.f2335n = list;
        this.f2315A = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f2336o = bundle3;
        this.f2337p = z;
        this.f2338q = messenger;
        this.f2339r = i3;
        this.f2340s = i4;
        this.f2341t = f;
        this.f2342u = str5;
        this.f2343v = j;
        this.f2344w = str6;
        this.f2345x = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f2346y = str7;
        this.f2347z = nativeAdOptionsParcel;
        this.f2316B = j2;
        this.f2317C = capabilityParcel;
        this.f2318D = str8;
        this.f2319E = f2;
        this.f2320F = i5;
        this.f2321G = i6;
    }

    private AdRequestInfoParcel(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i, List list, List list2, Bundle bundle3, boolean z, Messenger messenger, int i2, int i3, float f, String str5, long j, String str6, List list3, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, long j2, CapabilityParcel capabilityParcel, String str8, float f2, int i4, int i5) {
        this(15, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i, list, bundle3, z, messenger, i2, i3, f, str5, j, str6, list3, str7, nativeAdOptionsParcel, list2, j2, capabilityParcel, str8, f2, i4, i5);
    }

    public AdRequestInfoParcel(C0448a c0448a, String str, long j) {
        String str2 = str;
        long j2 = j;
        this(c0448a.f2396a, c0448a.f2397b, c0448a.f2398c, c0448a.f2399d, c0448a.f2400e, c0448a.f2401f, str2, c0448a.f2402g, c0448a.f2403h, c0448a.f2405j, c0448a.f2404i, c0448a.f2406k, c0448a.f2407l, c0448a.f2408m, c0448a.f2409n, c0448a.f2410o, c0448a.f2411p, c0448a.f2412q, c0448a.f2413r, c0448a.f2414s, c0448a.f2415t, c0448a.f2416u, c0448a.f2417v, c0448a.f2418w, c0448a.f2419x, c0448a.f2420y, j2, c0448a.f2421z, c0448a.f2392A, c0448a.f2393B, c0448a.f2394C, c0448a.f2395D);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0471s.m2909a(this, parcel, i);
    }
}
