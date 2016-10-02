package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.C0346b;
import com.google.android.gms.ads.internal.aj;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.nu */
public final class nu {
    public static rp m4266a(Context context, C0346b c0346b, qa qaVar, aa aaVar, tf tfVar, ke keVar, nv nvVar, cz czVar) {
        rp nyVar;
        AdResponseParcel adResponseParcel = qaVar.f3953b;
        if (adResponseParcel.f2363h) {
            nyVar = new ny(context, qaVar, keVar, nvVar, czVar, tfVar);
        } else if (adResponseParcel.f2375t) {
            if (c0346b instanceof aj) {
                nyVar = new oa(context, (aj) c0346b, new ia(), qaVar, aaVar, nvVar);
            } else {
                throw new IllegalArgumentException("Invalid NativeAdManager type. Found: " + (c0346b != null ? c0346b.getClass().getName() : "null") + "; Required: NativeAdManager.");
            }
        } else if (adResponseParcel.f2371p) {
            nyVar = new np(context, qaVar, tfVar, nvVar);
        } else {
            nyVar = (((Boolean) ar.m2249n().m3580a(ck.f3056U)).booleanValue() && xn.m4900a(19) && !xn.m4900a(21) && tfVar.m4578k().f1906e) ? new nx(context, qaVar, tfVar, nvVar) : new nw(context, qaVar, tfVar, nvVar);
        }
        "AdRenderer: " + nyVar.getClass().getName();
        C0501b.m3027a(3);
        nyVar.m2704e();
        return nyVar;
    }
}
