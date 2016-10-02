package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p001b.C0028m;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ae;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.az;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.t */
public final class C0498t extends ai {
    private final Context f2521a;
    private final ae f2522b;
    private final ke f2523c;
    private final ee f2524d;
    private final eh f2525e;
    private final C0028m f2526f;
    private final C0028m f2527g;
    private final NativeAdOptionsParcel f2528h;
    private final List f2529i;
    private final az f2530j;
    private final String f2531k;
    private final VersionInfoParcel f2532l;
    private WeakReference f2533m;
    private final C0402k f2534n;
    private final Object f2535o;

    C0498t(Context context, String str, ke keVar, VersionInfoParcel versionInfoParcel, ae aeVar, ee eeVar, eh ehVar, C0028m c0028m, C0028m c0028m2, NativeAdOptionsParcel nativeAdOptionsParcel, az azVar, C0402k c0402k) {
        this.f2535o = new Object();
        this.f2521a = context;
        this.f2531k = str;
        this.f2523c = keVar;
        this.f2532l = versionInfoParcel;
        this.f2522b = aeVar;
        this.f2525e = ehVar;
        this.f2524d = eeVar;
        this.f2526f = c0028m;
        this.f2527g = c0028m2;
        this.f2528h = nativeAdOptionsParcel;
        this.f2529i = m2999d();
        this.f2530j = azVar;
        this.f2534n = c0402k;
    }

    private List m2999d() {
        List arrayList = new ArrayList();
        if (this.f2525e != null) {
            arrayList.add("1");
        }
        if (this.f2524d != null) {
            arrayList.add("2");
        }
        if (this.f2526f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    public final void m3005a(AdRequestParcel adRequestParcel) {
        rd.f4041a.post(new C0499u(this, adRequestParcel));
    }

    public final boolean m3006a() {
        synchronized (this.f2535o) {
            if (this.f2533m != null) {
                aj ajVar = (aj) this.f2533m.get();
                boolean k = ajVar != null ? ajVar.m2178k() : false;
                return k;
            }
            return false;
        }
    }

    public final String m3007b() {
        synchronized (this.f2535o) {
            if (this.f2533m != null) {
                aj ajVar = (aj) this.f2533m.get();
                String j = ajVar != null ? ajVar.m2206j() : null;
                return j;
            }
            return null;
        }
    }

    protected final aj m3008c() {
        Context context = this.f2521a;
        C0402k c0402k = this.f2534n;
        Context context2 = this.f2521a;
        return new aj(context, c0402k, AdSizeParcel.m2272a(), this.f2531k, this.f2523c, this.f2532l);
    }
}
