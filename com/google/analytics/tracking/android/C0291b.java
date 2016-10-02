package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.C0526b;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.analytics.tracking.android.b */
final class C0291b implements C0287a {
    ServiceConnection f1610a;
    C0296d f1611b;
    C0297e f1612c;
    Context f1613d;
    C0526b f1614e;

    public C0291b(Context context, C0296d c0296d, C0297e c0297e) {
        this.f1613d = context;
        if (c0296d == null) {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        this.f1611b = c0296d;
        if (c0297e == null) {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        }
        this.f1612c = c0297e;
    }

    private C0526b m1875d() {
        if ((this.f1614e != null ? 1 : null) != null) {
            return this.f1614e;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public final void m1876a() {
        try {
            m1875d().m3122a();
        } catch (RemoteException e) {
            as.m1827a("clear hits failed: " + e);
        }
    }

    public final void m1877a(Map map, long j, String str, List list) {
        try {
            m1875d().m3123a(map, j, str, list);
        } catch (RemoteException e) {
            as.m1827a("sendHit failed: " + e);
        }
    }

    public final void m1878b() {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", this.f1613d.getPackageName());
        if (this.f1610a != null) {
            as.m1827a("Calling connect() while still connected, missing disconnect().");
            return;
        }
        this.f1610a = new C0295c(this);
        boolean bindService = this.f1613d.bindService(intent, this.f1610a, 129);
        as.m1831c("connect: bindService returned " + bindService + " for " + intent);
        if (!bindService) {
            this.f1610a = null;
            this.f1612c.m1919a(1);
        }
    }

    public final void m1879c() {
        this.f1614e = null;
        if (this.f1610a != null) {
            try {
                this.f1613d.unbindService(this.f1610a);
            } catch (IllegalStateException e) {
            } catch (IllegalArgumentException e2) {
            }
            this.f1610a = null;
            this.f1611b.m1918b();
        }
    }
}
