package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.b.j */
final class C0038j implements Set {
    final /* synthetic */ C0030g f35a;

    C0038j(C0030g c0030g) {
        this.f35a = c0030g;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f35a.m23c();
    }

    public final boolean contains(Object obj) {
        return this.f35a.m14a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f35a.m21b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0030g.m12a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f35a.m13a() - 1; a >= 0; a--) {
            Object a2 = this.f35a.m15a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f35a.m13a() == 0;
    }

    public final Iterator iterator() {
        return new C0036h(this.f35a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f35a.m14a(obj);
        if (a < 0) {
            return false;
        }
        this.f35a.m17a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f35a.m21b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        Map b = this.f35a.m21b();
        int size = b.size();
        Iterator it = b.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != b.size();
    }

    public final int size() {
        return this.f35a.m13a();
    }

    public final Object[] toArray() {
        return this.f35a.m22b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f35a.m19a(objArr, 0);
    }
}
