package com.google.android.gms.p006b;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.b.rb */
final class rb implements Runnable {
    final /* synthetic */ sm f4037a;
    final /* synthetic */ Future f4038b;

    rb(sm smVar, Future future) {
        this.f4037a = smVar;
        this.f4038b = future;
    }

    public final void run() {
        if (this.f4037a.isCancelled()) {
            this.f4038b.cancel(true);
        }
    }
}
