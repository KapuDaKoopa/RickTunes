package com.google.android.gms.p006b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.overlay.C0431x;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ax;
import java.util.Map;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.tn */
final class tn extends FrameLayout implements tf {
    private final tf f4158a;
    private final te f4159b;

    public tn(tf tfVar) {
        super(tfVar.getContext());
        this.f4158a = tfVar;
        this.f4159b = new te(tfVar.m4574g(), this, this);
        tg l = this.f4158a.m4579l();
        if (l != null) {
            l.m4608a((tf) this);
        }
        addView(this.f4158a.m4564b());
    }

    public final OnClickListener m4624A() {
        return this.f4158a.m4552A();
    }

    public final WebView m4625a() {
        return this.f4158a.m4553a();
    }

    public final void m4626a(int i) {
        this.f4158a.m4554a(i);
    }

    public final void m4627a(Context context) {
        this.f4158a.m4555a(context);
    }

    public final void m4628a(Context context, AdSizeParcel adSizeParcel, cz czVar) {
        this.f4158a.m4556a(context, adSizeParcel, czVar);
    }

    public final void m4629a(AdSizeParcel adSizeParcel) {
        this.f4158a.m4557a(adSizeParcel);
    }

    public final void m4630a(C0421k c0421k) {
        this.f4158a.m4558a(c0421k);
    }

    public final void m4631a(ai aiVar, boolean z) {
        this.f4158a.m3474a(aiVar, z);
    }

    public final void m4632a(String str) {
        this.f4158a.m4559a(str);
    }

    public final void m4633a(String str, fk fkVar) {
        this.f4158a.m3841a(str, fkVar);
    }

    public final void m4634a(String str, String str2) {
        this.f4158a.m4560a(str, str2);
    }

    public final void m4635a(String str, Map map) {
        this.f4158a.m4561a(str, map);
    }

    public final void m4636a(String str, JSONObject jSONObject) {
        this.f4158a.m4562a(str, jSONObject);
    }

    public final void m4637a(boolean z) {
        this.f4158a.m4563a(z);
    }

    public final View m4638b() {
        return this;
    }

    public final void m4639b(int i) {
        this.f4158a.m4565b(i);
    }

    public final void m4640b(C0421k c0421k) {
        this.f4158a.m4566b(c0421k);
    }

    public final void m4641b(String str) {
        this.f4158a.m4567b(str);
    }

    public final void m4642b(String str, fk fkVar) {
        this.f4158a.m3844b(str, fkVar);
    }

    public final void m4643b(String str, JSONObject jSONObject) {
        this.f4158a.m3845b(str, jSONObject);
    }

    public final void m4644b(boolean z) {
        this.f4158a.m4568b(z);
    }

    public final void m4645c() {
        this.f4158a.m4569c();
    }

    public final void m4646c(boolean z) {
        this.f4158a.m4570c(z);
    }

    public final void clearCache(boolean z) {
        this.f4158a.clearCache(z);
    }

    public final void m4647d() {
        this.f4158a.m4571d();
    }

    public final void destroy() {
        this.f4158a.destroy();
    }

    public final void m4648e() {
        this.f4158a.m4572e();
    }

    public final Activity m4649f() {
        return this.f4158a.m4573f();
    }

    public final Context m4650g() {
        return this.f4158a.m4574g();
    }

    public final C0402k m4651h() {
        return this.f4158a.m4575h();
    }

    public final C0421k m4652i() {
        return this.f4158a.m4576i();
    }

    public final C0421k m4653j() {
        return this.f4158a.m4577j();
    }

    public final AdSizeParcel m4654k() {
        return this.f4158a.m4578k();
    }

    public final tg m4655l() {
        return this.f4158a.m4579l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f4158a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f4158a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f4158a.loadUrl(str);
    }

    public final boolean m4656m() {
        return this.f4158a.m4580m();
    }

    public final aa m4657n() {
        return this.f4158a.m4581n();
    }

    public final VersionInfoParcel m4658o() {
        return this.f4158a.m4582o();
    }

    public final void onPause() {
        te teVar = this.f4159b;
        ax.m5534b("onPause must be called from the UI thread.");
        if (teVar.f4129d != null) {
            teVar.f4129d.m2736g();
        }
        this.f4158a.onPause();
    }

    public final void onResume() {
        this.f4158a.onResume();
    }

    public final boolean m4659p() {
        return this.f4158a.m4583p();
    }

    public final int m4660q() {
        return this.f4158a.m4584q();
    }

    public final boolean m4661r() {
        return this.f4158a.m4585r();
    }

    public final void m4662s() {
        te teVar = this.f4159b;
        ax.m5534b("onDestroy must be called from the UI thread.");
        if (teVar.f4129d != null) {
            C0431x c0431x = teVar.f4129d;
            c0431x.f2251a.m2633a();
            if (c0431x.f2252b != null) {
                c0431x.f2252b.m2640b();
            }
            c0431x.m2742m();
        }
        this.f4158a.m4586s();
    }

    public final void setBackgroundColor(int i) {
        this.f4158a.setBackgroundColor(i);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f4158a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f4158a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f4158a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f4158a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f4158a.stopLoading();
    }

    public final boolean m4663t() {
        return this.f4158a.m4587t();
    }

    public final String m4664u() {
        return this.f4158a.m4588u();
    }

    public final te m4665v() {
        return this.f4159b;
    }

    public final cv m4666w() {
        return this.f4158a.m4590w();
    }

    public final cy m4667x() {
        return this.f4158a.m4591x();
    }

    public final void m4668y() {
        this.f4158a.m4592y();
    }

    public final void m4669z() {
        this.f4158a.m4593z();
    }
}
