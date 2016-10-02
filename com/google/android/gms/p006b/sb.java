package com.google.android.gms.p006b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.b.sb */
final class sb extends ue {
    private final sa f4083a;
    private final wh f4084b;

    public sb(String str, sa saVar, wh whVar) {
        super(str, new sc(whVar, saVar));
        this.f4083a = saVar;
        this.f4084b = whVar;
    }

    protected final wf m4518a(pu puVar) {
        return wf.m4854a(new ByteArrayInputStream(puVar.f3917b), zk.m5027a(puVar));
    }

    protected final /* synthetic */ void m4519a(Object obj) {
        this.f4084b.m4521a(this.f4083a.m4300a((InputStream) obj));
    }
}
