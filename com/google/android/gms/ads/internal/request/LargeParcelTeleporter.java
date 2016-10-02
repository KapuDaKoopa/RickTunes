package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.xk;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@op
public final class LargeParcelTeleporter implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2386a;
    ParcelFileDescriptor f2387b;
    private Parcelable f2388c;
    private boolean f2389d;

    static {
        CREATOR = new ac();
    }

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f2386a = i;
        this.f2387b = parcelFileDescriptor;
        this.f2388c = null;
        this.f2389d = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.f2386a = 1;
        this.f2387b = null;
        this.f2388c = safeParcelable;
        this.f2389d = false;
    }

    private ParcelFileDescriptor m2807a(byte[] bArr) {
        Closeable autoCloseOutputStream;
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C0450b(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = parcelFileDescriptor;
            C0501b.m3027a(6);
            ar.m2243h().m4367a(e, true);
            xk.m4897a(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }

    public final SafeParcelable m2808a(Creator creator) {
        if (this.f2389d) {
            if (this.f2387b == null) {
                C0501b.m3027a(6);
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f2387b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                xk.m4897a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f2388c = (SafeParcelable) creator.createFromParcel(obtain);
                    this.f2389d = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                xk.m4897a(dataInputStream);
            }
        }
        return (SafeParcelable) this.f2388c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f2387b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f2388c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.f2387b = m2807a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        ac.m2812a(this, parcel, i);
    }
}
