package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import java.lang.ref.WeakReference;

@op
public final class ao {
    final aq f1811a;
    final Runnable f1812b;
    AdRequestParcel f1813c;
    boolean f1814d;
    boolean f1815e;
    long f1816f;

    public ao(C0346b c0346b) {
        this(c0346b, new aq(rd.f4041a));
    }

    private ao(C0346b c0346b, aq aqVar) {
        this.f1814d = false;
        this.f1815e = false;
        this.f1816f = 0;
        this.f1811a = aqVar;
        this.f1812b = new ap(this, new WeakReference(c0346b));
    }

    public final void m2232a() {
        this.f1814d = false;
        this.f1811a.m2235a(this.f1812b);
    }

    public final void m2233a(AdRequestParcel adRequestParcel) {
        m2234a(adRequestParcel, 60000);
    }

    public final void m2234a(AdRequestParcel adRequestParcel, long j) {
        if (this.f1814d) {
            C0501b.m3025a("An ad refresh is already scheduled.");
            return;
        }
        this.f1813c = adRequestParcel;
        this.f1814d = true;
        this.f1816f = j;
        if (!this.f1815e) {
            "Scheduling ad refresh " + j + " milliseconds from now.";
            C0501b.m3027a(4);
            aq aqVar = this.f1811a;
            aqVar.f1819a.postDelayed(this.f1812b, j);
        }
    }
}
