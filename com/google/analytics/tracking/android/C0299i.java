package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: com.google.analytics.tracking.android.i */
final class C0299i implements C0292n {
    private static C0299i f1641e;
    private static Object f1642f;
    protected String f1643a;
    protected String f1644b;
    protected String f1645c;
    protected String f1646d;

    static {
        f1642f = new Object();
    }

    protected C0299i() {
    }

    private C0299i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f1645c = context.getPackageName();
        this.f1646d = packageManager.getInstallerPackageName(this.f1645c);
        String str = this.f1645c;
        String str2 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                str2 = packageInfo.versionName;
            }
        } catch (NameNotFoundException e) {
            as.m1827a("Error retrieving package info: appName set to " + str);
        }
        this.f1643a = str;
        this.f1644b = str2;
    }

    public static C0299i m1921a() {
        return f1641e;
    }

    public static void m1922a(Context context) {
        synchronized (f1642f) {
            if (f1641e == null) {
                f1641e = new C0299i(context);
            }
        }
    }

    public final String m1923a(String str) {
        return str == null ? null : str.equals("&an") ? this.f1643a : str.equals("&av") ? this.f1644b : str.equals("&aid") ? this.f1645c : str.equals("&aiid") ? this.f1646d : null;
    }
}
