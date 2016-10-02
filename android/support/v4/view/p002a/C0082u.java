package android.support.v4.view.p002a;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.view.a.u */
public final class C0082u {
    private static final C0083x f195a;
    private final Object f196b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f195a = new C0087y();
        } else if (VERSION.SDK_INT >= 15) {
            f195a = new C0086w();
        } else if (VERSION.SDK_INT >= 14) {
            f195a = new C0085v();
        } else {
            f195a = new C0084z();
        }
    }

    private C0082u(Object obj) {
        this.f196b = obj;
    }

    public static C0082u m313a() {
        return new C0082u(f195a.m318a());
    }

    public final void m314a(int i) {
        f195a.m321b(this.f196b, i);
    }

    public final void m315a(boolean z) {
        f195a.m320a(this.f196b, z);
    }

    public final void m316b(int i) {
        f195a.m319a(this.f196b, i);
    }

    public final void m317c(int i) {
        f195a.m322c(this.f196b, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0082u c0082u = (C0082u) obj;
        return this.f196b == null ? c0082u.f196b == null : this.f196b.equals(c0082u.f196b);
    }

    public final int hashCode() {
        return this.f196b == null ? 0 : this.f196b.hashCode();
    }
}
