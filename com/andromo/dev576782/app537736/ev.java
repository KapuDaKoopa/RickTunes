package com.andromo.dev576782.app537736;

import java.lang.reflect.Array;

public final class ev {
    public static int m1410a(int i, Object obj) {
        if (obj == null) {
            return (i * 37) + 0;
        }
        if (!obj.getClass().isArray()) {
            return obj.hashCode() + (i * 37);
        }
        int length = Array.getLength(obj);
        int i2 = 0;
        int i3 = i;
        while (i2 < length) {
            i = m1410a(i3, Array.get(obj, i2));
            i2++;
            i3 = i;
        }
        return i3;
    }
}
