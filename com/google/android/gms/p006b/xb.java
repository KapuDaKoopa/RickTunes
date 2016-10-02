package com.google.android.gms.p006b;

import android.support.v4.p001b.C0028m;
import android.support.v4.p001b.C0029a;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.b.xb */
public final class xb extends AbstractSet {
    private final C0029a f4327a;

    public xb() {
        this.f4327a = new C0029a();
    }

    public xb(int i) {
        this.f4327a = new C0029a(i);
    }

    public xb(Collection collection) {
        this(collection.size());
        addAll(collection);
    }

    private boolean m4877a(xb xbVar) {
        int size = size();
        C0028m c0028m = this.f4327a;
        C0028m c0028m2 = xbVar.f4327a;
        int i = c0028m2.f11h;
        c0028m.m7a(c0028m.f11h + i);
        if (c0028m.f11h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                c0028m.put(c0028m2.m8b(i2), c0028m2.m9c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0028m2.f9f, 0, c0028m.f9f, 0, i);
            System.arraycopy(c0028m2.f10g, 0, c0028m.f10g, 0, i << 1);
            c0028m.f11h = i;
        }
        return size() > size;
    }

    public final boolean add(Object obj) {
        if (this.f4327a.containsKey(obj)) {
            return false;
        }
        this.f4327a.put(obj, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        return collection instanceof xb ? m4877a((xb) collection) : super.addAll(collection);
    }

    public final void clear() {
        this.f4327a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f4327a.containsKey(obj);
    }

    public final Iterator iterator() {
        return this.f4327a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        if (!this.f4327a.containsKey(obj)) {
            return false;
        }
        this.f4327a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f4327a.size();
    }
}
