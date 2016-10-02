package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.b.i */
final class C0037i implements Set {
    final /* synthetic */ C0030g f34a;

    C0037i(C0030g c0030g) {
        this.f34a = c0030g;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int a = this.f34a.m13a();
        for (Entry entry : collection) {
            this.f34a.m18a(entry.getKey(), entry.getValue());
        }
        return a != this.f34a.m13a();
    }

    public final void clear() {
        this.f34a.m23c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f34a.m14a(entry.getKey());
        return a >= 0 ? C0032c.m35a(this.f34a.m15a(a, 1), entry.getValue()) : false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0030g.m12a((Set) this, obj);
    }

    public final int hashCode() {
        int a = this.f34a.m13a() - 1;
        int i = 0;
        while (a >= 0) {
            Object a2 = this.f34a.m15a(a, 0);
            Object a3 = this.f34a.m15a(a, 1);
            a--;
            i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f34a.m13a() == 0;
    }

    public final Iterator iterator() {
        return new C0039k(this.f34a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f34a.m13a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
