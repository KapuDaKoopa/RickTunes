package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;

/* renamed from: com.google.android.gms.common.api.internal.w */
final class C0687w implements C0464l, C0465m {
    final /* synthetic */ C0674o f4654a;

    private C0687w(C0674o c0674o) {
        this.f4654a = c0674o;
    }

    public final void m5261a(int i) {
    }

    public final void m5262a(Bundle bundle) {
        this.f4654a.f4622e.m4906a(new C0685u(this.f4654a));
    }

    public final void m5263a(ConnectionResult connectionResult) {
        this.f4654a.f4619b.lock();
        try {
            if (this.f4654a.m5232a(connectionResult)) {
                this.f4654a.m5241f();
                this.f4654a.m5240e();
            } else {
                this.f4654a.m5234b(connectionResult);
            }
            this.f4654a.f4619b.unlock();
        } catch (Throwable th) {
            this.f4654a.f4619b.unlock();
        }
    }
}
