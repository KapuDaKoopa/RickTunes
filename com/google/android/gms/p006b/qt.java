package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* renamed from: com.google.android.gms.b.qt */
final class qt extends qv {
    final /* synthetic */ Context f4026a;
    final /* synthetic */ String f4027b;

    qt(Context context, String str) {
        this.f4026a = context;
        this.f4027b = str;
        super();
    }

    public final void m4391a() {
        Editor edit = this.f4026a.getSharedPreferences("admob", 0).edit();
        edit.putString("content_url_hashes", this.f4027b);
        edit.apply();
    }
}
