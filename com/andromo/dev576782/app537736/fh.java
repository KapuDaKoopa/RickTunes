package com.andromo.dev576782.app537736;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class fh {
    private static final String[] f901a;

    static {
        f901a = new String[0];
    }

    public static Map m1434a(Parcel parcel, Class cls) {
        Map hashMap = new HashMap();
        if (parcel != null) {
            String[] createStringArray = parcel.createStringArray();
            Bundle readBundle = parcel.readBundle(cls.getClassLoader());
            for (String str : createStringArray) {
                hashMap.put(str, cls.cast(readBundle.getParcelable(str)));
            }
        }
        return hashMap;
    }

    public static void m1435a(Map map, Parcel parcel) {
        if (map == null || map.size() <= 0) {
            parcel.writeStringArray(f901a);
            parcel.writeBundle(Bundle.EMPTY);
            return;
        }
        Bundle bundle = new Bundle();
        for (Entry entry : map.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
        }
        Set keySet = map.keySet();
        parcel.writeStringArray((String[]) keySet.toArray(new String[keySet.size()]));
        parcel.writeBundle(bundle);
    }
}
