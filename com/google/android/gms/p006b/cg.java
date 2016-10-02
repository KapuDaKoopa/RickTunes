package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.cg */
public final class cg {
    final Collection f3028a;
    final Collection f3029b;
    final Collection f3030c;

    public cg() {
        this.f3028a = new ArrayList();
        this.f3029b = new ArrayList();
        this.f3030c = new ArrayList();
    }

    public final List m3579a() {
        List arrayList = new ArrayList();
        for (cb a : this.f3029b) {
            String str = (String) ar.m2249n().m3580a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
