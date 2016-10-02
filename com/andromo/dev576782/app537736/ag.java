package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.IntentFilter;
import android.util.Log;
import android.view.ViewGroup;
import com.andromo.dev576782.app537736.InterstitialHelperBase.AudioServiceReceiver;

public final class ag {
    private static ii f636a;
    private static au f637b;
    private static ij f638c;
    private static av f639d;
    private static InterstitialHelperBase f640e;
    private static int f641f;
    private static Activity f642g;
    private static boolean f643h;

    static {
        f636a = new ii();
        f637b = new au();
        f638c = new ij();
        f639d = new av();
    }

    static void m1223a() {
        ij ijVar = f638c;
        ij.m1601a();
        av avVar = f639d;
        av.m1293a();
        ii iiVar = f636a;
        ii.m1600e();
        au auVar = f637b;
        au.m1290f();
    }

    static void m1224a(Activity activity) {
        "onActivityCreated: " + activity;
        "Setting mActivity: " + activity + ", was: " + f642g;
        f642g = activity;
        m1236h(activity);
    }

    public static boolean m1225a(Activity activity, ViewGroup viewGroup) {
        ii iiVar = f636a;
        ii.m1596a(false);
        ae aeVar = ae.NONE;
        ii iiVar2 = f636a;
        ii.m1596a(false);
        cu c = m1229c();
        return c != null ? c.m1217a(activity, viewGroup, aeVar) : false;
    }

    public static boolean m1226a(Activity activity, ViewGroup viewGroup, ae aeVar) {
        ii iiVar = f636a;
        ii.m1596a(true);
        cu c = m1229c();
        return c != null ? c.m1217a(activity, viewGroup, aeVar) : false;
    }

    static void m1227b(Activity activity) {
        "onActivityStarted: " + activity;
        au auVar = f637b;
        au.m1286b();
        ii iiVar = f636a;
        ii.m1594a();
        "activity " + (activity == f642g ? "matches mActivity" : "does not match mActivity");
        "mInterstitialInitialized: " + f643h;
        if (!(activity == f642g && f643h)) {
            "Setting mActivity: " + activity + ", was: " + f642g;
            f642g = activity;
            m1236h(activity);
        }
        if (!(activity == f642g || f643h)) {
            "Setting mActivity: " + activity + ", was: " + f642g;
            f642g = activity;
            m1236h(activity);
        }
        if (f642g == activity && f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
            if (InterstitialHelperBase.f581b && InterstitialHelperBase.f582c == null) {
                IntentFilter intentFilter = new IntentFilter("com.andromo.dev576782.app537736.broadcast.STATE_CHANGED");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                InterstitialHelperBase.f582c = new AudioServiceReceiver();
                activity.registerReceiver(InterstitialHelperBase.f582c, intentFilter);
            }
        }
    }

    static boolean m1228b() {
        return false;
    }

    private static cu m1229c() {
        cu a = f637b.m1292a();
        as.m1278a().m1282a("Banner Ad Opportunity", "com.andromo.dev576782.app537736", "Andromo", null);
        return a;
    }

    static void m1230c(Activity activity) {
        au auVar = f637b;
        au.m1287c();
        ii iiVar = f636a;
        ii.m1597b();
        if (f642g == activity && f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
            if (InterstitialHelperBase.f582c != null) {
                try {
                    activity.unregisterReceiver(InterstitialHelperBase.f582c);
                } catch (IllegalArgumentException e) {
                    "IllegalArgumentException calling unRegisterReceiver: " + e.getMessage();
                    e.printStackTrace();
                }
                InterstitialHelperBase.f582c = null;
            }
        }
    }

    private static void m1231d() {
        f641f = 0;
        f643h = false;
        f640e = null;
        "SELECTED: " + (f640e != null ? f640e.getClass().getSimpleName() : "(null)");
        if (f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
            f643h = false;
            f640e = null;
        }
    }

    static void m1232d(Activity activity) {
        au auVar = f637b;
        au.m1288d();
        ii iiVar = f636a;
        ii.m1598c();
        if (f642g == activity && f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
        }
    }

    static void m1233e(Activity activity) {
        au auVar = f637b;
        au.m1289e();
        ii iiVar = f636a;
        ii.m1599d();
        if (f642g == activity && f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
        }
    }

    static void m1234f(Activity activity) {
        au auVar = f637b;
        au.m1285a(activity);
        ii iiVar = f636a;
        ii.m1595a(activity);
        if (f642g == activity) {
            if (f640e != null) {
                InterstitialHelperBase interstitialHelperBase = f640e;
            }
            "Setting mActivity: null, was: " + f642g;
            f642g = null;
        }
    }

    static void m1235g(Activity activity) {
        if (f642g == activity && f640e != null) {
            InterstitialHelperBase interstitialHelperBase = f640e;
        }
    }

    private static void m1236h(Activity activity) {
        f643h = false;
        if (f640e == null) {
            Log.w("AdManager", "initializeInterstitial called without any ad network selected, calling selectNextInterstitialNetwork()...");
            m1231d();
        }
        if (f640e != null) {
            boolean z = activity.getSharedPreferences("com.andromo.dev576782.app537736.interstitial", 0).getLong("interstitialAdExpiration", -1) - System.currentTimeMillis() < 300000;
            "isTimeToInitialize based on time: " + z;
            if (z) {
                InterstitialHelperBase interstitialHelperBase = f640e;
                "Ready to initialize, calling " + f640e.getClass().getSimpleName() + ".initializeInterstitial()";
                interstitialHelperBase = f640e;
                Log.w("AdManager", "Initialize failed, calling selectNextInterstitialNetwork");
                m1231d();
                if (f640e != null) {
                    "Second time's the charm, calling " + f640e.getClass().getSimpleName() + ".initializeInterstitial()";
                    interstitialHelperBase = f640e;
                }
                f643h = false;
            }
        }
    }
}
