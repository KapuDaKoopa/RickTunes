package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator CREATOR;
    private IBinder f4781a;

    static {
        CREATOR = new C0718a();
    }

    public BinderWrapper() {
        this.f4781a = null;
    }

    private BinderWrapper(Parcel parcel) {
        this.f4781a = null;
        this.f4781a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f4781a);
    }
}
