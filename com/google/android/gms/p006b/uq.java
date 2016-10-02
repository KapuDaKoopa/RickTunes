package com.google.android.gms.p006b;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.uq */
final class uq implements uo {
    private IBinder f4226a;

    uq(IBinder iBinder) {
        this.f4226a = iBinder;
    }

    public final void m4753a(Account account, int i, ul ulVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
            if (account != null) {
                obtain.writeInt(1);
                account.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeStrongBinder(ulVar != null ? ulVar.asBinder() : null);
            this.f4226a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4226a;
    }
}
