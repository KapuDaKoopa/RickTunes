package com.google.android.gms.p006b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;

/* renamed from: com.google.android.gms.b.vt */
public final class vt extends C0469n {
    public vt(Context context, Looper looper, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 40, c0727j, c0464l, c0465m);
    }

    protected final /* synthetic */ IInterface m4833a(IBinder iBinder) {
        return vy.m4839a(iBinder);
    }

    protected final String m4834a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public final void m4835a(vu vuVar, LogEventParcelable logEventParcelable) {
        ((vx) m2903n()).m4838a(vuVar, logEventParcelable);
    }

    protected final String m4836b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
