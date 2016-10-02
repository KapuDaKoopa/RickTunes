package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.hq */
final class hq {
    boolean f3340a;
    private final Object[] f3341b;

    hq(AdRequestParcel adRequestParcel, String str, int i) {
        Set hashSet = new HashSet(Arrays.asList(((String) ar.m2249n().m3580a(ck.af)).split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(adRequestParcel.f1885b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(hq.m3806a(adRequestParcel.f1886c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(adRequestParcel.f1887d));
        }
        if (hashSet.contains("keywords")) {
            if (adRequestParcel.f1888e != null) {
                arrayList.add(adRequestParcel.f1888e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.f1889f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(adRequestParcel.f1890g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.f1891h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(adRequestParcel.f1892i);
        }
        if (hashSet.contains("location")) {
            if (adRequestParcel.f1894k != null) {
                arrayList.add(adRequestParcel.f1894k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(adRequestParcel.f1895l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(hq.m3806a(adRequestParcel.f1896m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(hq.m3806a(adRequestParcel.f1897n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (adRequestParcel.f1898o != null) {
                arrayList.add(adRequestParcel.f1898o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(adRequestParcel.f1899p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(adRequestParcel.f1900q);
        }
        this.f3341b = arrayList.toArray();
    }

    private static String m3806a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Collections.sort(new ArrayList(bundle.keySet()));
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            String str2 = obj == null ? "null" : obj instanceof Bundle ? hq.m3806a((Bundle) obj) : obj.toString();
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hq)) {
            return false;
        }
        return Arrays.equals(this.f3341b, ((hq) obj).f3341b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3341b);
    }

    public final String toString() {
        return "[InterstitialAdPoolKey " + Arrays.toString(this.f3341b) + "]";
    }
}
