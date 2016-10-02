package com.google.android.gms.p006b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.qy */
final class qy implements Callable {
    final /* synthetic */ Runnable f4032a;

    qy(Runnable runnable) {
        this.f4032a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.f4032a.run();
        return null;
    }
}
