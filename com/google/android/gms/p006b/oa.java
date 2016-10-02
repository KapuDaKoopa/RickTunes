package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.aj;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@op
/* renamed from: com.google.android.gms.b.oa */
public final class oa extends qi {
    final nv f3715a;
    private final AdResponseParcel f3716b;
    private final qa f3717c;
    private final oc f3718d;
    private final Object f3719e;
    private Future f3720f;

    public oa(Context context, aj ajVar, ia iaVar, qa qaVar, aa aaVar, nv nvVar) {
        this(qaVar, nvVar, new oc(context, ajVar, iaVar, new rw(context), aaVar, qaVar));
    }

    private oa(qa qaVar, nv nvVar, oc ocVar) {
        this.f3719e = new Object();
        this.f3717c = qaVar;
        this.f3716b = qaVar.f3953b;
        this.f3715a = nvVar;
        this.f3718d = ocVar;
    }

    public final void m4277a() {
        pz pzVar;
        int i = -2;
        try {
            synchronized (this.f3719e) {
                this.f3720f = qx.m4395a(this.f3718d);
            }
            pzVar = (pz) this.f3720f.get(60000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            C0501b.m3025a("Timed out waiting for native ad.");
            i = 2;
            this.f3720f.cancel(true);
            pzVar = null;
        } catch (ExecutionException e2) {
            i = 0;
            pzVar = null;
        } catch (InterruptedException e3) {
            i = -1;
            pzVar = null;
        } catch (CancellationException e4) {
            i = -1;
            pzVar = null;
        }
        if (pzVar == null) {
            pzVar = new pz(this.f3717c.f3952a.f2324c, null, null, i, null, null, this.f3716b.f2367l, this.f3716b.f2366k, this.f3717c.f3952a.f2330i, false, null, null, null, null, null, this.f3716b.f2364i, this.f3717c.f3955d, this.f3716b.f2362g, this.f3717c.f3957f, this.f3716b.f2369n, this.f3716b.f2370o, this.f3717c.f3959h, null, null, null, null, this.f3717c.f3953b.f2354G);
        }
        rd.f4041a.post(new ob(this, pzVar));
    }

    public final void m4278b() {
        synchronized (this.f3719e) {
            if (this.f3720f != null) {
                this.f3720f.cancel(true);
            }
        }
    }
}
