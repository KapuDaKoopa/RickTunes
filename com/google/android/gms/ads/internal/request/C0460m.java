package com.google.android.gms.ads.internal.request;

import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rp;
import com.google.android.gms.p006b.su;

@op
/* renamed from: com.google.android.gms.ads.internal.request.m */
public abstract class C0460m implements C0452k, rp {
    private final su f2461a;
    private final C0452k f2462b;
    private final Object f2463c;

    public C0460m(su suVar, C0452k c0452k) {
        this.f2463c = new Object();
        this.f2461a = suVar;
        this.f2462b = c0452k;
    }

    public abstract void m2842a();

    public final void m2843a(AdResponseParcel adResponseParcel) {
        synchronized (this.f2463c) {
            this.f2462b.m2833a(adResponseParcel);
            m2842a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m2844a(com.google.android.gms.ads.internal.request.C0475w r5, com.google.android.gms.ads.internal.request.AdRequestInfoParcel r6) {
        /*
        r4 = this;
        r1 = 0;
        r0 = 1;
        r2 = new com.google.android.gms.ads.internal.request.t;	 Catch:{ RemoteException -> 0x000b, NullPointerException -> 0x0024, SecurityException -> 0x0032, Throwable -> 0x0040 }
        r2.<init>(r4);	 Catch:{ RemoteException -> 0x000b, NullPointerException -> 0x0024, SecurityException -> 0x0032, Throwable -> 0x0040 }
        r5.m2915a(r6, r2);	 Catch:{ RemoteException -> 0x000b, NullPointerException -> 0x0024, SecurityException -> 0x0032, Throwable -> 0x0040 }
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = move-exception;
        r3 = "Could not fetch ad response from ad request service.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r3, r2);
        r3 = com.google.android.gms.ads.internal.ar.m2243h();
        r3.m4367a(r2, r0);
    L_0x0018:
        r0 = r4.f2462b;
        r2 = new com.google.android.gms.ads.internal.request.AdResponseParcel;
        r2.<init>(r1);
        r0.m2833a(r2);
        r0 = r1;
        goto L_0x000a;
    L_0x0024:
        r2 = move-exception;
        r3 = "Could not fetch ad response from ad request service due to an Exception.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r3, r2);
        r3 = com.google.android.gms.ads.internal.ar.m2243h();
        r3.m4367a(r2, r0);
        goto L_0x0018;
    L_0x0032:
        r2 = move-exception;
        r3 = "Could not fetch ad response from ad request service due to an Exception.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r3, r2);
        r3 = com.google.android.gms.ads.internal.ar.m2243h();
        r3.m4367a(r2, r0);
        goto L_0x0018;
    L_0x0040:
        r2 = move-exception;
        r3 = "Could not fetch ad response from ad request service due to an Exception.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r3, r2);
        r3 = com.google.android.gms.ads.internal.ar.m2243h();
        r3.m4367a(r2, r0);
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.request.m.a(com.google.android.gms.ads.internal.request.w, com.google.android.gms.ads.internal.request.AdRequestInfoParcel):boolean");
    }

    public abstract C0475w m2845b();

    public final Void m2846c() {
        C0475w b = m2845b();
        if (b == null) {
            this.f2462b.m2833a(new AdResponseParcel(0));
            m2842a();
        } else {
            this.f2461a.m3882a(new C0461n(this, b), new C0462o(this));
        }
        return null;
    }

    public final void m2847d() {
        m2842a();
    }

    public /* synthetic */ Object m2848e() {
        return m2846c();
    }
}
