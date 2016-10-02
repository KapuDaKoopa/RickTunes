package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.clearcut.C0651h;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: com.google.android.gms.b.vy */
public abstract class vy extends Binder implements vx {
    public static vx m4839a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof vx)) ? new vz(iBinder) : (vx) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        LogEventParcelable logEventParcelable = null;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                vu vuVar;
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    vuVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    vuVar = (queryLocalInterface == null || !(queryLocalInterface instanceof vu)) ? new vw(readStrongBinder) : (vu) queryLocalInterface;
                }
                if (parcel.readInt() != 0) {
                    C0651h c0651h = LogEventParcelable.CREATOR;
                    logEventParcelable = C0651h.m5052a(parcel);
                }
                m4838a(vuVar, logEventParcelable);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
