package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.C0527c;

/* renamed from: com.google.analytics.tracking.android.c */
final class C0295c implements ServiceConnection {
    final /* synthetic */ C0291b f1640a;

    C0295c(C0291b c0291b) {
        this.f1640a = c0291b;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        as.m1831c("service connected, binder: " + iBinder);
        try {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(iBinder.getInterfaceDescriptor())) {
                as.m1831c("bound to service");
                this.f1640a.f1614e = C0527c.m3124a(iBinder);
                this.f1640a.f1611b.m1917a();
                return;
            }
        } catch (RemoteException e) {
        }
        this.f1640a.f1613d.unbindService(this);
        this.f1640a.f1610a = null;
        this.f1640a.f1612c.m1919a(2);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        as.m1831c("service disconnected: " + componentName);
        this.f1640a.f1610a = null;
        this.f1640a.f1611b.m1918b();
    }
}
