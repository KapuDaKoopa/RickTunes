package com.google.android.gms.p006b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0317d;
import com.google.android.gms.p017a.C0318e;

@op
/* renamed from: com.google.android.gms.b.ng */
public final class ng extends C0318e {
    private static final ng f3666a;

    static {
        f3666a = new ng();
    }

    private ng() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static mt m4234a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
                if (!intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false)) {
                    mt b = f3666a.m4235b(activity);
                    if (b != null) {
                        return b;
                    }
                }
                C0501b.m3027a(3);
                return C0374z.m2457c().m2452a(activity);
            }
            throw new nh("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } catch (nh e) {
            C0501b.m3025a(e.getMessage());
            return null;
        }
    }

    private mt m4235b(Activity activity) {
        try {
            return mu.m2775a(((mw) m1998a((Context) activity)).m4220a(C0317d.m1996a((Object) activity)));
        } catch (Throwable e) {
            C0501b.m3026a("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            C0501b.m3026a("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object m4236a(IBinder iBinder) {
        return mx.m4221a(iBinder);
    }
}
