package com.google.android.gms.p006b;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.b.xg */
public final class xg implements xf {
    private static xg f4328a;

    public static synchronized xf m4890d() {
        xf xfVar;
        synchronized (xg.class) {
            if (f4328a == null) {
                f4328a = new xg();
            }
            xfVar = f4328a;
        }
        return xfVar;
    }

    public final long m4891a() {
        return System.currentTimeMillis();
    }

    public final long m4892b() {
        return SystemClock.elapsedRealtime();
    }

    public final long m4893c() {
        return System.nanoTime();
    }
}
