package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.p006b.cv;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.xn;

@op
public final class aa extends C0408w {
    public final C0412v m2628a(Context context, tf tfVar, cz czVar, cv cvVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Object obj = (!xn.m4900a(14) || (applicationInfo != null && applicationInfo.targetSdkVersion < 11)) ? null : 1;
        if (obj == null) {
            return null;
        }
        return new C0413c(context, new ag(context, tfVar.m4582o(), tfVar.m4588u(), czVar, cvVar));
    }
}
