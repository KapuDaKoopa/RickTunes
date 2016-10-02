package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.C0342i;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public class AdSizeParcel implements SafeParcelable {
    public static final C0371v CREATOR;
    public final int f1902a;
    public final String f1903b;
    public final int f1904c;
    public final int f1905d;
    public final boolean f1906e;
    public final int f1907f;
    public final int f1908g;
    public final AdSizeParcel[] f1909h;
    public final boolean f1910i;
    public final boolean f1911j;
    public boolean f1912k;

    static {
        CREATOR = new C0371v();
    }

    public AdSizeParcel() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4) {
        this.f1902a = i;
        this.f1903b = str;
        this.f1904c = i2;
        this.f1905d = i3;
        this.f1906e = z;
        this.f1907f = i4;
        this.f1908g = i5;
        this.f1909h = adSizeParcelArr;
        this.f1910i = z2;
        this.f1911j = z3;
        this.f1912k = z4;
    }

    public AdSizeParcel(Context context, C0333f c0333f) {
        this(context, new C0333f[]{c0333f});
    }

    public AdSizeParcel(Context context, C0333f[] c0333fArr) {
        int i;
        int i2;
        C0333f c0333f = c0333fArr[0];
        this.f1902a = 5;
        this.f1906e = false;
        this.f1911j = c0333f.m2045c();
        if (this.f1911j) {
            this.f1907f = C0333f.f1747a.m2043b();
            this.f1904c = C0333f.f1747a.m2041a();
        } else {
            this.f1907f = c0333f.m2043b();
            this.f1904c = c0333f.m2041a();
        }
        boolean z = this.f1907f == -1;
        boolean z2 = this.f1904c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            double d;
            C0374z.m2455a();
            if (C0500a.m3022c(context)) {
                C0374z.m2455a();
                if (C0500a.m3023d(context)) {
                    i = displayMetrics.widthPixels;
                    C0374z.m2455a();
                    this.f1908g = i - C0500a.m3024e(context);
                    d = (double) (((float) this.f1908g) / displayMetrics.density);
                    i = (int) d;
                    if (d - ((double) ((int) d)) >= 0.01d) {
                        i++;
                    }
                    i2 = i;
                }
            }
            this.f1908g = displayMetrics.widthPixels;
            d = (double) (((float) this.f1908g) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.f1907f;
            C0374z.m2455a();
            this.f1908g = C0500a.m3010a(displayMetrics, this.f1907f);
            i2 = i;
        }
        i = z2 ? m2275c(displayMetrics) : this.f1904c;
        C0374z.m2455a();
        this.f1905d = C0500a.m3010a(displayMetrics, i);
        if (z || z2) {
            this.f1903b = i2 + "x" + i + "_as";
        } else if (this.f1911j) {
            this.f1903b = "320x50_mb";
        } else {
            this.f1903b = c0333f.toString();
        }
        if (c0333fArr.length > 1) {
            this.f1909h = new AdSizeParcel[c0333fArr.length];
            for (int i3 = 0; i3 < c0333fArr.length; i3++) {
                this.f1909h[i3] = new AdSizeParcel(context, c0333fArr[i3]);
            }
        } else {
            this.f1909h = null;
        }
        this.f1910i = false;
        this.f1912k = false;
    }

    public AdSizeParcel(AdSizeParcel adSizeParcel, AdSizeParcel[] adSizeParcelArr) {
        this(5, adSizeParcel.f1903b, adSizeParcel.f1904c, adSizeParcel.f1905d, adSizeParcel.f1906e, adSizeParcel.f1907f, adSizeParcel.f1908g, adSizeParcelArr, adSizeParcel.f1910i, adSizeParcel.f1911j, adSizeParcel.f1912k);
    }

    public static int m2271a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static AdSizeParcel m2272a() {
        return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int m2273b(DisplayMetrics displayMetrics) {
        return (int) (((float) m2275c(displayMetrics)) * displayMetrics.density);
    }

    public static AdSizeParcel m2274b() {
        return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    private static int m2275c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public final void m2276a(boolean z) {
        this.f1912k = z;
    }

    public final C0333f m2277c() {
        return C0342i.m2076a(this.f1907f, this.f1904c, this.f1903b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0371v.m2447a(this, parcel, i);
    }
}
