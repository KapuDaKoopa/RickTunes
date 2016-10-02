package com.google.android.gms.p006b;

import java.util.Comparator;

/* renamed from: com.google.android.gms.b.br */
final class br implements Comparator {
    final /* synthetic */ bp f3002a;

    br(bp bpVar) {
        this.f3002a = bpVar;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bw bwVar = (bw) obj;
        bw bwVar2 = (bw) obj2;
        int i = bwVar.f3008c - bwVar2.f3008c;
        return i != 0 ? i : (int) (bwVar.f3006a - bwVar2.f3006a);
    }
}
