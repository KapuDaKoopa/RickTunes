package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.C0338e;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.mediation.C0246k;

/* renamed from: com.google.ads.mediation.c */
final class C0247c extends C0246k {
    private final C0338e f1334l;

    public C0247c(C0338e c0338e) {
        this.f1334l = c0338e;
        this.f1326d = c0338e.m2055b().toString();
        this.f1327e = c0338e.m2056c();
        this.f1328f = c0338e.m2057d().toString();
        this.f1329g = c0338e.m2058e();
        this.f1330h = c0338e.m2059f().toString();
        this.f1331i = c0338e.m2060g().doubleValue();
        this.f1332j = c0338e.m2061h().toString();
        this.f1333k = c0338e.m2062i().toString();
        m1722a();
        m1724b();
    }

    public final void m1728a(View view) {
        if (view instanceof NativeAdView) {
            ((NativeAdView) view).setNativeAd(this.f1334l);
        }
    }
}
