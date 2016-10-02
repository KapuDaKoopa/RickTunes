package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: com.google.android.gms.b.qq */
final class qq extends qv {
    final /* synthetic */ Context f4020a;
    final /* synthetic */ qw f4021b;

    qq(Context context, qw qwVar) {
        this.f4020a = context;
        this.f4021b = qwVar;
        super();
    }

    public final void m4388a() {
        SharedPreferences sharedPreferences = this.f4020a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedPreferences.getInt("webview_cache_version", 0));
        if (this.f4021b != null) {
            this.f4021b.m4356a(bundle);
        }
    }
}
