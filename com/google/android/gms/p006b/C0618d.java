package com.google.android.gms.p006b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: com.google.android.gms.b.d */
public final class C0618d {
    public static ux m3608a(Context context) {
        zl zmVar;
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (NameNotFoundException e) {
        }
        if (VERSION.SDK_INT >= 9) {
            zmVar = new zm();
        } else {
            Object ziVar = new zi(AndroidHttpClient.newInstance(str));
        }
        ux uxVar = new ux(new zf(file, (byte) 0), new zc(zmVar), (byte) 0);
        uxVar.m4765a();
        return uxVar;
    }
}
