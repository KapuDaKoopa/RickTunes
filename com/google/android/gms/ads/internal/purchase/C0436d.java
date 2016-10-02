package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.ads.internal.purchase.d */
final class C0436d implements Runnable {
    final /* synthetic */ C0439g f2280a;
    final /* synthetic */ Intent f2281b;
    final /* synthetic */ C0435c f2282c;

    C0436d(C0435c c0435c, C0439g c0439g, Intent intent) {
        this.f2282c = c0435c;
        this.f2280a = c0439g;
        this.f2281b = intent;
    }

    public final void run() {
        try {
            if (this.f2282c.f2279h.m2803a(this.f2280a.f2297b, this.f2281b)) {
                this.f2282c.f2275d.m4229a(new C0440h(this.f2282c.f2274c, this.f2280a.f2298c, true, -1, this.f2281b, this.f2280a));
            } else {
                this.f2282c.f2275d.m4229a(new C0440h(this.f2282c.f2274c, this.f2280a.f2298c, false, -1, this.f2281b, this.f2280a));
            }
        } catch (RemoteException e) {
            C0501b.m3025a("Fail to verify and dispatch pending transaction");
        }
    }
}
