package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.ar;
import java.util.LinkedHashMap;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.cm */
public final class cm {
    boolean f3089a;
    String f3090b;
    Map f3091c;
    Context f3092d;
    String f3093e;

    public cm(Context context, String str) {
        this.f3092d = null;
        this.f3093e = null;
        this.f3092d = context;
        this.f3093e = str;
        this.f3089a = ((Boolean) ar.m2249n().m3580a(ck.f3042G)).booleanValue();
        this.f3090b = (String) ar.m2249n().m3580a(ck.f3043H);
        this.f3091c = new LinkedHashMap();
        this.f3091c.put("s", "gmob_sdk");
        this.f3091c.put("v", "3");
        this.f3091c.put("os", VERSION.RELEASE);
        this.f3091c.put("sdk", VERSION.SDK);
        ar.m2240e();
        this.f3091c.put("device", rd.m4438c());
        this.f3091c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        pi a = ar.m2246k().m4345a(this.f3092d);
        this.f3091c.put("network_coarse", Integer.toString(a.f3872m));
        this.f3091c.put("network_fine", Integer.toString(a.f3873n));
    }
}
