package com.andromo.dev576782.app537736;

import android.content.Context;
import com.google.analytics.tracking.android.C0306t;
import com.google.analytics.tracking.android.C0309w;
import com.google.analytics.tracking.android.ap;
import com.google.analytics.tracking.android.av;
import com.google.analytics.tracking.android.bi;

public final class as {
    private static boolean f658a;
    private static boolean f659b;
    private Context f660c;
    private ap f661d;
    private bi f662e;

    static {
        f658a = false;
        f659b = true;
    }

    private as() {
    }

    public static as m1278a() {
        return at.f663a;
    }

    public static boolean m1279b() {
        return f659b;
    }

    public final void m1280a(Context context) {
        boolean z = true;
        boolean z2 = this.f660c == null;
        if (context != null && f658a) {
            this.f660c = context.getApplicationContext();
            this.f661d = ap.m1817a(context);
            this.f662e = this.f661d.m1819a("UA-39762320-1");
            this.f662e.m1909a("&aip", "1");
            this.f662e.m1909a("&av", "4.6.2");
        }
        if (z2 && this.f662e != null) {
            z2 = ap.m1817a(this.f660c).m1824c();
            Context context2 = this.f660c;
            if (z2) {
                z = false;
            }
            ao.m1270a(context2, z);
            C0309w.m1950a().m1956a(300);
            Thread.setDefaultUncaughtExceptionHandler(new C0306t(this.f662e, C0309w.m1950a(), Thread.getDefaultUncaughtExceptionHandler(), this.f660c));
        }
    }

    public final void m1281a(String str) {
        if (!f659b && this.f662e != null && f658a && !f659b) {
            this.f662e.m1909a("&cd", str);
            this.f662e.m1910a(av.m1840b().m1842a());
        }
    }

    public final void m1282a(String str, String str2, String str3, Long l) {
        if (this.f662e != null && f658a) {
            if (str3 == null) {
                str3 = "com.andromo.dev576782.app537736";
            }
            this.f662e.m1910a(av.m1839a(str, str2, str3, l).m1842a());
        }
    }

    public final void m1283a(boolean z) {
        if (this.f661d != null) {
            this.f661d.m1822b(z);
        }
    }

    public final void m1284c() {
        if (!f659b) {
            m1282a("", "", "", Long.valueOf(0));
        }
    }
}
