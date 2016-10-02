package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C0336c;
import com.google.android.gms.ads.formats.C0337d;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.js */
public final class js implements jw {
    final String f3482a;
    final jo f3483b;
    final AdRequestParcel f3484c;
    final AdSizeParcel f3485d;
    final Context f3486e;
    final Object f3487f;
    final VersionInfoParcel f3488g;
    final boolean f3489h;
    final NativeAdOptionsParcel f3490i;
    final List f3491j;
    final boolean f3492k;
    kh f3493l;
    int f3494m;
    private final ke f3495n;
    private final long f3496o;
    private final jp f3497p;
    private ko f3498q;

    public js(Context context, String str, ke keVar, jp jpVar, jo joVar, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel, boolean z, boolean z2, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
        this.f3487f = new Object();
        this.f3494m = -2;
        this.f3486e = context;
        this.f3495n = keVar;
        this.f3483b = joVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f3482a = m3930d();
        } else {
            this.f3482a = str;
        }
        this.f3497p = jpVar;
        this.f3496o = jpVar.f3467b != -1 ? jpVar.f3467b : 10000;
        this.f3484c = adRequestParcel;
        this.f3485d = adSizeParcel;
        this.f3488g = versionInfoParcel;
        this.f3489h = z;
        this.f3492k = z2;
        this.f3490i = nativeAdOptionsParcel;
        this.f3491j = list;
    }

    static C0336c m3929b(String str) {
        int i = 0;
        C0337d c0337d = new C0337d();
        if (str == null) {
            return c0337d.m2054a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c0337d.f1765c = jSONObject.optBoolean("multiple_images", false);
            c0337d.f1763a = jSONObject.optBoolean("only_urls", false);
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            }
            c0337d.f1764b = i;
        } catch (Throwable e) {
            C0501b.m3026a("Exception occurred when creating native ad options", e);
        }
        return c0337d.m2054a();
    }

    private String m3930d() {
        try {
            if (!TextUtils.isEmpty(this.f3483b.f3455e)) {
                return this.f3495n.m3955b(this.f3483b.f3455e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            C0501b.m3025a("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private ko m3931e() {
        if (this.f3494m != 0 || !m3940c()) {
            return null;
        }
        try {
            if (!(!m3939b(4) || this.f3498q == null || this.f3498q.m3941a() == 0)) {
                return this.f3498q;
            }
        } catch (RemoteException e) {
            C0501b.m3025a("Could not get cpm value from MediationResponseMetadata");
        }
        return new ju(m3932f());
    }

    private int m3932f() {
        if (this.f3483b.f3458h == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f3483b.f3458h);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f3482a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m3939b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            C0501b.m3025a("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public final jv m3933a(long j, long j2) {
        jv jvVar;
        synchronized (this.f3487f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            jr jrVar = new jr();
            rd.f4041a.post(new jt(this, jrVar));
            long j3 = this.f3496o;
            while (this.f3494m == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                elapsedRealtime2 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || elapsedRealtime2 <= 0) {
                    C0501b.m3027a(4);
                    this.f3494m = 3;
                } else {
                    try {
                        this.f3487f.wait(Math.min(j4, elapsedRealtime2));
                    } catch (InterruptedException e) {
                        this.f3494m = -1;
                    }
                }
            }
            jvVar = new jv(this.f3483b, this.f3493l, this.f3482a, jrVar, this.f3494m, m3931e());
        }
        return jvVar;
    }

    final String m3934a(String str) {
        if (!(str == null || !m3940c() || m3939b(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                C0501b.m3025a("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    public final void m3935a() {
        synchronized (this.f3487f) {
            try {
                if (this.f3493l != null) {
                    this.f3493l.m3974c();
                }
            } catch (Throwable e) {
                C0501b.m3026a("Could not destroy mediation adapter.", e);
            }
            this.f3494m = -1;
            this.f3487f.notify();
        }
    }

    public final void m3936a(int i) {
        synchronized (this.f3487f) {
            this.f3494m = i;
            this.f3487f.notify();
        }
    }

    public final void m3937a(ko koVar) {
        synchronized (this.f3487f) {
            this.f3494m = 0;
            this.f3498q = koVar;
            this.f3487f.notify();
        }
    }

    final kh m3938b() {
        "Instantiating mediation adapter: " + this.f3482a;
        C0501b.m3027a(4);
        if (((Boolean) ar.m2249n().m3580a(ck.av)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f3482a)) {
            return new ky(new AdMobAdapter());
        }
        if (((Boolean) ar.m2249n().m3580a(ck.aw)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f3482a)) {
            return new ky(new AdUrlAdapter());
        }
        try {
            return this.f3495n.m3954a(this.f3482a);
        } catch (RemoteException e) {
            "Could not instantiate mediation adapter: " + this.f3482a;
            C0501b.m3027a(3);
            return null;
        }
    }

    final boolean m3939b(int i) {
        try {
            Bundle l = this.f3489h ? this.f3493l.m3983l() : this.f3485d.f1906e ? this.f3493l.m3982k() : this.f3493l.m3981j();
            return l != null && (l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            C0501b.m3025a("Could not get adapter info. Returning false");
            return false;
        }
    }

    final boolean m3940c() {
        return this.f3497p.f3475j != -1;
    }
}
