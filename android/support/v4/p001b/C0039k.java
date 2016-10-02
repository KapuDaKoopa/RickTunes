package android.support.v4.p001b;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.support.v4.b.k */
final class C0039k implements Iterator, Entry {
    int f36a;
    int f37b;
    boolean f38c;
    final /* synthetic */ C0030g f39d;

    C0039k(C0030g c0030g) {
        this.f39d = c0030g;
        this.f38c = false;
        this.f36a = c0030g.m13a() - 1;
        this.f37b = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f38c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            return C0032c.m35a(entry.getKey(), this.f39d.m15a(this.f37b, 0)) && C0032c.m35a(entry.getValue(), this.f39d.m15a(this.f37b, 1));
        }
    }

    public final Object getKey() {
        if (this.f38c) {
            return this.f39d.m15a(this.f37b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f38c) {
            return this.f39d.m15a(this.f37b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f37b < this.f36a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f38c) {
            Object a = this.f39d.m15a(this.f37b, 0);
            Object a2 = this.f39d.m15a(this.f37b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f37b++;
        this.f38c = true;
        return this;
    }

    public final void remove() {
        if (this.f38c) {
            this.f39d.m17a(this.f37b);
            this.f37b--;
            this.f36a--;
            this.f38c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f38c) {
            return this.f39d.m16a(this.f37b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
