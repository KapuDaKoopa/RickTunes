package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.C0607k;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.ax;

public final class aa extends C0469n {
    private final C0607k f2813a;

    public aa(Context context, Looper looper, C0727j c0727j, C0607k c0607k, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 87, c0727j, c0464l, c0465m);
        this.f2813a = (C0607k) ax.m5527a((Object) c0607k);
    }

    protected final /* synthetic */ IInterface m3295a(IBinder iBinder) {
        return C0596q.m3394a(iBinder);
    }

    protected final String m3296a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected final String m3297b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
}
