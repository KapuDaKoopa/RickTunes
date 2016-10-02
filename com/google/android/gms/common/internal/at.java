package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

final class at implements ar {
    private IBinder f4830a;

    at(IBinder iBinder) {
        this.f4830a = iBinder;
    }

    public final C0314a m5520a(C0314a c0314a, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f4830a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0314a a = C0315b.m1995a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0314a m5521a(C0314a c0314a, SignInButtonConfig signInButtonConfig) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            if (signInButtonConfig != null) {
                obtain.writeInt(1);
                signInButtonConfig.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4830a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0314a a = C0315b.m1995a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4830a;
    }
}
