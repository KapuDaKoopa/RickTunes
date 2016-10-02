package com.google.android.gms.p006b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: com.google.android.gms.b.qo */
final class qo extends qv {
    final /* synthetic */ Context f4016a;
    final /* synthetic */ qw f4017b;

    qo(Context context, qw qwVar) {
        this.f4016a = context;
        this.f4017b = qwVar;
        super();
    }

    public final void m4386a() {
        SharedPreferences sharedPreferences = this.f4016a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedPreferences.getBoolean("use_https", true));
        if (this.f4017b != null) {
            this.f4017b.m4356a(bundle);
        }
    }
}
