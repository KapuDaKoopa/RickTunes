package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.C0339g;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.mediation.C0257l;

/* renamed from: com.google.ads.mediation.d */
final class C0258d extends C0257l {
    private final C0339g f1352j;

    public C0258d(C0339g c0339g) {
        this.f1352j = c0339g;
        this.f1346d = c0339g.m2063b().toString();
        this.f1347e = c0339g.m2064c();
        this.f1348f = c0339g.m2065d().toString();
        this.f1349g = c0339g.m2066e();
        this.f1350h = c0339g.m2067f().toString();
        this.f1351i = c0339g.m2068g().toString();
        m1722a();
        m1724b();
    }

    public final void m1745a(View view) {
        if (view instanceof NativeAdView) {
            ((NativeAdView) view).setNativeAd(this.f1352j);
        }
    }
}
