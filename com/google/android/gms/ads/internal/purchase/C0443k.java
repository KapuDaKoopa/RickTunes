package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.k */
public final class C0443k {
    public static int m2798a(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            C0501b.m3025a("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C0501b.m3025a("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    public static int m2799a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            C0501b.m3025a("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C0501b.m3025a("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    public static String m2800a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("developerPayload");
            } catch (JSONException e) {
                C0501b.m3025a("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public static String m2801b(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    public static String m2802b(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("purchaseToken");
            } catch (JSONException e) {
                C0501b.m3025a("Fail to parse purchase data");
            }
        }
        return str2;
    }
}
