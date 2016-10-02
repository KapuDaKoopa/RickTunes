package com.google.android.gms.p006b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aj;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.formats.C0381c;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.formats.C0385f;
import com.google.android.gms.ads.internal.formats.C0387j;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p017a.C0317d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.oc */
public final class oc implements Callable {
    private static final long f3723a;
    private final Context f3724b;
    private final rw f3725c;
    private final aj f3726d;
    private final aa f3727e;
    private final ia f3728f;
    private final Object f3729g;
    private final qa f3730h;
    private boolean f3731i;
    private int f3732j;
    private List f3733k;
    private JSONObject f3734l;

    static {
        f3723a = TimeUnit.SECONDS.toMillis(60);
    }

    public oc(Context context, aj ajVar, ia iaVar, rw rwVar, aa aaVar, qa qaVar) {
        this.f3729g = new Object();
        this.f3724b = context;
        this.f3726d = ajVar;
        this.f3725c = rwVar;
        this.f3728f = iaVar;
        this.f3730h = qaVar;
        this.f3727e = aaVar;
        this.f3731i = false;
        this.f3732j = -2;
        this.f3733k = null;
    }

    private pz m4280a(C0382i c0382i) {
        int i;
        synchronized (this.f3729g) {
            i = this.f3732j;
            if (c0382i == null && this.f3732j == -2) {
                i = 0;
            }
        }
        return new pz(this.f3730h.f3952a.f2324c, null, this.f3730h.f3953b.f2359d, i, this.f3730h.f3953b.f2361f, this.f3733k, this.f3730h.f3953b.f2367l, this.f3730h.f3953b.f2366k, this.f3730h.f3952a.f2330i, false, null, null, null, null, null, 0, this.f3730h.f3955d, this.f3730h.f3953b.f2362g, this.f3730h.f3957f, this.f3730h.f3958g, this.f3730h.f3953b.f2370o, this.f3734l, i != -2 ? null : c0382i, null, null, null, this.f3730h.f3953b.f2354G);
    }

