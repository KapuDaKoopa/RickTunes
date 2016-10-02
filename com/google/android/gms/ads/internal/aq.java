package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class aq {
    final Handler f1819a;

    public aq(Handler handler) {
        this.f1819a = handler;
    }

    public final void m2235a(Runnable runnable) {
        this.f1819a.removeCallbacks(runnable);
    }
}
