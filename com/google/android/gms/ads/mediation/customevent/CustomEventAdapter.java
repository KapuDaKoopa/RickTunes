package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.C0239d;
import com.google.android.gms.ads.mediation.C0240h;
import com.google.android.gms.ads.mediation.C0241f;
import com.google.android.gms.ads.mediation.C0508a;
import com.google.android.gms.ads.mediation.C0518e;
import com.google.android.gms.ads.mediation.C0519g;
import com.google.android.gms.ads.mediation.C0520i;
import com.google.android.gms.ads.mediation.C0521m;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements C0239d, C0241f, C0240h {
    C0514e f2574a;
    C0516g f2575b;
    C0517h f2576c;
    private View f2577d;

    private static Object m3067a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            C0501b.m3025a("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    public final void m3068a() {
        if (this.f2574a != null) {
            this.f2574a.m3076a();
        }
        if (this.f2575b != null) {
            this.f2575b.m3076a();
        }
        if (this.f2576c != null) {
            this.f2576c.m3076a();
        }
    }

    public final void m3069a(Context context, C0518e c0518e, Bundle bundle, C0333f c0333f, C0508a c0508a, Bundle bundle2) {
        this.f2574a = (C0514e) m3067a(bundle.getString("class_name"));
        if (this.f2574a == null) {
            c0518e.m3085a(0);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        C0514e c0514e = this.f2574a;
        C0511b c0511b = new C0511b(this, c0518e);
        bundle.getString("parameter");
        c0514e.m3079d();
    }

    public final void m3070a(Context context, C0519g c0519g, Bundle bundle, C0508a c0508a, Bundle bundle2) {
        this.f2575b = (C0516g) m3067a(bundle.getString("class_name"));
        if (this.f2575b == null) {
            c0519g.m3090b(0);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        C0516g c0516g = this.f2575b;
        C0512c c0512c = new C0512c(this, this, c0519g);
        bundle.getString("parameter");
        c0516g.m3081d();
    }

    public final void m3071a(Context context, C0520i c0520i, Bundle bundle, C0521m c0521m, Bundle bundle2) {
        this.f2576c = (C0517h) m3067a(bundle.getString("class_name"));
        if (this.f2576c == null) {
            c0520i.m3097c(0);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        C0517h c0517h = this.f2576c;
        C0513d c0513d = new C0513d(this, c0520i);
        bundle.getString("parameter");
        c0517h.m3083d();
    }

    public final void m3072b() {
        if (this.f2574a != null) {
            this.f2574a.m3077b();
        }
        if (this.f2575b != null) {
            this.f2575b.m3077b();
        }
        if (this.f2576c != null) {
            this.f2576c.m3077b();
        }
    }

    public final void m3073c() {
        if (this.f2574a != null) {
            this.f2574a.m3078c();
        }
        if (this.f2575b != null) {
            this.f2575b.m3078c();
        }
        if (this.f2576c != null) {
            this.f2576c.m3078c();
        }
    }

    public final View m3074d() {
        return this.f2577d;
    }

    public final void m3075e() {
        this.f2575b.m3082e();
    }
}
