package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.content.f */
public final class C0049f {
    private static final C0050g f82a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            f82a = new C0053j();
        } else if (i >= 11) {
            f82a = new C0052i();
        } else {
            f82a = new C0051h();
        }
    }

    public static Intent m88a(ComponentName componentName) {
        return f82a.m89a(componentName);
    }
}
