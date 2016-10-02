package com.andromo.dev576782.app537736;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

final class du {
    private static final ThreadLocal f847a;

    static {
        f847a = new dv();
    }

    public static SimpleDateFormat m1350a(String str, boolean z) {
        Map map;
        Map map2 = (Map) ((SoftReference) f847a.get()).get();
        if (map2 == null) {
            HashMap hashMap = new HashMap();
            f847a.set(new SoftReference(hashMap));
            map = hashMap;
        } else {
            map = map2;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
        if (simpleDateFormat == null) {
            simpleDateFormat = z ? new SimpleDateFormat(str, Locale.getDefault()) : new SimpleDateFormat(str, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put(str, simpleDateFormat);
        }
        return simpleDateFormat;
    }
}
