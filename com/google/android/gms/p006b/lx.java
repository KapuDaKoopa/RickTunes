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
/* renamed from: com.google.android.gms.b.lx */
public final class lx extends C0318e {
    private static final lx f3641a;

    static {
        f3641a = new lx();
    }

    private lx() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static lz m4192a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
                if (!intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false)) {
                    lz b = f3641a.m4193b(activity);
                    if (b != null) {
                        return b;
                    }
                }
                C0501b.m3027a(3);
                return C0374z.m2457c().m2454b(activity);
            }
            throw new ly("Ad overlay requires the useClientJar flag in intent extras.");
        } catch (ly e) {
            C0501b.m3025a(e.getMessage());
            return null;
        }
    }

    private lz m4193b(Activity activity) {
        try {
            return ma.m2676a(((mc) m1998a((Context) activity)).m4207a(C0317d.m1996a((Object) activity)));
        } catch (Throwable e) {
            C0501b.m3026a("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            C0501b.m3026a("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object m4194a(IBinder iBinder) {
        return md.m4208a(iBinder);
    }
}
