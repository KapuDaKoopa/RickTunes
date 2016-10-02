package com.google.android.gms.common.api.internal;

import com.google.android.gms.p006b.xp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class ao {
    private static final ExecutorService f4572a;

    static {
        f4572a = Executors.newFixedThreadPool(2, new xp("GAC_Executor"));
    }

    public static ExecutorService m5168a() {
        return f4572a;
    }
}
