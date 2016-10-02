package com.google.analytics.tracking.android;

import java.util.TimerTask;

final class ae extends TimerTask {
    final /* synthetic */ C0312z f1503a;

    private ae(C0312z c0312z) {
        this.f1503a = c0312z;
    }

    public final void run() {
        if (this.f1503a.f1698b == ad.CONNECTED_SERVICE && this.f1503a.f1699c.isEmpty() && this.f1503a.f1697a + this.f1503a.f1702f < this.f1503a.f1701e.m1783a()) {
            as.m1831c("Disconnecting due to inactivity");
            this.f1503a.m1979j();
            return;
        }
        this.f1503a.f1700d.schedule(new ae(this.f1503a), this.f1503a.f1702f);
    }
}
