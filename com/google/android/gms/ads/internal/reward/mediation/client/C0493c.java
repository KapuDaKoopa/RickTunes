package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;

/* renamed from: com.google.android.gms.ads.internal.reward.mediation.client.c */
public final class C0493c implements C0491a {
    private IBinder f2515a;

    public C0493c(IBinder iBinder) {
        this.f2515a = iBinder;
    }

    public final void m2963a(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2964a(C0314a c0314a, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeInt(i);
            this.f2515a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2965a(C0314a c0314a, RewardItemParcel rewardItemParcel) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            if (rewardItemParcel != null) {
                obtain.writeInt(1);
                rewardItemParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2515a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2515a;
    }

    public final void m2966b(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2967b(C0314a c0314a, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeInt(i);
            this.f2515a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2968c(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2969d(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2970e(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2971f(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2972g(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f2515a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
