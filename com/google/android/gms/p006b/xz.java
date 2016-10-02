package com.google.android.gms.p006b;

import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C0793k;

/* renamed from: com.google.android.gms.b.xz */
public final class xz {
    public static final C0655d f4339a;
    public static final C0655d f4340b;
    public static final C0531b f4341c;
    static final C0531b f4342d;
    public static final Scope f4343e;
    public static final Scope f4344f;
    public static final C0654a f4345g;
    public static final C0654a f4346h;
    public static final yd f4347i;

    static {
        f4339a = new C0655d();
        f4340b = new C0655d();
        f4341c = new ya();
        f4342d = new yb();
        f4343e = new Scope("profile");
        f4344f = new Scope("email");
        f4345g = new C0654a("SignIn.API", f4341c, f4339a);
        f4346h = new C0654a("SignIn.INTERNAL_API", f4342d, f4340b);
        f4347i = new C0793k();
    }
}
