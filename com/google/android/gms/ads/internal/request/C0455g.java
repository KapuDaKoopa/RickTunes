package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rp;
import com.google.android.gms.p006b.su;

/* renamed from: com.google.android.gms.ads.internal.request.g */
final class C0455g implements Runnable {
    final /* synthetic */ su f2457a;
    final /* synthetic */ C0453e f2458b;

    C0455g(C0453e c0453e, su suVar) {
        this.f2458b = c0453e;
        this.f2457a = suVar;
    }

    public final void run() {
        synchronized (this.f2458b.f2447b) {
            rp c0463p;
            C0453e c0453e = this.f2458b;
            C0452k c0452k = this.f2458b;
            VersionInfoParcel versionInfoParcel = this.f2458b.f2446a.f2405j;
            su suVar = this.f2457a;
            Context context = c0452k.f2448c;
            if (new C0459j(context).m2840a(versionInfoParcel)) {
                C0501b.m3027a(3);
                c0463p = new C0463p(context, suVar, c0452k);
                c0463p.m2846c();
            } else {
                C0501b.m3027a(3);
                C0374z.m2455a();
                if (C0500a.m3021b(context)) {
                    c0463p = new C0466q(context, versionInfoParcel, suVar, c0452k);
                } else {
                    C0501b.m3025a("Failed to connect to remote ad request service.");
                    c0463p = null;
                }
            }
            c0453e.f2450e = c0463p;
            if (this.f2458b.f2450e == null) {
                this.f2458b.m2836a(0, "Could not start the ad request service.");
                rd.f4041a.removeCallbacks(this.f2458b.f2449d);
            }
        }
    }
}
