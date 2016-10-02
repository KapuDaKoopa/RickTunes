package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.p006b.qd;

/* renamed from: com.google.android.gms.ads.internal.purchase.l */
public final class C0444l implements ServiceConnection {
    final /* synthetic */ Context f2311a;
    final /* synthetic */ C0443k f2312b;

    public C0444l(C0443k c0443k, Context context) {
        this.f2312b = c0443k;
        this.f2311a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = false;
        C0434b c0434b = new C0434b(this.f2311a.getApplicationContext(), false);
        c0434b.m2754a(iBinder);
        int c = c0434b.m2756c(this.f2311a.getPackageName(), "inapp");
        qd h = ar.m2243h();
        if (c == 0) {
            z = true;
        }
        synchronized (h.f3974a) {
            h.f3980g = z;
        }
        this.f2311a.unbindService(this);
        c0434b.f2269a = null;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
