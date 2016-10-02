package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: com.google.android.gms.b.qu */
final class qu extends qv {
    final /* synthetic */ Context f4028a;
    final /* synthetic */ qw f4029b;

    qu(Context context, qw qwVar) {
        this.f4028a = context;
        this.f4029b = qwVar;
        super();
    }

    public final void m4392a() {
        SharedPreferences sharedPreferences = this.f4028a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", sharedPreferences.getString("content_url_hashes", ""));
        if (this.f4029b != null) {
            this.f4029b.m4356a(bundle);
        }
    }
}
