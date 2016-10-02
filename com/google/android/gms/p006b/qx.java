package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@op
/* renamed from: com.google.android.gms.b.qx */
public final class qx {
    private static final ExecutorService f4030a;
    private static final ExecutorService f4031b;

    static {
        f4030a = Executors.newFixedThreadPool(10, qx.m4397a("Default"));
        f4031b = Executors.newFixedThreadPool(5, qx.m4397a("Loader"));
    }

    public static ss m4393a(int i, Runnable runnable) {
        return i == 1 ? qx.m4396a(f4031b, new qy(runnable)) : qx.m4396a(f4030a, new qz(runnable));
    }

    public static ss m4394a(Runnable runnable) {
        return qx.m4393a(0, runnable);
    }

    public static ss m4395a(Callable callable) {
        return qx.m4396a(f4030a, callable);
    }

    public static ss m4396a(ExecutorService executorService, Callable callable) {
        Object smVar = new sm();
        try {
            smVar.m3859b(new rb(smVar, executorService.submit(new ra(smVar, callable))));
        } catch (Throwable e) {
            C0501b.m3026a("Thread execution is rejected.", e);
            smVar.cancel(true);
        }
        return smVar;
    }

    private static ThreadFactory m4397a(String str) {
        return new rc(str);
    }
}
