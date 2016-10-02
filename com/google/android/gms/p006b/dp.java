package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

/* renamed from: com.google.android.gms.b.dp */
final class dp implements dn {
    private IBinder f3139a;

    dp(IBinder iBinder) {
        this.f3139a = iBinder;
    }

    public final C0314a m3633a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            obtain.writeString(str);
            this.f3139a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0314a a = C0315b.m1995a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3634a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            this.f3139a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3635a(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f3139a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m3636a(String str, C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            obtain.writeString(str);
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f3139a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3139a;
    }
}
