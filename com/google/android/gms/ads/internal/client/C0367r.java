package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.kd;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0317d;
import com.google.android.gms.p017a.C0318e;
import com.google.android.gms.p017a.C0319f;

@op
/* renamed from: com.google.android.gms.ads.internal.client.r */
public final class C0367r extends C0318e {
    public C0367r() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final aq m2440a(Context context, AdSizeParcel adSizeParcel, String str, kd kdVar, int i) {
        try {
            return ar.m2137a(((at) m1998a(context)).m2342a(C0317d.m1996a((Object) context), adSizeParcel, str, kdVar, 8487000, i));
        } catch (RemoteException e) {
            C0501b.m3027a(3);
            return null;
        } catch (C0319f e2) {
            C0501b.m3027a(3);
            return null;
        }
    }

    protected final /* synthetic */ Object m2441a(IBinder iBinder) {
        return au.m2343a(iBinder);
    }
}
