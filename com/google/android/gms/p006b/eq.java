package com.google.android.gms.p006b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0317d;
import com.google.android.gms.p017a.C0318e;
import com.google.android.gms.p017a.C0319f;

@op
/* renamed from: com.google.android.gms.b.eq */
public final class eq extends C0318e {
    public eq() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final dn m3694a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        Throwable e;
        try {
            return C0361do.m2425a(((dq) m1998a(context)).m3637a(C0317d.m1996a((Object) context), C0317d.m1996a((Object) frameLayout), C0317d.m1996a((Object) frameLayout2), 8487000));
        } catch (RemoteException e2) {
            e = e2;
            C0501b.m3026a("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (C0319f e3) {
            e = e3;
            C0501b.m3026a("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object m3695a(IBinder iBinder) {
        return dr.m3638a(iBinder);
    }
}
