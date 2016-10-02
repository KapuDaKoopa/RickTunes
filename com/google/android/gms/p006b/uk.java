package com.google.android.gms.p006b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;

/* renamed from: com.google.android.gms.b.uk */
public final class uk extends C0469n {
    public uk(Context context, Looper looper, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 74, c0727j, c0464l, c0465m);
    }

    protected final /* synthetic */ IInterface m4746a(IBinder iBinder) {
        return up.m4752a(iBinder);
    }

    protected final String m4747a() {
        return "com.google.android.gms.auth.api.accountstatus.START";
    }

    protected final String m4748b() {
        return "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";
    }
}
