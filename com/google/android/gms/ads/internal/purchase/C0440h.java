package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.stats.C0765b;
import com.google.android.gms.p006b.na;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.h */
public final class C0440h extends na implements ServiceConnection {
    C0434b f2299a;
    private boolean f2300b;
    private Context f2301c;
    private int f2302d;
    private Intent f2303e;
    private C0439g f2304f;
    private String f2305g;

    public C0440h(Context context, String str, boolean z, int i, Intent intent, C0439g c0439g) {
        this.f2300b = false;
        this.f2305g = str;
        this.f2302d = i;
        this.f2303e = intent;
        this.f2300b = z;
        this.f2301c = context;
        this.f2304f = c0439g;
    }

    public final boolean m2785a() {
        return this.f2300b;
    }

    public final String m2786b() {
        return this.f2305g;
    }

    public final Intent m2787c() {
        return this.f2303e;
    }

    public final int m2788d() {
        return this.f2302d;
    }

    public final void m2789e() {
        ar.m2250o();
        int a = C0443k.m2798a(this.f2303e);
        if (this.f2302d == -1 && a == 0) {
            this.f2299a = new C0434b(this.f2301c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C0765b.m5734a().m5740a(this.f2301c, intent, this);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0501b.m3027a(4);
        this.f2299a.m2754a(iBinder);
        ar.m2250o();
        String b = C0443k.m2801b(this.f2303e);
        ar.m2250o();
        b = C0443k.m2802b(b);
        if (b != null) {
            if (this.f2299a.m2752a(this.f2301c.getPackageName(), b) == 0) {
                C0441i.m2791a(this.f2301c).m2796a(this.f2304f);
            }
            C0765b.m5734a().m5738a(this.f2301c, this);
            this.f2299a.f2269a = null;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0501b.m3027a(4);
        this.f2299a.f2269a = null;
    }
}
