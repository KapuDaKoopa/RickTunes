package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C0596q extends Binder implements C0595p {
    public static C0595p m3394a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0595p)) ? new C0597r(iBinder) : (C0595p) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3389a(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (SignInConfiguration) SignInConfiguration.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3392b(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (SignInConfiguration) SignInConfiguration.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3390a(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (SignInConfiguration) SignInConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (SignInAccount) SignInAccount.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 101:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3388a(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 102:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3391b(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 103:
                parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                m3393c(C0579n.m3321a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
