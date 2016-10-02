package com.google.android.gms.p006b;

import java.util.Comparator;

/* renamed from: com.google.android.gms.b.bq */
final class bq implements Comparator {
    final /* synthetic */ bp f3001a;

    bq(bp bpVar) {
        this.f3001a = bpVar;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) obj2).length() - ((String) obj).length();
    }
}
