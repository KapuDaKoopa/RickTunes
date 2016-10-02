package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.mn;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0315b;
import com.google.android.gms.p017a.C0317d;

@op
public final class GInAppPurchaseManagerInfoParcel implements SafeParcelable {
    public static final C0433a CREATOR;
    public final int f2264a;
    public final C0445n f2265b;
    public final mn f2266c;
    public final Context f2267d;
    public final C0348m f2268e;

    static {
        CREATOR = new C0433a();
    }

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.f2264a = i;
        this.f2265b = (C0445n) C0317d.m1997a(C0315b.m1995a(iBinder));
        this.f2266c = (mn) C0317d.m1997a(C0315b.m1995a(iBinder2));
        this.f2267d = (Context) C0317d.m1997a(C0315b.m1995a(iBinder3));
        this.f2268e = (C0348m) C0317d.m1997a(C0315b.m1995a(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, C0445n c0445n, mn mnVar, C0348m c0348m) {
        this.f2264a = 2;
        this.f2267d = context;
        this.f2265b = c0445n;
        this.f2266c = mnVar;
        this.f2268e = c0348m;
    }

    public static GInAppPurchaseManagerInfoParcel m2745a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m2746a(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    final IBinder m2747a() {
        return C0317d.m1996a(this.f2268e).asBinder();
    }

    final IBinder m2748b() {
        return C0317d.m1996a(this.f2265b).asBinder();
    }

    final IBinder m2749c() {
        return C0317d.m1996a(this.f2266c).asBinder();
    }

    final IBinder m2750d() {
        return C0317d.m1996a(this.f2267d).asBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0433a.m2751a(this, parcel);
    }
}