    private ss m4281a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? new sn(new C0381c(null, Uri.parse(string), optDouble)) : this.f3725c.m4510a(string, new oh(this, z, optDouble, string));
        } else {
            m4292a(0, z);
            return new sn(null);
        }
    }

    private static Integer m4282a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    static /* synthetic */ List m4283a(List list) {
        List arrayList = new ArrayList();
        for (C0381c a : list) {
            arrayList.add((Drawable) C0317d.m1997a(a.m2490a()));
        }
        return arrayList;
    }

    static /* synthetic */ void m4284a(oc ocVar, eb ebVar, String str) {
        try {
            ek b = ocVar.f3726d.m2227b(ebVar.m2550k());
            if (b != null) {
                b.m3690a(ebVar, str);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    private pz m4285b() {
        try {
            hy hyVar;
            JSONObject jSONObject;
            oi okVar;
            JSONObject jSONObject2;
            String[] b;
            C0382i a;
            C0382i c0382i;
            C0385f c0385f;
            oj ojVar;
            fk ofVar;
            if (m4293a()) {
                hyVar = null;
            } else {
                String str = (this.f3730h.f3953b.f2357b.indexOf("https") == 0 ? "https:" : "http:") + ((String) ar.m2249n().m3580a(ck.ac));
                ia iaVar = this.f3728f;
                Context context = this.f3724b;
                VersionInfoParcel versionInfoParcel = this.f3730h.f3952a.f2332k;
                aa aaVar = this.f3727e;
                Future idVar = new id();
                rd.f4041a.post(new ib(iaVar, context, versionInfoParcel, idVar, aaVar, str));
                hy hyVar2 = (hy) idVar.get(f3723a, TimeUnit.MILLISECONDS);
                hyVar2.m3847a(this.f3726d, this.f3726d, this.f3726d, this.f3726d);
                hyVar = hyVar2;
            }
            if (m4293a()) {
                jSONObject = null;
            } else {
                sm smVar = new sm();
                oj ojVar2 = new oj(this);
                fk odVar = new od(this, hyVar, ojVar2, smVar);
                ojVar2.f3755a = odVar;
                hyVar.m3841a("/nativeAdPreProcess", odVar);
                hyVar.m3843a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.f3730h.f3953b.f2358c));
                jSONObject = (JSONObject) smVar.get(f3723a, TimeUnit.MILLISECONDS);
            }
            if (!m4293a()) {
                String string = jSONObject.getString("template_id");
                boolean z = this.f3730h.f3952a.f2347z != null ? this.f3730h.f3952a.f2347z.f2048b : false;
                boolean z2 = this.f3730h.f3952a.f2347z != null ? this.f3730h.f3952a.f2347z.f2050d : false;
                if ("2".equals(string)) {
                    okVar = new ok(z, z2);
                } else if ("1".equals(string)) {
                    r3 = new ol(z, z2);
                } else if ("3".equals(string)) {
                    String string2 = jSONObject.getString("custom_template_id");
                    sm smVar2 = new sm();
                    rd.f4041a.post(new oe(this, smVar2, string2));
                    if (smVar2.get(f3723a, TimeUnit.MILLISECONDS) != null) {
                        r3 = new om(z);
                    } else {
                        "No handler for custom template: " + jSONObject.getString("custom_template_id");
                        C0501b.m3027a(6);
                    }
                } else {
                    m4291a(0);
                }
                if (m4293a()) {
                    jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
                    b = oc.m4286b(jSONObject2, "impression_tracking_urls");
                    this.f3733k = b != null ? null : Arrays.asList(b);
                    this.f3734l = jSONObject2.optJSONObject("active_view");
                    a = okVar.m4304a(this, jSONObject);
                    if (a != null) {
                        C0501b.m3027a(6);
                        c0382i = null;
                    } else {
                        a.m2504a(new C0387j(this.f3724b, this.f3726d, hyVar, this.f3727e, jSONObject, a, this.f3730h.f3952a.f2332k));
                        c0382i = a;
                    }
                } else {
                    c0382i = null;
                }
                if (c0382i instanceof C0385f) {
                    c0385f = (C0385f) c0382i;
                    ojVar = new oj(this);
                    ofVar = new of(this, c0385f);
                    ojVar.f3755a = ofVar;
                    hyVar.m3841a("/nativeAdCustomClick", ofVar);
                }
                return m4280a(c0382i);
            }
            okVar = null;
            if (m4293a()) {
                jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
                b = oc.m4286b(jSONObject2, "impression_tracking_urls");
                if (b != null) {
                }
                this.f3733k = b != null ? null : Arrays.asList(b);
                this.f3734l = jSONObject2.optJSONObject("active_view");
                a = okVar.m4304a(this, jSONObject);
                if (a != null) {
                    a.m2504a(new C0387j(this.f3724b, this.f3726d, hyVar, this.f3727e, jSONObject, a, this.f3730h.f3952a.f2332k));
                    c0382i = a;
                } else {
                    C0501b.m3027a(6);
                    c0382i = null;
                }
            } else {
                c0382i = null;
            }
            if (c0382i instanceof C0385f) {
                c0385f = (C0385f) c0382i;
                ojVar = new oj(this);
                ofVar = new of(this, c0385f);
                ojVar.f3755a = ofVar;
                hyVar.m3841a("/nativeAdCustomClick", ofVar);
            }
            return m4280a(c0382i);
        } catch (CancellationException e) {
            if (!this.f3731i) {
                m4291a(0);
            }
            return m4280a(null);
        } catch (ExecutionException e2) {
            if (this.f3731i) {
                m4291a(0);
            }
            return m4280a(null);
        } catch (InterruptedException e3) {
            if (this.f3731i) {
                m4291a(0);
            }
            return m4280a(null);
        } catch (Throwable e4) {
            C0501b.m3026a("Malformed native JSON response.", e4);
            if (this.f3731i) {
                m4291a(0);
            }
            return m4280a(null);
        } catch (Throwable e42) {
            C0501b.m3026a("Timeout when loading native ad.", e42);
            if (this.f3731i) {
                m4291a(0);
            }
            return m4280a(null);
        }
    }

    private static String[] m4286b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    public final ss m4287a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new sn(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer a = oc.m4282a(optJSONObject, "text_color");
        Integer a2 = oc.m4282a(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = m4289a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(m4288a(optJSONObject, "image", false, false));
        }
        ss a3 = so.m4535a(arrayList);
        sr ogVar = new og(this, optString, a2, a, optInt, optInt3, optInt2);
        sm smVar = new sm();
        a3.m3856a(new sp(smVar, ogVar, a3));
        return smVar;
    }

    public final ss m4288a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m4281a(jSONObject2, z, z2);
    }

    public final List m4289a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            m4292a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m4281a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public final Future m4290a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m4281a(jSONObject2, optBoolean, z);
    }

    public final void m4291a(int i) {
        synchronized (this.f3729g) {
            this.f3731i = true;
            this.f3732j = i;
        }
    }

    public final void m4292a(int i, boolean z) {
        if (z) {
            m4291a(i);
        }
    }

    public final boolean m4293a() {
        boolean z;
        synchronized (this.f3729g) {
            z = this.f3731i;
        }
        return z;
    }

    public final /* synthetic */ Object call() {
        return m4285b();
    }
}
