package com.google.android.gms.p006b;

import android.view.View;
import com.google.android.gms.ads.internal.formats.C0386h;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.b.an */
public final class an implements bf {
    private WeakReference f2916a;

    public an(C0386h c0386h) {
        this.f2916a = new WeakReference(c0386h);
    }

    public final View m3462a() {
        C0386h c0386h = (C0386h) this.f2916a.get();
        return c0386h != null ? c0386h.m2567e() : null;
    }

    public final boolean m3463b() {
        return this.f2916a.get() == null;
    }

    public final bf m3464c() {
        return new ao((C0386h) this.f2916a.get());
    }
}
