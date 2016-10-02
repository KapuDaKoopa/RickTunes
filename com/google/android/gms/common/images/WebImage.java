package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class WebImage implements SafeParcelable {
    public static final Creator CREATOR;
    private final int f4758a;
    private final Uri f4759b;
    private final int f4760c;
    private final int f4761d;

    static {
        CREATOR = new C0717h();
    }

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f4758a = i;
        this.f4759b = uri;
        this.f4760c = i2;
        this.f4761d = i3;
    }

    final int m5377a() {
        return this.f4758a;
    }

    public final Uri m5378b() {
        return this.f4759b;
    }

    public final int m5379c() {
        return this.f4760c;
    }

    public final int m5380d() {
        return this.f4761d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return av.m5525a(this.f4759b, webImage.f4759b) && this.f4760c == webImage.f4760c && this.f4761d == webImage.f4761d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4759b, Integer.valueOf(this.f4760c), Integer.valueOf(this.f4761d)});
    }

    public final String toString() {
        return String.format("Image %dx%d %s", new Object[]{Integer.valueOf(this.f4760c), Integer.valueOf(this.f4761d), this.f4759b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0717h.m5387a(this, parcel, i);
    }
}
