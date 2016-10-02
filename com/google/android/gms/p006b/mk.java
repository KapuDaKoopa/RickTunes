package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.mk */
public final class mk implements mh {
    final Context f3651a;
    final Set f3652b;

    public mk(Context context) {
        this.f3652b = Collections.synchronizedSet(new HashSet());
        this.f3651a = context;
    }

    public final void m4212a(String str, String str2) {
        C0501b.m3027a(3);
        rd.f4041a.post(new ml(this, str, str2));
    }
}
