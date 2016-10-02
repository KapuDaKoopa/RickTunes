package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.vs */
final class vs {
    private int f4300a;

    private vs() {
        this.f4300a = 0;
    }

    public final synchronized void m4830a() {
        this.f4300a++;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m4831a(java.util.concurrent.TimeUnit r7) {
        /*
        r6 = this;
        r2 = java.lang.System.currentTimeMillis();
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r4 = 100;
        r0 = r0.convert(r4, r7);
        monitor-enter(r6);
    L_0x000d:
        r4 = r6.f4300a;	 Catch:{ all -> 0x0027 }
        if (r4 != 0) goto L_0x0014;
    L_0x0011:
        r0 = 1;
        monitor-exit(r6);	 Catch:{ all -> 0x0027 }
    L_0x0013:
        return r0;
    L_0x0014:
        r4 = 0;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x001d;
    L_0x001a:
        r0 = 0;
        monitor-exit(r6);
        goto L_0x0013;
    L_0x001d:
        r6.wait(r0);	 Catch:{ all -> 0x0027 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0027 }
        r4 = r4 - r2;
        r0 = r0 - r4;
        goto L_0x000d;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0027 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.vs.a(java.util.concurrent.TimeUnit):boolean");
    }

    public final synchronized void m4832b() {
        if (this.f4300a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.f4300a--;
        if (this.f4300a == 0) {
            notifyAll();
        }
    }
}
