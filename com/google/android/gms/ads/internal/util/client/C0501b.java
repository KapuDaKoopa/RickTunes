package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.util.client.b */
public class C0501b {
    public static void m3025a(String str) {
        if (C0501b.m3027a(5)) {
            Log.w("Ads", str);
        }
    }

    public static void m3026a(String str, Throwable th) {
        if (C0501b.m3027a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static boolean m3027a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
