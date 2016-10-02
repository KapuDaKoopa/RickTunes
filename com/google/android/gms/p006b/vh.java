package com.google.android.gms.p006b;

import android.app.Activity;
import com.google.android.gms.common.internal.ax;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.b.vh */
public abstract class vh implements vf {
    protected final Activity f4272a;
    protected final Set f4273b;
    String f4274c;
    vg f4275d;
    private String f4276e;

    protected vh(Activity activity, List list, List list2) {
        this.f4272a = (Activity) ax.m5527a((Object) activity);
        Set hashSet = new HashSet((Collection) ax.m5527a((Object) list));
        hashSet.addAll((Collection) ax.m5527a((Object) list2));
        this.f4273b = Collections.unmodifiableSet(hashSet);
    }

    protected final Set m4800b() {
        return this.f4273b;
    }

    protected final void m4801b(vg vgVar) {
        this.f4275d = (vg) ax.m5527a((Object) vgVar);
    }

    protected final void m4802b(String str, String str2, vg vgVar) {
        this.f4276e = str;
        this.f4274c = str2;
        m4801b(vgVar);
    }
}
