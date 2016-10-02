package com.google.android.gms.p006b;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0403l;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.C0260a;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0347t;
import com.google.android.gms.ads.internal.overlay.C0428r;
import com.google.android.gms.ads.internal.overlay.ac;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@op
/* renamed from: com.google.android.gms.b.tg */
public class tg extends WebViewClient {
    private static final String[] f4130e;
    private static final String[] f4131f;
    protected tf f4132a;
    final Object f4133b;
    boolean f4134c;
    boolean f4135d;
    private final HashMap f4136g;
    private C0260a f4137h;
    private C0347t f4138i;
    private ti f4139j;
    private ev f4140k;
    private tj f4141l;
    private fs f4142m;
    private fu f4143n;
    private boolean f4144o;
    private ac f4145p;
    private final lu f4146q;
    private C0403l f4147r;
    private lm f4148s;
    private lw f4149t;
    private boolean f4150u;
    private boolean f4151v;
    private boolean f4152w;
    private int f4153x;

    static {
        f4130e = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
        f4131f = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    }

    public tg(tf tfVar, boolean z) {
        this(tfVar, z, new lu(tfVar, tfVar.m4574g(), new bx(tfVar.getContext())));
    }

    private tg(tf tfVar, boolean z, lu luVar) {
        this.f4136g = new HashMap();
        this.f4133b = new Object();
        this.f4134c = false;
        this.f4132a = tfVar;
        this.f4135d = z;
        this.f4146q = luVar;
        this.f4148s = null;
    }

