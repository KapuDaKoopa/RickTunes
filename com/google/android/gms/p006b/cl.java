package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.C0706q;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.cl */
final class cl implements Callable {
    final /* synthetic */ Context f3088a;

    cl(Context context) {
        this.f3088a = context;
    }

    private Void m3584a() {
        ci n = ar.m2249n();
        Context context = this.f3088a;
        synchronized (n.f3031a) {
            if (n.f3032b) {
            } else {
                context = C0706q.m5358d(context);
                if (context == null) {
                } else {
                    ar.m2247l();
                    n.f3033c = context.getSharedPreferences("google_ads_flags", 1);
                    n.f3032b = true;
                }
            }
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return m3584a();
    }
}
