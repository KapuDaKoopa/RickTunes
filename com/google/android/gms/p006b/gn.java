package com.google.android.gms.p006b;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.C0504w;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@op
/* renamed from: com.google.android.gms.b.gn */
public final class gn {
    MutableContextWrapper f3291a;
    final ke f3292b;
    final VersionInfoParcel f3293c;
    final C0402k f3294d;

    gn(Context context, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        this.f3291a = new MutableContextWrapper(context.getApplicationContext());
        this.f3292b = keVar;
        this.f3293c = versionInfoParcel;
        this.f3294d = c0402k;
    }

    public final C0504w m3760a(String str) {
        return new C0504w(this.f3291a, new AdSizeParcel(), str, this.f3292b, this.f3293c, this.f3294d);
    }
}
