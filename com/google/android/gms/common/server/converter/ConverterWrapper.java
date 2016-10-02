package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.C0754a;

public class ConverterWrapper implements SafeParcelable {
    public static final C0755a CREATOR;
    private final int f4896a;
    private final StringToIntConverter f4897b;

    static {
        CREATOR = new C0755a();
    }

    ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.f4896a = i;
        this.f4897b = stringToIntConverter;
    }

    private ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.f4896a = 1;
        this.f4897b = stringToIntConverter;
    }

    public static ConverterWrapper m5645a(C0754a c0754a) {
        if (c0754a instanceof StringToIntConverter) {
            return new ConverterWrapper((StringToIntConverter) c0754a);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    final int m5646a() {
        return this.f4896a;
    }

    final StringToIntConverter m5647b() {
        return this.f4897b;
    }

    public final C0754a m5648c() {
        if (this.f4897b != null) {
            return this.f4897b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        C0755a c0755a = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0755a c0755a = CREATOR;
        C0755a.m5654a(this, parcel, i);
    }
}
