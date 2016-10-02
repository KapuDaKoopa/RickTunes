package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.ma;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rg;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p006b.tm;
import java.util.Collections;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.k */
public final class C0421k extends ma implements af {
    static final int f2221a;
    AdOverlayInfoParcel f2222b;
    tf f2223c;
    C0425o f2224d;
    ab f2225e;
    boolean f2226f;
    FrameLayout f2227g;
    CustomViewCallback f2228h;
    boolean f2229i;
    boolean f2230j;
    RelativeLayout f2231k;
    boolean f2232l;
    int f2233m;
    C0409y f2234n;
    private final Activity f2235o;
    private boolean f2236p;
    private boolean f2237q;
    private boolean f2238r;

    static {
        f2221a = Color.argb(0, 0, 0, 0);
    }

    public C0421k(Activity activity) {
        this.f2226f = false;
        this.f2229i = false;
        this.f2230j = false;
        this.f2232l = false;
        this.f2233m = 0;
        this.f2237q = false;
        this.f2238r = true;
        this.f2235o = activity;
        this.f2234n = new ad();
    }

    private void m2678a(boolean z) {
        this.f2225e = new ab(this.f2235o, z ? 50 : 32, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f2225e.m2629a(z, this.f2222b.f2165h);
        this.f2231k.addView(this.f2225e, layoutParams);
    }

    private void m2679b(boolean z) {
        if (!this.f2236p) {
            this.f2235o.requestWindowFeature(1);
        }
        Window window = this.f2235o.getWindow();
        if (window == null) {
            throw new C0423m("Invalid activity, no window available.");
        }
        if (!this.f2230j || (this.f2222b.f2174q != null && this.f2222b.f2174q.f1770c)) {
            window.setFlags(1024, 1024);
        }
        boolean b = this.f2222b.f2162e.m4579l().m4616b();
        this.f2232l = false;
        if (b) {
            if (this.f2222b.f2168k == ar.m2242g().m4461a()) {
                this.f2232l = this.f2235o.getResources().getConfiguration().orientation == 1;
            } else if (this.f2222b.f2168k == ar.m2242g().m4474b()) {
                this.f2232l = this.f2235o.getResources().getConfiguration().orientation == 2;
            }
        }
        "Delay onShow to next orientation change: " + this.f2232l;
        C0501b.m3027a(3);
        m2683a(this.f2222b.f2168k);
        if (ar.m2242g().m4473a(window)) {
            C0501b.m3027a(3);
        }
        if (this.f2230j) {
            this.f2231k.setBackgroundColor(f2221a);
        } else {
            this.f2231k.setBackgroundColor(-16777216);
        }
        this.f2235o.setContentView(this.f2231k);
        this.f2236p = true;
        if (z) {
            ar.m2241f();
            this.f2223c = tm.m4623a(this.f2235o, this.f2222b.f2162e.m4578k(), true, b, null, this.f2222b.f2171n, null, this.f2222b.f2162e.m4575h());
            this.f2223c.m4579l().m4606a(null, null, this.f2222b.f2163f, this.f2222b.f2167j, true, this.f2222b.f2172o, null, this.f2222b.f2162e.m4579l().m4603a(), null);
            this.f2223c.m4579l().m4609a(new C0422l(this));
            if (this.f2222b.f2170m != null) {
                this.f2223c.loadUrl(this.f2222b.f2170m);
            } else if (this.f2222b.f2166i != null) {
                this.f2223c.loadDataWithBaseURL(this.f2222b.f2164g, this.f2222b.f2166i, "text/html", "UTF-8", null);
            } else {
                throw new C0423m("No URL or HTML to display in ad overlay.");
            }
            if (this.f2222b.f2162e != null) {
                this.f2222b.f2162e.m4566b(this);
            }
        } else {
            this.f2223c = this.f2222b.f2162e;
            this.f2223c.m4555a(this.f2235o);
        }
        this.f2223c.m4558a(this);
        ViewParent parent = this.f2223c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f2223c.m4564b());
        }
        if (this.f2230j) {
            this.f2223c.setBackgroundColor(f2221a);
        }
        this.f2231k.addView(this.f2223c.m4564b(), -1, -1);
        if (!(z || this.f2232l)) {
            m2681q();
        }
        m2678a(b);
        if (this.f2223c.m4580m()) {
            m2686a(b, true);
        }
        C0402k h = this.f2223c.m4575h();
        C0410z c0410z = h != null ? h.f2142c : null;
        if (c0410z != null) {
            Activity activity = this.f2235o;
            tf tfVar = this.f2223c;
            RelativeLayout relativeLayout = this.f2231k;
            this.f2234n = c0410z.m2630a();
            return;
        }
        C0501b.m3025a("Appstreaming controller is null.");
    }

    private void m2680p() {
        if (this.f2235o.isFinishing() && !this.f2237q) {
            this.f2237q = true;
            if (this.f2223c != null) {
                this.f2223c.m4554a(this.f2233m);
                this.f2231k.removeView(this.f2223c.m4564b());
                if (this.f2224d != null) {
                    this.f2223c.m4555a(this.f2224d.f2244d);
                    this.f2223c.m4563a(false);
                    this.f2224d.f2243c.addView(this.f2223c.m4564b(), this.f2224d.f2241a, this.f2224d.f2242b);
                    this.f2224d = null;
                } else if (this.f2235o.getApplicationContext() != null) {
                    this.f2223c.m4555a(this.f2235o.getApplicationContext());
                }
                this.f2223c = null;
            }
            if (!(this.f2222b == null || this.f2222b.f2161d == null)) {
                this.f2222b.f2161d.d_();
            }
            C0409y c0409y = this.f2234n;
        }
    }

    private void m2681q() {
        this.f2223c.m4571d();
    }

    public final void m2682a() {
        this.f2233m = 2;
        this.f2235o.finish();
    }

    public final void m2683a(int i) {
        this.f2235o.setRequestedOrientation(i);
    }

    public final void m2684a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f2229i = z;
        try {
            this.f2222b = AdOverlayInfoParcel.m2617a(this.f2235o.getIntent());
            if (this.f2222b == null) {
                throw new C0423m("Could not get info for ad overlay.");
            }
            if (this.f2222b.f2171n.f2541d > 7500000) {
                this.f2233m = 3;
            }
            if (this.f2235o.getIntent() != null) {
                this.f2238r = this.f2235o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f2222b.f2174q != null) {
                this.f2230j = this.f2222b.f2174q.f1769b;
            } else {
                this.f2230j = false;
            }
            if (((Boolean) ar.m2249n().m3580a(ck.aE)).booleanValue() && this.f2230j && this.f2222b.f2174q.f1771d != null) {
                new C0426p().m2709g();
            }
            if (bundle == null) {
                if (this.f2222b.f2161d != null && this.f2238r) {
                    this.f2222b.f2161d.e_();
                }
                if (!(this.f2222b.f2169l == 1 || this.f2222b.f2160c == null)) {
                    this.f2222b.f2160c.m1751e();
                }
            }
            this.f2231k = new C0424n(this.f2235o, this.f2222b.f2173p);
            this.f2231k.setId(1000);
            switch (this.f2222b.f2169l) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    m2679b(false);
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    this.f2224d = new C0425o(this.f2222b.f2162e);
                    m2679b(false);
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    m2679b(true);
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    if (this.f2229i) {
                        this.f2233m = 3;
                        this.f2235o.finish();
                        return;
                    }
                    ar.m2237b();
                    if (!C0407a.m2626a(this.f2235o, this.f2222b.f2159b, this.f2222b.f2167j)) {
                        this.f2233m = 3;
                        this.f2235o.finish();
                    }
                default:
                    throw new C0423m("Could not determine ad overlay type.");
            }
        } catch (C0423m e) {
            C0501b.m3025a(e.getMessage());
            this.f2233m = 3;
            this.f2235o.finish();
        }
    }

    public final void m2685a(View view, CustomViewCallback customViewCallback) {
        this.f2227g = new FrameLayout(this.f2235o);
        this.f2227g.setBackgroundColor(-16777216);
        this.f2227g.addView(view, -1, -1);
        this.f2235o.setContentView(this.f2227g);
        this.f2236p = true;
        this.f2228h = customViewCallback;
        this.f2226f = true;
    }

    public final void m2686a(boolean z, boolean z2) {
        if (this.f2225e != null) {
            this.f2225e.m2629a(z, z2);
        }
    }

    public final void m2687b() {
        if (this.f2222b != null && this.f2226f) {
            m2683a(this.f2222b.f2168k);
        }
        if (this.f2227g != null) {
            this.f2235o.setContentView(this.f2231k);
            this.f2236p = true;
            this.f2227g.removeAllViews();
            this.f2227g = null;
        }
        if (this.f2228h != null) {
            this.f2228h.onCustomViewHidden();
            this.f2228h = null;
        }
        this.f2226f = false;
    }

    public final void m2688b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2229i);
    }

    public final void m2689c() {
        this.f2233m = 1;
        this.f2235o.finish();
    }

    public final void m2690d() {
        this.f2233m = 0;
    }

    public final boolean m2691e() {
        boolean z = true;
        this.f2233m = 0;
        if (this.f2223c != null) {
            if (this.f2223c.m4587t()) {
                C0409y c0409y = this.f2234n;
            } else {
                z = false;
            }
            if (!z) {
                this.f2223c.m4561a("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    public final void m2692f() {
    }

    public final void m2693g() {
    }

    public final void m2694h() {
        if (this.f2222b != null && this.f2222b.f2169l == 4) {
            if (this.f2229i) {
                this.f2233m = 3;
                this.f2235o.finish();
            } else {
                this.f2229i = true;
            }
        }
        if (this.f2222b.f2161d != null) {
            this.f2222b.f2161d.g_();
        }
        if (this.f2223c == null || this.f2223c.m4585r()) {
            C0501b.m3025a("The webview does not exit. Ignoring action.");
        } else {
            ar.m2242g();
            rg.m4460b(this.f2223c);
        }
        C0409y c0409y = this.f2234n;
    }

    public final void m2695i() {
        C0409y c0409y = this.f2234n;
        m2687b();
        if (this.f2222b.f2161d != null) {
            this.f2222b.f2161d.f_();
        }
        if (this.f2223c != null && (!this.f2235o.isFinishing() || this.f2224d == null)) {
            ar.m2242g();
            rg.m4459a(this.f2223c);
        }
        m2680p();
    }

    public final void m2696j() {
        m2680p();
    }

    public final void m2697k() {
        if (this.f2223c != null) {
            this.f2231k.removeView(this.f2223c.m4564b());
        }
        m2680p();
    }

    public final void m2698l() {
        this.f2236p = true;
    }

    public final void m2699m() {
        this.f2231k.removeView(this.f2225e);
        m2678a(true);
    }

    public final void m2700n() {
        if (this.f2232l) {
            this.f2232l = false;
            m2681q();
        }
    }

    public final void m2701o() {
        C0409y c0409y = this.f2234n;
    }
}
