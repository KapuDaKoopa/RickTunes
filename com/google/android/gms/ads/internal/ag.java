package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.kr;
import com.google.android.gms.p006b.ku;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p017a.C0317d;
import java.util.Map;

final class ag implements fk {
    final /* synthetic */ kr f1782a;
    final /* synthetic */ C0447q f1783b;
    final /* synthetic */ ku f1784c;

    ag(kr krVar, C0447q c0447q, ku kuVar) {
        this.f1782a = krVar;
        this.f1783b = c0447q;
        this.f1784c = kuVar;
    }

    public final void m2107a(tf tfVar, Map map) {
        Object b = tfVar.m4564b();
        if (b != null) {
            try {
                if (this.f1782a != null) {
                    if (this.f1782a.m4026k()) {
                        ab.m2097a(tfVar);
                        return;
                    }
                    this.f1782a.m4015a(C0317d.m1996a(b));
                    this.f1783b.f2314a.m2204e();
                } else if (this.f1784c == null) {
                } else {
                    if (this.f1784c.m4053i()) {
                        ab.m2097a(tfVar);
                        return;
                    }
                    this.f1784c.m4044a(C0317d.m1996a(b));
                    this.f1783b.f2314a.m2204e();
                }
            } catch (Throwable e) {
                C0501b.m3026a("Unable to call handleClick on mapper", e);
            }
        }
    }
}
