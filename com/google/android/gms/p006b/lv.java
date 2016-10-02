package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.lv */
public class lv {
    private final String f3578a;
    final tf f3579h;

    public lv(tf tfVar) {
        this(tfVar, "");
    }

    public lv(tf tfVar, String str) {
        this.f3579h = tfVar;
        this.f3578a = str;
    }

    public final void m4177a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f3579h.m3845b("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }

    public final void m4178a(String str) {
        try {
            this.f3579h.m3845b("onError", new JSONObject().put("message", str).put("action", this.f3578a));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }

    public final void m4179b(String str) {
        try {
            this.f3579h.m3845b("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }
}
