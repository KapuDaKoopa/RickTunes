package com.google.android.gms.p006b;

import android.content.Context;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.rw */
public final class rw {
    public static final sa f4074a;
    private static ux f4075b;
    private static final Object f4076c;

    static {
        f4076c = new Object();
        f4074a = new rx();
    }

    public rw(Context context) {
        f4075b = rw.m4509a(context);
    }

    private static ux m4509a(Context context) {
        ux uxVar;
        synchronized (f4076c) {
            if (f4075b == null) {
                f4075b = C0618d.m3608a(context.getApplicationContext());
            }
            uxVar = f4075b;
        }
        return uxVar;
    }

    public final ss m4510a(String str, sa saVar) {
        Object sdVar = new sd();
        f4075b.m4764a(new sb(str, saVar, sdVar));
        return sdVar;
    }

    public final ss m4511a(String str, Map map) {
        Object sdVar = new sd();
        f4075b.m4764a(new rz(this, str, sdVar, new ry(this, str, sdVar), map));
        return sdVar;
    }
}
