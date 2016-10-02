package com.google.analytics.tracking.android;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.analytics.tracking.android.p */
public final class C0303p extends bi {
    private static C0303p f1655b;
    private static String f1656c;
    boolean f1657a;
    private final ap f1658d;
    private boolean f1659e;
    private boolean f1660f;
    private int f1661g;
    private long f1662h;
    private long f1663i;
    private Context f1664j;
    private final Map f1665k;
    private aw f1666l;
    private be f1667m;
    private C0288l f1668n;
    private Timer f1669o;
    private TimerTask f1670p;
    private boolean f1671q;

    private C0303p(Context context) {
        this(context, new ax(context), ap.m1817a(context), C0309w.m1950a());
    }

    private C0303p(Context context, aw awVar, ap apVar, be beVar) {
        super("easy_tracker", null, apVar);
        this.f1660f = false;
        this.f1661g = 0;
        this.f1665k = new HashMap();
        this.f1657a = false;
        this.f1671q = false;
        if (f1656c != null) {
            awVar.m1847d(f1656c);
        }
        this.f1658d = apVar;
        if (context == null) {
            as.m1827a("Context cannot be null");
        }
        this.f1664j = context.getApplicationContext();
        this.f1667m = beVar;
        this.f1666l = awVar;
        as.m1831c("Starting EasyTracker.");
        String a = this.f1666l.m1844a("ga_trackingId");
        if (TextUtils.isEmpty(a)) {
            a = this.f1666l.m1844a("ga_api_key");
        }
        m1909a("&tid", a);
        as.m1831c("[EasyTracker] trackingId loaded: " + a);
        a = this.f1666l.m1844a("ga_appName");
        if (!TextUtils.isEmpty(a)) {
            as.m1831c("[EasyTracker] app name loaded: " + a);
            m1909a("&an", a);
        }
        a = this.f1666l.m1844a("ga_appVersion");
        if (a != null) {
            as.m1831c("[EasyTracker] app version loaded: " + a);
            m1909a("&av", a);
        }
        a = this.f1666l.m1844a("ga_logLevel");
        if (a != null) {
            au a2 = C0303p.m1940a(a);
            if (a2 != null) {
                as.m1831c("[EasyTracker] log level loaded: " + a2);
                this.f1658d.m1825d().m1834a(a2);
            }
        }
        Double b = this.f1666l.m1845b("ga_sampleFrequency");
        if (b == null) {
            b = new Double((double) this.f1666l.m1843a("ga_sampleRate", 100));
        }
        if (b.doubleValue() != 100.0d) {
            m1909a("&sf", Double.toString(b.doubleValue()));
        }
        as.m1831c("[EasyTracker] sample rate loaded: " + b);
        int a3 = this.f1666l.m1843a("ga_dispatchPeriod", 1800);
        as.m1831c("[EasyTracker] dispatch period loaded: " + a3);
        this.f1667m.m1887a(a3);
        this.f1662h = (long) (this.f1666l.m1843a("ga_sessionTimeout", 30) * 1000);
        as.m1831c("[EasyTracker] session timeout loaded: " + this.f1662h);
        boolean z = this.f1666l.m1846c("ga_autoActivityTracking") || this.f1666l.m1846c("ga_auto_activity_tracking");
        this.f1660f = z;
        as.m1831c("[EasyTracker] auto activity tracking loaded: " + this.f1660f);
        z = this.f1666l.m1846c("ga_anonymizeIp");
        if (z) {
            m1909a("&aip", "1");
            as.m1831c("[EasyTracker] anonymize ip loaded: " + z);
        }
        this.f1659e = this.f1666l.m1846c("ga_reportUncaughtExceptions");
        if (this.f1659e) {
            Thread.setDefaultUncaughtExceptionHandler(new C0306t(this, this.f1667m, Thread.getDefaultUncaughtExceptionHandler(), this.f1664j));
            as.m1831c("[EasyTracker] report uncaught exceptions loaded: " + this.f1659e);
        }
        this.f1658d.m1821a(this.f1666l.m1846c("ga_dryRun"));
        this.f1668n = new C0304q(this);
    }

    private static au m1940a(String str) {
        try {
            return au.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static C0303p m1941a(Context context) {
        if (f1655b == null) {
            f1655b = new C0303p(context);
        }
        return f1655b;
    }

    private synchronized void m1942b() {
        if (this.f1669o != null) {
            this.f1669o.cancel();
            this.f1669o = null;
        }
    }

    public final void m1943a() {
        an.m1810a().m1811a(ao.EASY_TRACKER_ACTIVITY_STOP);
        this.f1661g--;
        this.f1661g = Math.max(0, this.f1661g);
        this.f1663i = this.f1668n.m1783a();
        if (this.f1661g == 0) {
            m1942b();
            this.f1670p = new C0305r();
            this.f1669o = new Timer("waitForActivityStart");
            this.f1669o.schedule(this.f1670p, 1000);
        }
    }

    public final void m1944a(Activity activity) {
        an.m1810a().m1811a(ao.EASY_TRACKER_ACTIVITY_START);
        m1942b();
        if (!this.f1657a && this.f1661g == 0) {
            boolean z = this.f1662h == 0 || (this.f1662h > 0 && this.f1668n.m1783a() > this.f1663i + this.f1662h);
            if (z) {
                this.f1671q = true;
            }
        }
        this.f1657a = true;
        this.f1661g++;
        if (this.f1660f) {
            String str;
            Map hashMap = new HashMap();
            hashMap.put("&t", "appview");
            an.m1810a().m1812a(true);
            String str2 = "&cd";
            String canonicalName = activity.getClass().getCanonicalName();
            if (this.f1665k.containsKey(canonicalName)) {
                str = (String) this.f1665k.get(canonicalName);
            } else {
                str = this.f1666l.m1844a(canonicalName);
                if (str == null) {
                    str = canonicalName;
                }
                this.f1665k.put(canonicalName, str);
            }
            m1909a(str2, str);
            m1945a(hashMap);
            an.m1810a().m1812a(false);
        }
    }

    public final void m1945a(Map map) {
        if (this.f1671q) {
            map.put("&sc", "start");
            this.f1671q = false;
        }
        super.m1910a(map);
    }
}
