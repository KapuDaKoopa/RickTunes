package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.auth.api.credentials.internal.i */
public abstract class C0553i extends Binder implements C0552h {
    public static C0552h m3201a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0552h)) ? new C0554j(iBinder) : (C0552h) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        GeneratePasswordRequest generatePasswordRequest = null;
        C0549e a;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                CredentialRequest credentialRequest;
                parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                a = C0550f.m3192a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    credentialRequest = (CredentialRequest) CredentialRequest.CREATOR.createFromParcel(parcel);
                }
                m3197a(a, credentialRequest);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                SaveRequest saveRequest;
                parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                a = C0550f.m3192a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    saveRequest = (SaveRequest) SaveRequest.CREATOR.createFromParcel(parcel);
                }
                m3200a(a, saveRequest);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                DeleteRequest deleteRequest;
                parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                a = C0550f.m3192a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    deleteRequest = (DeleteRequest) DeleteRequest.CREATOR.createFromParcel(parcel);
                }
                m3198a(a, deleteRequest);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                m3196a(C0550f.m3192a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                a = C0550f.m3192a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    generatePasswordRequest = (GeneratePasswordRequest) GeneratePasswordRequest.CREATOR.createFromParcel(parcel);
                }
                m3199a(a, generatePasswordRequest);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
