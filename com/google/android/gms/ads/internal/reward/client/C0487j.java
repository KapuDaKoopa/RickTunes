package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.p007b.C0325a;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.reward.client.j */
public final class C0487j implements C0325a {
    private final C0478a f2510a;

    public C0487j(C0478a c0478a) {
        this.f2510a = c0478a;
    }

    public final String m2940a() {
        String str = null;
        if (this.f2510a != null) {
            try {
                str = this.f2510a.m2919a();
            } catch (Throwable e) {
                C0501b.m3026a("Could not forward getType to RewardItem", e);
            }
        }
        return str;
    }

    public final int m2941b() {
        int i = 0;
        if (this.f2510a != null) {
            try {
                i = this.f2510a.m2920b();
            } catch (Throwable e) {
                C0501b.m3026a("Could not forward getAmount to RewardItem", e);
            }
        }
        return i;
    }
}
