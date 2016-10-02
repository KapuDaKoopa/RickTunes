package com.google.android.gms.p006b;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.xw */
public final class xw {
    public static Object m4902a(Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        Object call;
        try {
            StrictMode.setThreadPolicy(ThreadPolicy.LAX);
            call = callable.call();
            return call;
        } catch (Throwable th) {
            call = th;
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
