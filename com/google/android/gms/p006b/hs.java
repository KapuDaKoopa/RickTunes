package com.google.android.gms.p006b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.hs */
final class hs implements Executor {
    final /* synthetic */ Handler f3343a;
    final /* synthetic */ hr f3344b;

    hs(hr hrVar, Handler handler) {
        this.f3344b = hrVar;
        this.f3343a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f3343a.post(runnable);
    }
}
