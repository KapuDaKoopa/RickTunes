package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.BinderThread;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C0734r extends aj {
    private C0469n f4863a;
    private final int f4864b;

    public C0734r(C0469n c0469n, int i) {
        this.f4863a = c0469n;
        this.f4864b = i;
    }

    @BinderThread
    public final void m5562a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @BinderThread
    public final void m5563a(int i, IBinder iBinder, Bundle bundle) {
        ax.m5528a(this.f4863a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f4863a.m2890a(i, iBinder, bundle, this.f4864b);
        this.f4863a = null;
    }
}
