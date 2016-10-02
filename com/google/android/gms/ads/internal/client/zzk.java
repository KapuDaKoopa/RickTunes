package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.p006b.op;

@op
public final class zzk {
    private final C0333f[] f2042a;
    private final String f2043b;

    public zzk(Context context, AttributeSet attributeSet) {
        Object obj = 1;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0772e.AdsAttrs);
        String string = obtainAttributes.getString(C0772e.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C0772e.AdsAttrs_adSizes);
        Object obj2 = !TextUtils.isEmpty(string) ? 1 : null;
        if (TextUtils.isEmpty(string2)) {
            obj = null;
        }
        if (obj2 != null && r1 == null) {
            this.f2042a = m2460a(string);
        } else if (obj2 == null && r1 != null) {
            this.f2042a = m2460a(string2);
        } else if (obj2 != null) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f2043b = obtainAttributes.getString(C0772e.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f2043b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static C0333f[] m2460a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C0333f[] c0333fArr = new C0333f[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c0333fArr[i] = new C0333f("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
                }
            } else if ("BANNER".equals(trim)) {
                c0333fArr[i] = C0333f.f1747a;
            } else if ("LARGE_BANNER".equals(trim)) {
                c0333fArr[i] = C0333f.f1749c;
            } else if ("FULL_BANNER".equals(trim)) {
                c0333fArr[i] = C0333f.f1748b;
            } else if ("LEADERBOARD".equals(trim)) {
                c0333fArr[i] = C0333f.f1750d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c0333fArr[i] = C0333f.f1751e;
            } else if ("SMART_BANNER".equals(trim)) {
                c0333fArr[i] = C0333f.f1753g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c0333fArr[i] = C0333f.f1752f;
            } else if ("FLUID".equals(trim)) {
                c0333fArr[i] = C0333f.f1754h;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
            }
        }
        if (c0333fArr.length != 0) {
            return c0333fArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }

    public final String m2461a() {
        return this.f2043b;
    }

    public final C0333f[] m2462a(boolean z) {
        if (z || this.f2042a.length == 1) {
            return this.f2042a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
