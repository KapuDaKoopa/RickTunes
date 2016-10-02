package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.jx */
public final class jx {
    public static List m3943a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void m3944a(Context context, String str, pz pzVar, String str2, boolean z, List list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String replaceAll : list) {
                String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", pzVar.f3941q.f3471f).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", ar.m2243h().f3975b).replaceAll("@gw_seqnum@", pzVar.f3933i);
                if (pzVar.f3938n != null) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", pzVar.f3938n.f3452b).replaceAll("@gw_allocid@", pzVar.f3938n.f3454d);
                }
                new sg(context, str, replaceAll2).m2709g();
            }
        }
    }
}
