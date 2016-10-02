package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fh */
final class fh implements fk {
    fh() {
    }

    public final void m3717a(tf tfVar, Map map) {
        C0421k i = tfVar.m4576i();
        if (i != null) {
            i.m2682a();
            return;
        }
        i = tfVar.m4577j();
        if (i != null) {
            i.m2682a();
        } else {
            C0501b.m3025a("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
