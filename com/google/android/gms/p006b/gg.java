package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0500a;
import java.lang.ref.WeakReference;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.gg */
public abstract class gg {
    protected Context f3269a;
    protected String f3270b;
    protected WeakReference f3271c;

    public gg(tf tfVar) {
        this.f3269a = tfVar.getContext();
        this.f3270b = ar.m2240e().m4453a(this.f3269a, tfVar.m4582o().f2539b);
        this.f3271c = new WeakReference(tfVar);
    }

    static /* synthetic */ void m3751a(gg ggVar, String str, Map map) {
        tf tfVar = (tf) ggVar.f3271c.get();
        if (tfVar != null) {
            tfVar.m4561a(str, map);
        }
    }

    public abstract void m3752a();

    protected final void m3753a(String str, String str2, int i) {
        C0500a.f2543a.post(new gi(this, str, str2, i));
    }

    protected final void m3754a(String str, String str2, String str3, String str4) {
        C0500a.f2543a.post(new gj(this, str, str2, str3, str4));
    }

    public abstract boolean m3755a(String str);
}
