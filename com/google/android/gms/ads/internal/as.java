package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.p001b.C0028m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.ae;
import com.google.android.gms.ads.internal.client.aw;
import com.google.android.gms.ads.internal.client.az;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.C0445n;
import com.google.android.gms.ads.internal.reward.client.C0484g;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p006b.aa;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cn;
import com.google.android.gms.p006b.df;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.mq;
import com.google.android.gms.p006b.nc;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.qb;
import com.google.android.gms.p006b.qg;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.rp;
import com.google.android.gms.p006b.sh;
import com.google.android.gms.p006b.tg;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@op
public final class as implements OnGlobalLayoutListener, OnScrollChangedListener {
    C0445n f1842A;
    public qg f1843B;
    View f1844C;
    public int f1845D;
    boolean f1846E;
    boolean f1847F;
    private String f1848G;
    private HashSet f1849H;
    private int f1850I;
    private int f1851J;
    private sh f1852K;
    private boolean f1853L;
    private boolean f1854M;
    private boolean f1855N;
    final String f1856a;
    public String f1857b;
    public final Context f1858c;
    final aa f1859d;
    public final VersionInfoParcel f1860e;
    at f1861f;
    public qi f1862g;
    public rp f1863h;
    public AdSizeParcel f1864i;
    public pz f1865j;
    public qa f1866k;
    public qb f1867l;
    ab f1868m;
    ae f1869n;
    aw f1870o;
    az f1871p;
    mq f1872q;
    nc f1873r;
    ee f1874s;
    eh f1875t;
    C0028m f1876u;
    C0028m f1877v;
    NativeAdOptionsParcel f1878w;
    df f1879x;
    C0484g f1880y;
    List f1881z;

    public as(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this(context, adSizeParcel, str, versionInfoParcel, (byte) 0);
    }

    private as(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel, byte b) {
        this.f1843B = null;
        this.f1844C = null;
        this.f1845D = 0;
        this.f1846E = false;
        this.f1847F = false;
        this.f1849H = null;
        this.f1850I = -1;
        this.f1851J = -1;
        this.f1853L = true;
        this.f1854M = true;
        this.f1855N = false;
        ck.m3582a(context);
        if (ar.m2243h().m4370c() != null) {
            Iterable b2 = ck.m3583b();
            if (versionInfoParcel.f2540c != 0) {
                b2.add(Integer.toString(versionInfoParcel.f2540c));
            }
            cn c = ar.m2243h().m4370c();
            if (!(b2 == null || b2.isEmpty())) {
                c.f3096c.put("e", TextUtils.join(",", b2));
            }
        }
        this.f1856a = UUID.randomUUID().toString();
        if (adSizeParcel.f1906e || adSizeParcel.f1910i) {
            this.f1861f = null;
        } else {
            this.f1861f = new at(context, this, this);
            this.f1861f.setMinimumWidth(adSizeParcel.f1908g);
            this.f1861f.setMinimumHeight(adSizeParcel.f1905d);
            this.f1861f.setVisibility(4);
        }
        this.f1864i = adSizeParcel;
        this.f1857b = str;
        this.f1858c = context;
        this.f1860e = versionInfoParcel;
        this.f1859d = new aa(new C0497s(this));
        this.f1852K = new sh(200);
        this.f1877v = new C0028m();
    }

    private void m2257b(boolean z) {
        boolean z2 = true;
        if (this.f1861f != null && this.f1865j != null && this.f1865j.f3926b != null) {
            if (!z || this.f1852K.m4526a()) {
                if (this.f1865j.f3926b.m4579l().m4616b()) {
                    int[] iArr = new int[2];
                    this.f1861f.getLocationOnScreen(iArr);
                    C0374z.m2455a();
                    int b = C0500a.m3018b(this.f1858c, iArr[0]);
                    C0374z.m2455a();
                    int b2 = C0500a.m3018b(this.f1858c, iArr[1]);
                    if (!(b == this.f1850I && b2 == this.f1851J)) {
                        this.f1850I = b;
                        this.f1851J = b2;
                        tg l = this.f1865j.f3926b.m4579l();
                        b = this.f1850I;
                        int i = this.f1851J;
                        if (z) {
                            z2 = false;
                        }
                        l.m4605a(b, i, z2);
                    }
                }
                View findViewById = this.f1861f.getRootView().findViewById(16908290);
                if (findViewById != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.f1861f.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.f1853L = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.f1854M = false;
                    }
                }
            }
        }
    }

    public final HashSet m2258a() {
        return this.f1849H;
    }

    final void m2259a(String str) {
        this.f1848G = str;
    }

    public final void m2260a(HashSet hashSet) {
        this.f1849H = hashSet;
    }

    public final void m2261a(boolean z) {
        if (!(this.f1845D != 0 || this.f1865j == null || this.f1865j.f3926b == null)) {
            this.f1865j.f3926b.stopLoading();
        }
        if (this.f1862g != null) {
            this.f1862g.m2707d();
        }
        if (this.f1863h != null) {
            this.f1863h.m2703d();
        }
        if (z) {
            this.f1865j = null;
        }
    }

    public final void m2262b() {
        if (this.f1865j != null && this.f1865j.f3926b != null) {
            this.f1865j.f3926b.destroy();
        }
    }

    public final void m2263c() {
        if (this.f1865j != null && this.f1865j.f3939o != null) {
            try {
                this.f1865j.f3939o.m3974c();
            } catch (RemoteException e) {
                C0501b.m3025a("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean m2264d() {
        return this.f1845D == 0;
    }

    public final boolean m2265e() {
        return this.f1845D == 1;
    }

    public final String m2266f() {
        return (this.f1853L && this.f1854M) ? "" : this.f1853L ? this.f1855N ? "top-scrollable" : "top-locked" : this.f1854M ? this.f1855N ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public final void m2267g() {
        qb qbVar = this.f1867l;
        long j = this.f1865j.f3949y;
        synchronized (qbVar.f3962c) {
            qbVar.f3969j = j;
            if (qbVar.f3969j != -1) {
                qbVar.f3960a.m4366a(qbVar);
            }
        }
        qbVar = this.f1867l;
        j = this.f1865j.f3950z;
        synchronized (qbVar.f3962c) {
            if (qbVar.f3969j != -1) {
                qbVar.f3963d = j;
                qbVar.f3960a.m4366a(qbVar);
            }
        }
        qbVar = this.f1867l;
        boolean z = this.f1864i.f1906e;
        synchronized (qbVar.f3962c) {
            if (qbVar.f3969j != -1) {
                qbVar.f3966g = SystemClock.elapsedRealtime();
                if (!z) {
                    qbVar.f3964e = qbVar.f3966g;
                    qbVar.f3960a.m4366a(qbVar);
                }
            }
        }
        qbVar = this.f1867l;
        z = this.f1865j.f3937m;
        synchronized (qbVar.f3962c) {
            if (qbVar.f3969j != -1) {
                qbVar.f3965f = z;
                qbVar.f3960a.m4366a(qbVar);
            }
        }
    }

    public final void m2268h() {
        if (this.f1861f != null) {
            this.f1861f.m2270b();
        }
        this.f1869n = null;
        this.f1870o = null;
        this.f1873r = null;
        this.f1872q = null;
        this.f1879x = null;
        this.f1871p = null;
        m2261a(false);
        if (this.f1861f != null) {
            this.f1861f.removeAllViews();
        }
        m2262b();
        m2263c();
        this.f1865j = null;
    }

    public final void onGlobalLayout() {
        m2257b(false);
    }

    public final void onScrollChanged() {
        m2257b(true);
        this.f1855N = true;
    }
}
