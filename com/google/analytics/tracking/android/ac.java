package com.google.analytics.tracking.android;

final /* synthetic */ class ac {
    static final /* synthetic */ int[] f1494a;

    static {
        f1494a = new int[ad.values().length];
        try {
            f1494a[ad.CONNECTED_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1494a[ad.CONNECTED_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1494a[ad.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1494a[ad.PENDING_CONNECTION.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1494a[ad.PENDING_DISCONNECT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1494a[ad.DISCONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
