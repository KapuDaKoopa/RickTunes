package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.av */
public final class av extends ai {
    private final ji f2934d;

    public av(Context context, AdSizeParcel adSizeParcel, pz pzVar, VersionInfoParcel versionInfoParcel, bf bfVar, ji jiVar) {
        super(context, adSizeParcel, pzVar, versionInfoParcel, bfVar);
        this.f2934d = jiVar;
        m3441a(this.f2934d);
        m3438a();
        m3448b(false);
        "Tracking ad unit: " + this.b.f2924c;
        C0501b.m3027a(3);
    }

    protected final void m3484b() {
        synchronized (this.a) {
            super.m3445b();
            m3446b(this.f2934d);
        }
    }

    protected final void m3485b(JSONObject jSONObject) {
        this.f2934d.m3843a("AFMA_updateActiveView", jSONObject);
    }

    public final void m3486c() {
        m3484b();
    }

    protected final boolean m3487f() {
        return true;
    }
}
