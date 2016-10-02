package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.gf */
public final class gf implements Iterable {
    private final List f3268a;

    public gf() {
        this.f3268a = new LinkedList();
    }

    public static boolean m3746a(tf tfVar) {
        gd c = gf.m3748c(tfVar);
        if (c == null) {
            return false;
        }
        c.f3265b.m3752a();
        return true;
    }

    public static boolean m3747b(tf tfVar) {
        return gf.m3748c(tfVar) != null;
    }

    private static gd m3748c(tf tfVar) {
        Iterator it = ar.m2255t().iterator();
        while (it.hasNext()) {
            gd gdVar = (gd) it.next();
            if (gdVar.f3264a == tfVar) {
                return gdVar;
            }
        }
        return null;
    }

    public final void m3749a(gd gdVar) {
        this.f3268a.add(gdVar);
    }

    public final void m3750b(gd gdVar) {
        this.f3268a.remove(gdVar);
    }

    public final Iterator iterator() {
        return this.f3268a.iterator();
    }
}
