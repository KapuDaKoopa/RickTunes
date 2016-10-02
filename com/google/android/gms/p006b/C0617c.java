package com.google.android.gms.p006b;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.b.c */
public class C0617c extends ue {
    private final wh f3024a;

    private C0617c(String str, wh whVar, wg wgVar) {
        super(str, wgVar);
        this.f3024a = whVar;
    }

    public C0617c(String str, wh whVar, wg wgVar, byte b) {
        this(str, whVar, wgVar);
    }

    protected final wf m3566a(pu puVar) {
        Object str;
        try {
            str = new String(puVar.f3917b, zk.m5028a(puVar.f3918c, "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            str = new String(puVar.f3917b);
        }
        return wf.m4854a(str, zk.m5027a(puVar));
    }

    protected final /* synthetic */ void m3567a(Object obj) {
        this.f3024a.m4521a((String) obj);
    }
}
