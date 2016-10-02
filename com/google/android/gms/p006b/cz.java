package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.cz */
public final class cz {
    public boolean f3120a;
    public final Object f3121b;
    public String f3122c;
    cz f3123d;
    private final List f3124e;
    private final Map f3125f;
    private cv f3126g;

    public cz(boolean z, String str, String str2) {
        this.f3124e = new LinkedList();
        this.f3125f = new LinkedHashMap();
        this.f3121b = new Object();
        this.f3120a = z;
        this.f3125f.put("action", str);
        this.f3125f.put("ad_format", str2);
    }

    public final cv m3599a() {
        return m3600a(ar.m2244i().m4888b());
    }

    public final cv m3600a(long j) {
        return !this.f3120a ? null : new cv(j, null, null);
    }

    public final void m3601a(String str, String str2) {
        if (this.f3120a && !TextUtils.isEmpty(str2)) {
            cn c = ar.m2243h().m4370c();
            if (c != null) {
                synchronized (this.f3121b) {
                    c.m3585a(str).m3591a(this.f3125f, str, str2);
                }
            }
        }
    }

    public final boolean m3602a(cv cvVar, long j, String... strArr) {
        synchronized (this.f3121b) {
            for (String cvVar2 : strArr) {
                this.f3124e.add(new cv(j, cvVar2, cvVar));
            }
        }
        return true;
    }

    public final boolean m3603a(cv cvVar, String... strArr) {
        return (!this.f3120a || cvVar == null) ? false : m3602a(cvVar, ar.m2244i().m4888b(), strArr);
    }

    public final void m3604b() {
        synchronized (this.f3121b) {
            this.f3126g = m3599a();
        }
    }

    public final String m3605c() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f3121b) {
            for (cv cvVar : this.f3124e) {
                long j = cvVar.f3107a;
                String str = cvVar.f3108b;
                cv cvVar2 = cvVar2.f3109c;
                if (cvVar2 != null && j > 0) {
                    stringBuilder2.append(str).append('.').append(j - cvVar2.f3107a).append(',');
                }
            }
            this.f3124e.clear();
            if (!TextUtils.isEmpty(this.f3122c)) {
                stringBuilder2.append(this.f3122c);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    final Map m3606d() {
        Map map;
        synchronized (this.f3121b) {
            cn c = ar.m2243h().m4370c();
            if (c == null || this.f3123d == null) {
                map = this.f3125f;
            } else {
                map = c.m3586a(this.f3125f, this.f3123d.m3606d());
            }
        }
        return map;
    }

    public final cv m3607e() {
        cv cvVar;
        synchronized (this.f3121b) {
            cvVar = this.f3126g;
        }
        return cvVar;
    }
}
