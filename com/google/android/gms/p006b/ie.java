package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.C0403l;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.overlay.C0347t;
import com.google.android.gms.ads.internal.overlay.ac;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ie */
public final class ie implements hy {
    final tf f3384a;

    public ie(Context context, VersionInfoParcel versionInfoParcel, aa aaVar) {
        ar.m2241f();
        this.f3384a = tm.m4622a(context, new AdSizeParcel(), aaVar, versionInfoParcel);
        this.f3384a.m4553a().setWillNotDraw(true);
    }

    private static void m3860a(Runnable runnable) {
        C0374z.m2455a();
        if (C0500a.m3020b()) {
            runnable.run();
        } else {
            rd.f4041a.post(runnable);
        }
    }

    public final void m3861a() {
        this.f3384a.destroy();
    }

    public final void m3862a(C0260a c0260a, C0347t c0347t, ev evVar, ac acVar) {
        this.f3384a.m4579l().m4606a(c0260a, c0347t, evVar, acVar, false, null, null, new C0403l((byte) 0), null);
    }

    public final void m3863a(hz hzVar) {
        this.f3384a.m4579l().m4609a(new ik(this, hzVar));
    }

    public final void m3864a(String str) {
        ie.m3860a(new ih(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void m3865a(String str, fk fkVar) {
        this.f3384a.m4579l().m4611a(str, fkVar);
    }

    public final void m3866a(String str, String str2) {
        ie.m3860a(new ig(this, str, str2));
    }

    public final void m3867a(String str, JSONObject jSONObject) {
        ie.m3860a(new C0624if(this, str, jSONObject));
    }

    public final jj m3868b() {
        return new jk(this);
    }

    public final void m3869b(String str) {
        ie.m3860a(new ij(this, str));
    }

    public final void m3870b(String str, fk fkVar) {
        this.f3384a.m4579l().m4615b(str, fkVar);
    }

    public final void m3871b(String str, JSONObject jSONObject) {
        this.f3384a.m3845b(str, jSONObject);
    }

    public final void m3872c(String str) {
        ie.m3860a(new ii(this, str));
    }
}
