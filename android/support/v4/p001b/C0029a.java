package android.support.v4.p001b;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.b.a */
public class C0029a extends C0028m implements Map {
    C0030g f12a;

    public C0029a(int i) {
        super(i);
    }

    private C0030g m11b() {
        if (this.f12a == null) {
            this.f12a = new C0031b(this);
        }
        return this.f12a;
    }

    public Set entrySet() {
        C0030g b = m11b();
        if (b.f13b == null) {
            b.f13b = new C0037i(b);
        }
        return b.f13b;
    }

    public Set keySet() {
        C0030g b = m11b();
        if (b.f14c == null) {
            b.f14c = new C0038j(b);
        }
        return b.f14c;
    }

    public void putAll(Map map) {
        m7a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        C0030g b = m11b();
        if (b.f15d == null) {
            b.f15d = new C0040l(b);
        }
        return b.f15d;
    }
}