    private void m4594a(Context context, String str, String str2, String str3) {
        if (((Boolean) ar.m2249n().m3580a(ck.ao)).booleanValue()) {
            String host;
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str4 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    host = parse.getHost();
                    bundle.putString(str4, host);
                    ar.m2240e();
                    rd.m4416a(context, this.f4132a.m4582o().f2539b, "gmob-apps", bundle, true);
                }
            }
            host = "";
            bundle.putString(str4, host);
            ar.m2240e();
            rd.m4416a(context, this.f4132a.m4582o().f2539b, "gmob-apps", bundle, true);
        }
    }

    private void m4595a(Uri uri) {
        String path = uri.getPath();
        List<fk> list = (List) this.f4136g.get(path);
        if (list != null) {
            ar.m2240e();
            Map a = rd.m4409a(uri);
            if (C0501b.m3027a(2)) {
                "Received GMSG: " + path;
                qk.m4383a();
                for (String path2 : a.keySet()) {
                    "  " + path2 + ": " + ((String) a.get(path2));
                    qk.m4383a();
                }
            }
            for (fk a2 : list) {
                a2.m2104a(this.f4132a, a);
            }
            return;
        }
        "No GMSG handler found for GMSG: " + uri;
        qk.m4383a();
    }

    private void m4596a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f4148s != null ? this.f4148s.m4188a() : false;
        ar.m2238c();
        Context context = this.f4132a.getContext();
        if (!a) {
            z = true;
        }
        C0428r.m2712a(context, adOverlayInfoParcel, z);
    }

    static /* synthetic */ void m4597a(tg tgVar) {
        synchronized (tgVar.f4133b) {
            tgVar.f4144o = true;
        }
        tgVar.f4153x++;
        tgVar.m4602g();
    }

    static /* synthetic */ void m4598b(tg tgVar) {
        tgVar.f4153x--;
        tgVar.m4602g();
    }

    static /* synthetic */ void m4599c(tg tgVar) {
        tgVar.f4152w = true;
        tgVar.m4602g();
    }

    private void m4602g() {
        if (this.f4139j != null && ((this.f4151v && this.f4153x <= 0) || this.f4152w)) {
            this.f4139j.m2101a(this.f4132a, !this.f4152w);
            this.f4139j = null;
        }
        this.f4132a.m4593z();
    }

    public final C0403l m4603a() {
        return this.f4147r;
    }

    public final void m4604a(int i, int i2) {
        if (this.f4148s != null) {
            this.f4148s.m4184a(i, i2);
        }
    }

    public final void m4605a(int i, int i2, boolean z) {
        this.f4146q.m4190a(i, i2);
        if (this.f4148s != null) {
            this.f4148s.m4185a(i, i2, z);
        }
    }

    public final void m4606a(C0260a c0260a, C0347t c0347t, ev evVar, ac acVar, boolean z, fs fsVar, fu fuVar, C0403l c0403l, lw lwVar) {
        if (c0403l == null) {
            c0403l = new C0403l((byte) 0);
        }
        this.f4148s = new lm(this.f4132a, lwVar);
        m4611a("/appEvent", new eu(evVar));
        m4611a("/backButton", ey.f3171k);
        m4611a("/canOpenURLs", ey.f3162b);
        m4611a("/canOpenIntents", ey.f3163c);
        m4611a("/click", ey.f3164d);
        m4611a("/close", ey.f3165e);
        m4611a("/customClose", ey.f3167g);
        m4611a("/instrument", ey.f3174n);
        m4611a("/delayPageLoaded", new tl());
        m4611a("/httpTrack", ey.f3168h);
        m4611a("/log", ey.f3169i);
        m4611a("/mraid", new fw(c0403l, this.f4148s));
        m4611a("/mraidLoaded", this.f4146q);
        m4611a("/open", new fx(fsVar, c0403l, this.f4148s));
        m4611a("/precache", ey.f3173m);
        m4611a("/touch", ey.f3170j);
        m4611a("/video", ey.f3172l);
        m4611a("/appStreaming", ey.f3166f);
        if (fuVar != null) {
            m4611a("/setInterstitialProperties", new ft(fuVar));
        }
        this.f4137h = c0260a;
        this.f4138i = c0347t;
        this.f4140k = evVar;
        this.f4142m = fsVar;
        this.f4145p = acVar;
        this.f4147r = c0403l;
        this.f4149t = lwVar;
        this.f4143n = fuVar;
        this.f4134c = z;
    }

    public final void m4607a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        C0347t c0347t = null;
        boolean p = this.f4132a.m4583p();
        C0260a c0260a = (!p || this.f4132a.m4578k().f1906e) ? this.f4137h : null;
        if (!p) {
            c0347t = this.f4138i;
        }
        m4596a(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, c0260a, c0347t, this.f4145p, this.f4132a.m4582o()));
    }

    public final void m4608a(tf tfVar) {
        this.f4132a = tfVar;
    }

    public final void m4609a(ti tiVar) {
        this.f4139j = tiVar;
    }

    public final void m4610a(tj tjVar) {
        this.f4141l = tjVar;
    }

    public final void m4611a(String str, fk fkVar) {
        synchronized (this.f4133b) {
            List list = (List) this.f4136g.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f4136g.put(str, list);
            }
            list.add(fkVar);
        }
    }

    public final void m4612a(boolean z, int i) {
        C0260a c0260a = (!this.f4132a.m4583p() || this.f4132a.m4578k().f1906e) ? this.f4137h : null;
        m4596a(new AdOverlayInfoParcel(c0260a, this.f4138i, this.f4145p, this.f4132a, z, i, this.f4132a.m4582o()));
    }

    public final void m4613a(boolean z, int i, String str) {
        C0347t c0347t = null;
        boolean p = this.f4132a.m4583p();
        C0260a c0260a = (!p || this.f4132a.m4578k().f1906e) ? this.f4137h : null;
        if (!p) {
            c0347t = new tk(this.f4132a, this.f4138i);
        }
        m4596a(new AdOverlayInfoParcel(c0260a, c0347t, this.f4140k, this.f4145p, this.f4132a, z, i, str, this.f4132a.m4582o(), this.f4142m));
    }

    public final void m4614a(boolean z, int i, String str, String str2) {
        boolean p = this.f4132a.m4583p();
        C0260a c0260a = (!p || this.f4132a.m4578k().f1906e) ? this.f4137h : null;
        m4596a(new AdOverlayInfoParcel(c0260a, p ? null : new tk(this.f4132a, this.f4138i), this.f4140k, this.f4145p, this.f4132a, z, i, str, str2, this.f4132a.m4582o(), this.f4142m));
    }

    public final void m4615b(String str, fk fkVar) {
        synchronized (this.f4133b) {
            List list = (List) this.f4136g.get(str);
            if (list == null) {
                return;
            }
            list.remove(fkVar);
        }
    }

    public final boolean m4616b() {
        boolean z;
        synchronized (this.f4133b) {
            z = this.f4135d;
        }
        return z;
    }

    public final boolean m4617c() {
        boolean z;
        synchronized (this.f4133b) {
            z = this.f4144o;
        }
        return z;
    }

    public final void m4618d() {
        synchronized (this.f4133b) {
            qk.m4383a();
            this.f4150u = true;
            this.f4132a.m4559a("about:blank");
        }
    }

    public final void m4619e() {
        synchronized (this.f4133b) {
            this.f4136g.clear();
            this.f4137h = null;
            this.f4138i = null;
            this.f4139j = null;
            this.f4140k = null;
            this.f4134c = false;
            this.f4135d = false;
            this.f4144o = false;
            this.f4142m = null;
            this.f4145p = null;
            this.f4141l = null;
            if (this.f4148s != null) {
                this.f4148s.m4187a(true);
                this.f4148s = null;
            }
        }
    }

    public final void m4620f() {
        this.f4134c = false;
    }

    public final void onLoadResource(WebView webView, String str) {
        "Loading resource: " + str;
        qk.m4383a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m4595a(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f4133b) {
            if (this.f4150u) {
                qk.m4383a();
                this.f4132a.m4586s();
                return;
            }
            this.f4151v = true;
            m4602g();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= f4130e.length) ? String.valueOf(i) : f4130e[(-i) - 1];
        m4594a(this.f4132a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= f4131f.length) ? String.valueOf(primaryError) : f4131f[primaryError];
            m4594a(this.f4132a.getContext(), "ssl_err", valueOf, ar.m2242g().m4465a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case NotificationCompat.FLAG_HIGH_PRIORITY /*128*/:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        "AdWebView shouldOverrideUrlLoading: " + str;
        qk.m4383a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m4595a(parse);
        } else {
            if (this.f4134c && webView == this.f4132a.m4553a()) {
                String scheme = parse.getScheme();
                Object obj = ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) ? 1 : null;
                if (obj != null) {
                    if (this.f4137h != null) {
                        if (((Boolean) ar.m2249n().m3580a(ck.f3058W)).booleanValue()) {
                            this.f4137h.m1751e();
                            this.f4137h = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f4132a.m4553a().willNotDraw()) {
                C0501b.m3025a("AdWebView unable to handle URL: " + str);
            } else {
                Uri uri;
                try {
                    aa n = this.f4132a.m4581n();
                    if (n != null && n.m3418a(parse)) {
                        parse = n.m3415a(parse, this.f4132a.getContext());
                    }
                    uri = parse;
                } catch (ab e) {
                    C0501b.m3025a("Unable to append parameter to URL: " + str);
                    uri = parse;
                }
                if (this.f4147r == null || this.f4147r.m2605a()) {
                    m4607a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
                } else {
                    this.f4147r.m2604a(str);
                }
            }
        }
        return true;
    }
}
