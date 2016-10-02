package com.google.android.gms.p006b;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fg */
final class fg implements fk {
    fg() {
    }

    public final void m3716a(tf tfVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C0501b.m3025a("URL missing from click GMSG.");
            return;
        }
        Uri a;
        Uri parse = Uri.parse(str);
        try {
            aa n = tfVar.m4581n();
            if (n != null && n.m3418a(parse)) {
                a = n.m3415a(parse, tfVar.getContext());
                new sg(tfVar.getContext(), tfVar.m4582o().f2539b, a.toString()).m2709g();
            }
        } catch (ab e) {
            C0501b.m3025a("Unable to append parameter to URL: " + str);
        }
        a = parse;
        new sg(tfVar.getContext(), tfVar.m4582o().f2539b, a.toString()).m2709g();
    }
}
