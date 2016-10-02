package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.content.Context;

/* renamed from: com.google.android.gms.b.xh */
public final class xh {
    @TargetApi(20)
    public static boolean m4894a(Context context) {
        return xn.m4900a(20) && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
