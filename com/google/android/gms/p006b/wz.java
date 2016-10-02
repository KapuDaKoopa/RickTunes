package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;

/* renamed from: com.google.android.gms.b.wz */
public abstract class wz extends Binder implements wy {
    public static wy m4869a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof wy)) ? new xa(iBinder) : (wy) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                wv wvVar;
                parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    wvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    wvVar = (queryLocalInterface == null || !(queryLocalInterface instanceof wv)) ? new wx(readStrongBinder) : (wv) queryLocalInterface;
                }
                m4868a(wvVar);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
