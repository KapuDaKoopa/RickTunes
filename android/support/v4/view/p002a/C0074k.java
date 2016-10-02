package android.support.v4.view.p002a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.k */
final class C0074k implements C0073q {
    final /* synthetic */ C0069h f189a;
    final /* synthetic */ C0072j f190b;

    C0074k(C0072j c0072j, C0069h c0069h) {
        this.f190b = c0072j;
        this.f189a = c0069h;
    }

    public final boolean m301a() {
        C0069h c0069h = this.f189a;
        return C0069h.m291c();
    }

    public final List m302b() {
        List list = null;
        C0069h c0069h = this.f189a;
        C0069h.m292d();
        List arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C0062a) list.get(i)).m128a());
        }
        return arrayList;
    }

    public final Object m303c() {
        C0069h c0069h = this.f189a;
        C0069h.m290b();
        return null;
    }
}
