package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ls */
public final class ls {
    private final boolean f3618a;
    private final boolean f3619b;
    private final boolean f3620c;
    private final boolean f3621d;
    private final boolean f3622e;

    private ls(lt ltVar) {
        this.f3618a = ltVar.f3623a;
        this.f3619b = ltVar.f3624b;
        this.f3620c = ltVar.f3625c;
        this.f3621d = ltVar.f3626d;
        this.f3622e = ltVar.f3627e;
    }

    public final JSONObject m4189a() {
        try {
            return new JSONObject().put("sms", this.f3618a).put("tel", this.f3619b).put("calendar", this.f3620c).put("storePicture", this.f3621d).put("inlineVideo", this.f3622e);
        } catch (JSONException e) {
            C0501b.m3027a(6);
            return null;
        }
    }
}
