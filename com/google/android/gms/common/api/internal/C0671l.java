package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.l */
public final class C0671l implements ak {
    final al f4614a;
    boolean f4615b;

    public C0671l(al alVar) {
        this.f4615b = false;
        this.f4614a = alVar;
    }

    public final C0586c m5213a(C0586c c0586c) {
        return m5218b(c0586c);
    }

    public final void m5214a() {
    }

    public final void m5215a(int i) {
        this.f4614a.m5156a(null);
        this.f4614a.f4568n.m5169a(i, this.f4615b);
    }

    public final void m5216a(Bundle bundle) {
    }

    public final void m5217a(ConnectionResult connectionResult, C0654a c0654a, int i) {
    }

    public final C0586c m5218b(C0586c c0586c) {
        try {
            this.f4614a.f4567m.m5287a((aj) c0586c);
            C0467c a = this.f4614a.f4567m.m5282a(c0586c.m3352b());
            if (a.m2869h() || !this.f4614a.f4561g.containsKey(c0586c.m3352b())) {
                c0586c.m3354b(a);
                return c0586c;
            }
            c0586c.m3353b(new Status(17));
            return c0586c;
        } catch (DeadObjectException e) {
            this.f4614a.m5157a(new C0672m(this, this));
        }
    }

    public final boolean m5219b() {
        if (this.f4615b) {
            return false;
        }
        if (this.f4614a.f4567m.m5306m()) {
            this.f4615b = true;
            for (az azVar : this.f4614a.f4567m.f4664i) {
                synchronized (azVar.f4587e) {
                    azVar.f4585c = null;
                }
            }
            return false;
        }
        this.f4614a.m5156a(null);
        return true;
    }

    public final void m5220c() {
        if (this.f4615b) {
            this.f4615b = false;
            this.f4614a.m5157a(new C0673n(this, this));
        }
    }
}
