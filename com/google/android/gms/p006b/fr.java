package com.google.android.gms.p006b;

import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.fr */
final class fr {
    final String f3244a;
    final int f3245b;
    final List f3246c;
    final String f3247d;

    public fr(String str, int i, List list, String str2) {
        this.f3244a = str;
        this.f3245b = i;
        if (list == null) {
            this.f3246c = new ArrayList();
        } else {
            this.f3246c = list;
        }
        this.f3247d = str2;
    }
}
