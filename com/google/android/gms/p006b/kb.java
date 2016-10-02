package com.google.android.gms.p006b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.kb */
public final class kb implements jn {
    private final AdRequestInfoParcel f3525a;
    private final ke f3526b;
    private final Context f3527c;
    private final Object f3528d;
    private final jp f3529e;
    private final boolean f3530f;
    private final long f3531g;
    private final long f3532h;
    private final cz f3533i;
    private final boolean f3534j;
    private boolean f3535k;
    private js f3536l;

    public kb(Context context, AdRequestInfoParcel adRequestInfoParcel, ke keVar, jp jpVar, boolean z, boolean z2, long j, long j2, cz czVar) {
        this.f3528d = new Object();
        this.f3535k = false;
        this.f3527c = context;
        this.f3525a = adRequestInfoParcel;
        this.f3526b = keVar;
        this.f3529e = jpVar;
        this.f3530f = z;
        this.f3534j = z2;
        this.f3531g = j;
        this.f3532h = j2;
        this.f3533i = czVar;
    }

    public final jv m3952a(List list) {
        C0501b.m3027a(3);
        Iterable arrayList = new ArrayList();
        cv a = this.f3533i.m3599a();
        for (jo joVar : list) {
            "Trying mediation network: " + joVar.f3452b;
            C0501b.m3027a(4);
            for (String str : joVar.f3453c) {
                cv a2 = this.f3533i.m3599a();
                synchronized (this.f3528d) {
                    if (this.f3535k) {
                        jv jvVar = new jv(-1);
                        return jvVar;
                    }
                    this.f3536l = new js(this.f3527c, str, this.f3526b, this.f3529e, joVar, this.f3525a.f2324c, this.f3525a.f2325d, this.f3525a.f2332k, this.f3530f, this.f3534j, this.f3525a.f2347z, this.f3525a.f2335n);
                    jvVar = this.f3536l.m3933a(this.f3531g, this.f3532h);
                    if (jvVar.f3502a == 0) {
                        C0501b.m3027a(3);
                        this.f3533i.m3601a("mediation_network_succeed", str);
                        if (!arrayList.isEmpty()) {
                            this.f3533i.m3601a("mediation_networks_fail", TextUtils.join(",", arrayList));
                        }
                        this.f3533i.m3603a(a2, "mls");
                        this.f3533i.m3603a(a, "ttm");
                        return jvVar;
                    }
                    arrayList.add(str);
                    this.f3533i.m3603a(a2, "mlf");
                    if (jvVar.f3504c != null) {
                        rd.f4041a.post(new kc(this, jvVar));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f3533i.m3601a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new jv(1);
    }

    public final void m3953a() {
        synchronized (this.f3528d) {
            this.f3535k = true;
            if (this.f3536l != null) {
                this.f3536l.m3935a();
            }
        }
    }
}
