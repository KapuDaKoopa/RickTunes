package com.google.android.gms.p006b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.ax;

@op
/* renamed from: com.google.android.gms.b.se */
public final class se {
    public Handler f4088a;
    public int f4089b;
    public final Object f4090c;
    private HandlerThread f4091d;

    public se() {
        this.f4091d = null;
        this.f4088a = null;
        this.f4089b = 0;
        this.f4090c = new Object();
    }

    public final Looper m4523a() {
        Looper looper;
        synchronized (this.f4090c) {
            if (this.f4089b != 0) {
                ax.m5528a(this.f4091d, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f4091d == null) {
                qk.m4383a();
                this.f4091d = new HandlerThread("LooperProvider");
                this.f4091d.start();
                this.f4088a = new Handler(this.f4091d.getLooper());
                qk.m4383a();
            } else {
                qk.m4383a();
                this.f4090c.notifyAll();
            }
            this.f4089b++;
            looper = this.f4091d.getLooper();
        }
        return looper;
    }
}
