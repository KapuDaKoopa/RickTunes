package com.google.android.gms.p006b;

import android.content.SharedPreferences;

@op
/* renamed from: com.google.android.gms.b.ci */
public final class ci {
    final Object f3031a;
    boolean f3032b;
    SharedPreferences f3033c;

    public ci() {
        this.f3031a = new Object();
        this.f3032b = false;
        this.f3033c = null;
    }

    public final Object m3580a(cb cbVar) {
        synchronized (this.f3031a) {
            if (this.f3032b) {
                return sk.m4527a(new cj(this, cbVar));
            }
            Object obj = cbVar.f3026b;
            return obj;
        }
    }
}
