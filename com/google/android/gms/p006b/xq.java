package com.google.android.gms.p006b;

import android.os.Process;

/* renamed from: com.google.android.gms.b.xq */
final class xq implements Runnable {
    private final Runnable f4336a;
    private final int f4337b;

    public xq(Runnable runnable, int i) {
        this.f4336a = runnable;
        this.f4337b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f4337b);
        this.f4336a.run();
    }
}
