package com.andromo.dev576782.app537736;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.andromo.dev576782.app537736.p */
final class C0214p implements C0213o {
    final /* synthetic */ C0211m f1210a;
    private final Map f1211b;

    private C0214p(C0211m c0211m) {
        this.f1210a = c0211m;
        this.f1211b = new HashMap();
    }

    public final void m1642a(List list, List list2) {
        Map map = this.f1211b;
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0212n c0212n = (C0212n) list.get(i);
            c0212n.f1208b = 0.0f;
            map.put(c0212n.f1207a.activityInfo.packageName, c0212n);
        }
        float f = 1.0f;
        int size2 = list2.size() - 1;
        while (size2 >= 0) {
            float f2;
            C0215q c0215q = (C0215q) list2.get(size2);
            C0212n c0212n2 = (C0212n) map.get(c0215q.f1212a.getPackageName());
            if (c0212n2 != null) {
                c0212n2.f1208b = (c0215q.f1214c * f) + c0212n2.f1208b;
                f2 = 0.95f * f;
            } else {
                f2 = f;
            }
            size2--;
            f = f2;
        }
        Collections.sort(list);
    }
}
