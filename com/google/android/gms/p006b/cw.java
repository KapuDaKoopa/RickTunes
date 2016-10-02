package com.google.android.gms.p006b;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.b.cw */
public final class cw extends Thread {
    private static final boolean f3110a;
    private final BlockingQueue f3111b;
    private final BlockingQueue f3112c;
    private final aw f3113d;
    private final xj f3114e;
    private volatile boolean f3115f;

    static {
        f3110a = yh.f4366b;
    }

    public cw(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, aw awVar, xj xjVar) {
        this.f3115f = false;
        this.f3111b = blockingQueue;
        this.f3112c = blockingQueue2;
        this.f3113d = awVar;
        this.f3114e = xjVar;
    }

    public final void m3597a() {
        this.f3115f = true;
        interrupt();
    }

    public final void run() {
        if (f3110a) {
            yh.m4915a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3113d.m3489a();
        while (true) {
            try {
                ue ueVar = (ue) this.f3111b.take();
                ueVar.m3552a("cache-queue-take");
                if (ueVar.m3560g()) {
                    ueVar.m3555b("cache-discard-canceled");
                } else {
                    ax a = this.f3113d.m3488a(ueVar.m3558e());
                    if (a == null) {
                        ueVar.m3552a("cache-miss");
                        this.f3112c.put(ueVar);
                    } else {
                        if ((a.f2939e < System.currentTimeMillis() ? 1 : 0) != 0) {
                            ueVar.m3552a("cache-hit-expired");
                            ueVar.m3547a(a);
                            this.f3112c.put(ueVar);
                        } else {
                            ueVar.m3552a("cache-hit");
                            wf a2 = ueVar.m3549a(new pu(a.f2935a, a.f2941g));
                            ueVar.m3552a("cache-hit-parsed");
                            if ((a.f2940f < System.currentTimeMillis() ? 1 : 0) == 0) {
                                this.f3114e.m3807a(ueVar, a2);
                            } else {
                                ueVar.m3552a("cache-hit-refresh-needed");
                                ueVar.m3547a(a);
                                a2.f4313d = true;
                                this.f3114e.m3808a(ueVar, a2, new cx(this, ueVar));
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f3115f) {
                    return;
                }
            }
        }
    }
}
