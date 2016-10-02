package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0656e;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C0722e extends C0469n {
    private final C0656e f4838a;

    public C0722e(Context context, Looper looper, int i, C0464l c0464l, C0465m c0465m, C0727j c0727j, C0656e c0656e) {
        super(context, looper, i, c0727j, c0464l, c0465m);
        this.f4838a = c0656e;
    }

    protected final IInterface m5546a(IBinder iBinder) {
        return this.f4838a.m5077c();
    }

    protected final String m5547a() {
        return this.f4838a.m5075a();
    }

    protected final String m5548b() {
        return this.f4838a.m5076b();
    }

    protected final void i_() {
        C0656e c0656e = this.f4838a;
    }
}
