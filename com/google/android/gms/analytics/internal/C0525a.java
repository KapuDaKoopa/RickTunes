package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.analytics.internal.a */
final class C0525a implements Creator {
    C0525a() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }
}
