package com.google.tagmanager;

import android.os.Build.VERSION;

/* renamed from: com.google.tagmanager.x */
final class C0822x {
    public static int m5932a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            "Invalid version number: " + VERSION.SDK;
            C0824z.m5936a();
            return 0;
        }
    }
}
