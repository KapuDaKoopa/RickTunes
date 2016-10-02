package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.t */
public final class C0132t {
    Object f384a;
    C0133u f385b;

    private C0132t(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f385b = new C0136x();
        } else if (i >= 9) {
            this.f385b = new C0135w();
        } else {
            this.f385b = new C0134v();
        }
        this.f384a = this.f385b.m737a(context, interpolator);
    }

    C0132t(Context context, Interpolator interpolator) {
        this(VERSION.SDK_INT, context, interpolator);
    }

    public final int m734a() {
        return this.f385b.m740b(this.f384a);
    }

    public final int m735b() {
        return this.f385b.m741c(this.f384a);
    }

    public final void m736c() {
        this.f385b.m743e(this.f384a);
    }
}
