package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.widget.GridLayout;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.to */
final class to extends WebView implements OnGlobalLayoutListener, DownloadListener, tf {
    private int f4160A;
    private Map f4161B;
    private final WindowManager f4162C;
    private final tq f4163a;
    private final Object f4164b;
    private final aa f4165c;
    private final VersionInfoParcel f4166d;
    private final C0402k f4167e;
    private tg f4168f;
    private C0421k f4169g;
    private AdSizeParcel f4170h;
    private boolean f4171i;
    private boolean f4172j;
    private boolean f4173k;
    private boolean f4174l;
    private Boolean f4175m;
    private int f4176n;
    private boolean f4177o;
    private String f4178p;
    private cv f4179q;
    private cv f4180r;
    private cv f4181s;
    private cy f4182t;
    private WeakReference f4183u;
    private C0421k f4184v;
    private sl f4185w;
    private int f4186x;
    private int f4187y;
    private int f4188z;

    private to(tq tqVar, AdSizeParcel adSizeParcel, boolean z, aa aaVar, VersionInfoParcel versionInfoParcel, cz czVar, C0402k c0402k) {
        super(tqVar);
        this.f4164b = new Object();
        this.f4177o = true;
        this.f4178p = "";
        this.f4186x = -1;
        this.f4187y = -1;
        this.f4188z = -1;
        this.f4160A = -1;
        this.f4163a = tqVar;
        this.f4170h = adSizeParcel;
        this.f4173k = z;
        this.f4176n = -1;
        this.f4165c = aaVar;
        this.f4166d = versionInfoParcel;
        this.f4167e = c0402k;
        this.f4162C = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        ar.m2240e().m4455a((Context) tqVar, versionInfoParcel.f2539b, settings);
        ar.m2242g().m4471a(getContext(), settings);
        setDownloadListener(this);
        m4673E();
        if (xn.m4900a(17)) {
            addJavascriptInterface(new tr(this), "googleAdsJsInterface");
        }
        this.f4185w = new sl(this.f4163a.m4730a(), this, null);
        m4679a(czVar);
    }

    private boolean m4670B() {
        if (!this.f4168f.m4616b()) {
            return false;
        }
        int i;
        int i2;
        ar.m2240e();
        DisplayMetrics a = rd.m4400a(this.f4162C);
        C0374z.m2455a();
        int b = C0500a.m3019b(a, a.widthPixels);
        C0374z.m2455a();
        int b2 = C0500a.m3019b(a, a.heightPixels);
        Activity a2 = this.f4163a.m4730a();
        if (a2 == null || a2.getWindow() == null) {
            i = b2;
            i2 = b;
        } else {
            ar.m2240e();
            int[] a3 = rd.m4430a(a2);
            C0374z.m2455a();
            i2 = C0500a.m3019b(a, a3[0]);
            C0374z.m2455a();
            i = C0500a.m3019b(a, a3[1]);
        }
        if (this.f4187y == b && this.f4186x == b2 && this.f4188z == i2 && this.f4160A == i) {
            return false;
        }
        boolean z = (this.f4187y == b && this.f4186x == b2) ? false : true;
        this.f4187y = b;
        this.f4186x = b2;
        this.f4188z = i2;
        this.f4160A = i;
        new lv(this).m4177a(b, b2, i2, i, a.density, this.f4162C.getDefaultDisplay().getRotation());
        return z;
    }

    private Boolean m4671C() {
        Boolean bool;
        synchronized (this.f4164b) {
            bool = this.f4175m;
        }
        return bool;
    }

    private void m4672D() {
        cq.m3589a(this.f4182t.f3119b, this.f4179q, "aeh");
    }

    private void m4673E() {
        synchronized (this.f4164b) {
            if (this.f4173k || this.f4170h.f1906e) {
                if (VERSION.SDK_INT < 14) {
                    C0501b.m3027a(3);
                    m4674F();
                } else {
                    C0501b.m3027a(3);
                    m4675G();
                }
            } else if (VERSION.SDK_INT < 18) {
                C0501b.m3027a(3);
                m4674F();
            } else {
                C0501b.m3027a(3);
                m4675G();
            }
        }
    }

    private void m4674F() {
        synchronized (this.f4164b) {
            if (!this.f4174l) {
                ar.m2242g().m4478c((View) this);
            }
            this.f4174l = true;
        }
    }

    private void m4675G() {
        synchronized (this.f4164b) {
            if (this.f4174l) {
                ar.m2242g().m4475b((View) this);
            }
            this.f4174l = false;
        }
    }

