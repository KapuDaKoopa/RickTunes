package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cv;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rt;

@op
public final class ag {
    final Context f2177a;
    final String f2178b;
    final VersionInfoParcel f2179c;
    final cv f2180d;
    final cz f2181e;
    final rt f2182f;
    final long[] f2183g;
    final String[] f2184h;
    cv f2185i;
    cv f2186j;
    cv f2187k;
    cv f2188l;
    boolean f2189m;
    C0412v f2190n;
    boolean f2191o;
    boolean f2192p;
    long f2193q;

    public ag(Context context, VersionInfoParcel versionInfoParcel, String str, cz czVar, cv cvVar) {
        this.f2182f = new rt((byte) 0);
        this.f2193q = -1;
        this.f2177a = context;
        this.f2179c = versionInfoParcel;
        this.f2178b = str;
        this.f2181e = czVar;
        this.f2180d = cvVar;
        String str2 = (String) ar.m2249n().m3580a(ck.f3083v);
        if (str2 == null) {
            this.f2184h = new String[0];
            this.f2183g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f2184h = new String[split.length];
        this.f2183g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f2183g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                C0501b.m3026a("Unable to parse frame hash target time number.", e);
                this.f2183g[i] = -1;
            }
        }
    }
}
