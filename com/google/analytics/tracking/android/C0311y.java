package com.google.analytics.tracking.android;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.google.analytics.tracking.android.y */
final class C0311y implements Callback {
    final /* synthetic */ C0309w f1696a;

    C0311y(C0309w c0309w) {
        this.f1696a = c0309w;
    }

    public final boolean handleMessage(Message message) {
        if (1 == message.what && C0309w.f1680a.equals(message.obj)) {
            an.m1810a().m1812a(true);
            this.f1696a.m1961c();
            an.m1810a().m1812a(false);
            if (this.f1696a.f1685e > 0 && !this.f1696a.f1694n) {
                this.f1696a.f1692l.sendMessageDelayed(this.f1696a.f1692l.obtainMessage(1, C0309w.f1680a), (long) (this.f1696a.f1685e * 1000));
            }
        }
        return true;
    }
}
