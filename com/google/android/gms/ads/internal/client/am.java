package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.ek;
import com.google.android.gms.p006b.en;

final class am implements ak {
    private IBinder f1932a;

    am(IBinder iBinder) {
        this.f1932a = iBinder;
    }

    public final ah m2309a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            this.f1932a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            ah a = ai.m2297a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2310a(ae aeVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obtain.writeStrongBinder(aeVar != null ? aeVar.asBinder() : null);
            this.f1932a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2311a(az azVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obtain.writeStrongBinder(azVar != null ? azVar.asBinder() : null);
            this.f1932a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2312a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (nativeAdOptionsParcel != null) {
                obtain.writeInt(1);
                nativeAdOptionsParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1932a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2313a(ee eeVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obtain.writeStrongBinder(eeVar != null ? eeVar.asBinder() : null);
            this.f1932a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2314a(eh ehVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obtain.writeStrongBinder(ehVar != null ? ehVar.asBinder() : null);
            this.f1932a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2315a(String str, en enVar, ek ekVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            obtain.writeString(str);
            obtain.writeStrongBinder(enVar != null ? enVar.asBinder() : null);
            if (ekVar != null) {
                iBinder = ekVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1932a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1932a;
    }
}
