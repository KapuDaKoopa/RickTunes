package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: android.support.v4.b.l */
final class C0040l implements Collection {
    final /* synthetic */ C0030g f40a;

    C0040l(C0030g c0030g) {
        this.f40a = c0030g;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f40a.m23c();
    }

    public final boolean contains(Object obj) {
        return this.f40a.m20b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f40a.m13a() == 0;
    }

    public final Iterator iterator() {
        return new C0036h(this.f40a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f40a.m20b(obj);
        if (b < 0) {
            return false;
        }
        this.f40a.m17a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        int a = this.f40a.m13a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f40a.m15a(i, 1))) {
                this.f40a.m17a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = 0;
        int a = this.f40a.m13a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f40a.m15a(i, 1))) {
                this.f40a.m17a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f40a.m13a();
    }

    public final Object[] toArray() {
        return this.f40a.m22b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f40a.m19a(objArr, 1);
    }
}
