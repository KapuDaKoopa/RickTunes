package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.client.C0352d;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.purchase.C0522a;
import com.google.android.gms.p006b.nf;

class BaseAdView extends ViewGroup {
    private final C0352d f1724a;

    public BaseAdView(Context context) {
        super(context);
        this.f1724a = new C0352d(this, m2001a(1));
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1724a = new C0352d(this, attributeSet, m2001a(i), (byte) 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f1724a = new C0352d(this, attributeSet, m2001a(i2), (byte) 0);
    }

    private static boolean m2001a(int i) {
        return i == 2;
    }

    public void m2002a() {
        C0352d c0352d = this.f1724a;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.c_();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to call resume.", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.RequiresPermission("android.permission.INTERNET")
    public void m2003a(com.google.android.gms.ads.C0328d r9) {
        /*
        r8 = this;
        r6 = r8.f1724a;
        r7 = r9.m2040a();
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        if (r0 != 0) goto L_0x00dc;
    L_0x000a:
        r0 = r6.f1976f;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r0 = r6.f1977g;	 Catch:{ RemoteException -> 0x001e }
        if (r0 != 0) goto L_0x0025;
    L_0x0012:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        if (r0 != 0) goto L_0x0025;
    L_0x0016:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RemoteException -> 0x001e }
        r1 = "The ad size and ad unit ID must be set before loadAd is called.";
        r0.<init>(r1);	 Catch:{ RemoteException -> 0x001e }
        throw r0;	 Catch:{ RemoteException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        r1 = "Failed to load ad.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);
    L_0x0024:
        return;
    L_0x0025:
        r0 = r6.f1979i;	 Catch:{ RemoteException -> 0x001e }
        r1 = r0.getContext();	 Catch:{ RemoteException -> 0x001e }
        r0 = com.google.android.gms.ads.internal.client.C0374z.m2456b();	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1976f;	 Catch:{ RemoteException -> 0x001e }
        r3 = r6.f1986p;	 Catch:{ RemoteException -> 0x001e }
        r2 = com.google.android.gms.ads.internal.client.C0352d.m2370a(r1, r2, r3);	 Catch:{ RemoteException -> 0x001e }
        r3 = r6.f1977g;	 Catch:{ RemoteException -> 0x001e }
        r4 = r6.f1971a;	 Catch:{ RemoteException -> 0x001e }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ RemoteException -> 0x001e }
        r5 = com.google.android.gms.ads.internal.util.client.C0500a.m3021b(r1);	 Catch:{ RemoteException -> 0x001e }
        if (r5 == 0) goto L_0x004b;
    L_0x0044:
        r5 = 1;
        r0 = r0.m2440a(r1, r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x001e }
        if (r0 != 0) goto L_0x005c;
    L_0x004b:
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ RemoteException -> 0x001e }
        r5 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel;	 Catch:{ RemoteException -> 0x001e }
        r5.<init>();	 Catch:{ RemoteException -> 0x001e }
        r0 = com.google.android.gms.ads.internal.client.C0374z.m2457c();	 Catch:{ RemoteException -> 0x001e }
        r0 = r0.m2450a(r1, r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x001e }
    L_0x005c:
        r6.f1975e = r0;	 Catch:{ RemoteException -> 0x001e }
        r0 = r6.f1973c;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x006e;
    L_0x0062:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.ads.internal.client.p;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1973c;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r0.m2118a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x006e:
        r0 = r6.f1974d;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x007e;
    L_0x0072:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.ads.internal.client.o;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1974d;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r0.m2117a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x007e:
        r0 = r6.f1980j;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x008e;
    L_0x0082:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.ads.internal.client.w;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1980j;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r0.m2119a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x008e:
        r0 = r6.f1981k;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x009e;
    L_0x0092:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.b.nf;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1981k;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r0.m2123a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x009e:
        r0 = r6.f1982l;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x00b0;
    L_0x00a2:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.b.nk;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1982l;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1978h;	 Catch:{ RemoteException -> 0x001e }
        r0.m2124a(r1, r2);	 Catch:{ RemoteException -> 0x001e }
    L_0x00b0:
        r0 = r6.f1983m;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x00c0;
    L_0x00b4:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = new com.google.android.gms.b.di;	 Catch:{ RemoteException -> 0x001e }
        r2 = r6.f1983m;	 Catch:{ RemoteException -> 0x001e }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x001e }
        r0.m2122a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x00c0:
        r0 = r6.f1985o;	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x00cd;
    L_0x00c4:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = r6.f1985o;	 Catch:{ RemoteException -> 0x001e }
        r1 = r1.f1766a;	 Catch:{ RemoteException -> 0x001e }
        r0.m2120a(r1);	 Catch:{ RemoteException -> 0x001e }
    L_0x00cd:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = r6.f1984n;	 Catch:{ RemoteException -> 0x001e }
        r0.m2126a(r1);	 Catch:{ RemoteException -> 0x001e }
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x0107 }
        r0 = r0.m2115a();	 Catch:{ RemoteException -> 0x0107 }
        if (r0 != 0) goto L_0x00fb;
    L_0x00dc:
        r0 = r6.f1975e;	 Catch:{ RemoteException -> 0x001e }
        r1 = r6.f1972b;	 Catch:{ RemoteException -> 0x001e }
        r1 = r6.f1979i;	 Catch:{ RemoteException -> 0x001e }
        r1 = r1.getContext();	 Catch:{ RemoteException -> 0x001e }
        r1 = com.google.android.gms.ads.internal.client.C0370u.m2444a(r1, r7);	 Catch:{ RemoteException -> 0x001e }
        r0 = r0.m2127a(r1);	 Catch:{ RemoteException -> 0x001e }
        if (r0 == 0) goto L_0x0024;
    L_0x00f0:
        r0 = r6.f1971a;	 Catch:{ RemoteException -> 0x001e }
        r1 = r7.m2359j();	 Catch:{ RemoteException -> 0x001e }
        r0.m3960a(r1);	 Catch:{ RemoteException -> 0x001e }
        goto L_0x0024;
    L_0x00fb:
        r1 = r6.f1979i;	 Catch:{ RemoteException -> 0x0107 }
        r0 = com.google.android.gms.p017a.C0317d.m1997a(r0);	 Catch:{ RemoteException -> 0x0107 }
        r0 = (android.view.View) r0;	 Catch:{ RemoteException -> 0x0107 }
        r1.addView(r0);	 Catch:{ RemoteException -> 0x0107 }
        goto L_0x00dc;
    L_0x0107:
        r0 = move-exception;
        r1 = "Failed to get an ad frame.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);	 Catch:{ RemoteException -> 0x001e }
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.BaseAdView.a(com.google.android.gms.ads.d):void");
    }

    public void m2004b() {
        C0352d c0352d = this.f1724a;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2130d();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to call pause.", e);
        }
    }

    public void m2005c() {
        C0352d c0352d = this.f1724a;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2128b();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to destroy AdView.", e);
        }
    }

    public C0259a getAdListener() {
        return this.f1724a.f1973c;
    }

    public C0333f getAdSize() {
        return this.f1724a.m2371a();
    }

    public String getAdUnitId() {
        return this.f1724a.f1977g;
    }

    public C0522a getInAppPurchaseListener() {
        return this.f1724a.f1981k;
    }

    public String getMediationAdapterClassName() {
        return this.f1724a.m2376b();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int b;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C0333f adSize = getAdSize();
            if (adSize != null) {
                Context context = getContext();
                b = adSize.m2044b(context);
                i3 = adSize.m2042a(context);
            } else {
                b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            b = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(C0259a c0259a) {
        this.f1724a.m2372a(c0259a);
        if (c0259a != null && (c0259a instanceof C0260a)) {
            this.f1724a.m2373a((C0260a) c0259a);
        } else if (c0259a == null) {
            this.f1724a.m2373a(null);
        }
    }

    public void setAdSize(C0333f c0333f) {
        this.f1724a.m2375a(c0333f);
    }

    public void setAdUnitId(String str) {
        this.f1724a.m2374a(str);
    }

    public void setInAppPurchaseListener(C0522a c0522a) {
        C0352d c0352d = this.f1724a;
        if (c0352d.f1982l != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            c0352d.f1981k = c0522a;
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2123a(c0522a != null ? new nf(c0522a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the InAppPurchaseListener.", e);
        }
    }
}
