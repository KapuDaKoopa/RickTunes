package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gcm.a */
public final class C0313a {
    static String f1717a;
    private static GCMBroadcastReceiver f1718b;

    static String m1980a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int i = C0313a.m1994i(context);
        "Saving regId on app version " + i;
        Editor edit = sharedPreferences.edit();
        edit.putString("regId", str);
        edit.putInt("appVersion", i);
        edit.commit();
        return string;
    }

    static String m1981a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(',').append(strArr[i]);
        }
        return stringBuilder.toString();
    }

    public static void m1982a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        String str = packageName + ".permission.C2D_MESSAGE";
        try {
            packageManager.getPermissionInfo(str, FragmentTransaction.TRANSIT_ENTER_MASK);
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 2).receivers;
                if (activityInfoArr == null || activityInfoArr.length == 0) {
                    throw new IllegalStateException("No receiver for package " + packageName);
                }
                if (Log.isLoggable("GCMRegistrar", 2)) {
                    "number of receivers for " + packageName + ": " + activityInfoArr.length;
                }
                Set hashSet = new HashSet();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if ("com.google.android.c2dm.permission.SEND".equals(activityInfo.permission)) {
                        hashSet.add(activityInfo.name);
                    }
                }
                if (hashSet.isEmpty()) {
                    throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
                }
                C0313a.m1984a(context, hashSet, "com.google.android.c2dm.intent.REGISTRATION");
                C0313a.m1984a(context, hashSet, "com.google.android.c2dm.intent.RECEIVE");
            } catch (NameNotFoundException e) {
                throw new IllegalStateException("Could not get receivers for package " + packageName);
            }
        } catch (NameNotFoundException e2) {
            throw new IllegalStateException("Application does not define permission " + str);
        }
    }

    static void m1983a(Context context, int i) {
        Editor edit = context.getSharedPreferences("com.google.android.gcm", 0).edit();
        edit.putInt("backoff_ms", i);
        edit.commit();
    }

    private static void m1984a(Context context, Set set, String str) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 32);
        if (queryBroadcastReceivers.isEmpty()) {
            throw new IllegalStateException("No receivers for action " + str);
        }
        if (Log.isLoggable("GCMRegistrar", 2)) {
            "Found " + queryBroadcastReceivers.size() + " receivers for action " + str;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            String str2 = resolveInfo.activityInfo.name;
            if (!set.contains(str2)) {
                throw new IllegalStateException("Receiver " + str2 + " is not set with permission com.google.android.c2dm.permission.SEND");
            }
        }
    }

    public static void m1985a(Context context, boolean z) {
        Editor edit = context.getSharedPreferences("com.google.android.gcm", 0).edit();
        edit.putBoolean("onServer", z);
        long g = C0313a.m1992g(context) + System.currentTimeMillis();
        "Setting registeredOnServer status as " + z + " until " + new Timestamp(g);
        edit.putLong("onServerExpirationTime", g);
        edit.commit();
    }

    public static void m1986a(Context context, String... strArr) {
        String a = C0313a.m1981a(strArr);
        "Registering app " + context.getPackageName() + " of senders " + a;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", a);
        context.startService(intent);
    }

    public static void m1987b(Context context) {
        C0313a.m1993h(context);
        C0313a.m1988c(context);
    }

    static void m1988c(Context context) {
        "Unregistering app " + context.getPackageName();
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        context.startService(intent);
    }

    static synchronized void m1989d(Context context) {
        synchronized (C0313a.class) {
            if (f1718b == null) {
                if (f1717a == null) {
                    f1718b = new GCMBroadcastReceiver();
                } else {
                    try {
                        f1718b = (GCMBroadcastReceiver) Class.forName(f1717a).newInstance();
                    } catch (Exception e) {
                        "Could not create instance of " + f1717a + ". Using " + GCMBroadcastReceiver.class.getName() + " directly.";
                        f1718b = new GCMBroadcastReceiver();
                    }
                }
                String packageName = context.getPackageName();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
                intentFilter.addCategory(packageName);
                context.registerReceiver(f1718b, intentFilter, packageName + ".permission.C2D_MESSAGE", null);
            }
        }
    }

    public static String m1990e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int i = sharedPreferences.getInt("appVersion", GridLayout.UNDEFINED);
        int i2 = C0313a.m1994i(context);
        if (i == GridLayout.UNDEFINED || i == i2) {
            return string;
        }
        "App version changed from " + i + " to " + i2 + "; resetting registration id";
        C0313a.m1980a(context, "");
        return "";
    }

    public static boolean m1991f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        boolean z = sharedPreferences.getBoolean("onServer", false);
        "Is registered on server: " + z;
        if (z) {
            long j = sharedPreferences.getLong("onServerExpirationTime", -1);
            if (System.currentTimeMillis() > j) {
                "flag expired on: " + new Timestamp(j);
                return false;
            }
        }
        return z;
    }

    public static long m1992g(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 0).getLong("onServerLifeSpan", 604800000);
    }

    public static void m1993h(Context context) {
        "resetting backoff for " + context.getPackageName();
        C0313a.m1983a(context, 3000);
    }

    private static int m1994i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Coult not get package name: " + e);
        }
    }
}
