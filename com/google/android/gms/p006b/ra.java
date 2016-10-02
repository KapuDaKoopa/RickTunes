package com.google.android.gms.p006b;

import android.os.Process;
import com.google.android.gms.ads.internal.ar;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.ra */
final class ra implements Runnable {
    final /* synthetic */ sm f4035a;
    final /* synthetic */ Callable f4036b;

    ra(sm smVar, Callable callable) {
        this.f4035a = smVar;
        this.f4036b = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.f4035a.m3858b(this.f4036b.call());
        } catch (Throwable e) {
            ar.m2243h().m4367a(e, true);
            this.f4035a.cancel(true);
        }
    }
}
