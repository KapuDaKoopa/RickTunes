package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class an {
    static final aw f206a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            f206a = new av();
        } else if (i >= 17) {
            f206a = new au();
        } else if (i >= 16) {
            f206a = new at();
        } else if (i >= 14) {
            f206a = new as();
        } else if (i >= 11) {
            f206a = new ar();
        } else if (i >= 9) {
            f206a = new aq();
        } else {
            f206a = new ao();
        }
    }

    public static int m362a(int i, int i2) {
        return f206a.m378a(i, i2);
    }

    public static void m363a(View view, int i, int i2, int i3, int i4) {
        f206a.m379a(view, i, i2, i3, i4);
    }

    public static void m364a(View view, int i, Paint paint) {
        f206a.m380a(view, i, paint);
    }

    public static void m365a(View view, Paint paint) {
        f206a.m381a(view, paint);
    }

    public static void m366a(View view, C0088a c0088a) {
        f206a.m382a(view, c0088a);
    }

    public static void m367a(View view, Runnable runnable) {
        f206a.m383a(view, runnable);
    }

    public static boolean m368a(View view) {
        return f206a.m384a(view);
    }

    public static boolean m369a(View view, int i) {
        return f206a.m385a(view, i);
    }

    public static int m370b(View view) {
        return f206a.m386b(view);
    }

    public static void m371b(View view, int i) {
        f206a.m387b(view, i);
    }

    public static void m372c(View view) {
        f206a.m388c(view);
    }

    public static int m373d(View view) {
        return f206a.m389d(view);
    }

    public static int m374e(View view) {
        return f206a.m390e(view);
    }

    public static int m375f(View view) {
        return f206a.m391f(view);
    }

    public static ViewParent m376g(View view) {
        return f206a.m392g(view);
    }

    public static boolean m377h(View view) {
        return f206a.m393h(view);
    }
}
