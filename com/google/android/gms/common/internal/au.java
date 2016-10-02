package com.google.android.gms.common.internal;

import java.util.Iterator;

public final class au {
    private final String f4831a;

    public au(String str) {
        this.f4831a = str;
    }

    private static CharSequence m5522a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder m5523a(StringBuilder stringBuilder, Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(m5522a(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.f4831a);
                stringBuilder.append(m5522a(it.next()));
            }
        }
        return stringBuilder;
    }
}
