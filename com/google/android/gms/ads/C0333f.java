package com.google.android.gms.ads;

import android.content.Context;
import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;

/* renamed from: com.google.android.gms.ads.f */
public final class C0333f {
    public static final C0333f f1747a;
    public static final C0333f f1748b;
    public static final C0333f f1749c;
    public static final C0333f f1750d;
    public static final C0333f f1751e;
    public static final C0333f f1752f;
    public static final C0333f f1753g;
    public static final C0333f f1754h;
    private final int f1755i;
    private final int f1756j;
    private final String f1757k;

    static {
        f1747a = new C0333f(320, 50, "320x50_mb");
        f1748b = new C0333f(468, 60, "468x60_as");
        f1749c = new C0333f(320, 100, "320x100_as");
        f1750d = new C0333f(728, 90, "728x90_as");
        f1751e = new C0333f(300, 250, "300x250_as");
        f1752f = new C0333f(160, 600, "160x600_as");
        f1753g = new C0333f(-1, -2, "smart_banner");
        f1754h = new C0333f(-3, -4, "fluid");
    }

    public C0333f(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    C0333f(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f1755i = i;
            this.f1756j = i2;
            this.f1757k = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public final int m2041a() {
        return this.f1756j;
    }

    public final int m2042a(Context context) {
        switch (this.f1756j) {
            case -4:
            case -3:
                return -1;
            case IcsAdapterView.ITEM_VIEW_TYPE_HEADER_OR_FOOTER /*-2*/:
                return AdSizeParcel.m2273b(context.getResources().getDisplayMetrics());
            default:
                C0374z.m2455a();
                return C0500a.m3009a(context, this.f1756j);
        }
    }

    public final int m2043b() {
        return this.f1755i;
    }

    public final int m2044b(Context context) {
        switch (this.f1755i) {
            case -4:
            case -3:
                return -1;
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                return AdSizeParcel.m2271a(context.getResources().getDisplayMetrics());
            default:
                C0374z.m2455a();
                return C0500a.m3009a(context, this.f1755i);
        }
    }

    public final boolean m2045c() {
        return this.f1755i == -3 && this.f1756j == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0333f)) {
            return false;
        }
        C0333f c0333f = (C0333f) obj;
        return this.f1755i == c0333f.f1755i && this.f1756j == c0333f.f1756j && this.f1757k.equals(c0333f.f1757k);
    }

    public final int hashCode() {
        return this.f1757k.hashCode();
    }

    public final String toString() {
        return this.f1757k;
    }
}
