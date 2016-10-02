package com.google.android.gms.p006b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.fl */
public final class fl implements fk {
    private final Context f3227a;
    private final VersionInfoParcel f3228b;

    public fl(Context context, VersionInfoParcel versionInfoParcel) {
        this.f3227a = context;
        this.f3228b = versionInfoParcel;
    }

    private static fp m3720a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            C0501b.m3027a(6);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new fo(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new fp(optString, url, arrayList, optString3);
    }

    private fq m3721a(fp fpVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) fpVar.f3237b.openConnection();
            ar.m2240e().m4456a(this.f3227a, this.f3228b.f2539b, false, httpURLConnection);
            Iterator it = fpVar.f3238c.iterator();
            while (it.hasNext()) {
                fo foVar = (fo) it.next();
                httpURLConnection.addRequestProperty(foVar.f3234a, foVar.f3235b);
            }
            if (!TextUtils.isEmpty(fpVar.f3239d)) {
                httpURLConnection.setDoOutput(true);
                byte[] bytes = fpVar.f3239d.getBytes();
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            List arrayList = new ArrayList();
            if (httpURLConnection.getHeaderFields() != null) {
                for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                    for (String foVar2 : (List) entry.getValue()) {
                        arrayList.add(new fo((String) entry.getKey(), foVar2));
                    }
                }
            }
            String foVar22 = fpVar.f3236a;
            int responseCode = httpURLConnection.getResponseCode();
            ar.m2240e();
            return new fq(this, true, new fr(foVar22, responseCode, arrayList, rd.m4407a(new InputStreamReader(httpURLConnection.getInputStream()))), null);
        } catch (Exception e) {
            return new fq(this, false, null, e.toString());
        }
    }

    private static JSONObject m3722a(fr frVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", frVar.f3244a);
            if (frVar.f3247d != null) {
                jSONObject.put("body", frVar.f3247d);
            }
            JSONArray jSONArray = new JSONArray();
            for (fo foVar : frVar.f3246c) {
                jSONArray.put(new JSONObject().put("key", foVar.f3234a).put("value", foVar.f3235b));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", frVar.f3245b);
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
        return jSONObject;
    }

    public final JSONObject m3723a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                fq a = m3721a(fl.m3720a(jSONObject));
                if (a.f3241b) {
                    jSONObject2.put("response", fl.m3722a(a.f3240a));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", a.f3242c);
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            C0501b.m3027a(6);
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    public final void m3724a(tf tfVar, Map map) {
        qx.m4394a(new fm(this, map, tfVar));
    }
}
