package com.google.android.gms.p006b;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

/* renamed from: com.google.android.gms.b.dl */
final class dl implements dj {
    private IBinder f3134a;

    dl(IBinder iBinder) {
        this.f3134a = iBinder;
    }

    public final C0314a m3627a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f3134a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0314a a = C0315b.m1995a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3134a;
    }

    public final Uri m3628b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f3134a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Uri uri = obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return uri;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final double m3629c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f3134a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            double readDouble = obtain2.readDouble();
            return readDouble;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
