package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.client.C0353e;
import com.google.android.gms.ads.internal.client.C0365p;
import com.google.android.gms.ads.internal.reward.client.C0489l;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.p007b.C0243b;

/* renamed from: com.google.android.gms.ads.h */
public final class C0341h {
    private final C0353e f1767a;

    public C0341h(Context context) {
        this.f1767a = new C0353e(context);
    }

    public final void m2069a() {
        C0353e c0353e = this.f1767a;
        try {
            c0353e.m2379a("show");
            c0353e.f1993f.m2131f();
        } catch (Throwable e) {
            C0501b.m3026a("Failed to show interstitial.", e);
        }
    }

    public final void m2070a(C0259a c0259a) {
        C0353e c0353e = this.f1767a;
        try {
            c0353e.f1991d = c0259a;
            if (c0353e.f1993f != null) {
                c0353e.f1993f.m2118a(c0259a != null ? new C0365p(c0259a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdListener.", e);
        }
        if (c0259a != null && (c0259a instanceof C0260a)) {
            this.f1767a.m2378a((C0260a) c0259a);
        } else if (c0259a == null) {
            this.f1767a.m2378a(null);
        }
    }

    public final void m2071a(C0243b c0243b) {
        C0353e c0353e = this.f1767a;
        try {
            c0353e.f2001n = c0243b;
            if (c0353e.f1993f != null) {
                c0353e.f1993f.m2121a(c0243b != null ? new C0489l(c0243b) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdListener.", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.RequiresPermission("android.permission.INTERNET")
    public final void m2072a(com.google.android.gms.ads.C0328d r9) {
        /*
        r8 = this;
        r6 = r8.f1767a;
        r7 = r9.m2040a();
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 != 0) goto L_0x00d3;
    L_0x000a:
        r0 = "loadAd";
        r1 = r6.f1994g;	 Catch:{ RemoteException -> 0x00f4 }
        if (r1 != 0) goto L_0x0013;
    L_0x0010:
        r6.m2379a(r0);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0013:
        r0 = r6.f2003p;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00ed;
    L_0x0017:
        r2 = com.google.android.gms.ads.internal.client.AdSizeParcel.m2274b();	 Catch:{ RemoteException -> 0x00f4 }
    L_0x001b:
        r0 = com.google.android.gms.ads.internal.client.C0374z.m2456b();	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r6.f1989b;	 Catch:{ RemoteException -> 0x00f4 }
        r3 = r6.f1994g;	 Catch:{ RemoteException -> 0x00f4 }
        r4 = r6.f1988a;	 Catch:{ RemoteException -> 0x00f4 }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ RemoteException -> 0x00f4 }
        r5 = com.google.android.gms.ads.internal.util.client.C0500a.m3021b(r1);	 Catch:{ RemoteException -> 0x00f4 }
        if (r5 == 0) goto L_0x0035;
    L_0x002e:
        r5 = 2;
        r0 = r0.m2440a(r1, r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 != 0) goto L_0x0047;
    L_0x0035:
        r0 = "Using InterstitialAdManager from the client jar.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);	 Catch:{ RemoteException -> 0x00f4 }
        r5 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel;	 Catch:{ RemoteException -> 0x00f4 }
        r5.<init>();	 Catch:{ RemoteException -> 0x00f4 }
        r0 = com.google.android.gms.ads.internal.client.C0374z.m2457c();	 Catch:{ RemoteException -> 0x00f4 }
        r0 = r0.m2453b(r1, r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0047:
        r6.f1993f = r0;	 Catch:{ RemoteException -> 0x00f4 }
        r0 = r6.f1991d;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x0059;
    L_0x004d:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.ads.internal.client.p;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1991d;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2118a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0059:
        r0 = r6.f1992e;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x0069;
    L_0x005d:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.ads.internal.client.o;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1992e;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2117a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0069:
        r0 = r6.f1996i;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x0079;
    L_0x006d:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.ads.internal.client.w;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1996i;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2119a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0079:
        r0 = r6.f1998k;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x0089;
    L_0x007d:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.b.nf;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1998k;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2123a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x0089:
        r0 = r6.f1997j;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x009b;
    L_0x008d:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.b.nk;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1997j;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1995h;	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2124a(r1, r2);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x009b:
        r0 = r6.f1999l;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00ab;
    L_0x009f:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.b.di;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f1999l;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2122a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x00ab:
        r0 = r6.f2000m;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00b8;
    L_0x00af:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r6.f2000m;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r1.f1766a;	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2120a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x00b8:
        r0 = r6.f2001n;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00c8;
    L_0x00bc:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = new com.google.android.gms.ads.internal.reward.client.l;	 Catch:{ RemoteException -> 0x00f4 }
        r2 = r6.f2001n;	 Catch:{ RemoteException -> 0x00f4 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2121a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x00c8:
        r0 = r6.f2002o;	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00d3;
    L_0x00cc:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r6.f2002o;	 Catch:{ RemoteException -> 0x00f4 }
        r0.m2125a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x00d3:
        r0 = r6.f1993f;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r6.f1990c;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r6.f1989b;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = com.google.android.gms.ads.internal.client.C0370u.m2444a(r1, r7);	 Catch:{ RemoteException -> 0x00f4 }
        r0 = r0.m2127a(r1);	 Catch:{ RemoteException -> 0x00f4 }
        if (r0 == 0) goto L_0x00ec;
    L_0x00e3:
        r0 = r6.f1988a;	 Catch:{ RemoteException -> 0x00f4 }
        r1 = r7.m2359j();	 Catch:{ RemoteException -> 0x00f4 }
        r0.m3960a(r1);	 Catch:{ RemoteException -> 0x00f4 }
    L_0x00ec:
        return;
    L_0x00ed:
        r2 = new com.google.android.gms.ads.internal.client.AdSizeParcel;	 Catch:{ RemoteException -> 0x00f4 }
        r2.<init>();	 Catch:{ RemoteException -> 0x00f4 }
        goto L_0x001b;
    L_0x00f4:
        r0 = move-exception;
        r1 = "Failed to load ad.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.h.a(com.google.android.gms.ads.d):void");
    }

    public final void m2073a(String str) {
        C0353e c0353e = this.f1767a;
        if (c0353e.f1994g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        c0353e.f1994g = str;
    }

    public final void m2074b() {
        this.f1767a.f2003p = true;
    }

    public final void m2075b(String str) {
        C0353e c0353e = this.f1767a;
        try {
            c0353e.f2002o = str;
            if (c0353e.f1993f != null) {
                c0353e.f1993f.m2125a(str);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdListener.", e);
        }
    }
}
