package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.mn;
import com.google.android.gms.p006b.mu;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.f */
public final class C0438f extends mu implements ServiceConnection {
    C0441i f2287a;
    private final Activity f2288b;
    private Context f2289c;
    private mn f2290d;
    private C0434b f2291e;
    private C0439g f2292f;
    private C0348m f2293g;
    private C0445n f2294h;
    private String f2295i;

    public C0438f(Activity activity) {
        this.f2295i = null;
        this.f2288b = activity;
        this.f2287a = C0441i.m2791a(this.f2288b.getApplicationContext());
    }

    private void m2776a(String str, boolean z, int i, Intent intent) {
        if (this.f2293g != null) {
            this.f2293g.m2184a(str, z, i, intent, this.f2292f);
        }
    }

    public final void m2777a() {
        GInAppPurchaseManagerInfoParcel a = GInAppPurchaseManagerInfoParcel.m2745a(this.f2288b.getIntent());
        this.f2293g = a.f2268e;
        this.f2294h = a.f2265b;
        this.f2290d = a.f2266c;
        this.f2291e = new C0434b(this.f2288b.getApplicationContext());
        this.f2289c = a.f2267d;
        if (this.f2288b.getResources().getConfiguration().orientation == 2) {
            this.f2288b.setRequestedOrientation(ar.m2242g().m4461a());
        } else {
            this.f2288b.setRequestedOrientation(ar.m2242g().m4474b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f2288b.bindService(intent, this, 1);
    }

    public final void m2778a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                ar.m2250o();
                int a = C0443k.m2798a(intent);
                if (i2 == -1) {
                    ar.m2250o();
                    if (a == 0) {
                        if (this.f2294h.m2803a(this.f2295i, intent)) {
                            z = true;
                        }
                        this.f2290d.m2766b(a);
                        this.f2288b.finish();
                        m2776a(this.f2290d.m2764a(), z, i2, intent);
                    }
                }
                this.f2287a.m2796a(this.f2292f);
                this.f2290d.m2766b(a);
                this.f2288b.finish();
                m2776a(this.f2290d.m2764a(), z, i2, intent);
            } catch (RemoteException e) {
                C0501b.m3025a("Fail to process purchase result.");
                this.f2288b.finish();
            } finally {
                this.f2295i = null;
            }
        }
    }

    public final void m2779b() {
        this.f2288b.unbindService(this);
        this.f2291e.f2269a = null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.f2291e.m2754a(iBinder);
        try {
            C0445n c0445n = this.f2294h;
            ar.m2240e();
            this.f2295i = rd.m4434b();
            Bundle a = this.f2291e.m2753a(this.f2288b.getPackageName(), this.f2290d.m2764a(), this.f2295i);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                ar.m2250o();
                int a2 = C0443k.m2799a(a);
                this.f2290d.m2766b(a2);
                m2776a(this.f2290d.m2764a(), false, a2, null);
                this.f2288b.finish();
                return;
            }
            this.f2292f = new C0439g(this.f2290d.m2764a(), this.f2295i);
            this.f2287a.m2797b(this.f2292f);
            this.f2288b.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            C0501b.m3026a("Error when connecting in-app billing service", e);
            this.f2288b.finish();
        } catch (SendIntentException e3) {
            e = e3;
            C0501b.m3026a("Error when connecting in-app billing service", e);
            this.f2288b.finish();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0501b.m3027a(4);
        this.f2291e.f2269a = null;
    }
}
