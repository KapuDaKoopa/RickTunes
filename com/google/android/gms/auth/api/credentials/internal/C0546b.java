package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C0561h;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;

/* renamed from: com.google.android.gms.auth.api.credentials.internal.b */
public final class C0546b extends C0469n {
    private final C0561h f2708a;

    public C0546b(Context context, Looper looper, C0727j c0727j, C0561h c0561h, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 68, c0727j, c0464l, c0465m);
        this.f2708a = c0561h;
    }

    protected final /* synthetic */ IInterface m3184a(IBinder iBinder) {
        return C0553i.m3201a(iBinder);
    }

    protected final String m3185a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected final String m3186b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected final Bundle b_() {
        if (this.f2708a == null) {
            return new Bundle();
        }
        C0561h c0561h = this.f2708a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", c0561h.f2711a);
        bundle.putParcelable("password_specification", c0561h.f2712b);
        return bundle;
    }
}
