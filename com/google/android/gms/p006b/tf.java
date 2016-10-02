package com.google.android.gms.p006b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0402k;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.tf */
public interface tf extends ar, ji {
    OnClickListener m4552A();

    WebView m4553a();

    void m4554a(int i);

    void m4555a(Context context);

    void m4556a(Context context, AdSizeParcel adSizeParcel, cz czVar);

    void m4557a(AdSizeParcel adSizeParcel);

    void m4558a(C0421k c0421k);

    void m4559a(String str);

    void m4560a(String str, String str2);

    void m4561a(String str, Map map);

    void m4562a(String str, JSONObject jSONObject);

    void m4563a(boolean z);

    View m4564b();

    void m4565b(int i);

    void m4566b(C0421k c0421k);

    void m4567b(String str);

    void m4568b(boolean z);

    void m4569c();

    void m4570c(boolean z);

    void clearCache(boolean z);

    void m4571d();

    void destroy();

    void m4572e();

    Activity m4573f();

    Context m4574g();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    C0402k m4575h();

    C0421k m4576i();

    C0421k m4577j();

    AdSizeParcel m4578k();

    tg m4579l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    boolean m4580m();

    void measure(int i, int i2);

    aa m4581n();

    VersionInfoParcel m4582o();

    void onPause();

    void onResume();

    boolean m4583p();

    int m4584q();

    boolean m4585r();

    void m4586s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    boolean m4587t();

    String m4588u();

    te m4589v();

    cv m4590w();

    cy m4591x();

    void m4592y();

    void m4593z();
}
