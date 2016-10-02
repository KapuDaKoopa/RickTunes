package com.google.android.gms.p006b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: com.google.android.gms.b.xe */
public final class xe {
    public static boolean m4886a(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
