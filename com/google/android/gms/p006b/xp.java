package com.google.android.gms.p006b;

import com.google.android.gms.common.internal.ax;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.b.xp */
public final class xp implements ThreadFactory {
    private final String f4332a;
    private final int f4333b;
    private final AtomicInteger f4334c;
    private final ThreadFactory f4335d;

    public xp(String str) {
        this(str, (byte) 0);
    }

    private xp(String str, byte b) {
        this.f4334c = new AtomicInteger();
        this.f4335d = Executors.defaultThreadFactory();
        this.f4332a = (String) ax.m5528a((Object) str, (Object) "Name must not be null");
        this.f4333b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4335d.newThread(new xq(runnable, this.f4333b));
        newThread.setName(this.f4332a + "[" + this.f4334c.getAndIncrement() + "]");
        return newThread;
    }
}
