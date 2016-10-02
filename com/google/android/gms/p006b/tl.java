package com.google.android.gms.p006b;

import java.util.Map;

/* renamed from: com.google.android.gms.b.tl */
final class tl implements fk {
    final /* synthetic */ tg f4157a;

    private tl(tg tgVar) {
        this.f4157a = tgVar;
    }

    public final void m4621a(tf tfVar, Map map) {
        if (map.keySet().contains("start")) {
            tg.m4597a(this.f4157a);
        } else if (map.keySet().contains("stop")) {
            tg.m4598b(this.f4157a);
        } else if (map.keySet().contains("cancel")) {
            tg.m4599c(this.f4157a);
        }
    }
}
