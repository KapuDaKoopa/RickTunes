package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.auth.api.credentials.internal.j */
final class C0554j implements C0552h {
    private IBinder f2710a;

    C0554j(IBinder iBinder) {
        this.f2710a = iBinder;
    }

    public final void m3202a(C0549e c0549e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            obtain.writeStrongBinder(c0549e != null ? c0549e.asBinder() : null);
            this.f2710a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3203a(C0549e c0549e, CredentialRequest credentialRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            obtain.writeStrongBinder(c0549e != null ? c0549e.asBinder() : null);
            if (credentialRequest != null) {
                obtain.writeInt(1);
                credentialRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2710a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3204a(C0549e c0549e, DeleteRequest deleteRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            obtain.writeStrongBinder(c0549e != null ? c0549e.asBinder() : null);
            if (deleteRequest != null) {
                obtain.writeInt(1);
                deleteRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2710a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3205a(C0549e c0549e, GeneratePasswordRequest generatePasswordRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            obtain.writeStrongBinder(c0549e != null ? c0549e.asBinder() : null);
            if (generatePasswordRequest != null) {
                obtain.writeInt(1);
                generatePasswordRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2710a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3206a(C0549e c0549e, SaveRequest saveRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            obtain.writeStrongBinder(c0549e != null ? c0549e.asBinder() : null);
            if (saveRequest != null) {
                obtain.writeInt(1);
                saveRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2710a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2710a;
    }
}
