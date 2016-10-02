package com.google.android.gms.p006b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.qz */
final class qz implements Callable {
    final /* synthetic */ Runnable f4033a;

    qz(Runnable runnable) {
        this.f4033a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.f4033a.run();
        return null;
    }
}
