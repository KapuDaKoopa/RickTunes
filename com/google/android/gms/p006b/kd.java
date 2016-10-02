package com.google.android.gms.p006b;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C0248i;
import com.google.ads.mediation.C0271q;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.C0237b;
import com.google.android.gms.ads.mediation.customevent.C0510a;
import com.google.android.gms.ads.mediation.customevent.C0515f;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.kd */
public final class kd extends kf {
    private Map f3539a;

    private kh m3957c(String str) {
        try {
            Class cls = Class.forName(str, false, kd.class.getClassLoader());
            if (C0248i.class.isAssignableFrom(cls)) {
                C0248i c0248i = (C0248i) cls.newInstance();
                return new ld(c0248i, (C0271q) this.f3539a.get(c0248i.m1730b()));
            } else if (C0237b.class.isAssignableFrom(cls)) {
                return new ky((C0237b) cls.newInstance());
            } else {
                C0501b.m3025a("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            }
        } catch (Throwable th) {
            return m3958d(str);
        }
    }

    private kh m3958d(String str) {
        try {
            C0501b.m3027a(3);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new ky(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new ky(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new ky(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                C0248i customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new ld(customEventAdapter, (C0515f) this.f3539a.get(customEventAdapter.m1740b()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            C0501b.m3026a("Could not instantiate mediation adapter: " + str + ". ", th);
        }
    }

    public final kh m3959a(String str) {
        return m3957c(str);
    }

    public final void m3960a(Map map) {
        this.f3539a = map;
    }

    public final boolean m3961b(String str) {
        boolean z = false;
        try {
            z = C0510a.class.isAssignableFrom(Class.forName(str, false, kd.class.getClassLoader()));
        } catch (Throwable th) {
            C0501b.m3025a("Could not load custom event implementation class: " + str + ", assuming old implementation.");
        }
        return z;
    }
}
