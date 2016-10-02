package android.support.v4.view.p002a;

import android.os.Build.VERSION;
import java.util.List;

/* renamed from: android.support.v4.view.a.h */
public final class C0069h {
    private static final C0070i f187a;
    private final Object f188b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f187a = new C0075l();
        } else if (VERSION.SDK_INT >= 16) {
            f187a = new C0072j();
        } else {
            f187a = new C0071n();
        }
    }

    public C0069h() {
        this.f188b = f187a.m295a(this);
    }

    public C0069h(Object obj) {
        this.f188b = obj;
    }

    public static C0062a m290b() {
        return null;
    }

    public static boolean m291c() {
        return false;
    }

    public static List m292d() {
        return null;
    }

    public static C0062a m293e() {
        return null;
    }

    public final Object m294a() {
        return this.f188b;
    }
}
