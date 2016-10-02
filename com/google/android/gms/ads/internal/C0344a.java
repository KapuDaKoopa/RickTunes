package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0343y;
import com.google.android.gms.ads.internal.client.C0373x;
import com.google.android.gms.ads.internal.client.ak;
import com.google.android.gms.ads.internal.client.aq;
import com.google.android.gms.ads.internal.formats.C0396r;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.purchase.C0438f;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.dn;
import com.google.android.gms.p006b.hw;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.lz;
import com.google.android.gms.p006b.mt;

/* renamed from: com.google.android.gms.ads.internal.a */
public class C0344a implements C0343y {
    public static void m2083a() {
        C0373x.f2032a = C0344a.class.getName();
    }

    public final ak m2084a(Context context, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        return new C0503v(context, str, kdVar, versionInfoParcel, C0402k.m2603a());
    }

    public final aq m2085a(Context context, AdSizeParcel adSizeParcel, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        return new C0406o(context, adSizeParcel, str, kdVar, versionInfoParcel, C0402k.m2603a());
    }

    public final dn m2086a(FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new C0396r(frameLayout, frameLayout2);
    }

    public final mt m2087a(Activity activity) {
        return new C0438f(activity);
    }

    public final aq m2088b(Context context, AdSizeParcel adSizeParcel, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        if (((Boolean) ar.m2249n().m3580a(ck.ae)).booleanValue()) {
            return new hw(context, str, kdVar, versionInfoParcel, C0402k.m2603a());
        }
        return new C0504w(context, adSizeParcel, str, kdVar, versionInfoParcel, C0402k.m2603a());
    }

    public final lz m2089b(Activity activity) {
        return new C0421k(activity);
    }
}
