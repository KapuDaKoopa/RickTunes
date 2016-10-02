package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bb {
    static final be f209a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            f209a = new bf();
        } else if (i >= 14) {
            f209a = new bd();
        } else if (i >= 11) {
            f209a = new bc();
        } else {
            f209a = new bg();
        }
    }

    public static void m465a(ViewGroup viewGroup) {
        f209a.m467a(viewGroup);
    }

    public static int m466b(ViewGroup viewGroup) {
        return f209a.m468b(viewGroup);
    }
}
