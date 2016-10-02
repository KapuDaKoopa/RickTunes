package com.google.android.gms.p006b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;

/* renamed from: com.google.android.gms.b.us */
public final class us extends C0469n {
    public us(Context context, Looper looper, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 92, c0727j, c0464l, c0465m);
    }

    protected final /* synthetic */ IInterface m4754a(IBinder iBinder) {
        return uu.m4758a(iBinder);
    }

    protected final String m4755a() {
        return "com.google.android.gms.auth.api.consent.START";
    }

    protected final String m4756b() {
        return "com.google.android.gms.auth.api.consent.internal.IConsentService";
    }
}
