package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@op
/* renamed from: com.google.android.gms.b.bj */
public final class bj extends Thread {
    private boolean f2972a;
    private boolean f2973b;
    private boolean f2974c;
    private final Object f2975d;
    private final bi f2976e;
    private final bh f2977f;
    private final oo f2978g;
    private final int f2979h;
    private final int f2980i;
    private final int f2981j;
    private final int f2982k;
    private final int f2983l;

    public bj(bi biVar, bh bhVar, oo ooVar) {
        this.f2972a = false;
        this.f2973b = false;
        this.f2974c = false;
        this.f2976e = biVar;
        this.f2977f = bhVar;
        this.f2978g = ooVar;
        this.f2975d = new Object();
        this.f2980i = ((Integer) ar.m2249n().m3580a(ck.f3046K)).intValue();
        this.f2981j = ((Integer) ar.m2249n().m3580a(ck.f3047L)).intValue();
        this.f2982k = ((Integer) ar.m2249n().m3580a(ck.f3048M)).intValue();
        this.f2983l = ((Integer) ar.m2249n().m3580a(ck.f3049N)).intValue();
        this.f2979h = ((Integer) ar.m2249n().m3580a(ck.f3050O)).intValue();
        setName("ContentFetchTask");
    }

    private bn m3514a(View view, bg bgVar) {
        int i = 0;
        if (view == null) {
            return new bn(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new bn(this, 0, 0);
            }
            bgVar.m3506b(text.toString(), globalVisibleRect);
            return new bn(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof tf)) {
            bgVar.m3505b();
            WebView webView = (WebView) view;
            if (xn.m4900a(19)) {
                bgVar.m3505b();
                webView.post(new bl(this, bgVar, webView, globalVisibleRect));
                r1 = 1;
            } else {
                r1 = 0;
            }
            return r1 != 0 ? new bn(this, 0, 1) : new bn(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new bn(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            r1 = 0;
            int i2 = 0;
            while (i < viewGroup.getChildCount()) {
                bn a = m3514a(viewGroup.getChildAt(i), bgVar);
                i2 += a.f2992a;
                r1 += a.f2993b;
                i++;
            }
            return new bn(this, i2, r1);
        }
    }

    private boolean m3515e() {
        try {
            Context b = this.f2976e.m3513b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (!((runningAppProcessInfo.importance == 100 ? 1 : null) == null || keyguardManager.inKeyguardRestrictedInputMode())) {
                        PowerManager powerManager = (PowerManager) b.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public final void m3516a() {
        synchronized (this.f2975d) {
            if (this.f2972a) {
                C0501b.m3027a(3);
                return;
            }
            this.f2972a = true;
            start();
        }
    }

    final void m3517a(View view) {
        try {
            bg bgVar = new bg(this.f2980i, this.f2981j, this.f2982k, this.f2983l);
            bn a = m3514a(view, bgVar);
            bgVar.m3507c();
            if (a.f2992a != 0 || a.f2993b != 0) {
                if (a.f2993b != 0 || bgVar.f2954b != 0) {
                    if (a.f2993b != 0 || !this.f2977f.m3509a(bgVar)) {
                        bh bhVar = this.f2977f;
                        synchronized (bhVar.f2966a) {
                            if (bhVar.f2968c.size() >= 10) {
                                "Queue is full, current size = " + bhVar.f2968c.size();
                                C0501b.m3027a(3);
                                bhVar.f2968c.remove(0);
                            }
                            int i = bhVar.f2967b;
                            bhVar.f2967b = i + 1;
                            bgVar.f2955c = i;
                            bhVar.f2968c.add(bgVar);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            C0501b.m3027a(6);
            this.f2978g.m4312a(e, true);
        }
    }

    final void m3518a(bg bgVar, WebView webView, String str, boolean z) {
        synchronized (bgVar.f2953a) {
            bgVar.f2956d--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    bgVar.m3503a(optString, z);
                } else {
                    bgVar.m3503a(webView.getTitle() + "\n" + optString, z);
                }
            }
            if (bgVar.m3504a()) {
                this.f2977f.m3510b(bgVar);
            }
        } catch (JSONException e) {
            C0501b.m3027a(3);
        } catch (Throwable th) {
            C0501b.m3027a(3);
            this.f2978g.m4312a(th, true);
        }
    }

    public final bg m3519b() {
        return this.f2977f.m3508a();
    }

    public final void m3520c() {
        synchronized (this.f2975d) {
            this.f2973b = false;
            this.f2975d.notifyAll();
            C0501b.m3027a(3);
        }
    }

    public final boolean m3521d() {
        return this.f2973b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r4 = this;
        r3 = 1;
    L_0x0001:
        r0 = r4.f2974c;
        if (r0 != 0) goto L_0x0095;
    L_0x0005:
        r0 = r4.m3515e();	 Catch:{ Throwable -> 0x0018 }
        if (r0 == 0) goto L_0x006c;
    L_0x000b:
        r0 = r4.f2976e;	 Catch:{ Throwable -> 0x0018 }
        r1 = r0.m3512a();	 Catch:{ Throwable -> 0x0018 }
        if (r1 != 0) goto L_0x0035;
    L_0x0013:
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0001;
    L_0x0018:
        r0 = move-exception;
        r1 = 6;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r1);
        r1 = r4.f2978g;
        r1.m4312a(r0, r3);
    L_0x0022:
        r1 = r4.f2975d;
        monitor-enter(r1);
    L_0x0025:
        r0 = r4.f2973b;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x008f;
    L_0x0029:
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ InterruptedException -> 0x0033 }
        r0 = r4.f2975d;	 Catch:{ InterruptedException -> 0x0033 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0033 }
        goto L_0x0025;
    L_0x0033:
        r0 = move-exception;
        goto L_0x0025;
    L_0x0035:
        if (r1 == 0) goto L_0x0063;
    L_0x0037:
        r0 = 0;
        r2 = r1.getWindow();	 Catch:{ Throwable -> 0x0018 }
        if (r2 == 0) goto L_0x0057;
    L_0x003e:
        r2 = r1.getWindow();	 Catch:{ Throwable -> 0x0018 }
        r2 = r2.getDecorView();	 Catch:{ Throwable -> 0x0018 }
        if (r2 == 0) goto L_0x0057;
    L_0x0048:
        r0 = r1.getWindow();	 Catch:{ Throwable -> 0x0018 }
        r0 = r0.getDecorView();	 Catch:{ Throwable -> 0x0018 }
        r1 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r0 = r0.findViewById(r1);	 Catch:{ Throwable -> 0x0018 }
    L_0x0057:
        if (r0 == 0) goto L_0x0063;
    L_0x0059:
        if (r0 == 0) goto L_0x0063;
    L_0x005b:
        r1 = new com.google.android.gms.b.bk;	 Catch:{ Throwable -> 0x0018 }
        r1.<init>(r4, r0);	 Catch:{ Throwable -> 0x0018 }
        r0.post(r1);	 Catch:{ Throwable -> 0x0018 }
    L_0x0063:
        r0 = r4.f2979h;	 Catch:{ Throwable -> 0x0018 }
        r0 = r0 * 1000;
        r0 = (long) r0;	 Catch:{ Throwable -> 0x0018 }
        java.lang.Thread.sleep(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0022;
    L_0x006c:
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ Throwable -> 0x0018 }
        r1 = r4.f2975d;	 Catch:{ Throwable -> 0x0018 }
        monitor-enter(r1);	 Catch:{ Throwable -> 0x0018 }
        r0 = 1;
        r4.f2973b = r0;	 Catch:{ all -> 0x008c }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008c }
        r2 = "ContentFetchThread: paused, mPause = ";
        r0.<init>(r2);	 Catch:{ all -> 0x008c }
        r2 = r4.f2973b;	 Catch:{ all -> 0x008c }
        r0 = r0.append(r2);	 Catch:{ all -> 0x008c }
        r0.toString();	 Catch:{ all -> 0x008c }
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ all -> 0x008c }
        monitor-exit(r1);	 Catch:{ all -> 0x008c }
        goto L_0x0063;
    L_0x008c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ Throwable -> 0x0018 }
        throw r0;	 Catch:{ Throwable -> 0x0018 }
    L_0x008f:
        monitor-exit(r1);	 Catch:{ all -> 0x0092 }
        goto L_0x0001;
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0095:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.bj.run():void");
    }
}
