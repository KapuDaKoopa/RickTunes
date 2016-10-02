package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* renamed from: com.google.android.gms.b.qp */
final class qp extends qv {
    final /* synthetic */ Context f4018a;
    final /* synthetic */ int f4019b;

    qp(Context context, int i) {
        this.f4018a = context;
        this.f4019b = i;
        super();
    }

    public final void m4387a() {
        Editor edit = this.f4018a.getSharedPreferences("admob", 0).edit();
        edit.putInt("webview_cache_version", this.f4019b);
        edit.apply();
    }
}
