package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C0335b;
import com.google.android.gms.ads.formats.C0338e;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0314a;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.dw */
public final class dw extends C0338e {
    private final dt f3142a;
    private final List f3143b;
    private final dm f3144c;

    public dw(dt dtVar) {
        dm dmVar;
        this.f3143b = new ArrayList();
        this.f3142a = dtVar;
        try {
            List b = this.f3142a.m2494b();
            if (b != null) {
                for (Object next : b) {
                    dj a = next instanceof IBinder ? dk.m2489a((IBinder) next) : null;
                    if (a != null) {
                        this.f3143b.add(new dm(a));
                    }
                }
            }
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
        try {
            dj d = this.f3142a.m2496d();
            if (d != null) {
                dmVar = new dm(d);
                this.f3144c = dmVar;
            }
        } catch (RemoteException e2) {
            C0501b.m3027a(6);
        }
        dmVar = null;
        this.f3144c = dmVar;
    }

    private C0314a m3651j() {
        try {
            return this.f3142a.m2501i();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    protected final /* synthetic */ Object m3652a() {
        return m3651j();
    }

    public final CharSequence m3653b() {
        try {
            return this.f3142a.m2493a();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final List m3654c() {
        return this.f3143b;
    }

    public final CharSequence m3655d() {
        try {
            return this.f3142a.m2495c();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final C0335b m3656e() {
        return this.f3144c;
    }

    public final CharSequence m3657f() {
        try {
            return this.f3142a.m2497e();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final Double m3658g() {
        Double d = null;
        try {
            double f = this.f3142a.m2498f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
        return d;
    }

    public final CharSequence m3659h() {
        try {
            return this.f3142a.m2499g();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public final CharSequence m3660i() {
        try {
            return this.f3142a.m2500h();
        } catch (RemoteException e) {
            C0501b.m3027a(6);
            return null;
        }
    }
}
