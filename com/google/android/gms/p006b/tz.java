package com.google.android.gms.p006b;

import android.webkit.ConsoleMessage.MessageLevel;

/* renamed from: com.google.android.gms.b.tz */
final /* synthetic */ class tz {
    static final /* synthetic */ int[] f4202a;

    static {
        f4202a = new int[MessageLevel.values().length];
        try {
            f4202a[MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f4202a[MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f4202a[MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f4202a[MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f4202a[MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
