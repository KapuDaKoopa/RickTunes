package com.google.android.gms.p006b;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@op
/* renamed from: com.google.android.gms.b.ny */
public final class ny extends nq {
    protected jv f3705g;
    final tf f3706h;
    boolean f3707i;
    private ke f3708k;
    private jn f3709l;
    private jp f3710m;
    private final cz f3711n;

    ny(Context context, qa qaVar, ke keVar, nv nvVar, cz czVar, tf tfVar) {
        super(context, qaVar, nvVar);
        this.f3708k = keVar;
        this.f3710m = qaVar.f3954c;
        this.f3711n = czVar;
        this.f3706h = tfVar;
    }

    protected final pz m4273a(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.e.f3952a;
        return new pz(adRequestInfoParcel.f2324c, this.f3706h, this.f.f2359d, i, this.f.f2361f, this.f.f2365j, this.f.f2367l, this.f.f2366k, adRequestInfoParcel.f2330i, this.f.f2363h, this.f3705g != null ? this.f3705g.f3503b : null, this.f3705g != null ? this.f3705g.f3504c : null, this.f3705g != null ? this.f3705g.f3505d : AdMobAdapter.class.getName(), this.f3710m, this.f3705g != null ? this.f3705g.f3506e : null, this.f.f2364i, this.e.f3955d, this.f.f2362g, this.e.f3957f, this.f.f2369n, this.f.f2370o, this.e.f3959h, null, this.f.f2351D, this.f.f2352E, this.f.f2353F, this.f.f2354G);
    }

    protected final void m4274a(long j) {
        synchronized (this.d) {
            jn jyVar;
            long j2;
            if (this.f3710m.f3475j != -1) {
                j2 = j;
                jyVar = new jy(this.b, this.e.f3952a, this.f3708k, this.f3710m, this.f.f2375t, this.f.f2350C, j2, ((Long) ar.m2249n().m3580a(ck.ay)).longValue());
            } else {
                j2 = j;
                jyVar = new kb(this.b, this.e.f3952a, this.f3708k, this.f3710m, this.f.f2375t, this.f.f2350C, j2, ((Long) ar.m2249n().m3580a(ck.ay)).longValue(), this.f3711n);
            }
            this.f3709l = jyVar;
        }
        this.f3705g = this.f3709l.m3907a(this.f3710m.f3466a);
        switch (this.f3705g.f3502a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                if (this.f3705g.f3503b != null && this.f3705g.f3503b.f3461k != null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    rd.f4041a.post(new nz(this, countDownLatch));
                    try {
                        countDownLatch.await(10, TimeUnit.SECONDS);
                        synchronized (this.d) {
                            if (this.f3707i) {
                                if (this.f3706h.m4585r()) {
                                    throw new nt("Assets not loaded, web view is destroyed", 0);
                                }
                                break;
                            }
                            throw new nt("View could not be prepared", 0);
                            break;
                        }
                    } catch (InterruptedException e) {
                        throw new nt("Interrupted while waiting for latch : " + e, 0);
                    }
                }
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                throw new nt("No fill from any mediation ad networks.", 3);
            default:
                throw new nt("Unexpected mediation result: " + this.f3705g.f3502a, 0);
        }
    }

    public final void m4275b() {
        synchronized (this.d) {
            super.m4264b();
            if (this.f3709l != null) {
                this.f3709l.m3908a();
            }
        }
    }
}
