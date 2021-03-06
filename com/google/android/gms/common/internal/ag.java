package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

final class ag implements ae {
    private IBinder f4826a;

    ag(IBinder iBinder) {
        this.f4826a = iBinder;
    }

    public final Account m5417a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
            this.f4826a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Account account = obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return account;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4826a;
    }
}
