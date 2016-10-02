package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p001b.C0028m;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ae;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.al;
import com.google.android.gms.ads.internal.client.az;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.ek;
import com.google.android.gms.p006b.en;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.v */
public final class C0503v extends al {
    private ae f2550a;
    private ee f2551b;
    private eh f2552c;
    private C0028m f2553d;
    private C0028m f2554e;
    private NativeAdOptionsParcel f2555f;
    private az f2556g;
    private final Context f2557h;
    private final ke f2558i;
    private final String f2559j;
    private final VersionInfoParcel f2560k;
    private final C0402k f2561l;

    public C0503v(Context context, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        this.f2557h = context;
        this.f2559j = str;
        this.f2558i = keVar;
        this.f2560k = versionInfoParcel;
        this.f2554e = new C0028m();
        this.f2553d = new C0028m();
        this.f2561l = c0402k;
    }

    public final ah m3029a() {
        return new C0498t(this.f2557h, this.f2559j, this.f2558i, this.f2560k, this.f2550a, this.f2551b, this.f2552c, this.f2554e, this.f2553d, this.f2555f, this.f2556g, this.f2561l);
    }

    public final void m3030a(ae aeVar) {
        this.f2550a = aeVar;
    }

    public final void m3031a(az azVar) {
        this.f2556g = azVar;
    }

    public final void m3032a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        this.f2555f = nativeAdOptionsParcel;
    }

    public final void m3033a(ee eeVar) {
        this.f2551b = eeVar;
    }

    public final void m3034a(eh ehVar) {
        this.f2552c = ehVar;
    }

    public final void m3035a(String str, en enVar, ek ekVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f2554e.put(str, enVar);
        this.f2553d.put(str, ekVar);
    }
}
