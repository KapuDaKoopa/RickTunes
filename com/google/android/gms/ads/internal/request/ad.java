package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.p018a.C0321a;
import com.google.android.gms.ads.p018a.C0322b;
import com.google.android.gms.common.C0699c;
import com.google.android.gms.common.C0701d;
import com.google.android.gms.p006b.by;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.fl;
import com.google.android.gms.p006b.fv;
import com.google.android.gms.p006b.hy;
import com.google.android.gms.p006b.il;
import com.google.android.gms.p006b.iz;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pb;
import com.google.android.gms.p006b.pi;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.sm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@op
public final class ad extends qi {
    static final long f2423a;
    private static final Object f2424b;
    private static boolean f2425c;
    private static il f2426d;
    private static fl f2427e;
    private static fv f2428f;
    private static fk f2429g;
    private final C0345d f2430h;
    private final C0448a f2431i;
    private final Object f2432k;
    private final Context f2433l;
    private iz f2434m;

    static {
        f2423a = TimeUnit.SECONDS.toMillis(10);
        f2424b = new Object();
        f2425c = false;
        f2426d = null;
        f2427e = null;
        f2428f = null;
        f2429g = null;
    }

    public ad(Context context, C0448a c0448a, C0345d c0345d) {
        super((byte) 0);
        this.f2432k = new Object();
        this.f2430h = c0345d;
        this.f2433l = context;
        this.f2431i = c0448a;
        synchronized (f2424b) {
            if (!f2425c) {
                f2428f = new fv();
                f2427e = new fl(context.getApplicationContext(), c0448a.f2405j);
                f2429g = new al();
                f2426d = new il(this.f2433l.getApplicationContext(), this.f2431i.f2405j, (String) ar.m2249n().m3580a(ck.f3063b), new ak(), new aj());
                f2425c = true;
            }
        }
    }

    private AdResponseParcel m2813a(AdRequestInfoParcel adRequestInfoParcel) {
        String uuid = UUID.randomUUID().toString();
        JSONObject a = m2816a(adRequestInfoParcel, uuid);
        if (a == null) {
            return new AdResponseParcel(0);
        }
        long b = ar.m2244i().m4888b();
        fv fvVar = f2428f;
        Future smVar = new sm();
        fvVar.f3249a.put(uuid, smVar);
        C0500a.f2543a.post(new af(this, a, uuid));
        try {
            JSONObject jSONObject = (JSONObject) smVar.get(f2423a - (ar.m2244i().m4888b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new AdResponseParcel(-1);
            }
            AdResponseParcel a2 = pb.m4325a(this.f2433l, adRequestInfoParcel, jSONObject.toString());
            return (a2.f2360e == -3 || !TextUtils.isEmpty(a2.f2358c)) ? a2 : new AdResponseParcel(3);
        } catch (CancellationException e) {
            return new AdResponseParcel(-1);
        } catch (InterruptedException e2) {
            return new AdResponseParcel(-1);
        } catch (TimeoutException e3) {
            return new AdResponseParcel(2);
        } catch (ExecutionException e4) {
            return new AdResponseParcel(0);
        }
    }

    private JSONObject m2816a(AdRequestInfoParcel adRequestInfoParcel, String str) {
        Throwable e;
        Object obj;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = adRequestInfoParcel.f2324c.f1886c.getBundle("sdk_less_server_data");
        String string = adRequestInfoParcel.f2324c.f1886c.getString("sdk_less_network_id");
        if (bundle != null) {
            Context context = this.f2433l;
            pi a = ar.m2246k().m4345a(this.f2433l);
            by byVar = new by((String) ar.m2249n().m3580a(ck.f3063b));
            JSONObject a2 = pb.m4329a(adRequestInfoParcel, a, jSONObject, new ArrayList(), jSONObject);
            if (a2 != null) {
                C0322b a3;
                try {
                    a3 = C0321a.m2014a(this.f2433l);
                } catch (IOException e2) {
                    e = e2;
                    C0501b.m3026a("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a2);
                    hashMap.put("data", bundle);
                    if (a3 != null) {
                        hashMap.put("adid", a3.f1732a);
                        hashMap.put("lat", Integer.valueOf(a3.f1733b ? 0 : 1));
                    }
                    jSONObject = ar.m2240e().m4454a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e3) {
                    e = e3;
                    C0501b.m3026a("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a2);
                    hashMap.put("data", bundle);
                    if (a3 != null) {
                        hashMap.put("adid", a3.f1732a);
                        if (a3.f1733b) {
                        }
                        hashMap.put("lat", Integer.valueOf(a3.f1733b ? 0 : 1));
                    }
                    jSONObject = ar.m2240e().m4454a(hashMap);
                    return jSONObject;
                } catch (C0699c e4) {
                    e = e4;
                    C0501b.m3026a("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a2);
                    hashMap.put("data", bundle);
                    if (a3 != null) {
                        hashMap.put("adid", a3.f1732a);
                        if (a3.f1733b) {
                        }
                        hashMap.put("lat", Integer.valueOf(a3.f1733b ? 0 : 1));
                    }
                    jSONObject = ar.m2240e().m4454a(hashMap);
                    return jSONObject;
                } catch (C0701d e5) {
                    e = e5;
                    C0501b.m3026a("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a2);
                    hashMap.put("data", bundle);
                    if (a3 != null) {
                        hashMap.put("adid", a3.f1732a);
                        if (a3.f1733b) {
                        }
                        hashMap.put("lat", Integer.valueOf(a3.f1733b ? 0 : 1));
                    }
                    jSONObject = ar.m2240e().m4454a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("network_id", string);
                hashMap.put("request_param", a2);
                hashMap.put("data", bundle);
                if (a3 != null) {
                    hashMap.put("adid", a3.f1732a);
                    if (a3.f1733b) {
                    }
                    hashMap.put("lat", Integer.valueOf(a3.f1733b ? 0 : 1));
                }
                try {
                    jSONObject = ar.m2240e().m4454a(hashMap);
                } catch (JSONException e6) {
                }
            }
        }
        return jSONObject;
    }

    protected static void m2817a(hy hyVar) {
        hyVar.m3841a("/loadAd", f2428f);
        hyVar.m3841a("/fetchHttpRequest", f2427e);
        hyVar.m3841a("/invalidRequest", f2429g);
    }

    protected static void m2819b(hy hyVar) {
        hyVar.m3844b("/loadAd", f2428f);
        hyVar.m3844b("/fetchHttpRequest", f2427e);
        hyVar.m3844b("/invalidRequest", f2429g);
    }

    public final void m2822a() {
        C0501b.m3027a(3);
        AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.f2431i, null, -1);
        AdResponseParcel a = m2813a(adRequestInfoParcel);
        AdSizeParcel adSizeParcel = null;
        C0500a.f2543a.post(new ae(this, new qa(adRequestInfoParcel, a, null, adSizeParcel, a.f2360e, ar.m2244i().m4888b(), a.f2369n, null)));
    }

    public final void m2823b() {
        synchronized (this.f2432k) {
            C0500a.f2543a.post(new ai(this));
        }
    }
}
