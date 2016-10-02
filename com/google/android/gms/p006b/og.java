package com.google.android.gms.p006b;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.C0379a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.List;

/* renamed from: com.google.android.gms.b.og */
final class og implements sr {
    final /* synthetic */ String f3744a;
    final /* synthetic */ Integer f3745b;
    final /* synthetic */ Integer f3746c;
    final /* synthetic */ int f3747d;
    final /* synthetic */ int f3748e;
    final /* synthetic */ int f3749f;
    final /* synthetic */ oc f3750g;

    og(oc ocVar, String str, Integer num, Integer num2, int i, int i2, int i3) {
        this.f3750g = ocVar;
        this.f3744a = str;
        this.f3745b = num;
        this.f3746c = num2;
        this.f3747d = i;
        this.f3748e = i2;
        this.f3749f = i3;
    }

    private C0379a m4297a(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    return new C0379a(this.f3744a, oc.m4283a(list), this.f3745b, this.f3746c, this.f3747d > 0 ? Integer.valueOf(this.f3747d) : null, this.f3748e + this.f3749f);
                }
            } catch (RemoteException e) {
                C0501b.m3027a(6);
                return null;
            }
        }
        return null;
    }

    public final /* synthetic */ Object m4298a(Object obj) {
        return m4297a((List) obj);
    }
}
