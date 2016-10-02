package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.qg */
public final class qg {
    public final Object f4006a;
    public int f4007b;
    public int f4008c;
    public final qd f4009d;
    public final String f4010e;

    private qg(qd qdVar, String str) {
        this.f4006a = new Object();
        this.f4009d = qdVar;
        this.f4010e = str;
    }

    public qg(String str) {
        this(ar.m2243h(), str);
    }

    public final Bundle m4380a() {
        Bundle bundle;
        synchronized (this.f4006a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f4007b);
            bundle.putInt("pmnll", this.f4008c);
        }
        return bundle;
    }
}
