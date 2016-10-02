package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ay */
public final class ay extends ai {
    private iz f2942d;
    private boolean f2943e;

    public ay(Context context, AdSizeParcel adSizeParcel, pz pzVar, VersionInfoParcel versionInfoParcel, bf bfVar, il ilVar) {
        super(context, adSizeParcel, pzVar, versionInfoParcel, bfVar);
        this.f2942d = ilVar.m3875b();
        try {
            this.f2942d.m3884a(new az(this, m3437a(bfVar.m3461c().m3459a())), new ba(this));
        } catch (JSONException e) {
        } catch (RuntimeException e2) {
            C0501b.m3027a(6);
        }
        this.f2942d.m3884a(new bb(this), new bc(this));
        "Tracking ad unit: " + this.b.f2924c;
        C0501b.m3027a(3);
    }

    protected final void m3492b() {
        synchronized (this.a) {
            super.m3445b();
            this.f2942d.m3884a(new be(this), new sw());
            this.f2942d.m3888a();
        }
    }

    protected final void m3493b(JSONObject jSONObject) {
        this.f2942d.m3884a(new bd(this, jSONObject), new sw());
    }

    protected final boolean m3494f() {
        return this.f2943e;
    }
}
