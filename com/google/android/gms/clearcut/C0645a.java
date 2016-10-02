package com.google.android.gms.clearcut;

import android.content.Context;

/* renamed from: com.google.android.gms.clearcut.a */
public final class C0645a {
    public static final C0645a f4468a;
    private static int f4469b;

    static {
        f4469b = -1;
        f4468a = new C0645a();
    }

    protected C0645a() {
    }

    public static int m5032a(Context context) {
        if (f4469b < 0) {
            f4469b = context.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
        }
        return f4469b;
    }
}
