package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: com.google.android.gms.auth.api.signin.internal.r */
final class C0597r implements C0595p {
    private IBinder f2844a;

    C0597r(IBinder iBinder) {
        this.f2844a = iBinder;
    }

    public final void m3395a(C0578m c0578m, GoogleSignInOptions googleSignInOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (googleSignInOptions != null) {
                obtain.writeInt(1);
                googleSignInOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2844a.transact(101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3396a(C0578m c0578m, SignInConfiguration signInConfiguration) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (signInConfiguration != null) {
                obtain.writeInt(1);
                signInConfiguration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2844a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3397a(C0578m c0578m, SignInConfiguration signInConfiguration, SignInAccount signInAccount, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (signInConfiguration != null) {
                obtain.writeInt(1);
                signInConfiguration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (signInAccount != null) {
                obtain.writeInt(1);
                signInAccount.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f2844a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2844a;
    }

    public final void m3398b(C0578m c0578m, GoogleSignInOptions googleSignInOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (googleSignInOptions != null) {
                obtain.writeInt(1);
                googleSignInOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2844a.transact(102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3399b(C0578m c0578m, SignInConfiguration signInConfiguration) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (signInConfiguration != null) {
                obtain.writeInt(1);
                signInConfiguration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2844a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3400c(C0578m c0578m, GoogleSignInOptions googleSignInOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
            obtain.writeStrongBinder(c0578m != null ? c0578m.asBinder() : null);
            if (googleSignInOptions != null) {
                obtain.writeInt(1);
                googleSignInOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2844a.transact(103, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
