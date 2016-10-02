package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.C0488k;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.p006b.eq;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.client.z */
public final class C0374z {
    private static final Object f2034a;
    private static C0374z f2035b;
    private final C0500a f2036c;
    private final C0367r f2037d;
    private final C0373x f2038e;
    private final C0354f f2039f;
    private final eq f2040g;
    private final C0488k f2041h;

    static {
        f2034a = new Object();
        C0374z c0374z = new C0374z();
        synchronized (f2034a) {
            f2035b = c0374z;
        }
    }

    protected C0374z() {
        this.f2036c = new C0500a();
        this.f2037d = new C0367r();
        this.f2038e = new C0373x();
        this.f2039f = new C0354f();
        this.f2040g = new eq();
        this.f2041h = new C0488k();
    }

    public static C0500a m2455a() {
        return C0374z.m2459e().f2036c;
    }

    public static C0367r m2456b() {
        return C0374z.m2459e().f2037d;
    }

    public static C0373x m2457c() {
        return C0374z.m2459e().f2038e;
    }

    public static eq m2458d() {
        return C0374z.m2459e().f2040g;
    }

    private static C0374z m2459e() {
        C0374z c0374z;
        synchronized (f2034a) {
            c0374z = f2035b;
        }
        return c0374z;
    }
}
