package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.y */
public abstract class C0743y {
    private static final Object f4880a;
    private static C0743y f4881b;

    static {
        f4880a = new Object();
    }

    public static C0743y m5621a(Context context) {
        synchronized (f4880a) {
            if (f4881b == null) {
                f4881b = new C0744z(context.getApplicationContext());
            }
        }
        return f4881b;
    }

    public abstract void m5622a(String str, ServiceConnection serviceConnection);

    public abstract boolean m5623a(String str, ServiceConnection serviceConnection, String str2);
}
