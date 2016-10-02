package com.google.android.gms.p006b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.b.rc */
final class rc implements ThreadFactory {
    final /* synthetic */ String f4039a;
    private final AtomicInteger f4040b;

    rc(String str) {
        this.f4039a = str;
        this.f4040b = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f4039a + ") #" + this.f4040b.getAndIncrement());
    }
}
