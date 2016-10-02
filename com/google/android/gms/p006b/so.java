package com.google.android.gms.p006b;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@op
/* renamed from: com.google.android.gms.b.so */
public final class so {
    public static ss m4535a(List list) {
        ss smVar = new sm();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (ss a : list) {
            a.m3856a(new sq(atomicInteger, size, smVar, list));
        }
        return smVar;
    }
}
