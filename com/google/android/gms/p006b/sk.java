package com.google.android.gms.p006b;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.concurrent.Callable;

@op
/* renamed from: com.google.android.gms.b.sk */
public final class sk {
    public static Object m4527a(Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        Object call;
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            call = callable.call();
            return call;
        } catch (Throwable th) {
            call = th;
            C0501b.m3027a(6);
            ar.m2243h().m4367a((Throwable) call, true);
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
