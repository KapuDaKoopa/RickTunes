package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.p006b.xw;

/* renamed from: com.google.android.gms.flags.impl.j */
public final class C0782j {
    private static SharedPreferences f5002a;

    static {
        f5002a = null;
    }

    public static SharedPreferences m5746a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f5002a == null) {
                f5002a = (SharedPreferences) xw.m4902a(new C0783k(context));
            }
            sharedPreferences = f5002a;
        }
        return sharedPreferences;
    }
}
