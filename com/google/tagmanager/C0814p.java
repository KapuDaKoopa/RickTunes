package com.google.tagmanager;

import java.util.List;

/* renamed from: com.google.tagmanager.p */
final class C0814p implements Runnable {
    final /* synthetic */ List f5166a;
    final /* synthetic */ long f5167b;
    final /* synthetic */ C0812n f5168c;

    C0814p(C0812n c0812n, List list, long j) {
        this.f5168c = c0812n;
        this.f5166a = list;
        this.f5167b = j;
    }

    public final void run() {
        this.f5168c.m5913b(this.f5166a, this.f5167b);
    }
}
