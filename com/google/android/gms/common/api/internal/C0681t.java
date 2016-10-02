package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.internal.C0728k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.t */
final class C0681t extends C0678x {
    final /* synthetic */ C0674o f4648a;
    private final ArrayList f4649c;

    public C0681t(C0674o c0674o, ArrayList arrayList) {
        this.f4648a = c0674o;
        super((byte) 0);
        this.f4649c = arrayList;
    }

    @WorkerThread
    public final void m5247a() {
        Set emptySet;
        C0689z c0689z = this.f4648a.f4618a.f4567m;
        C0674o c0674o = this.f4648a;
        if (c0674o.f4628k == null) {
            emptySet = Collections.emptySet();
        } else {
            Set hashSet = new HashSet(c0674o.f4628k.f4841b);
            Map map = c0674o.f4628k.f4843d;
            for (C0654a c0654a : map.keySet()) {
                if (!c0674o.f4618a.f4561g.containsKey(c0654a.m5074b())) {
                    hashSet.addAll(((C0728k) map.get(c0654a)).f4850a);
                }
            }
            emptySet = hashSet;
        }
        c0689z.f4659d = emptySet;
        Iterator it = this.f4649c.iterator();
        while (it.hasNext()) {
            ((C0467c) it.next()).m2864a(this.f4648a.f4625h, this.f4648a.f4618a.f4567m.f4659d);
        }
    }
}
