package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C0740u extends C0732o {
    public final IBinder f4868e;
    final /* synthetic */ C0469n f4869f;

    @BinderThread
    public C0740u(C0469n c0469n, int i, IBinder iBinder, Bundle bundle) {
        this.f4869f = c0469n;
        super(c0469n, i, bundle);
        this.f4868e = iBinder;
    }

    protected final void m5609a(ConnectionResult connectionResult) {
        if (this.f4869f.f2499y != null) {
            this.f4869f.f2499y.m2856a(connectionResult);
        }
        this.f4869f.m2891a(connectionResult);
    }

    protected final boolean m5610a() {
        try {
            String interfaceDescriptor = this.f4868e.getInterfaceDescriptor();
            if (this.f4869f.m2895b().equals(interfaceDescriptor)) {
                IInterface a = this.f4869f.m2886a(this.f4868e);
                if (a == null || !this.f4869f.m2878a(2, 3, a)) {
                    return false;
                }
                C0469n c0469n = this.f4869f;
                C0469n.m2885m();
                if (this.f4869f.f2498x != null) {
                    this.f4869f.f2498x.m2855a(null);
                }
                return true;
            }
            "service descriptor mismatch: " + this.f4869f.m2895b() + " vs. " + interfaceDescriptor;
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
