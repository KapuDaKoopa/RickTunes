package com.google.android.gms.ads.internal.formats;

import android.text.TextUtils;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.tf;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.formats.k */
final class C0389k implements fk {
    final /* synthetic */ C0387j f2113a;

    C0389k(C0387j c0387j) {
        this.f2113a = c0387j;
    }

    public final void m2588a(tf tfVar, Map map) {
        this.f2113a.f2097c.m4579l().m4609a(new C0390l(this, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            this.f2113a.f2097c.loadData(str, "text/html", "UTF-8");
        } else {
            this.f2113a.f2097c.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
