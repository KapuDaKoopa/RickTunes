package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C0263f;
import com.google.android.gms.ads.formats.C0264h;
import com.google.android.gms.ads.formats.C0336c;
import com.google.android.gms.ads.internal.client.C0365p;
import com.google.android.gms.ads.internal.client.C0366q;
import com.google.android.gms.ads.internal.client.ak;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.er;
import com.google.android.gms.p006b.es;
import com.google.android.gms.p006b.kd;

/* renamed from: com.google.android.gms.ads.c */
public final class C0327c {
    private final Context f1741a;
    private final ak f1742b;

    private C0327c(Context context, ak akVar) {
        this.f1741a = context;
        this.f1742b = akVar;
    }

    public C0327c(Context context, String str) {
        this((Context) ax.m5528a((Object) context, (Object) "context cannot be null"), C0366q.m2437a(context, str, new kd()));
    }

    public final C0326b m2035a() {
        try {
            return new C0326b(this.f1741a, this.f1742b.m2301a());
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final C0327c m2036a(C0259a c0259a) {
        try {
            this.f1742b.m2302a(new C0365p(c0259a));
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set AdListener.", e);
        }
        return this;
    }

    public final C0327c m2037a(C0336c c0336c) {
        try {
            this.f1742b.m2304a(new NativeAdOptionsParcel(c0336c));
        } catch (Throwable e) {
            C0501b.m3026a("Failed to specify native ad options", e);
        }
        return this;
    }

    public final C0327c m2038a(C0263f c0263f) {
        try {
            this.f1742b.m2305a(new er(c0263f));
        } catch (Throwable e) {
            C0501b.m3026a("Failed to add app install ad listener", e);
        }
        return this;
    }

    public final C0327c m2039a(C0264h c0264h) {
        try {
            this.f1742b.m2306a(new es(c0264h));
        } catch (Throwable e) {
            C0501b.m3026a("Failed to add content ad listener", e);
        }
        return this;
    }
}
