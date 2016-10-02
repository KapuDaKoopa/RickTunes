package com.google.android.gms.p006b;

import java.net.URL;
import java.util.ArrayList;

@op
/* renamed from: com.google.android.gms.b.fp */
final class fp {
    final String f3236a;
    final URL f3237b;
    final ArrayList f3238c;
    final String f3239d;

    public fp(String str, URL url, ArrayList arrayList, String str2) {
        this.f3236a = str;
        this.f3237b = url;
        if (arrayList == null) {
            this.f3238c = new ArrayList();
        } else {
            this.f3238c = arrayList;
        }
        this.f3239d = str2;
    }
}
