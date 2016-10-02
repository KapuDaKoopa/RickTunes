package com.google.android.gms.p006b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C0248i;
import com.google.ads.mediation.C0249j;
import com.google.ads.mediation.C0250l;
import com.google.ads.mediation.C0255n;
import com.google.ads.mediation.C0267k;
import com.google.ads.mediation.C0268m;
import com.google.ads.mediation.C0271q;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0491a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ld */
public final class ld extends ki {
    private final C0248i f3569a;
    private final C0271q f3570b;

    public ld(C0248i c0248i, C0271q c0271q) {
        this.f3569a = c0248i;
        this.f3570b = c0271q;
    }

    private C0255n m4151a(String str) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable th) {
                C0501b.m3026a("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class c = this.f3569a.m1731c();
        if (c == null) {
            return null;
        }
        C0255n c0255n = (C0255n) c.newInstance();
        c0255n.m1744a(hashMap);
        return c0255n;
    }

    public final C0314a m4152a() {
        if (this.f3569a instanceof C0249j) {
            try {
                return C0317d.m1996a(((C0249j) this.f3569a).m1733d());
            } catch (Throwable th) {
                C0501b.m3026a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationBannerAdapter: " + this.f3569a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4153a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, C0491a c0491a, String str2) {
    }

    public final void m4154a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, kk kkVar) {
        m4155a(c0314a, adRequestParcel, str, null, kkVar);
    }

    public final void m4155a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar) {
        if (this.f3569a instanceof C0250l) {
            C0501b.m3027a(3);
            try {
                C0250l c0250l = (C0250l) this.f3569a;
                C0268m leVar = new le(kkVar);
                C0317d.m1997a(c0314a);
                int i = adRequestParcel.f1890g;
                C0255n a = m4151a(str);
                lh.m4176a(adRequestParcel);
                c0250l.m1734a(leVar, a, this.f3570b);
            } catch (Throwable th) {
                C0501b.m3026a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f3569a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4156a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
    }

    public final void m4157a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, kk kkVar) {
        m4158a(c0314a, adSizeParcel, adRequestParcel, str, null, kkVar);
    }

    public final void m4158a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar) {
        if (this.f3569a instanceof C0249j) {
            C0501b.m3027a(3);
            try {
                C0249j c0249j = (C0249j) this.f3569a;
                C0267k leVar = new le(kkVar);
                C0317d.m1997a(c0314a);
                int i = adRequestParcel.f1890g;
                C0255n a = m4151a(str);
                lh.m4175a(adSizeParcel);
                lh.m4176a(adRequestParcel);
                c0249j.m1732a(leVar, a, this.f3570b);
            } catch (Throwable th) {
                C0501b.m3026a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationBannerAdapter: " + this.f3569a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4159a(AdRequestParcel adRequestParcel, String str) {
    }

    public final void m4160a(AdRequestParcel adRequestParcel, String str, String str2) {
    }

    public final void m4161b() {
        if (this.f3569a instanceof C0250l) {
            C0501b.m3027a(3);
            try {
                ((C0250l) this.f3569a).m1735e();
            } catch (Throwable th) {
                C0501b.m3026a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f3569a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4162c() {
        try {
            this.f3569a.m1729a();
        } catch (Throwable th) {
            C0501b.m3026a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void m4163d() {
        throw new RemoteException();
    }

    public final void m4164e() {
        throw new RemoteException();
    }

    public final void m4165f() {
    }

    public final boolean m4166g() {
        return true;
    }

    public final kr m4167h() {
        return null;
    }

    public final ku m4168i() {
        return null;
    }

    public final Bundle m4169j() {
        return new Bundle();
    }

    public final Bundle m4170k() {
        return new Bundle();
    }

    public final Bundle m4171l() {
        return new Bundle();
    }
}
