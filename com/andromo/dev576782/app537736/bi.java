package com.andromo.dev576782.app537736;

final /* synthetic */ class bi {
    static final /* synthetic */ int[] f745a;
    static final /* synthetic */ int[] f746b;
    static final /* synthetic */ int[] f747c;
    static final /* synthetic */ int[] f748d;

    static {
        f748d = new int[hd.values().length];
        try {
            f748d[hd.SEQUENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f748d[hd.SHUFFLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        f747c = new int[hj.values().length];
        try {
            f747c[hj.ERROR_SAVING.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f747c[hj.ERROR_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f747c[hj.ERROR_EXPANDING.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        f746b = new int[ct.values().length];
        try {
            f746b[ct.Preparing.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f746b[ct.Stopped.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f746b[ct.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f746b[ct.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
        }
        f745a = new int[he.values().length];
        try {
            f745a[he.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f745a[he.ONE_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f745a[he.ALL_TRACKS.ordinal()] = 3;
        } catch (NoSuchFieldError e12) {
        }
    }
}
