package com.google.android.gms.p006b;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.nq */
public abstract class nq extends qi {
    protected final nv f3692a;
    protected final Context f3693b;
    protected final Object f3694c;
    protected final Object f3695d;
    protected final qa f3696e;
    protected AdResponseParcel f3697f;

    protected nq(Context context, qa qaVar, nv nvVar) {
        super((byte) 0);
        this.f3694c = new Object();
        this.f3695d = new Object();
        this.f3693b = context;
        this.f3696e = qaVar;
        this.f3697f = qaVar.f3953b;
        this.f3692a = nvVar;
    }

    protected abstract pz m4260a(int i);

    public final void m4261a() {
        int a;
        synchronized (this.f3694c) {
            C0501b.m3027a(3);
            int i = this.f3696e.f3956e;
            try {
                m4262a(SystemClock.elapsedRealtime());
            } catch (nt e) {
                a = e.m4265a();
                if (a == 3 || a == -1) {
                    e.getMessage();
                    C0501b.m3027a(4);
                } else {
                    C0501b.m3025a(e.getMessage());
                }
                if (this.f3697f == null) {
                    this.f3697f = new AdResponseParcel(a);
                } else {
                    this.f3697f = new AdResponseParcel(a, this.f3697f.f2366k);
                }
                rd.f4041a.post(new nr(this));
                i = a;
            }
            rd.f4041a.post(new ns(this, m4260a(i)));
        }
    }

    protected abstract void m4262a(long j);

    protected final void m4263a(pz pzVar) {
        this.f3692a.m2141b(pzVar);
    }

    public void m4264b() {
    }
}
