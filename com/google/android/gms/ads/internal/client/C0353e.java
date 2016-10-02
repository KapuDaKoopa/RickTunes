package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.C0259a;
import com.google.android.gms.ads.C0340g;
import com.google.android.gms.ads.doubleclick.C0329a;
import com.google.android.gms.ads.doubleclick.C0330b;
import com.google.android.gms.ads.doubleclick.C0331c;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.p007b.C0243b;
import com.google.android.gms.ads.purchase.C0522a;
import com.google.android.gms.ads.purchase.C0523b;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.client.e */
public final class C0353e {
    public final kd f1988a;
    public final Context f1989b;
    public final C0370u f1990c;
    public C0259a f1991d;
    public C0260a f1992e;
    public aq f1993f;
    public String f1994g;
    public String f1995h;
    public C0329a f1996i;
    public C0523b f1997j;
    public C0522a f1998k;
    public C0330b f1999l;
    public C0340g f2000m;
    public C0243b f2001n;
    public String f2002o;
    public boolean f2003p;
    private C0331c f2004q;

    public C0353e(Context context) {
        this(context, C0370u.m2445a());
    }

    private C0353e(Context context, C0370u c0370u) {
        this.f1988a = new kd();
        this.f1989b = context;
        this.f1990c = c0370u;
        this.f2004q = null;
    }

    public final void m2378a(C0260a c0260a) {
        try {
            this.f1992e = c0260a;
            if (this.f1993f != null) {
                this.f1993f.m2117a(c0260a != null ? new C0364o(c0260a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdClickListener.", e);
        }
    }

    public final void m2379a(String str) {
        if (this.f1993f == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }
}
