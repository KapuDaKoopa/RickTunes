package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.g */
public final class C0708g implements ServiceConnection {
    boolean f4743a;
    private final BlockingQueue f4744b;

    public C0708g() {
        this.f4743a = false;
        this.f4744b = new LinkedBlockingQueue();
    }

    public final IBinder m5364a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        } else if (this.f4743a) {
            throw new IllegalStateException();
        } else {
            this.f4743a = true;
            return (IBinder) this.f4744b.take();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4744b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
