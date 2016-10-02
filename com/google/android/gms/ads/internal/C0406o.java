package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p006b.kr;
import com.google.android.gms.p006b.ku;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.qa;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p017a.C0317d;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.o */
public final class C0406o extends C0377e implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean f2148l;

    public C0406o(Context context, AdSizeParcel adSizeParcel, String str, ke keVar, VersionInfoParcel versionInfoParcel, C0402k c0402k) {
        super(context, adSizeParcel, str, keVar, versionInfoParcel, c0402k);
    }

    private boolean m2608b(pz pzVar, pz pzVar2) {
        if (pzVar2.f3937m) {
            View a = ab.m2091a(pzVar2);
            if (a == null) {
                C0501b.m3025a("Could not get mediation view");
                return false;
            }
            View nextView = this.f.f1861f.getNextView();
            if (nextView != null) {
                if (nextView instanceof tf) {
                    ((tf) nextView).destroy();
                }
                this.f.f1861f.removeView(nextView);
            }
            if (!ab.m2100b(pzVar2)) {
                try {
                    m2146a(a);
                } catch (Throwable th) {
                    C0501b.m3026a("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (!(pzVar2.f3944t == null || pzVar2.f3926b == null)) {
            pzVar2.f3926b.m4557a(pzVar2.f3944t);
            this.f.f1861f.removeAllViews();
            this.f.f1861f.setMinimumWidth(pzVar2.f3944t.f1908g);
            this.f.f1861f.setMinimumHeight(pzVar2.f3944t.f1905d);
            m2146a(pzVar2.f3926b.m4564b());
        }
        if (this.f.f1861f.getChildCount() > 1) {
            this.f.f1861f.showNext();
        }
        if (pzVar != null) {
            View nextView2 = this.f.f1861f.getNextView();
            if (nextView2 instanceof tf) {
                ((tf) nextView2).m4556a(this.f.f1858c, this.f.f1864i, this.a);
            } else if (nextView2 != null) {
                this.f.f1861f.removeView(nextView2);
            }
            this.f.m2263c();
        }
        this.f.f1861f.setVisibility(0);
        return true;
    }

    private void m2609d(pz pzVar) {
        if (pzVar != null && !pzVar.f3936l && this.f.f1861f != null) {
            ar.m2240e();
            if (rd.m4426a(this.f.f1861f, this.f.f1858c) && this.f.f1861f.getGlobalVisibleRect(new Rect(), null)) {
                m2611a(pzVar, false);
                pzVar.f3936l = true;
            }
        }
    }

    protected final tf m2610a(qa qaVar, C0403l c0403l) {
        if (this.f.f1864i.f1911j) {
            AdSizeParcel adSizeParcel;
            as asVar = this.f;
            if (qaVar.f3953b.f2349B) {
                adSizeParcel = this.f.f1864i;
            } else {
                C0333f c0333f;
                String str = qaVar.f3953b.f2368m;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    c0333f = new C0333f(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    c0333f = this.f.f1864i.m2277c();
                }
                adSizeParcel = new AdSizeParcel(this.f.f1858c, c0333f);
            }
            asVar.f1864i = adSizeParcel;
        }
        return super.m2469a(qaVar, c0403l);
    }

    protected final void m2611a(pz pzVar, boolean z) {
        super.m2194a(pzVar, z);
        if (ab.m2100b(pzVar)) {
            C0447q c0447q = new C0447q(this);
            if (ab.m2100b(pzVar)) {
                tf tfVar = pzVar.f3926b;
                Object b = tfVar.m4564b();
                if (b == null) {
                    C0501b.m3025a("AdWebView is null");
                    return;
                }
                try {
                    List list = pzVar.f3938n.f3464n;
                    if (list == null || list.isEmpty()) {
                        C0501b.m3025a("No template ids present in mediation response");
                        return;
                    }
                    kr h = pzVar.f3939o.m3979h();
                    ku i = pzVar.f3939o.m3980i();
                    if (list.contains("2") && h != null) {
                        h.m4017b(C0317d.m1996a(b));
                        if (!h.m4025j()) {
                            h.m4024i();
                        }
                        tfVar.m4579l().m4611a("/nativeExpressViewClicked", ab.m2093a(h, null, c0447q));
                    } else if (!list.contains("1") || i == null) {
                        C0501b.m3025a("No matching template id and mapper");
                    } else {
                        i.m4046b(C0317d.m1996a(b));
                        if (!i.m4052h()) {
                            i.m4051g();
                        }
                        tfVar.m4579l().m4611a("/nativeExpressViewClicked", ab.m2093a(null, i, c0447q));
                    }
                } catch (Throwable e) {
                    C0501b.m3026a("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    public final void m2612a(boolean z) {
        ax.m5534b("setManualImpressionsEnabled must be called from the main thread.");
        this.f2148l = z;
    }

    public final boolean m2613a(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f1891h != this.f2148l) {
            int i = adRequestParcel.f1884a;
            long j = adRequestParcel.f1885b;
            Bundle bundle = adRequestParcel.f1886c;
            int i2 = adRequestParcel.f1887d;
            List list = adRequestParcel.f1888e;
            boolean z = adRequestParcel.f1889f;
            int i3 = adRequestParcel.f1890g;
            boolean z2 = adRequestParcel.f1891h || this.f2148l;
            adRequestParcel = new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, adRequestParcel.f1892i, adRequestParcel.f1893j, adRequestParcel.f1894k, adRequestParcel.f1895l, adRequestParcel.f1896m, adRequestParcel.f1897n, adRequestParcel.f1898o, adRequestParcel.f1899p, adRequestParcel.f1900q, adRequestParcel.f1901r);
        }
        return super.m2163a(adRequestParcel);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2614a(com.google.android.gms.p006b.pz r4, com.google.android.gms.p006b.pz r5) {
        /*
        r3 = this;
        r1 = 0;
        r0 = super.m2473a(r4, r5);
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        r0 = r1;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = r3.f;
        r0 = r0.m2264d();
        if (r0 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r3.m2608b(r4, r5);
        if (r0 != 0) goto L_0x001c;
    L_0x0017:
        r3.m2145a(r1);
        r0 = r1;
        goto L_0x0008;
    L_0x001c:
        r0 = r5.f3935k;
        if (r0 == 0) goto L_0x0061;
    L_0x0020:
        r3.m2609d(r5);
        r0 = r3.f;
        r0 = r0.f1861f;
        com.google.android.gms.p006b.ta.m4540a(r0, r3);
        r0 = r3.f;
        r0 = r0.f1861f;
        com.google.android.gms.p006b.ta.m4541a(r0, r3);
    L_0x0031:
        r0 = r3.f;
        r0 = r0.m2264d();
        if (r0 == 0) goto L_0x008e;
    L_0x0039:
        r0 = r5.f3926b;
        if (r0 == 0) goto L_0x005f;
    L_0x003d:
        r0 = r5.f3934j;
        if (r0 == 0) goto L_0x004a;
    L_0x0041:
        r0 = r3.h;
        r1 = r3.f;
        r1 = r1.f1864i;
        r0.m3477a(r1, r5);
    L_0x004a:
        r0 = r5.m4353a();
        if (r0 == 0) goto L_0x007f;
    L_0x0050:
        r0 = r3.h;
        r1 = r3.f;
        r1 = r1.f1864i;
        r0 = r0.m3477a(r1, r5);
        r1 = r5.f3926b;
        r0.m3439a(r1);
    L_0x005f:
        r0 = 1;
        goto L_0x0008;
    L_0x0061:
        r0 = r3.f;
        r0 = r0.m2265e();
        if (r0 == 0) goto L_0x007b;
    L_0x0069:
        r0 = com.google.android.gms.p006b.ck.aG;
        r2 = com.google.android.gms.ads.internal.ar.m2249n();
        r0 = r2.m3580a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0031;
    L_0x007b:
        r3.m2611a(r5, r1);
        goto L_0x0031;
    L_0x007f:
        r0 = r5.f3926b;
        r0 = r0.m4579l();
        r1 = new com.google.android.gms.ads.internal.p;
        r1.<init>(r3, r5);
        r0.m4610a(r1);
        goto L_0x005f;
    L_0x008e:
        r0 = r3.f;
        r0 = r0.f1844C;
        if (r0 == 0) goto L_0x005f;
    L_0x0094:
        r0 = r5.f3934j;
        if (r0 == 0) goto L_0x005f;
    L_0x0098:
        r0 = r3.h;
        r1 = r3.f;
        r1 = r1.f1864i;
        r2 = r3.f;
        r2 = r2.f1844C;
        r0.m3478a(r1, r5, r2);
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.o.a(com.google.android.gms.b.pz, com.google.android.gms.b.pz):boolean");
    }

    public final void m2615f() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void onGlobalLayout() {
        m2609d(this.f.f1865j);
    }

    public final void onScrollChanged() {
        m2609d(this.f.f1865j);
    }

    protected final boolean m2616q() {
        boolean z = true;
        ar.m2240e();
        if (!rd.m4425a(this.f.f1858c.getPackageManager(), this.f.f1858c.getPackageName(), "android.permission.INTERNET")) {
            C0374z.m2455a();
            C0500a.m3016a(this.f.f1861f, this.f.f1864i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        ar.m2240e();
        if (!rd.m4423a(this.f.f1858c)) {
            C0374z.m2455a();
            C0500a.m3016a(this.f.f1861f, this.f.f1864i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.f.f1861f == null)) {
            this.f.f1861f.setVisibility(0);
        }
        return z;
    }
}
