package com.google.android.gms.p006b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.hr */
public final class hr implements xj {
    private final Executor f3342a;

    public hr(Handler handler) {
        this.f3342a = new hs(this, handler);
    }

    public final void m3810a(ue ueVar, wf wfVar) {
        m3811a(ueVar, wfVar, null);
    }

    public final void m3811a(ue ueVar, wf wfVar, Runnable runnable) {
        ueVar.m3564n();
        ueVar.m3552a("post-response");
        this.f3342a.execute(new ht(this, ueVar, wfVar, runnable));
    }

    public final void m3812a(ue ueVar, xy xyVar) {
        ueVar.m3552a("post-error");
        this.f3342a.execute(new ht(this, ueVar, new wf(xyVar), null));
    }
}
