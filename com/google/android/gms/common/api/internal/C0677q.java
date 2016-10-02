package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.C0676n;
import com.google.android.gms.common.internal.ax;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C0677q implements C0676n {
    private final WeakReference f4640a;
    private final C0654a f4641b;
    private final int f4642c;

    public C0677q(C0674o c0674o, C0654a c0654a, int i) {
        this.f4640a = new WeakReference(c0674o);
        this.f4641b = c0654a;
        this.f4642c = i;
    }

    public final void m5243a(ConnectionResult connectionResult) {
        boolean z = false;
        C0674o c0674o = (C0674o) this.f4640a.get();
        if (c0674o != null) {
            if (Looper.myLooper() == c0674o.f4618a.f4567m.m5297c()) {
                z = true;
            }
            ax.m5532a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            c0674o.f4619b.lock();
            try {
                if (c0674o.m5237b(0)) {
                    if (!connectionResult.m5057b()) {
                        c0674o.m5235b(connectionResult, this.f4641b, this.f4642c);
                    }
                    if (c0674o.m5239d()) {
                        c0674o.m5240e();
                    }
                    c0674o.f4619b.unlock();
                }
            } finally {
                c0674o.f4619b.unlock();
            }
        }
    }
}
