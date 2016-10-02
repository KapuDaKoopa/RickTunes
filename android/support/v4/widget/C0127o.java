package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.widget.o */
public final class C0127o {
    private static final C0128r f382b;
    private Object f383a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f382b = new C0130q();
        } else {
            f382b = new C0129p();
        }
    }

    public C0127o(Context context) {
        this.f383a = f382b.m713a(context);
    }

    public final void m707a(int i, int i2) {
        f382b.m714a(this.f383a, i, i2);
    }

    public final boolean m708a() {
        return f382b.m715a(this.f383a);
    }

    public final boolean m709a(float f) {
        return f382b.m716a(this.f383a, f);
    }

    public final boolean m710a(Canvas canvas) {
        return f382b.m717a(this.f383a, canvas);
    }

    public final void m711b() {
        f382b.m718b(this.f383a);
    }

    public final boolean m712c() {
        return f382b.m719c(this.f383a);
    }
}
