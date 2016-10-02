package com.google.android.gms.p006b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@op
/* renamed from: com.google.android.gms.b.jy */
public final class jy implements jn {
    final long f3508a;
    final long f3509b;
    final Object f3510c;
    boolean f3511d;
    final Map f3512e;
    private final AdRequestInfoParcel f3513f;
    private final ke f3514g;
    private final Context f3515h;
    private final jp f3516i;
    private final boolean f3517j;
    private final int f3518k;
    private final boolean f3519l;

    public jy(Context context, AdRequestInfoParcel adRequestInfoParcel, ke keVar, jp jpVar, boolean z, boolean z2, long j, long j2) {
        this.f3510c = new Object();
        this.f3511d = false;
        this.f3512e = new HashMap();
        this.f3515h = context;
        this.f3513f = adRequestInfoParcel;
        this.f3514g = keVar;
        this.f3516i = jpVar;
        this.f3517j = z;
        this.f3519l = z2;
        this.f3508a = j;
        this.f3509b = j2;
        this.f3518k = 2;
    }

    private void m3945a(ss ssVar) {
        rd.f4041a.post(new ka(this, ssVar));
    }

    private jv m3946b(List list) {
        Throwable e;
        synchronized (this.f3510c) {
            if (this.f3511d) {
                jv jvVar = new jv(-1);
                return jvVar;
            }
            for (ss ssVar : list) {
                try {
                    jvVar = (jv) ssVar.get();
                    if (jvVar != null && jvVar.f3502a == 0) {
                        m3945a(ssVar);
                        return jvVar;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                }
            }
            m3945a(null);
            return new jv(1);
        }
    }

    private jv m3947c(List list) {
        InterruptedException e;
        synchronized (this.f3510c) {
            if (this.f3511d) {
                jv jvVar = new jv(-1);
                return jvVar;
            }
            long j = -1;
            ss ssVar = null;
            jvVar = null;
            long j2 = this.f3516i.f3476k != -1 ? this.f3516i.f3476k : 10000;
            long j3 = j2;
            for (ss ssVar2 : list) {
                jv jvVar2;
                ko koVar;
                int a;
                jv jvVar3;
                ss ssVar3;
                jv jvVar4;
                long a2 = ar.m2244i().m4887a();
                if (j3 == 0) {
                    try {
                        if (ssVar2.isDone()) {
                            jvVar2 = (jv) ssVar2.get();
                            if (jvVar2 != null && jvVar2.f3502a == 0) {
                                koVar = jvVar2.f3507f;
                                if (koVar != null && koVar.m3941a() > j) {
                                    a = koVar.m3941a();
                                    jvVar3 = jvVar2;
                                    ssVar3 = ssVar2;
                                    jvVar4 = jvVar3;
                                    j3 = Math.max(j3 - (ar.m2244i().m4887a() - a2), 0);
                                    ssVar = ssVar3;
                                    j = a;
                                    jvVar = jvVar4;
                                }
                            }
                            jvVar4 = jvVar;
                            ssVar3 = ssVar;
                            a = j;
                            j3 = Math.max(j3 - (ar.m2244i().m4887a() - a2), 0);
                            ssVar = ssVar3;
                            j = a;
                            jvVar = jvVar4;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        try {
                            C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                            j3 = e;
                        } finally {
                            jvVar = j3 - (ar.m2244i().m4887a() - a2);
                            j = 0;
                            Math.max(jvVar, j);
                            j = j3;
                        }
                    } catch (ExecutionException e3) {
                        e = e3;
                        C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                        j3 = e;
                    } catch (RemoteException e4) {
                        e = e4;
                        C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                        j3 = e;
                    } catch (TimeoutException e5) {
                        e = e5;
                        C0501b.m3026a("Exception while processing an adapter; continuing with other adapters", e);
                        j3 = e;
                    }
                }
                jvVar2 = (jv) ssVar2.get(j3, TimeUnit.MILLISECONDS);
                koVar = jvVar2.f3507f;
                a = koVar.m3941a();
                jvVar3 = jvVar2;
                ssVar3 = ssVar2;
                jvVar4 = jvVar3;
                j3 = Math.max(j3 - (ar.m2244i().m4887a() - a2), 0);
                ssVar = ssVar3;
                j = a;
                jvVar = jvVar4;
            }
            m3945a(ssVar);
            return jvVar == null ? new jv(1) : jvVar;
        }
    }

    public final jv m3948a(List list) {
        C0501b.m3027a(3);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        List arrayList = new ArrayList();
        for (jo joVar : list) {
            "Trying mediation network: " + joVar.f3452b;
            C0501b.m3027a(4);
            for (String jsVar : joVar.f3453c) {
                js jsVar2 = new js(this.f3515h, jsVar, this.f3514g, this.f3516i, joVar, this.f3513f.f2324c, this.f3513f.f2325d, this.f3513f.f2332k, this.f3517j, this.f3519l, this.f3513f.f2347z, this.f3513f.f2335n);
                ss a = qx.m4396a(newCachedThreadPool, new jz(this, jsVar2));
                this.f3512e.put(a, jsVar2);
                arrayList.add(a);
            }
        }
        switch (this.f3518k) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return m3947c(arrayList);
            default:
                return m3946b(arrayList);
        }
    }

    public final void m3949a() {
        synchronized (this.f3510c) {
            this.f3511d = true;
            for (js a : this.f3512e.values()) {
                a.m3935a();
            }
        }
    }
}
