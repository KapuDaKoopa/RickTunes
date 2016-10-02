package com.google.android.gms.p006b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;

/* renamed from: com.google.android.gms.b.wu */
public final class wu extends C0469n {
    public wu(Context context, Looper looper, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 39, c0727j, c0464l, c0465m);
    }

    protected final /* synthetic */ IInterface m4864a(IBinder iBinder) {
        return wz.m4869a(iBinder);
    }

    public final String m4865a() {
        return "com.google.android.gms.common.service.START";
    }

    protected final String m4866b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