    private void m4676H() {
        synchronized (this.f4164b) {
            if (this.f4161B != null) {
                Iterator it = this.f4161B.values().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void m4677I() {
        if (this.f4182t != null) {
            cz czVar = this.f4182t.f3119b;
            if (czVar != null && ar.m2243h().m4370c() != null) {
                ar.m2243h().m4370c().m3587a(czVar);
            }
        }
    }

    static to m4678a(Context context, AdSizeParcel adSizeParcel, boolean z, aa aaVar, VersionInfoParcel versionInfoParcel, cz czVar, C0402k c0402k) {
        return new to(new tq(context), adSizeParcel, z, aaVar, versionInfoParcel, czVar, c0402k);
    }

    private void m4679a(cz czVar) {
        m4677I();
        this.f4182t = new cy(new cz(true, "make_wv", this.f4170h.f1903b));
        cz czVar2 = this.f4182t.f3119b;
        synchronized (czVar2.f3121b) {
            czVar2.f3123d = czVar;
        }
        this.f4180r = cq.m3588a(this.f4182t.f3119b);
        this.f4182t.m3598a("native:view_create", this.f4180r);
        this.f4181s = null;
        this.f4179q = null;
    }

    private void m4681a(Boolean bool) {
        this.f4175m = bool;
        qd h = ar.m2243h();
        synchronized (h.f3974a) {
            h.f3979f = bool;
        }
    }

    private void m4682c(String str) {
        synchronized (this.f4164b) {
            if (m4721r()) {
                C0501b.m3025a("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    private void m4683d(String str) {
        if (xn.m4900a(19)) {
            if (m4671C() == null) {
                synchronized (this.f4164b) {
                    this.f4175m = ar.m2243h().m4375h();
                    if (this.f4175m == null) {
                        try {
                            evaluateJavascript("(function(){})()", null);
                            m4681a(Boolean.valueOf(true));
                        } catch (IllegalStateException e) {
                            m4681a(Boolean.valueOf(false));
                        }
                    }
                }
            }
            if (m4671C().booleanValue()) {
                synchronized (this.f4164b) {
                    if (m4721r()) {
                        C0501b.m3025a("The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            m4682c("javascript:" + str);
            return;
        }
        m4682c("javascript:" + str);
    }

    public final OnClickListener m4684A() {
        return (OnClickListener) this.f4183u.get();
    }

    public final WebView m4685a() {
        return this;
    }

    public final void m4686a(int i) {
        m4672D();
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f4166d.f2539b);
        m4695a("onhide", hashMap);
    }

    public final void m4687a(Context context) {
        this.f4163a.setBaseContext(context);
        this.f4185w.f4101a = this.f4163a.m4730a();
    }

    public final void m4688a(Context context, AdSizeParcel adSizeParcel, cz czVar) {
        synchronized (this.f4164b) {
            this.f4185w.m4531b();
            m4687a(context);
            this.f4169g = null;
            this.f4170h = adSizeParcel;
            this.f4173k = false;
            this.f4171i = false;
            this.f4178p = "";
            this.f4176n = -1;
            ar.m2242g();
            rg.m4460b((tf) this);
            loadUrl("about:blank");
            this.f4168f.m4619e();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.f4177o = true;
            m4679a(czVar);
        }
    }

    public final void m4689a(AdSizeParcel adSizeParcel) {
        synchronized (this.f4164b) {
            this.f4170h = adSizeParcel;
            requestLayout();
        }
    }

    public final void m4690a(C0421k c0421k) {
        synchronized (this.f4164b) {
            this.f4169g = c0421k;
        }
    }

    public final void m4691a(ai aiVar, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        m4695a("onAdVisibilityChanged", hashMap);
    }

    public final void m4692a(String str) {
        synchronized (this.f4164b) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                C0501b.m3025a("Could not call loadUrl. " + th);
            }
        }
    }

    public final void m4693a(String str, fk fkVar) {
        if (this.f4168f != null) {
            this.f4168f.m4611a(str, fkVar);
        }
    }

    public final void m4694a(String str, String str2) {
        m4683d(str + "(" + str2 + ");");
    }

    public final void m4695a(String str, Map map) {
        try {
            m4703b(str, ar.m2240e().m4454a(map));
        } catch (JSONException e) {
            C0501b.m3025a("Could not convert parameters to JSON.");
        }
    }

    public final void m4696a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m4694a(str, jSONObject.toString());
    }

    public final void m4697a(boolean z) {
        synchronized (this.f4164b) {
            this.f4173k = z;
            m4673E();
        }
    }

    public final View m4698b() {
        return this;
    }

    public final void m4699b(int i) {
        synchronized (this.f4164b) {
            this.f4176n = i;
            if (this.f4169g != null) {
                this.f4169g.m2683a(this.f4176n);
            }
        }
    }

    public final void m4700b(C0421k c0421k) {
        synchronized (this.f4164b) {
            this.f4184v = c0421k;
        }
    }

    public final void m4701b(String str) {
        synchronized (this.f4164b) {
            if (str == null) {
                str = "";
            }
            this.f4178p = str;
        }
    }

    public final void m4702b(String str, fk fkVar) {
        if (this.f4168f != null) {
            this.f4168f.m4615b(str, fkVar);
        }
    }

    public final void m4703b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        "Dispatching AFMA event: " + stringBuilder.toString();
        qk.m4383a();
        m4683d(stringBuilder.toString());
    }

    public final void m4704b(boolean z) {
        synchronized (this.f4164b) {
            if (this.f4169g != null) {
                this.f4169g.m2686a(this.f4168f.m4616b(), z);
            } else {
                this.f4171i = z;
            }
        }
    }

    public final void m4705c() {
        m4672D();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f4166d.f2539b);
        m4695a("onhide", hashMap);
    }

    public final void m4706c(boolean z) {
        synchronized (this.f4164b) {
            this.f4177o = z;
        }
    }

    public final void m4707d() {
        if (this.f4179q == null) {
            cq.m3589a(this.f4182t.f3119b, this.f4181s, "aes");
            this.f4179q = cq.m3588a(this.f4182t.f3119b);
            this.f4182t.m3598a("native:view_show", this.f4179q);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f4166d.f2539b);
        m4695a("onshow", hashMap);
    }

    public final void destroy() {
        synchronized (this.f4164b) {
            m4677I();
            this.f4185w.m4531b();
            if (this.f4169g != null) {
                this.f4169g.m2682a();
                this.f4169g.m2697k();
                this.f4169g = null;
            }
            this.f4168f.m4619e();
            if (this.f4172j) {
                return;
            }
            ar.m2255t();
            gf.m3746a((tf) this);
            m4676H();
            this.f4172j = true;
            qk.m4383a();
            this.f4168f.m4618d();
        }
    }

    public final void m4708e() {
        Map hashMap = new HashMap(2);
        ar.m2240e();
        hashMap.put("app_volume", String.valueOf(rd.m4443d()));
        ar.m2240e();
        hashMap.put("device_volume", String.valueOf(rd.m4450h(getContext())));
        m4695a("volume", hashMap);
    }

    @TargetApi(19)
    public final void evaluateJavascript(String str, ValueCallback valueCallback) {
        synchronized (this.f4164b) {
            if (m4721r()) {
                C0501b.m3025a("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                return;
            }
            super.evaluateJavascript(str, valueCallback);
        }
    }

    public final Activity m4709f() {
        return this.f4163a.m4730a();
    }

    protected final void finalize() {
        synchronized (this.f4164b) {
            if (!this.f4172j) {
                ar.m2255t();
                gf.m3746a((tf) this);
                m4676H();
            }
        }
        super.finalize();
    }

    public final Context m4710g() {
        return this.f4163a.m4731b();
    }

    public final C0402k m4711h() {
        return this.f4167e;
    }

    public final C0421k m4712i() {
        C0421k c0421k;
        synchronized (this.f4164b) {
            c0421k = this.f4169g;
        }
        return c0421k;
    }

    public final C0421k m4713j() {
        C0421k c0421k;
        synchronized (this.f4164b) {
            c0421k = this.f4184v;
        }
        return c0421k;
    }

    public final AdSizeParcel m4714k() {
        AdSizeParcel adSizeParcel;
        synchronized (this.f4164b) {
            adSizeParcel = this.f4170h;
        }
        return adSizeParcel;
    }

    public final tg m4715l() {
        return this.f4168f;
    }

    public final void loadData(String str, String str2, String str3) {
        synchronized (this.f4164b) {
            if (m4721r()) {
                C0501b.m3025a("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f4164b) {
            if (m4721r()) {
                C0501b.m3025a("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public final void loadUrl(String str) {
        synchronized (this.f4164b) {
            if (m4721r()) {
                C0501b.m3025a("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    C0501b.m3025a("Could not call loadUrl. " + th);
                }
            }
        }
    }

    public final boolean m4716m() {
        return this.f4171i;
    }

    public final aa m4717n() {
        return this.f4165c;
    }

    public final VersionInfoParcel m4718o() {
        return this.f4166d;
    }

    protected final void onAttachedToWindow() {
        synchronized (this.f4164b) {
            super.onAttachedToWindow();
            if (!m4721r()) {
                this.f4185w.m4532c();
            }
        }
    }

    protected final void onDetachedFromWindow() {
        synchronized (this.f4164b) {
            if (!m4721r()) {
                this.f4185w.m4533d();
            }
            super.onDetachedFromWindow();
        }
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            ar.m2240e();
            rd.m4414a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            "Couldn't find an Activity to view url/mimetype: " + str + " / " + str4;
            C0501b.m3027a(3);
        }
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (!m4721r()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final void onGlobalLayout() {
        boolean B = m4670B();
        C0421k i = m4712i();
        if (i != null && B) {
            i.m2700n();
        }
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        synchronized (this.f4164b) {
            if (m4721r()) {
                setMeasuredDimension(0, 0);
            } else if (isInEditMode() || this.f4173k || this.f4170h.f1910i || this.f4170h.f1911j) {
                super.onMeasure(i, i2);
            } else if (this.f4170h.f1906e) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f4162C.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                int mode = MeasureSpec.getMode(i);
                int size = MeasureSpec.getSize(i);
                int mode2 = MeasureSpec.getMode(i2);
                int size2 = MeasureSpec.getSize(i2);
                mode = (mode == GridLayout.UNDEFINED || mode == 1073741824) ? size : Integer.MAX_VALUE;
                if (mode2 == GridLayout.UNDEFINED || mode2 == 1073741824) {
                    i3 = size2;
                }
                if (this.f4170h.f1908g > mode || this.f4170h.f1905d > r0) {
                    float f = this.f4163a.getResources().getDisplayMetrics().density;
                    C0501b.m3025a("Not enough space to show ad. Needs " + ((int) (((float) this.f4170h.f1908g) / f)) + "x" + ((int) (((float) this.f4170h.f1905d) / f)) + " dp, but only has " + ((int) (((float) size) / f)) + "x" + ((int) (((float) size2) / f)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                } else {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    setMeasuredDimension(this.f4170h.f1908g, this.f4170h.f1905d);
                }
            }
        }
    }

    public final void onPause() {
        if (!m4721r()) {
            try {
                if (xn.m4900a(11)) {
                    super.onPause();
                }
            } catch (Exception e) {
                C0501b.m3027a(6);
            }
        }
    }

    public final void onResume() {
        if (!m4721r()) {
            try {
                if (xn.m4900a(11)) {
                    super.onResume();
                }
            } catch (Exception e) {
                C0501b.m3027a(6);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4165c != null) {
            this.f4165c.m3417a(motionEvent);
        }
        return m4721r() ? false : super.onTouchEvent(motionEvent);
    }

    public final boolean m4719p() {
        boolean z;
        synchronized (this.f4164b) {
            z = this.f4173k;
        }
        return z;
    }

    public final int m4720q() {
        int i;
        synchronized (this.f4164b) {
            i = this.f4176n;
        }
        return i;
    }

    public final boolean m4721r() {
        boolean z;
        synchronized (this.f4164b) {
            z = this.f4172j;
        }
        return z;
    }

    public final void m4722s() {
        synchronized (this.f4164b) {
            qk.m4383a();
            rd.f4041a.post(new tp(this));
        }
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f4183u = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof tg) {
            this.f4168f = (tg) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!m4721r()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C0501b.m3027a(6);
            }
        }
    }

    public final boolean m4723t() {
        boolean z;
        synchronized (this.f4164b) {
            cq.m3589a(this.f4182t.f3119b, this.f4179q, "aebb");
            z = this.f4177o;
        }
        return z;
    }

    public final String m4724u() {
        String str;
        synchronized (this.f4164b) {
            str = this.f4178p;
        }
        return str;
    }

    public final te m4725v() {
        return null;
    }

    public final cv m4726w() {
        return this.f4181s;
    }

    public final cy m4727x() {
        return this.f4182t;
    }

    public final void m4728y() {
        this.f4185w.m4530a();
    }

    public final void m4729z() {
        if (this.f4181s == null) {
            this.f4181s = cq.m3588a(this.f4182t.f3119b);
            this.f4182t.m3598a("native:view_load", this.f4181s);
        }
    }
}
