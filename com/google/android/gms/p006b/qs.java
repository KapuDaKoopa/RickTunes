package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: com.google.android.gms.b.qs */
final class qs extends qv {
    final /* synthetic */ Context f4024a;
    final /* synthetic */ qw f4025b;

    qs(Context context, qw qwVar) {
        this.f4024a = context;
        this.f4025b = qwVar;
        super();
    }

    public final void m4390a() {
        SharedPreferences sharedPreferences = this.f4024a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("content_url_opted_out", sharedPreferences.getBoolean("content_url_opted_out", true));
        if (this.f4025b != null) {
            this.f4025b.m4356a(bundle);
        }
    }
}
