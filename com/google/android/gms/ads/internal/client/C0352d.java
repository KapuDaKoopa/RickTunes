package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0259a;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.C0340g;
import com.google.android.gms.ads.doubleclick.C0329a;
import com.google.android.gms.ads.doubleclick.C0330b;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.purchase.C0522a;
import com.google.android.gms.ads.purchase.C0523b;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.op;
import java.util.concurrent.atomic.AtomicBoolean;

@op
/* renamed from: com.google.android.gms.ads.internal.client.d */
public final class C0352d {
    public final kd f1971a;
    public final C0370u f1972b;
    public C0259a f1973c;
    public C0260a f1974d;
    public aq f1975e;
    public C0333f[] f1976f;
    public String f1977g;
    public String f1978h;
    public ViewGroup f1979i;
    public C0329a f1980j;
    public C0522a f1981k;
    public C0523b f1982l;
    public C0330b f1983m;
    public boolean f1984n;
    public C0340g f1985o;
    public boolean f1986p;
    private final AtomicBoolean f1987q;

    public C0352d(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C0370u.m2445a(), false, (byte) 0);
    }

    public C0352d(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, byte b) {
        this(viewGroup, attributeSet, false, C0370u.m2445a(), z, (byte) 0);
    }

    private C0352d(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C0370u c0370u, boolean z2) {
        this.f1971a = new kd();
        this.f1979i = viewGroup;
        this.f1972b = c0370u;
        this.f1975e = null;
        this.f1987q = new AtomicBoolean(false);
        this.f1986p = z2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzk com_google_android_gms_ads_internal_client_zzk = new zzk(context, attributeSet);
                this.f1976f = com_google_android_gms_ads_internal_client_zzk.m2462a(z);
                this.f1977g = com_google_android_gms_ads_internal_client_zzk.m2461a();
                if (viewGroup.isInEditMode()) {
                    C0374z.m2455a();
                    C0333f c0333f = this.f1976f[0];
                    boolean z3 = this.f1986p;
                    AdSizeParcel adSizeParcel = new AdSizeParcel(context, c0333f);
                    adSizeParcel.m2276a(z3);
                    C0500a.m3014a(viewGroup, adSizeParcel, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C0374z.m2455a();
                C0500a.m3016a(viewGroup, new AdSizeParcel(context, C0333f.f1747a), e.getMessage(), e.getMessage());
            }
        }
    }

    private C0352d(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C0370u c0370u, boolean z2, byte b) {
        this(viewGroup, attributeSet, z, c0370u, z2);
    }

    public C0352d(ViewGroup viewGroup, boolean z) {
        this(viewGroup, null, false, C0370u.m2445a(), z, (byte) 0);
    }

    public static AdSizeParcel m2370a(Context context, C0333f[] c0333fArr, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, c0333fArr);
        adSizeParcel.m2276a(z);
        return adSizeParcel;
    }

    public final C0333f m2371a() {
        try {
            if (this.f1975e != null) {
                AdSizeParcel i = this.f1975e.m2134i();
                if (i != null) {
                    return i.m2277c();
                }
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to get the current AdSize.", e);
        }
        return this.f1976f != null ? this.f1976f[0] : null;
    }

    public final void m2372a(C0259a c0259a) {
        try {
            this.f1973c = c0259a;
            if (this.f1975e != null) {
                this.f1975e.m2118a(c0259a != null ? new C0365p(c0259a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdListener.", e);
        }
    }

    public final void m2373a(C0260a c0260a) {
        try {
            this.f1974d = c0260a;
            if (this.f1975e != null) {
                this.f1975e.m2117a(c0260a != null ? new C0364o(c0260a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AdClickListener.", e);
        }
    }

    public final void m2374a(String str) {
        if (this.f1977g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f1977g = str;
    }

    public final void m2375a(C0333f... c0333fArr) {
        if (this.f1976f != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m2377b(c0333fArr);
    }

    public final String m2376b() {
        try {
            if (this.f1975e != null) {
                return this.f1975e.m2135j();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final void m2377b(C0333f... c0333fArr) {
        this.f1976f = c0333fArr;
        try {
            if (this.f1975e != null) {
                this.f1975e.m2116a(C0352d.m2370a(this.f1979i.getContext(), this.f1976f, this.f1986p));
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the ad size.", e);
        }
        this.f1979i.requestLayout();
    }
}
