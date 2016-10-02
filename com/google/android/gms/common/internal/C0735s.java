package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.gms.common.internal.s */
public final class C0735s implements ServiceConnection {
    final /* synthetic */ C0469n f4865a;
    private final int f4866b;

    public C0735s(C0469n c0469n, int i) {
        this.f4865a = c0469n;
        this.f4866b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ax.m5528a((Object) iBinder, (Object) "Expecting a valid IBinder");
        synchronized (this.f4865a.f2489o) {
            this.f4865a.f2490p = am.m5469a(iBinder);
        }
        this.f4865a.m2889a(0, this.f4866b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4865a.f2489o) {
            this.f4865a.f2490p = null;
        }
        this.f4865a.f2479d.sendMessage(this.f4865a.f2479d.obtainMessage(4, this.f4866b, 1));
    }
}
