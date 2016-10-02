package com.google.android.gms.p006b;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.b.mi */
public final class mi extends Thread {
    private final BlockingQueue f3645a;
    private final kn f3646b;
    private final aw f3647c;
    private final xj f3648d;
    private volatile boolean f3649e;

    public mi(BlockingQueue blockingQueue, kn knVar, aw awVar, xj xjVar) {
        this.f3649e = false;
        this.f3645a = blockingQueue;
        this.f3646b = knVar;
        this.f3647c = awVar;
        this.f3648d = xjVar;
    }

    public final void m4211a() {
        this.f3649e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                ue ueVar = (ue) this.f3645a.take();
                try {
                    ueVar.m3552a("network-queue-take");
                    if (ueVar.m3560g()) {
                        ueVar.m3555b("network-discard-cancelled");
                    } else {
                        if (VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(ueVar.m3556c());
                        }
                        pu a = this.f3646b.m4012a(ueVar);
                        ueVar.m3552a("network-http-complete");
                        if (a.f3919d && ueVar.m3565o()) {
                            ueVar.m3555b("not-modified");
                        } else {
                            wf a2 = ueVar.m3549a(a);
                            ueVar.m3552a("network-parse-complete");
                            if (ueVar.m3561k() && a2.f4311b != null) {
                                this.f3647c.m3490a(ueVar.m3558e(), a2.f4311b);
                                ueVar.m3552a("network-cache-written");
                            }
                            ueVar.m3564n();
                            this.f3648d.m3807a(ueVar, a2);
                        }
                    }
                } catch (xy e) {
                    e.m3412a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f3648d.m3809a(ueVar, ue.m3541a(e));
                } catch (Throwable e2) {
                    yh.m4918d("Unhandled exception %s", e2.toString());
                    xy xyVar = new xy(e2);
                    xyVar.m3412a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f3648d.m3809a(ueVar, xyVar);
                }
            } catch (InterruptedException e3) {
                if (this.f3649e) {
                    return;
                }
            }
        }
    }
}
