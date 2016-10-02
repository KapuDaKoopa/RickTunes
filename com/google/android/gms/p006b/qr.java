package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* renamed from: com.google.android.gms.b.qr */
final class qr extends qv {
    final /* synthetic */ Context f4022a;
    final /* synthetic */ boolean f4023b;

    qr(Context context, boolean z) {
        this.f4022a = context;
        this.f4023b = z;
        super();
    }

    public final void m4389a() {
        Editor edit = this.f4022a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("content_url_opted_out", this.f4023b);
        edit.apply();
    }
}
