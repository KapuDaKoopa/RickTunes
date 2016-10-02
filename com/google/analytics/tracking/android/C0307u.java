package com.google.analytics.tracking.android;

import android.os.Build.VERSION;

/* renamed from: com.google.analytics.tracking.android.u */
final class C0307u {
    public static int m1947a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            as.m1827a("Invalid version number: " + VERSION.SDK);
            return 0;
        }
    }
}
