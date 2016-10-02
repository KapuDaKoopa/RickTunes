package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@op
/* renamed from: com.google.android.gms.b.tm */
public final class tm {
    public static tf m4622a(Context context, AdSizeParcel adSizeParcel, aa aaVar, VersionInfoParcel versionInfoParcel) {
        return tm.m4623a(context, adSizeParcel, false, false, aaVar, versionInfoParcel, null, null);
    }

    public static tf m4623a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, aa aaVar, VersionInfoParcel versionInfoParcel, cz czVar, C0402k c0402k) {
        tf tnVar = new tn(to.m4678a(context, adSizeParcel, z, aaVar, versionInfoParcel, czVar, c0402k));
        tnVar.setWebViewClient(ar.m2242g().m4463a(tnVar, z2));
        tnVar.setWebChromeClient(ar.m2242g().m4477c(tnVar));
        return tnVar;
    }
}
