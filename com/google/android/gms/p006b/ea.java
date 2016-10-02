package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C0335b;
import com.google.android.gms.ads.formats.C0339g;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0314a;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.ea */
public final class ea extends C0339g {
    private final dx f3146a;
    private final List f3147b;
    private final dm f3148c;

    public ea(dx dxVar) {
        dm dmVar;
        this.f3147b = new ArrayList();
        this.f3146a = dxVar;
        try {
            List b = this.f3146a.m2524b();
            if (b != null) {
                for (Object next : b) {
                    dj a = next instanceof IBinder ? dk.m2489a((IBinder) next) : null;
                    if (a != null) {
                        this.f3147b.add(new dm(a));
                    }
                }
            }
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
        try {
            dj d = this.f3146a.m2526d();
            if (d != null) {
                dmVar = new dm(d);
                this.f3148c = dmVar;
            }
        } catch (RemoteException e2) {
            C0501b.m3027a(6);
        }
        dmVar = null;
        this.f3148c = dmVar;
    }

    private C0314a m3672h() {
        try {
            return this.f3146a.m2529g();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    protected final /* synthetic */ Object m3673a() {
        return m3672h();
    }

    public final CharSequence m3674b() {
        try {
            return this.f3146a.m2523a();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final List m3675c() {
        return this.f3147b;
    }

    public final CharSequence m3676d() {
        try {
            return this.f3146a.m2525c();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final C0335b m3677e() {
        return this.f3148c;
    }

    public final CharSequence m3678f() {
        try {
            return this.f3146a.m2527e();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final CharSequence m3679g() {
        try {
            return this.f3146a.m2528f();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }
}
