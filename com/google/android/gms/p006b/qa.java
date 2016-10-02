package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.qa */
public final class qa {
    public final AdRequestInfoParcel f3952a;
    public final AdResponseParcel f3953b;
    public final jp f3954c;
    public final AdSizeParcel f3955d;
    public final int f3956e;
    public final long f3957f;
    public final long f3958g;
    public final JSONObject f3959h;

    public qa(AdRequestInfoParcel adRequestInfoParcel, AdResponseParcel adResponseParcel, jp jpVar, AdSizeParcel adSizeParcel, int i, long j, long j2, JSONObject jSONObject) {
        this.f3952a = adRequestInfoParcel;
        this.f3953b = adResponseParcel;
        this.f3954c = jpVar;
        this.f3955d = adSizeParcel;
        this.f3956e = i;
        this.f3957f = j;
        this.f3958g = j2;
        this.f3959h = jSONObject;
    }
}
