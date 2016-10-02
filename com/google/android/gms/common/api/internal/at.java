package com.google.android.gms.common.api.internal;

import com.google.android.gms.p006b.xp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class at {
    private static final ExecutorService f4574a;

    static {
        f4574a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new xp("GAC_Transform"));
    }

    public static ExecutorService m5172a() {
        return f4574a;
    }
}
