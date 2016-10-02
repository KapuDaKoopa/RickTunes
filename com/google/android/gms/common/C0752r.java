package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;

/* renamed from: com.google.android.gms.common.r */
public final class C0752r {
    private static final C0752r f4892a;

    static {
        f4892a = new C0752r();
    }

    private C0752r() {
    }

    static C0746k m5640a(PackageInfo packageInfo, C0746k... c0746kArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C0746k c0747l = new C0747l(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < c0746kArr.length; i++) {
            if (c0746kArr[i].equals(c0747l)) {
                return c0746kArr[i];
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            "Signature not valid.  Found: \n" + Base64.encodeToString(c0747l.m5634a(), 0);
        }
        return null;
    }

    public static C0752r m5641a() {
        return f4892a;
    }

    private static boolean m5642a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            C0746k a;
            if (z) {
                a = C0752r.m5640a(packageInfo, C0749n.f4891a);
            } else {
                a = C0752r.m5640a(packageInfo, C0749n.f4891a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean m5643a(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (C0706q.m5352a(packageManager)) {
            return C0752r.m5642a(packageInfo, true);
        }
        boolean a = C0752r.m5642a(packageInfo, false);
        if (a || !C0752r.m5642a(packageInfo, true)) {
            return a;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return a;
    }
}
