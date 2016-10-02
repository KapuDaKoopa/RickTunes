package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0317d;
import com.google.android.gms.p017a.C0318e;

@op
/* renamed from: com.google.android.gms.ads.internal.client.q */
public final class C0366q extends C0318e {
    private static final C0366q f2012a;

    static {
        f2012a = new C0366q();
    }

    private C0366q() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static ak m2437a(Context context, String str, kd kdVar) {
        C0374z.m2455a();
        if (C0500a.m3021b(context)) {
            ak b = f2012a.m2438b(context, str, kdVar);
            if (b != null) {
                return b;
            }
        }
        C0501b.m3027a(3);
        return C0374z.m2457c().m2449a(context, str, kdVar, new VersionInfoParcel());
    }

    private ak m2438b(Context context, String str, kd kdVar) {
        try {
            return al.m2308a(((an) m1998a(context)).m2316a(C0317d.m1996a((Object) context), str, kdVar, 8487000));
        } catch (Throwable e) {
            C0501b.m3026a("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            C0501b.m3026a("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object m2439a(IBinder iBinder) {
        return ao.m2317a(iBinder);
    }
}
