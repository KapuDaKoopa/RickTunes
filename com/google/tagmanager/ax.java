package com.google.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

final class ax implements az {
    final /* synthetic */ Map f5102a;
    final /* synthetic */ Map f5103b;
    final /* synthetic */ Map f5104c;
    final /* synthetic */ Map f5105d;
    final /* synthetic */ aw f5106e;

    ax(aw awVar, Map map, Map map2, Map map3, Map map4) {
        this.f5106e = awVar;
        this.f5102a = map;
        this.f5103b = map2;
        this.f5104c = map3;
        this.f5105d = map4;
    }

    public final void m5857a(au auVar, Set set, Set set2, ar arVar) {
        List list = (List) this.f5102a.get(auVar);
        this.f5103b.get(auVar);
        if (list != null) {
            set.addAll(list);
            arVar.m5817c();
        }
        list = (List) this.f5104c.get(auVar);
        this.f5105d.get(auVar);
        if (list != null) {
            set2.addAll(list);
            arVar.m5818d();
        }
    }
}
