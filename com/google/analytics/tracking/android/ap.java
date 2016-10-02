package com.google.analytics.tracking.android;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ap extends bj {
    private static ap f1580h;
    private boolean f1581a;
    private C0289h f1582b;
    private Context f1583c;
    private bi f1584d;
    private volatile Boolean f1585e;
    private final Map f1586f;
    private at f1587g;

    private ap(Context context) {
        this(context, ai.m1791a(context));
    }

    private ap(Context context, C0289h c0289h) {
        this.f1585e = Boolean.valueOf(false);
        this.f1586f = new HashMap();
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.f1583c = context.getApplicationContext();
        this.f1582b = c0289h;
        C0299i.m1922a(this.f1583c);
        bc.m1884a(this.f1583c);
        C0300j.m1927a(this.f1583c);
        this.f1587g = new C0302m();
    }

    static ap m1816a() {
        ap apVar;
        synchronized (ap.class) {
            apVar = f1580h;
        }
        return apVar;
    }

    public static ap m1817a(Context context) {
        ap apVar;
        synchronized (ap.class) {
            if (f1580h == null) {
                f1580h = new ap(context);
            }
            apVar = f1580h;
        }
        return apVar;
    }

    private bi m1818a(String str, String str2) {
        bi biVar;
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Tracker name cannot be empty");
            }
            biVar = (bi) this.f1586f.get(str);
            if (biVar == null) {
                biVar = new bi(str, str2, this);
                this.f1586f.put(str, biVar);
                if (this.f1584d == null) {
                    this.f1584d = biVar;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                biVar.m1909a("&tid", str2);
            }
            an.m1810a().m1811a(ao.GET_TRACKER);
        }
        return biVar;
    }

    public final bi m1819a(String str) {
        return m1818a(str, str);
    }

    final void m1820a(Map map) {
        synchronized (this) {
            if (map == null) {
                throw new IllegalArgumentException("hit cannot be null");
            }
            bk.m1913a(map, "&ul", bk.m1911a(Locale.getDefault()));
            bk.m1913a(map, "&sr", bc.m1883a().m1885a("&sr"));
            map.put("&_u", an.m1810a().m1814c());
            an.m1810a().m1813b();
            this.f1582b.m1786a(map);
        }
    }

    public final void m1821a(boolean z) {
        an.m1810a().m1811a(ao.SET_DRY_RUN);
        this.f1581a = z;
    }

    public final void m1822b(boolean z) {
        an.m1810a().m1811a(ao.SET_APP_OPT_OUT);
        this.f1585e = Boolean.valueOf(z);
        if (this.f1585e.booleanValue()) {
            this.f1582b.m1787b();
        }
    }

    public final boolean m1823b() {
        an.m1810a().m1811a(ao.GET_DRY_RUN);
        return this.f1581a;
    }

    public final boolean m1824c() {
        an.m1810a().m1811a(ao.GET_APP_OPT_OUT);
        return this.f1585e.booleanValue();
    }

    public final at m1825d() {
        return this.f1587g;
    }
}
