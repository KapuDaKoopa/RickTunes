package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.pe */
final class pe implements fk {
    final /* synthetic */ pc f3822a;

    pe(pc pcVar) {
        this.f3822a = pcVar;
    }

    public final void m4331a(tf tfVar, Map map) {
        synchronized (this.f3822a.f3813a) {
            if (this.f3822a.f3816d.isDone()) {
                return;
            }
            Object phVar = new ph(-2, map);
            if (this.f3822a.f3814b.equals(phVar.f3854f)) {
                String str = phVar.f3855g;
                if (str == null) {
                    C0501b.m3025a("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (str.contains("%40mediation_adapters%40")) {
                    String replaceAll = str.replaceAll("%40mediation_adapters%40", qh.m4382a(tfVar.getContext(), (String) map.get("check_adapters"), this.f3822a.f3815c));
                    phVar.f3855g = replaceAll;
                    "Ad request URL modified to " + replaceAll;
                    qk.m4383a();
                }
                this.f3822a.f3816d.m3858b(phVar);
                return;
            }
            C0501b.m3025a(phVar.f3854f + " ==== " + this.f3822a.f3814b);
        }
    }
}
