package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command implements Parcelable {
    public static final Creator CREATOR;
    private String f2603a;
    private String f2604b;
    private String f2605c;

    static {
        CREATOR = new C0525a();
    }

    Command(Parcel parcel) {
        this.f2603a = parcel.readString();
        this.f2604b = parcel.readString();
        this.f2605c = parcel.readString();
    }

    public Command(String str, String str2, String str3) {
        this.f2603a = str;
        this.f2604b = str2;
        this.f2605c = str3;
    }

    public final String m3120a() {
        return this.f2603a;
    }

    public final String m3121b() {
        return this.f2605c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2603a);
        parcel.writeString(this.f2604b);
        parcel.writeString(this.f2605c);
    }
}
