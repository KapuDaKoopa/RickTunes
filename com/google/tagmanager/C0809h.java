package com.google.tagmanager;

import java.util.List;

/* renamed from: com.google.tagmanager.h */
final class C0809h implements C0808l {
    final /* synthetic */ C0805f f5157a;

    C0809h(C0805f c0805f) {
        this.f5157a = c0805f;
    }

    public final void m5900a(List list) {
        for (C0810i c0810i : list) {
            C0805f c0805f = this.f5157a;
            C0805f c0805f2 = this.f5157a;
            c0805f.m5891b(C0805f.m5885a(c0810i.f5158a, c0810i.f5159b));
        }
        this.f5157a.f5156i.countDown();
    }
}
