package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C0344a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.dn;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.lz;
import com.google.android.gms.p006b.mt;
import com.google.android.gms.p006b.op;

@op
/* renamed from: com.google.android.gms.ads.internal.client.x */
public class C0373x {
    public static String f2032a;
    private C0343y f2033b;

    static {
        f2032a = null;
    }

    public C0373x() {
        C0344a.m2083a();
        if (f2032a != null) {
            try {
                this.f2033b = (C0343y) C0373x.class.getClassLoader().loadClass(f2032a).newInstance();
                return;
            } catch (Throwable e) {
                C0501b.m3026a("Failed to instantiate ClientApi class.", e);
                this.f2033b = new C0360l();
                return;
            }
        }
        C0501b.m3025a("No client jar implementation found.");
        this.f2033b = new C0360l();
    }

    public final ak m2449a(Context context, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        return this.f2033b.m2077a(context, str, kdVar, versionInfoParcel);
    }

    public final aq m2450a(Context context, AdSizeParcel adSizeParcel, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        return this.f2033b.m2078a(context, adSizeParcel, str, kdVar, versionInfoParcel);
    }

    public final dn m2451a(FrameLayout frameLayout, FrameLayout frameLayout2) {
        return this.f2033b.m2079a(frameLayout, frameLayout2);
    }

    public final mt m2452a(Activity activity) {
        return this.f2033b.m2080a(activity);
    }

    public final aq m2453b(Context context, AdSizeParcel adSizeParcel, String str, kd kdVar, VersionInfoParcel versionInfoParcel) {
        return this.f2033b.m2081b(context, adSizeParcel, str, kdVar, versionInfoParcel);
    }

    public final lz m2454b(Activity activity) {
        return this.f2033b.m2082b(activity);
    }
}
