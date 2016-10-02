package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.p017a.C0317d;
import com.google.android.gms.p017a.C0318e;
import com.google.android.gms.p017a.C0319f;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C0721d extends C0318e {
    private static final C0721d f4837a;

    static {
        f4837a = new C0721d();
    }

    private C0721d() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View m5543a(Context context, int i, int i2, Scope[] scopeArr) {
        return f4837a.m5544b(context, i, i2, scopeArr);
    }

    private View m5544b(Context context, int i, int i2, Scope[] scopeArr) {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, scopeArr);
            return (View) C0317d.m1997a(((ar) m1998a(context)).m5518a(C0317d.m1996a((Object) context), signInButtonConfig));
        } catch (Throwable e) {
            throw new C0319f("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public final /* synthetic */ Object m5545a(IBinder iBinder) {
        return as.m5519a(iBinder);
    }
}
