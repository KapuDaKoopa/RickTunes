package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* renamed from: android.support.v4.view.r */
public final class C0105r {
    static final C0106v f225a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f225a = new C0109u();
        } else {
            f225a = new C0107s();
        }
    }

    public static boolean m518a(KeyEvent keyEvent) {
        return f225a.m522b(keyEvent.getMetaState());
    }

    public static boolean m519b(KeyEvent keyEvent) {
        return f225a.m523c(keyEvent.getMetaState());
    }

    public static void m520c(KeyEvent keyEvent) {
        f225a.m521a(keyEvent);
    }
}
