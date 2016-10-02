package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import com.google.android.gms.p006b.op;

@op
public class ThinAdSizeParcel extends AdSizeParcel {
    public ThinAdSizeParcel(AdSizeParcel adSizeParcel) {
        super(adSizeParcel.f1902a, adSizeParcel.f1903b, adSizeParcel.f1904c, adSizeParcel.f1905d, adSizeParcel.f1906e, adSizeParcel.f1907f, adSizeParcel.f1908g, adSizeParcel.f1909h, adSizeParcel.f1910i, adSizeParcel.f1911j, adSizeParcel.f1912k);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, this.a);
        C0738c.m5598a(parcel, 2, this.b);
        C0738c.m5606b(parcel, 3, this.c);
        C0738c.m5606b(parcel, 6, this.f);
        C0738c.m5605b(parcel, a);
    }
}
