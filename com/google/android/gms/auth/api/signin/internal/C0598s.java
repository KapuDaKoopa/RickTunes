package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.C0574h;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ax;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public final class C0598s {
    public static void m3401a(SignInConfiguration signInConfiguration, List list, Map map) {
        ax.m5527a((Object) signInConfiguration);
        ax.m5527a((Object) list);
        ax.m5527a((Object) map);
        GoogleSignInOptions d = signInConfiguration.m3280d();
        if (d != null) {
            list.add(C0574h.GOOGLE);
            List linkedList = new LinkedList();
            Iterator it = d.m3243a().iterator();
            while (it.hasNext()) {
                linkedList.add(((Scope) it.next()).m5065a());
            }
            map.put(C0574h.GOOGLE, linkedList);
        }
    }
}
