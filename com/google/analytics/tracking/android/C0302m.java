package com.google.analytics.tracking.android;

import android.util.Log;

/* renamed from: com.google.analytics.tracking.android.m */
final class C0302m implements at {
    private au f1654a;

    C0302m() {
        this.f1654a = au.INFO;
    }

    private static String m1933e(String str) {
        return Thread.currentThread().toString() + ": " + str;
    }

    public final au m1934a() {
        return this.f1654a;
    }

    public final void m1935a(au auVar) {
        this.f1654a = auVar;
    }

    public final void m1936a(String str) {
        if (this.f1654a.ordinal() <= au.VERBOSE.ordinal()) {
            C0302m.m1933e(str);
        }
    }

    public final void m1937b(String str) {
        if (this.f1654a.ordinal() <= au.INFO.ordinal()) {
            C0302m.m1933e(str);
        }
    }

    public final void m1938c(String str) {
        if (this.f1654a.ordinal() <= au.WARNING.ordinal()) {
            Log.w("GAV3", C0302m.m1933e(str));
        }
    }

    public final void m1939d(String str) {
        if (this.f1654a.ordinal() <= au.ERROR.ordinal()) {
            C0302m.m1933e(str);
        }
    }
}
