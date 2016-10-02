package com.google.android.gms.auth.api.signin.internal;

import android.app.Activity;
import com.google.android.gms.auth.api.signin.C0574h;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.vi;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C0600u {
    final Map f2845a;

    public C0600u(Activity activity, List list, Map map) {
        ax.m5527a((Object) activity);
        ax.m5527a((Object) list);
        ax.m5527a((Object) map);
        Map hashMap = new HashMap();
        for (C0574h c0574h : list) {
            List list2 = (List) map.get(c0574h);
            if (list2 == null) {
                list2 = Collections.emptyList();
            }
            Object viVar = C0574h.FACEBOOK.equals(c0574h) ? new vi(activity, list2) : null;
            if (viVar != null) {
                hashMap.put(c0574h, viVar);
            }
        }
        this.f2845a = Collections.unmodifiableMap(hashMap);
    }
}
