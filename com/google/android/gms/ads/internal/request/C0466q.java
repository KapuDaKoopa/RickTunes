package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.se;
import com.google.android.gms.p006b.sf;
import com.google.android.gms.p006b.su;

@op
/* renamed from: com.google.android.gms.ads.internal.request.q */
public final class C0466q extends C0460m implements C0464l, C0465m {
    protected C0470r f2468a;
    private Context f2469b;
    private VersionInfoParcel f2470c;
    private su f2471d;
    private final C0452k f2472e;
    private final Object f2473f;
    private boolean f2474g;

    public C0466q(Context context, VersionInfoParcel versionInfoParcel, su suVar, C0452k c0452k) {
        Looper a;
        super(suVar, c0452k);
        this.f2473f = new Object();
        this.f2469b = context;
        this.f2470c = versionInfoParcel;
        this.f2471d = suVar;
        this.f2472e = c0452k;
        if (((Boolean) ar.m2249n().m3580a(ck.f3036A)).booleanValue()) {
            this.f2474g = true;
            a = ar.m2252q().m4523a();
        } else {
            a = context.getMainLooper();
        }
        this.f2468a = new C0470r(context, a, this, this, this.f2470c.f2541d);
        this.f2468a.j_();
    }

    public final void m2857a() {
        boolean z = false;
        synchronized (this.f2473f) {
            if (this.f2468a.m2899h() || this.f2468a.m2902l()) {
                this.f2468a.m2898g();
            }
            Binder.flushPendingCommands();
            if (this.f2474g) {
                se q = ar.m2252q();
                synchronized (q.f4090c) {
                    if (q.f4089b > 0) {
                        z = true;
                    }
                    ax.m5536b(z, "Invalid state: release() called more times than expected.");
                    int i = q.f4089b - 1;
                    q.f4089b = i;
                    if (i == 0) {
                        q.f4088a.post(new sf(q));
                    }
                }
                this.f2474g = false;
            }
        }
    }

    public final void m2858a(int i) {
        C0501b.m3027a(3);
    }

    public final void m2859a(Bundle bundle) {
        m2846c();
    }

    public final void m2860a(ConnectionResult connectionResult) {
        C0501b.m3027a(3);
        new C0463p(this.f2469b, this.f2471d, this.f2472e).m2704e();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        ar.m2240e();
        rd.m4436b(this.f2469b, this.f2470c.f2539b, "gmob-apps", bundle, true);
    }

    public final C0475w m2861b() {
        C0475w c;
        synchronized (this.f2473f) {
            try {
                c = this.f2468a.m2907c();
            } catch (IllegalStateException e) {
                c = null;
                return c;
            } catch (DeadObjectException e2) {
                c = null;
                return c;
            }
        }
        return c;
    }

    public final /* synthetic */ Object m2862e() {
        return super.m2846c();
    }
}
