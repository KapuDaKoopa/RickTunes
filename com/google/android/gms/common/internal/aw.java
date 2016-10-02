package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class aw {
    private final List f4832a;
    private final Object f4833b;

    private aw(Object obj) {
        this.f4833b = ax.m5527a(obj);
        this.f4832a = new ArrayList();
    }

    public final aw m5526a(String str, Object obj) {
        this.f4832a.add(((String) ax.m5527a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f4833b.getClass().getSimpleName()).append('{');
        int size = this.f4832a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f4832a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
