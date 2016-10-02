package com.google.tagmanager;

import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.android.gms.C0772e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class bn {
    private static ak m5876a(ak akVar) {
        try {
            return new ak(bl.m5871a(URLEncoder.encode(bl.m5872a((C0286b) akVar.f5069a), "UTF-8").replaceAll("\\+", "%20")), akVar.f5070b);
        } catch (UnsupportedEncodingException e) {
            C0824z.m5938b();
            return akVar;
        }
    }

    static ak m5877a(ak akVar, int... iArr) {
        int length = iArr.length;
        int i = 0;
        ak akVar2 = akVar;
        while (i < length) {
            ak a;
            int i2 = iArr[i];
            if (bl.m5875c((C0286b) akVar2.f5069a) instanceof String) {
                switch (i2) {
                    case C0772e.MapAttrs_uiZoomGestures /*12*/:
                        a = m5876a(akVar2);
                        break;
                    default:
                        "Unsupported Value Escaping: " + i2;
                        C0824z.m5936a();
                        a = akVar2;
                        break;
                }
            }
            C0824z.m5936a();
            a = akVar2;
            i++;
            akVar2 = a;
        }
        return akVar2;
    }
}
