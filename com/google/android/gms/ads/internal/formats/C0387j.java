package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.aj;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.aa;
import com.google.android.gms.p006b.hy;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.tm;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.j */
public class C0387j implements C0386h {
    final hy f2095a;
    boolean f2096b;
    tf f2097c;
    String f2098d;
    private final Object f2099e;
    private final aj f2100f;
    private final Context f2101g;
    private final JSONObject f2102h;
    private final C0382i f2103i;
    private final aa f2104j;
    private final VersionInfoParcel f2105k;
    private WeakReference f2106l;

    public C0387j(Context context, aj ajVar, hy hyVar, aa aaVar, JSONObject jSONObject, C0382i c0382i, VersionInfoParcel versionInfoParcel) {
        this.f2099e = new Object();
        this.f2106l = null;
        this.f2101g = context;
        this.f2100f = ajVar;
        this.f2095a = hyVar;
        this.f2104j = aaVar;
        this.f2102h = jSONObject;
        this.f2103i = c0382i;
        this.f2105k = versionInfoParcel;
    }

    public C0380b m2569a(OnClickListener onClickListener) {
        C0379a l = this.f2103i.m2507l();
        if (l == null) {
            return null;
        }
        C0380b c0380b = new C0380b(this.f2101g, l);
        c0380b.setLayoutParams(new LayoutParams(-1, -1));
        c0380b.m2485a().setOnClickListener(onClickListener);
        c0380b.m2485a().setContentDescription("Ad attribution icon");
        return c0380b;
    }

    public void m2570a() {
        ax.m5534b("recordImpression must be called on the main UI thread.");
        this.f2096b = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f2102h);
            this.f2095a.m3843a("google.afma.nativeAds.handleImpressionPing", jSONObject);
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
        this.f2100f.m2218a((C0386h) this);
    }

    public final void m2571a(MotionEvent motionEvent) {
        this.f2104j.m3417a(motionEvent);
    }

    public void m2572a(View view) {
    }

    public void m2573a(View view, Map map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ax.m5534b("performClick must be called on the main UI thread.");
        for (Entry entry : map.entrySet()) {
            if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                m2574a((String) entry.getKey(), jSONObject, jSONObject2, jSONObject3);
                return;
            }
        }
    }

    public final void m2574a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ax.m5534b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset", str);
            jSONObject4.put("template", this.f2103i.m2505j());
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.f2102h);
            jSONObject5.put("click", jSONObject4);
            jSONObject5.put("has_custom_click_handler", this.f2100f.m2227b(this.f2103i.m2506k()) != null);
            if (jSONObject != null) {
                jSONObject5.put("view_rectangles", jSONObject);
            }
            if (jSONObject2 != null) {
                jSONObject5.put("click_point", jSONObject2);
            }
            if (jSONObject3 != null) {
                jSONObject5.put("native_view_rectangle", jSONObject3);
            }
            this.f2095a.m3843a("google.afma.nativeAds.handleClickGmsg", jSONObject5);
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }

    public final void m2575b(View view) {
        synchronized (this.f2099e) {
            if (this.f2096b) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                m2570a();
            }
        }
    }

    public final void m2576c(View view) {
        this.f2106l = new WeakReference(view);
    }

    public tf m2577d() {
        ar.m2241f();
        Context context = this.f2101g;
        Context context2 = this.f2101g;
        this.f2097c = tm.m4622a(context, AdSizeParcel.m2272a(), this.f2104j, this.f2105k);
        this.f2097c.m4564b().setVisibility(8);
        this.f2095a.m3841a("/loadHtml", new C0389k(this));
        this.f2095a.m3841a("/showOverlay", new C0391m(this));
        this.f2095a.m3841a("/hideOverlay", new C0392n(this));
        this.f2097c.m4579l().m4611a("/hideOverlay", new C0393o(this));
        this.f2097c.m4579l().m4611a("/sendMessageToSdk", new C0394p(this));
        return this.f2097c;
    }

    public final View m2578e() {
        return this.f2106l != null ? (View) this.f2106l.get() : null;
    }

    public final Context m2579f() {
        return this.f2101g;
    }
}
