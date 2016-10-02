package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.overlay.C0421k;
import com.google.android.gms.ads.internal.util.client.C0501b;

@TargetApi(11)
@op
/* renamed from: com.google.android.gms.b.ts */
public class ts extends WebChromeClient {
    private final tf f4194a;

    public ts(tf tfVar) {
        this.f4194a = tfVar;
    }

    private static Context m4732a(WebView webView) {
        if (!(webView instanceof tf)) {
            return webView.getContext();
        }
        tf tfVar = (tf) webView;
        Context f = tfVar.m4573f();
        return f == null ? tfVar.getContext() : f;
    }

    private static boolean m4733a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            Builder builder = new Builder(context);
            builder.setTitle(str);
            if (z) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                View textView = new TextView(context);
                textView.setText(str2);
                View editText = new EditText(context);
                editText.setText(str3);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new ty(jsPromptResult, editText)).setNegativeButton(17039360, new tx(jsPromptResult)).setOnCancelListener(new tw(jsPromptResult)).create().show();
            } else {
                builder.setMessage(str2).setPositiveButton(17039370, new tv(jsResult)).setNegativeButton(17039360, new tu(jsResult)).setOnCancelListener(new tt(jsResult)).create().show();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Fail to display Dialog.", e);
        }
        return true;
    }

    protected final void m4734a(View view, int i, CustomViewCallback customViewCallback) {
        C0421k i2 = this.f4194a.m4576i();
        if (i2 == null) {
            C0501b.m3025a("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        i2.m2685a(view, customViewCallback);
        i2.m2683a(i);
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof tf) {
            C0421k i = ((tf) webView).m4576i();
            if (i == null) {
                C0501b.m3025a("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                i.m2682a();
                return;
            }
        }
        C0501b.m3025a("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (tz.f4202a[consoleMessage.messageLevel().ordinal()]) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                C0501b.m3027a(6);
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                C0501b.m3025a(str);
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                C0501b.m3027a(4);
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                C0501b.m3027a(3);
                break;
            default:
                C0501b.m3027a(4);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f4194a.m4579l());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072, j4) + j, 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            ar.m2240e();
            if (!rd.m4425a(this.f4194a.getContext().getPackageManager(), this.f4194a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                ar.m2240e();
                if (!rd.m4425a(this.f4194a.getContext().getPackageManager(), this.f4194a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C0421k i = this.f4194a.m4576i();
        if (i == null) {
            C0501b.m3025a("Could not get ad overlay when hiding custom view.");
        } else {
            i.m2687b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return ts.m4733a(ts.m4732a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return ts.m4733a(ts.m4732a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return ts.m4733a(ts.m4732a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return ts.m4733a(ts.m4732a(webView), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        m4734a(view, -1, customViewCallback);
    }
}
