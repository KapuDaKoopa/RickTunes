package android.support.v4.p000a;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.a.b */
public final class C0001b implements Creator {
    final C0002c f0a;

    public C0001b(C0002c c0002c) {
        this.f0a = c0002c;
    }

    public final Object createFromParcel(Parcel parcel) {
        return this.f0a.m0a(parcel, null);
    }

    public final Object[] newArray(int i) {
        return this.f0a.m1a(i);
    }
}
