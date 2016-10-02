package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.xn;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.r */
public final class C0428r {
    public static void m2712a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f2169l == 4 && adOverlayInfoParcel.f2161d == null) {
            if (adOverlayInfoParcel.f2160c != null) {
                adOverlayInfoParcel.f2160c.m1751e();
            }
            ar.m2237b();
            C0407a.m2626a(context, adOverlayInfoParcel.f2159b, adOverlayInfoParcel.f2167j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f2171n.f2542e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m2618a(intent, adOverlayInfoParcel);
        if (!xn.m4900a(21)) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        ar.m2240e();
        rd.m4414a(context, intent);
    }
}
