package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.op;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.request.a */
public final class C0448a {
    public final String f2392A;
    public final float f2393B;
    public final int f2394C;
    public final int f2395D;
    public final Bundle f2396a;
    public final AdRequestParcel f2397b;
    public final AdSizeParcel f2398c;
    public final String f2399d;
    public final ApplicationInfo f2400e;
    public final PackageInfo f2401f;
    public final String f2402g;
    public final String f2403h;
    public final Bundle f2404i;
    public final VersionInfoParcel f2405j;
    public final int f2406k;
    public final List f2407l;
    public final List f2408m;
    public final Bundle f2409n;
    public final boolean f2410o;
    public final Messenger f2411p;
    public final int f2412q;
    public final int f2413r;
    public final float f2414s;
    public final String f2415t;
    public final long f2416u;
    public final String f2417v;
    public final List f2418w;
    public final String f2419x;
    public final NativeAdOptionsParcel f2420y;
    public final CapabilityParcel f2421z;

    public C0448a(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, VersionInfoParcel versionInfoParcel, Bundle bundle2, List list, List list2, Bundle bundle3, boolean z, Messenger messenger, int i, int i2, float f, String str4, long j, String str5, List list3, String str6, NativeAdOptionsParcel nativeAdOptionsParcel, CapabilityParcel capabilityParcel, String str7, float f2, int i3, int i4) {
        this.f2396a = bundle;
        this.f2397b = adRequestParcel;
        this.f2398c = adSizeParcel;
        this.f2399d = str;
        this.f2400e = applicationInfo;
        this.f2401f = packageInfo;
        this.f2402g = str2;
        this.f2403h = str3;
        this.f2405j = versionInfoParcel;
        this.f2404i = bundle2;
        this.f2410o = z;
        this.f2411p = messenger;
        this.f2412q = i;
        this.f2413r = i2;
        this.f2414s = f;
        if (list == null || list.size() <= 0) {
            if (adSizeParcel.f1912k) {
                this.f2406k = 4;
            } else {
                this.f2406k = 0;
            }
            this.f2407l = null;
            this.f2408m = null;
        } else {
            this.f2406k = 3;
            this.f2407l = list;
            this.f2408m = list2;
        }
        this.f2409n = bundle3;
        this.f2415t = str4;
        this.f2416u = j;
        this.f2417v = str5;
        this.f2418w = list3;
        this.f2419x = str6;
        this.f2420y = nativeAdOptionsParcel;
        this.f2421z = capabilityParcel;
        this.f2392A = str7;
        this.f2393B = f2;
        this.f2394C = i3;
        this.f2395D = i4;
    }
}
