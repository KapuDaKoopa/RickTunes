package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* renamed from: com.google.android.gms.b.qn */
final class qn extends qv {
    final /* synthetic */ Context f4014a;
    final /* synthetic */ boolean f4015b;

    qn(Context context, boolean z) {
        this.f4014a = context;
        this.f4015b = z;
        super();
    }

    public final void m4385a() {
        Editor edit = this.f4014a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("use_https", this.f4015b);
        edit.apply();
    }
}
