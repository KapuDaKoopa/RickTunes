package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import java.util.WeakHashMap;

@op
/* renamed from: com.google.android.gms.b.pk */
public final class pk {
    private WeakHashMap f3910a;

    public pk() {
        this.f3910a = new WeakHashMap();
    }

    public final pi m4345a(Context context) {
        pi a;
        pl plVar = (pl) this.f3910a.get(context);
        if (plVar != null) {
            if ((plVar.f3911a + ((Long) ar.m2249n().m3580a(ck.am)).longValue() < ar.m2244i().m4887a() ? 1 : null) == null) {
                if (((Boolean) ar.m2249n().m3580a(ck.al)).booleanValue()) {
                    a = new pj(context, plVar.f3912b).m4344a();
                    this.f3910a.put(context, new pl(this, a));
                    return a;
                }
            }
        }
        a = new pj(context).m4344a();
        this.f3910a.put(context, new pl(this, a));
        return a;
    }
}
