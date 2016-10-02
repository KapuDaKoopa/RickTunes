package android.support.v4.view;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.view.n */
public final class C0101n {
    static final C0102o f224a;

    static {
        if (VERSION.SDK_INT >= 17) {
            f224a = new C0104q();
        } else {
            f224a = new C0103p();
        }
    }

    public static int m514a(int i, int i2) {
        return f224a.m515a(i, i2);
    }
}
