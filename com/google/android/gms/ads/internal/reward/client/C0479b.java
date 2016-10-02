package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.C0772e;

/* renamed from: com.google.android.gms.ads.internal.reward.client.b */
public abstract class C0479b extends Binder implements C0478a {
    public C0479b() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                String a = m2919a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                int b = m2920b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
