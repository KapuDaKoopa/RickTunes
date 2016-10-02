package com.google.android.gms.auth.api.signin.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.auth.api.signin.internal.y */
final class C0604y extends LinkedHashMap {
    private final int f2854a;

    public C0604y() {
        this.f2854a = 20;
    }

    protected final boolean removeEldestEntry(Entry entry) {
        return size() > this.f2854a;
    }
}
