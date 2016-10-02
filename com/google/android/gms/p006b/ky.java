package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0342i;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0491a;
import com.google.android.gms.ads.internal.reward.mediation.client.C0494d;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.C0237b;
import com.google.android.gms.ads.mediation.C0239d;
import com.google.android.gms.ads.mediation.C0240h;
import com.google.android.gms.ads.mediation.C0241f;
import com.google.android.gms.ads.mediation.C0245j;
import com.google.android.gms.ads.mediation.C0246k;
import com.google.android.gms.ads.mediation.C0257l;
import com.google.android.gms.ads.p007b.p008a.C0238a;
import com.google.android.gms.ads.p007b.p008a.C0324b;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ky */
public final class ky extends ki {
    private final C0237b f3553a;
    private kz f3554b;

    public ky(C0237b c0237b) {
        this.f3553a = c0237b;
    }

    private Bundle m4075a(String str, int i, String str2) {
        C0501b.m3025a("Server parameters: " + str);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    bundle2.putString(str3, jSONObject.getString(str3));
                }
                bundle = bundle2;
            }
            if (this.f3553a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            C0501b.m3026a("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final C0314a m4076a() {
        if (this.f3553a instanceof C0239d) {
            try {
                return C0317d.m1996a(((C0239d) this.f3553a).m1682d());
            } catch (Throwable th) {
                C0501b.m3026a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationBannerAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4077a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, C0491a c0491a, String str2) {
        Date date = null;
        if (this.f3553a instanceof C0238a) {
            C0501b.m3027a(3);
            try {
                C0238a c0238a = (C0238a) this.f3553a;
                Set hashSet = adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null;
                if (adRequestParcel.f1885b != -1) {
                    date = new Date(adRequestParcel.f1885b);
                }
                kx kxVar = new kx(date, adRequestParcel.f1887d, hashSet, adRequestParcel.f1894k, adRequestParcel.f1889f, adRequestParcel.f1890g, adRequestParcel.f1901r);
                if (adRequestParcel.f1896m != null) {
                    adRequestParcel.f1896m.getBundle(c0238a.getClass().getName());
                }
                Context context = (Context) C0317d.m1997a(c0314a);
                C0324b c0494d = new C0494d(c0491a);
                m4075a(str2, adRequestParcel.f1890g, null);
                c0238a.m1677a(context, str, c0494d);
            } catch (Throwable th) {
                C0501b.m3026a("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4078a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, kk kkVar) {
        m4079a(c0314a, adRequestParcel, str, null, kkVar);
    }

    public final void m4079a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar) {
        if (this.f3553a instanceof C0241f) {
            C0501b.m3027a(3);
            try {
                C0241f c0241f = (C0241f) this.f3553a;
                c0241f.m1684a((Context) C0317d.m1997a(c0314a), new kz(kkVar), m4075a(str, adRequestParcel.f1890g, str2), new kx(adRequestParcel.f1885b == -1 ? null : new Date(adRequestParcel.f1885b), adRequestParcel.f1887d, adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null, adRequestParcel.f1894k, adRequestParcel.f1889f, adRequestParcel.f1890g, adRequestParcel.f1901r), adRequestParcel.f1896m != null ? adRequestParcel.f1896m.getBundle(c0241f.getClass().getName()) : null);
            } catch (Throwable th) {
                C0501b.m3026a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4080a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
        if (this.f3553a instanceof C0240h) {
            try {
                C0240h c0240h = (C0240h) this.f3553a;
                lc lcVar = new lc(adRequestParcel.f1885b == -1 ? null : new Date(adRequestParcel.f1885b), adRequestParcel.f1887d, adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null, adRequestParcel.f1894k, adRequestParcel.f1889f, adRequestParcel.f1890g, nativeAdOptionsParcel, list, adRequestParcel.f1901r);
                Bundle bundle = adRequestParcel.f1896m != null ? adRequestParcel.f1896m.getBundle(c0240h.getClass().getName()) : null;
                this.f3554b = new kz(kkVar);
                c0240h.m1683a((Context) C0317d.m1997a(c0314a), this.f3554b, m4075a(str, adRequestParcel.f1890g, str2), lcVar, bundle);
            } catch (Throwable th) {
                C0501b.m3026a("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationNativeAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4081a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, kk kkVar) {
        m4082a(c0314a, adSizeParcel, adRequestParcel, str, null, kkVar);
    }

    public final void m4082a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar) {
        if (this.f3553a instanceof C0239d) {
            C0501b.m3027a(3);
            try {
                C0239d c0239d = (C0239d) this.f3553a;
                c0239d.m1681a((Context) C0317d.m1997a(c0314a), new kz(kkVar), m4075a(str, adRequestParcel.f1890g, str2), C0342i.m2076a(adSizeParcel.f1907f, adSizeParcel.f1904c, adSizeParcel.f1903b), new kx(adRequestParcel.f1885b == -1 ? null : new Date(adRequestParcel.f1885b), adRequestParcel.f1887d, adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null, adRequestParcel.f1894k, adRequestParcel.f1889f, adRequestParcel.f1890g, adRequestParcel.f1901r), adRequestParcel.f1896m != null ? adRequestParcel.f1896m.getBundle(c0239d.getClass().getName()) : null);
            } catch (Throwable th) {
                C0501b.m3026a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationBannerAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4083a(AdRequestParcel adRequestParcel, String str) {
        m4084a(adRequestParcel, str, null);
    }

    public final void m4084a(AdRequestParcel adRequestParcel, String str, String str2) {
        if (this.f3553a instanceof C0238a) {
            C0501b.m3027a(3);
            try {
                C0238a c0238a = (C0238a) this.f3553a;
                c0238a.m1678a(new kx(adRequestParcel.f1885b == -1 ? null : new Date(adRequestParcel.f1885b), adRequestParcel.f1887d, adRequestParcel.f1888e != null ? new HashSet(adRequestParcel.f1888e) : null, adRequestParcel.f1894k, adRequestParcel.f1889f, adRequestParcel.f1890g, adRequestParcel.f1901r), m4075a(str, adRequestParcel.f1890g, str2), adRequestParcel.f1896m != null ? adRequestParcel.f1896m.getBundle(c0238a.getClass().getName()) : null);
            } catch (Throwable th) {
                C0501b.m3026a("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4085b() {
        if (this.f3553a instanceof C0241f) {
            C0501b.m3027a(3);
            try {
                ((C0241f) this.f3553a).m1685e();
            } catch (Throwable th) {
                C0501b.m3026a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void m4086c() {
        try {
            this.f3553a.m1674a();
        } catch (Throwable th) {
            C0501b.m3026a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void m4087d() {
        try {
            this.f3553a.m1675b();
        } catch (Throwable th) {
            C0501b.m3026a("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void m4088e() {
        try {
            this.f3553a.m1676c();
        } catch (Throwable th) {
            C0501b.m3026a("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void m4089f() {
        if (this.f3553a instanceof C0238a) {
            C0501b.m3027a(3);
            try {
                ((C0238a) this.f3553a).m1679g();
            } catch (Throwable th) {
                C0501b.m3026a("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final boolean m4090g() {
        if (this.f3553a instanceof C0238a) {
            C0501b.m3027a(3);
            try {
                return ((C0238a) this.f3553a).m1680h();
            } catch (Throwable th) {
                C0501b.m3026a("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0501b.m3025a("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f3553a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final kr m4091h() {
        C0245j c0245j = this.f3554b.f3555a;
        return c0245j instanceof C0246k ? new la((C0246k) c0245j) : null;
    }

    public final ku m4092i() {
        C0245j c0245j = this.f3554b.f3555a;
        return c0245j instanceof C0257l ? new lb((C0257l) c0245j) : null;
    }

    public final Bundle m4093j() {
        if (this.f3553a instanceof ud) {
            return ((ud) this.f3553a).m4745e();
        }
        C0501b.m3025a("MediationAdapter is not a v2 MediationBannerAdapter: " + this.f3553a.getClass().getCanonicalName());
        return new Bundle();
    }

    public final Bundle m4094k() {
        if (this.f3553a instanceof uh) {
            return ((uh) this.f3553a).m1686f();
        }
        C0501b.m3025a("MediationAdapter is not a v2 MediationInterstitialAdapter: " + this.f3553a.getClass().getCanonicalName());
        return new Bundle();
    }

    public final Bundle m4095l() {
        return new Bundle();
    }
}
