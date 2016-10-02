package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.ev;
import com.google.android.gms.p006b.fs;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p017a.C0315b;
import com.google.android.gms.p017a.C0317d;

@op
public final class AdOverlayInfoParcel implements SafeParcelable {
    public static final C0429s CREATOR;
    public final int f2158a;
    public final AdLauncherIntentInfoParcel f2159b;
    public final C0260a f2160c;
    public final C0347t f2161d;
    public final tf f2162e;
    public final ev f2163f;
    public final String f2164g;
    public final boolean f2165h;
    public final String f2166i;
    public final ac f2167j;
    public final int f2168k;
    public final int f2169l;
    public final String f2170m;
    public final VersionInfoParcel f2171n;
    public final fs f2172o;
    public final String f2173p;
    public final InterstitialAdParameterParcel f2174q;

    static {
        CREATOR = new C0429s();
    }

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f2158a = i;
        this.f2159b = adLauncherIntentInfoParcel;
        this.f2160c = (C0260a) C0317d.m1997a(C0315b.m1995a(iBinder));
        this.f2161d = (C0347t) C0317d.m1997a(C0315b.m1995a(iBinder2));
        this.f2162e = (tf) C0317d.m1997a(C0315b.m1995a(iBinder3));
        this.f2163f = (ev) C0317d.m1997a(C0315b.m1995a(iBinder4));
        this.f2164g = str;
        this.f2165h = z;
        this.f2166i = str2;
        this.f2167j = (ac) C0317d.m1997a(C0315b.m1995a(iBinder5));
        this.f2168k = i2;
        this.f2169l = i3;
        this.f2170m = str3;
        this.f2171n = versionInfoParcel;
        this.f2172o = (fs) C0317d.m1997a(C0315b.m1995a(iBinder6));
        this.f2173p = str4;
        this.f2174q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(C0260a c0260a, C0347t c0347t, ac acVar, tf tfVar, int i, VersionInfoParcel versionInfoParcel, String str, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f2158a = 4;
        this.f2159b = null;
        this.f2160c = c0260a;
        this.f2161d = c0347t;
        this.f2162e = tfVar;
        this.f2163f = null;
        this.f2164g = null;
        this.f2165h = false;
        this.f2166i = null;
        this.f2167j = acVar;
        this.f2168k = i;
        this.f2169l = 1;
        this.f2170m = null;
        this.f2171n = versionInfoParcel;
        this.f2172o = null;
        this.f2173p = str;
        this.f2174q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(C0260a c0260a, C0347t c0347t, ac acVar, tf tfVar, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.f2158a = 4;
        this.f2159b = null;
        this.f2160c = c0260a;
        this.f2161d = c0347t;
        this.f2162e = tfVar;
        this.f2163f = null;
        this.f2164g = null;
        this.f2165h = z;
        this.f2166i = null;
        this.f2167j = acVar;
        this.f2168k = i;
        this.f2169l = 2;
        this.f2170m = null;
        this.f2171n = versionInfoParcel;
        this.f2172o = null;
        this.f2173p = null;
        this.f2174q = null;
    }

    public AdOverlayInfoParcel(C0260a c0260a, C0347t c0347t, ev evVar, ac acVar, tf tfVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, fs fsVar) {
        this.f2158a = 4;
        this.f2159b = null;
        this.f2160c = c0260a;
        this.f2161d = c0347t;
        this.f2162e = tfVar;
        this.f2163f = evVar;
        this.f2164g = null;
        this.f2165h = z;
        this.f2166i = null;
        this.f2167j = acVar;
        this.f2168k = i;
        this.f2169l = 3;
        this.f2170m = str;
        this.f2171n = versionInfoParcel;
        this.f2172o = fsVar;
        this.f2173p = null;
        this.f2174q = null;
    }

    public AdOverlayInfoParcel(C0260a c0260a, C0347t c0347t, ev evVar, ac acVar, tf tfVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, fs fsVar) {
        this.f2158a = 4;
        this.f2159b = null;
        this.f2160c = c0260a;
        this.f2161d = c0347t;
        this.f2162e = tfVar;
        this.f2163f = evVar;
        this.f2164g = str2;
        this.f2165h = z;
        this.f2166i = str;
        this.f2167j = acVar;
        this.f2168k = i;
        this.f2169l = 3;
        this.f2170m = null;
        this.f2171n = versionInfoParcel;
        this.f2172o = fsVar;
        this.f2173p = null;
        this.f2174q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, C0260a c0260a, C0347t c0347t, ac acVar, VersionInfoParcel versionInfoParcel) {
        this.f2158a = 4;
        this.f2159b = adLauncherIntentInfoParcel;
        this.f2160c = c0260a;
        this.f2161d = c0347t;
        this.f2162e = null;
        this.f2163f = null;
        this.f2164g = null;
        this.f2165h = false;
        this.f2166i = null;
        this.f2167j = acVar;
        this.f2168k = -1;
        this.f2169l = 4;
        this.f2170m = null;
        this.f2171n = versionInfoParcel;
        this.f2172o = null;
        this.f2173p = null;
        this.f2174q = null;
    }

    public static AdOverlayInfoParcel m2617a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m2618a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    final IBinder m2619a() {
        return C0317d.m1996a(this.f2160c).asBinder();
    }

    final IBinder m2620b() {
        return C0317d.m1996a(this.f2161d).asBinder();
    }

    final IBinder m2621c() {
        return C0317d.m1996a(this.f2162e).asBinder();
    }

    final IBinder m2622d() {
        return C0317d.m1996a(this.f2163f).asBinder();
    }

    public final int describeContents() {
        return 0;
    }

    final IBinder m2623e() {
        return C0317d.m1996a(this.f2172o).asBinder();
    }

    final IBinder m2624f() {
        return C0317d.m1996a(this.f2167j).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0429s.m2713a(this, parcel, i);
    }
}
