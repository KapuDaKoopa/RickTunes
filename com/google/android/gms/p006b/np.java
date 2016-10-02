package com.google.android.gms.p006b;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.np */
public final class np extends nl {
    private nn f3691h;

    np(Context context, qa qaVar, tf tfVar, nv nvVar) {
        super(context, qaVar, tfVar, nvVar);
    }

    protected final void m4258a() {
        int i;
        int i2;
        AdSizeParcel k = this.c.m4578k();
        if (k.f1906e) {
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = k.f1908g;
            i2 = k.f1905d;
        }
        this.f3691h = new nn(this, this.c, i, i2, (byte) 0);
        this.c.m4579l().m4609a((ti) this);
        this.f3691h.m4253a(this.e);
    }

    protected final int m4259b() {
        if (!this.f3691h.m4255c()) {
            return !this.f3691h.m4256d() ? 2 : -2;
        } else {
            C0501b.m3027a(3);
            return 3;
        }
    }
}
