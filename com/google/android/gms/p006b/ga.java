package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

/* renamed from: com.google.android.gms.b.ga */
public final class ga implements fk {
    private final gb f3262a;

    public ga(gb gbVar) {
        this.f3262a = gbVar;
    }

    public final void m3741a(tf tfVar, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            RewardItemParcel rewardItemParcel;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                str = (String) map.get("type");
                if (!TextUtils.isEmpty(str)) {
                    rewardItemParcel = new RewardItemParcel(str, parseInt);
                    this.f3262a.m3039b(rewardItemParcel);
                }
            } catch (Throwable e) {
                C0501b.m3026a("Unable to parse reward amount.", e);
            }
            rewardItemParcel = null;
            this.f3262a.m3039b(rewardItemParcel);
        } else if ("video_start".equals(str)) {
            this.f3262a.m3038D();
        }
    }
}
