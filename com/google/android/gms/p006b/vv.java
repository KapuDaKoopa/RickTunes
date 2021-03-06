package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.b.vv */
public abstract class vv extends Binder implements vu {
    public vv() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                m4828a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
