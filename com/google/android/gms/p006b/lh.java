package com.google.android.gms.p006b;

import com.google.ads.C0234b;
import com.google.ads.C0235c;
import com.google.ads.C0236d;
import com.google.ads.mediation.C0266h;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.C0342i;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.lh */
public final class lh {
    public static int m4174a(C0234b c0234b) {
        switch (li.f3577b[c0234b.ordinal()]) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return 1;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                return 2;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                return 3;
            default:
                return 0;
        }
    }

    public static C0236d m4175a(AdSizeParcel adSizeParcel) {
        int i = 0;
        C0236d[] c0236dArr = new C0236d[]{C0236d.f1307a, C0236d.f1308b, C0236d.f1309c, C0236d.f1310d, C0236d.f1311e, C0236d.f1312f};
        while (i < c0236dArr.length) {
            if (c0236dArr[i].m1672a() == adSizeParcel.f1907f && c0236dArr[i].m1673b() == adSizeParcel.f1904c) {
                return c0236dArr[i];
            }
            i++;
        }
        return new C0236d(C0342i.m2076a(adSizeParcel.f1907f, adSizeParcel.f1904c, adSizeParcel.f1903b));
    }

    public static C0266h m4176a(AdRequestParcel adRequestParcel) {
        C0235c c0235c;
        Set hashSet = adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null;
        Date date = new Date(adRequestParcel.f1885b);
        switch (adRequestParcel.f1887d) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                c0235c = C0235c.MALE;
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                c0235c = C0235c.FEMALE;
                break;
            default:
                c0235c = C0235c.UNKNOWN;
                break;
        }
        return new C0266h(date, c0235c, hashSet, adRequestParcel.f1889f, adRequestParcel.f1894k);
    }
}
