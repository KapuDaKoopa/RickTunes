package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.ax;
import java.util.LinkedList;

@op
/* renamed from: com.google.android.gms.b.hu */
final class hu {
    final LinkedList f3349a;
    AdRequestParcel f3350b;
    final String f3351c;
    final int f3352d;

    hu(AdRequestParcel adRequestParcel, String str, int i) {
        ax.m5527a((Object) adRequestParcel);
        ax.m5527a((Object) str);
        this.f3349a = new LinkedList();
        this.f3350b = adRequestParcel;
        this.f3351c = str;
        this.f3352d = i;
    }

    final hv m3813a() {
        return (hv) this.f3349a.remove();
    }
}
