package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ac implements ServiceConnection {
    final /* synthetic */ ab f4823a;

    public ac(ab abVar) {
        this.f4823a = abVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (C0744z.m5624a(this.f4823a.f4822h)) {
            this.f4823a.f4819e = iBinder;
            this.f4823a.f4821g = componentName;
            for (ServiceConnection onServiceConnected : this.f4823a.f4816b) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f4823a.f4817c = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (C0744z.m5624a(this.f4823a.f4822h)) {
            this.f4823a.f4819e = null;
            this.f4823a.f4821g = componentName;
            for (ServiceConnection onServiceDisconnected : this.f4823a.f4816b) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f4823a.f4817c = 2;
        }
    }
}
