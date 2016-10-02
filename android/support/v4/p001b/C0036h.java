package android.support.v4.p001b;

import java.util.Iterator;

/* renamed from: android.support.v4.b.h */
final class C0036h implements Iterator {
    final int f29a;
    int f30b;
    int f31c;
    boolean f32d;
    final /* synthetic */ C0030g f33e;

    C0036h(C0030g c0030g, int i) {
        this.f33e = c0030g;
        this.f32d = false;
        this.f29a = i;
        this.f30b = c0030g.m13a();
    }

    public final boolean hasNext() {
        return this.f31c < this.f30b;
    }

    public final Object next() {
        Object a = this.f33e.m15a(this.f31c, this.f29a);
        this.f31c++;
        this.f32d = true;
        return a;
    }

    public final void remove() {
        if (this.f32d) {
            this.f31c--;
            this.f30b--;
            this.f32d = false;
            this.f33e.m17a(this.f31c);
            return;
        }
        throw new IllegalStateException();
    }
}
