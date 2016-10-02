package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.rd;

@op
/* renamed from: com.google.android.gms.ads.internal.y */
final class C0506y extends qi {
    final /* synthetic */ C0504w f2568a;
    private final Bitmap f2569b;
    private final String f2570c;

    public C0506y(C0504w c0504w, Bitmap bitmap, String str) {
        this.f2568a = c0504w;
        this.f2569b = bitmap;
        this.f2570c = str;
    }

    public final void m3058a() {
        boolean a;
        if (this.f2568a.f.f1847F) {
            ar.m2240e();
            a = rd.m4424a(this.f2568a.f.f1858c, this.f2569b, this.f2570c);
        } else {
            a = false;
        }
        InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.f2568a.f.f1847F, this.f2568a.m3043B(), a ? this.f2570c : null, this.f2568a.f2563m, this.f2568a.f2564n);
        int q = this.f2568a.f.f1865j.f3926b.m4584q();
        if (q == -1) {
            q = this.f2568a.f.f1865j.f3931g;
        }
        rd.f4041a.post(new C0507z(this, new AdOverlayInfoParcel(this.f2568a, this.f2568a, this.f2568a, this.f2568a.f.f1865j.f3926b, q, this.f2568a.f.f1860e, this.f2568a.f.f1865j.f3921A, interstitialAdParameterParcel)));
    }

    public final void m3059b() {
    }
}
