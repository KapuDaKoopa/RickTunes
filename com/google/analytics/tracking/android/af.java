package com.google.analytics.tracking.android;

import java.util.TimerTask;

final class af extends TimerTask {
    final /* synthetic */ C0312z f1504a;

    private af(C0312z c0312z) {
        this.f1504a = c0312z;
    }

    public final void run() {
        if (this.f1504a.f1698b == ad.CONNECTING) {
            this.f1504a.m1977h();
        }
    }
}
