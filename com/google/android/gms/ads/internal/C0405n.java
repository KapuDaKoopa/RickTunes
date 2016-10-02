package com.google.android.gms.ads.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.tf;

@op
/* renamed from: com.google.android.gms.ads.internal.n */
public final class C0405n implements C0404m {
    private final qa f2146a;
    private final tf f2147b;

    public C0405n(qa qaVar, tf tfVar) {
        this.f2146a = qaVar;
        this.f2147b = tfVar;
    }

    public final void m2607a(String str) {
        C0501b.m3027a(3);
        Builder builder = new Builder();
        builder.scheme("https");
        builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
        builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("navigationURL", str);
        }
        if (!(this.f2146a == null || this.f2146a.f3953b == null || TextUtils.isEmpty(this.f2146a.f3953b.f2370o))) {
            builder.appendQueryParameter("debugDialog", this.f2146a.f3953b.f2370o);
        }
        ar.m2240e();
        rd.m4415a(this.f2147b.getContext(), this.f2147b.m4582o().f2539b, builder.toString());
    }
}
