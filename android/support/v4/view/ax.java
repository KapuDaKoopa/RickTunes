package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ax {
    static final ba f208a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f208a = new az();
        } else {
            f208a = new ay();
        }
    }

    public static int m430a(ViewConfiguration viewConfiguration) {
        return f208a.m431a(viewConfiguration);
    }
}
