package com.google.analytics.tracking.android;

import android.content.Context;
import android.util.DisplayMetrics;

final class bc implements C0292n {
    private static bc f1618a;
    private static Object f1619b;
    private final Context f1620c;

    static {
        f1619b = new Object();
    }

    private bc(Context context) {
        this.f1620c = context;
    }

    public static bc m1883a() {
        bc bcVar;
        synchronized (f1619b) {
            bcVar = f1618a;
        }
        return bcVar;
    }

    public static void m1884a(Context context) {
        synchronized (f1619b) {
            if (f1618a == null) {
                f1618a = new bc(context);
            }
        }
    }

    public final String m1885a(String str) {
        if (str == null || !str.equals("&sr")) {
            return null;
        }
        DisplayMetrics displayMetrics = this.f1620c.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }
}
