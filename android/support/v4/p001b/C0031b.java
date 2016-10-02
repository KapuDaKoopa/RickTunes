package android.support.v4.p001b;

import java.util.Map;

/* renamed from: android.support.v4.b.b */
final class C0031b extends C0030g {
    final /* synthetic */ C0029a f16a;

    C0031b(C0029a c0029a) {
        this.f16a = c0029a;
    }

    protected final int m24a() {
        return this.f16a.h;
    }

    protected final int m25a(Object obj) {
        return obj == null ? this.f16a.m4a() : this.f16a.m6a(obj, obj.hashCode());
    }

    protected final Object m26a(int i, int i2) {
        return this.f16a.g[(i << 1) + i2];
    }

    protected final Object m27a(int i, Object obj) {
        C0028m c0028m = this.f16a;
        int i2 = (i << 1) + 1;
        Object obj2 = c0028m.f10g[i2];
        c0028m.f10g[i2] = obj;
        return obj2;
    }

    protected final void m28a(int i) {
        this.f16a.m10d(i);
    }

    protected final void m29a(Object obj, Object obj2) {
        this.f16a.put(obj, obj2);
    }

    protected final int m30b(Object obj) {
        return this.f16a.m5a(obj);
    }

    protected final Map m31b() {
        return this.f16a;
    }

    protected final void m32c() {
        this.f16a.clear();
    }
}
