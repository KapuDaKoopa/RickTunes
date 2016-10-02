package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel implements SafeParcelable {
    private static final Object f4782a;
    private static ClassLoader f4783b;
    private static Integer f4784c;
    private boolean f4785d;

    static {
        f4782a = new Object();
        f4783b = null;
        f4784c = null;
    }

    public DowngradeableSafeParcel() {
        this.f4785d = false;
    }
}
