package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C0771d;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.C0726i;
import com.google.android.gms.p006b.xh;
import com.google.android.gms.p006b.xi;
import com.google.android.gms.p006b.xn;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.q */
public class C0706q {
    private static final Object f4733a;
    @Deprecated
    public static final int f4734b;
    public static boolean f4735c;
    public static boolean f4736d;
    static int f4737e;
    static final AtomicBoolean f4738f;
    private static String f4739g;
    private static Integer f4740h;
    private static final AtomicBoolean f4741i;

    static {
        f4734b = 8487000;
        f4735c = false;
        f4736d = false;
        f4737e = -1;
        f4733a = new Object();
        f4739g = null;
        f4740h = null;
        f4738f = new AtomicBoolean();
        f4741i = new AtomicBoolean();
    }

    @Deprecated
    public static int m5347a(Context context) {
        if (C0726i.f4839a) {
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C0771d.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f4741i.get())) {
            Integer num;
            synchronized (f4733a) {
                if (f4739g == null) {
                    f4739g = context.getPackageName();
                    try {
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY).metaData;
                        if (bundle != null) {
                            f4740h = Integer.valueOf(bundle.getInt("com.google.android.gms.version"));
                        } else {
                            f4740h = null;
                        }
                    } catch (Throwable e) {
                        Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
                    }
                } else if (!f4739g.equals(context.getPackageName())) {
                    throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + f4739g + "' and this call used package '" + context.getPackageName() + "'.");
                }
                num = f4740h;
            }
            if (num == null) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (num.intValue() != f4734b) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f4734b + " but found " + num + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            C0752r.m5641a();
            if (!xh.m4894a(context)) {
                try {
                    if (C0752r.m5640a(packageManager.getPackageInfo("com.android.vending", 8256), C0749n.f4891a) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (C0752r.m5640a(packageInfo, C0752r.m5640a(packageManager.getPackageInfo("com.android.vending", 8256), C0749n.f4891a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } catch (NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return 9;
                }
            } else if (C0752r.m5640a(packageInfo, C0749n.f4891a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (xi.m4895a(packageInfo.versionCode) < xi.m4895a(f4734b)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4734b + " but found " + packageInfo.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e3) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e3);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static String m5348a(int i) {
        return ConnectionResult.m5054a(i);
    }

    public static boolean m5349a(Context context, int i) {
        boolean z = false;
        if (!C0706q.m5350a(context, i, "com.google.android.gms")) {
            return z;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C0752r.m5641a();
            return C0752r.m5643a(context.getPackageManager(), packageInfo);
        } catch (NameNotFoundException e) {
            Log.isLoggable("GooglePlayServicesUtil", 3);
            return z;
        }
    }

    @TargetApi(19)
    private static boolean m5350a(Context context, int i, String str) {
        if (xn.m4900a(19)) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    static boolean m5351a(android.content.Context r5, java.lang.String r6) {
        /*
        r1 = 1;
        r2 = 0;
        r0 = 21;
        r0 = com.google.android.gms.p006b.xn.m4900a(r0);
        if (r0 == 0) goto L_0x0032;
    L_0x000a:
        r0 = r5.getPackageManager();
        r0 = r0.getPackageInstaller();
        r0 = r0.getAllSessions();
        r3 = r0.iterator();
    L_0x001a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0032;
    L_0x0020:
        r0 = r3.next();
        r0 = (android.content.pm.PackageInstaller.SessionInfo) r0;
        r0 = r0.getAppPackageName();
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = 18;
        r0 = com.google.android.gms.p006b.xn.m4900a(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x003a:
        r0 = "user";
        r0 = r5.getSystemService(r0);
        r0 = (android.os.UserManager) r0;
        r3 = r5.getPackageName();
        r0 = r0.getApplicationRestrictions(r3);
        if (r0 == 0) goto L_0x005e;
    L_0x004c:
        r3 = "true";
        r4 = "restricted_profile";
        r0 = r0.getString(r4);
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x005a:
        if (r1 == 0) goto L_0x0060;
    L_0x005c:
        r0 = r2;
        goto L_0x0031;
    L_0x005e:
        r1 = r2;
        goto L_0x005a;
    L_0x0060:
        r0 = r5.getPackageManager();
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r0.getApplicationInfo(r6, r1);	 Catch:{ NameNotFoundException -> 0x006d }
        r0 = r0.enabled;	 Catch:{ NameNotFoundException -> 0x006d }
        goto L_0x0031;
    L_0x006d:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.q.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean m5352a(PackageManager packageManager) {
        if (!C0706q.m5356b(packageManager)) {
            if (f4735c ? f4736d : "user".equals(Build.TYPE)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static void m5353b(Context context) {
        if (!f4738f.getAndSet(true)) {
            try {
                ((NotificationManager) context.getSystemService("notification")).cancel(10436);
            } catch (SecurityException e) {
            }
        }
    }

    @Deprecated
    public static boolean m5354b(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static boolean m5355b(Context context, int i) {
        return i == 18 ? true : i == 1 ? C0706q.m5351a(context, "com.google.android.gms") : false;
    }

    private static boolean m5356b(PackageManager packageManager) {
        boolean z = true;
        synchronized (f4733a) {
            if (f4737e == -1) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
                    C0752r.m5641a();
                    if (C0752r.m5640a(packageInfo, C0749n.f4891a[1]) != null) {
                        f4737e = 1;
                    } else {
                        f4737e = 0;
                    }
                } catch (NameNotFoundException e) {
                    f4737e = 0;
                }
            }
            if (f4737e == 0) {
                z = false;
            }
        }
        return z;
    }

    public static Resources m5357c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Context m5358d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static String m5359e(Context context) {
        Object obj = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    @Deprecated
    public static int m5360f(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return i;
        }
    }

    public static boolean m5361g(Context context) {
        return xn.m4900a(21) && context.getPackageManager().hasSystemFeature("cn.google");
    }
}
