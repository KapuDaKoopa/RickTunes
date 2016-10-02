package com.google.android.gms.p006b;

import android.app.Activity;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.sl */
public final class sl {
    Activity f4101a;
    private boolean f4102b;
    private boolean f4103c;
    private boolean f4104d;
    private OnGlobalLayoutListener f4105e;
    private OnScrollChangedListener f4106f;

    public sl(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f4101a = activity;
        this.f4105e = onGlobalLayoutListener;
        this.f4106f = onScrollChangedListener;
    }

    private void m4528e() {
        if (this.f4101a != null && !this.f4102b) {
            if (this.f4105e != null) {
                ar.m2240e();
                rd.m4412a(this.f4101a, this.f4105e);
            }
            if (this.f4106f != null) {
                ar.m2240e();
                rd.m4413a(this.f4101a, this.f4106f);
            }
            this.f4102b = true;
        }
    }

    private void m4529f() {
        if (this.f4101a != null && this.f4102b) {
            if (this.f4105e != null) {
                ar.m2242g().m4467a(this.f4101a, this.f4105e);
            }
            if (this.f4106f != null) {
                ar.m2240e();
                rd.m4435b(this.f4101a, this.f4106f);
            }
            this.f4102b = false;
        }
    }

    public final void m4530a() {
        this.f4104d = true;
        if (this.f4103c) {
            m4528e();
        }
    }

    public final void m4531b() {
        this.f4104d = false;
        m4529f();
    }

    public final void m4532c() {
        this.f4103c = true;
        if (this.f4104d) {
            m4528e();
        }
    }

    public final void m4533d() {
        this.f4103c = false;
        m4529f();
    }
}
