package com.google.android.gms.p006b;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.b.aq */
public final class aq implements bf {
    private final WeakReference f2920a;
    private final WeakReference f2921b;

    public aq(View view, pz pzVar) {
        this.f2920a = new WeakReference(view);
        this.f2921b = new WeakReference(pzVar);
    }

    public final View m3471a() {
        return (View) this.f2920a.get();
    }

    public final boolean m3472b() {
        return this.f2920a.get() == null || this.f2921b.get() == null;
    }

    public final bf m3473c() {
        return new ap((View) this.f2920a.get(), (pz) this.f2921b.get());
    }
}
