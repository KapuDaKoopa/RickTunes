package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0690j;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.request.r */
public final class C0470r extends C0469n {
    final int f2501a;

    public C0470r(Context context, Looper looper, C0464l c0464l, C0465m c0465m, int i) {
        super(context, looper, 8, new C0690j(context).m5310a(), c0464l, c0465m);
        this.f2501a = i;
    }

    protected final /* synthetic */ IInterface m2904a(IBinder iBinder) {
        return C0476x.m2916a(iBinder);
    }

    protected final String m2905a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String m2906b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final C0475w m2907c() {
        return (C0475w) super.m2903n();
    }
}
