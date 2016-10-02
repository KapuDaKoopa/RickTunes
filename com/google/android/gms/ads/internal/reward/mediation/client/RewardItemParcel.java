package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.p007b.C0325a;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@op
public final class RewardItemParcel implements SafeParcelable {
    public static final C0495e CREATOR;
    public final int f2512a;
    public final String f2513b;
    public final int f2514c;

    static {
        CREATOR = new C0495e();
    }

    public RewardItemParcel(int i, String str, int i2) {
        this.f2512a = i;
        this.f2513b = str;
        this.f2514c = i2;
    }

    public RewardItemParcel(C0325a c0325a) {
        this(1, c0325a.m2032a(), c0325a.m2033b());
    }

    public RewardItemParcel(String str, int i) {
        this(1, str, i);
    }

    public static RewardItemParcel m2951a(String str) {
        RewardItemParcel rewardItemParcel = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                rewardItemParcel = m2952a(new JSONArray(str));
            } catch (JSONException e) {
            }
        }
        return rewardItemParcel;
    }

    public static RewardItemParcel m2952a(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new RewardItemParcel(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RewardItemParcel)) {
            return false;
        }
        RewardItemParcel rewardItemParcel = (RewardItemParcel) obj;
        return av.m5525a(this.f2513b, rewardItemParcel.f2513b) && av.m5525a(Integer.valueOf(this.f2514c), Integer.valueOf(rewardItemParcel.f2514c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2513b, Integer.valueOf(this.f2514c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0495e.m2982a(this, parcel);
    }
}
