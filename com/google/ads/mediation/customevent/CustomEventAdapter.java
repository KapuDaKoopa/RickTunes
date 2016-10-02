package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.C0234b;
import com.google.ads.mediation.C0249j;
import com.google.ads.mediation.C0250l;
import com.google.ads.mediation.C0255n;
import com.google.ads.mediation.C0267k;
import com.google.ads.mediation.C0268m;
import com.google.ads.mediation.C0271q;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.customevent.C0515f;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements C0249j, C0250l {
    C0253c f1335a;
    C0254d f1336b;
    private View f1337c;

    private static Object m1736a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            C0501b.m3025a("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    public final void m1737a() {
        if (this.f1335a != null) {
            C0253c c0253c = this.f1335a;
        }
        if (this.f1336b != null) {
            C0254d c0254d = this.f1336b;
        }
    }

    public final /* synthetic */ void m1738a(C0267k c0267k, C0255n c0255n, C0271q c0271q) {
        C0256e c0256e = (C0256e) c0255n;
        C0515f c0515f = (C0515f) c0271q;
        this.f1335a = (C0253c) m1736a(c0256e.f1344b);
        if (this.f1335a == null) {
            c0267k.m1774a(C0234b.INTERNAL_ERROR);
            return;
        }
        if (c0515f != null) {
            c0515f.m3080a(c0256e.f1343a);
        }
        C0253c c0253c = this.f1335a;
        C0251a c0251a = new C0251a(this, c0267k);
        String str = c0256e.f1343a;
        str = c0256e.f1345c;
    }

    public final /* synthetic */ void m1739a(C0268m c0268m, C0255n c0255n, C0271q c0271q) {
        C0256e c0256e = (C0256e) c0255n;
        C0515f c0515f = (C0515f) c0271q;
        this.f1336b = (C0254d) m1736a(c0256e.f1344b);
        if (this.f1336b == null) {
            c0268m.m1775b(C0234b.INTERNAL_ERROR);
            return;
        }
        if (c0515f != null) {
            c0515f.m3080a(c0256e.f1343a);
        }
        C0254d c0254d = this.f1336b;
        C0252b c0252b = new C0252b(this, this, c0268m);
        String str = c0256e.f1343a;
        str = c0256e.f1345c;
    }

    public final Class m1740b() {
        return C0515f.class;
    }

    public final Class m1741c() {
        return C0256e.class;
    }

    public final View m1742d() {
        return this.f1337c;
    }

    public final void m1743e() {
        C0254d c0254d = this.f1336b;
    }
}
