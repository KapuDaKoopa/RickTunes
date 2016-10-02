package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.search.C0524a;
import com.google.android.gms.p006b.op;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.client.u */
public final class C0370u {
    public static final C0370u f2030a;

    static {
        f2030a = new C0370u();
    }

    protected C0370u() {
    }

    public static AdRequestParcel m2444a(Context context, C0350b c0350b) {
        Date a = c0350b.m2349a();
        long time = a != null ? a.getTime() : -1;
        String b = c0350b.m2351b();
        int c = c0350b.m2352c();
        Collection d = c0350b.m2353d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = c0350b.m2350a(context);
        int l = c0350b.m2361l();
        Location e = c0350b.m2354e();
        Bundle a3 = c0350b.m2348a(AdMobAdapter.class);
        boolean f = c0350b.m2355f();
        String g = c0350b.m2356g();
        C0524a i = c0350b.m2358i();
        SearchAdRequestParcel searchAdRequestParcel = i != null ? new SearchAdRequestParcel(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C0374z.m2455a();
            str = C0500a.m3013a(Thread.currentThread().getStackTrace(), packageName);
        }
        return new AdRequestParcel(7, time, a3, c, unmodifiableList, a2, l, f, g, searchAdRequestParcel, e, b, c0350b.m2360k(), c0350b.m2362m(), Collections.unmodifiableList(new ArrayList(c0350b.m2363n())), c0350b.m2357h(), str, c0350b.m2364o());
    }

    public static C0370u m2445a() {
        return f2030a;
    }
}
