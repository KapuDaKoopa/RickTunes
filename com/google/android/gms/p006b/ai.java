package com.google.android.gms.p006b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.ai */
public abstract class ai implements OnGlobalLayoutListener, OnScrollChangedListener {
    protected final Object f2890a;
    protected final as f2891b;
    BroadcastReceiver f2892c;
    private final WeakReference f2893d;
    private WeakReference f2894e;
    private final bf f2895f;
    private final Context f2896g;
    private final WindowManager f2897h;
    private final PowerManager f2898i;
    private final KeyguardManager f2899j;
    private au f2900k;
    private boolean f2901l;
    private boolean f2902m;
    private boolean f2903n;
    private boolean f2904o;
    private boolean f2905p;
    private boolean f2906q;
    private final HashSet f2907r;
    private sh f2908s;
    private final fk f2909t;
    private final fk f2910u;
    private final fk f2911v;

    public ai(Context context, AdSizeParcel adSizeParcel, pz pzVar, VersionInfoParcel versionInfoParcel, bf bfVar) {
        this.f2890a = new Object();
        this.f2902m = false;
        this.f2903n = false;
        this.f2907r = new HashSet();
        this.f2909t = new ak(this);
        this.f2910u = new al(this);
        this.f2911v = new am(this);
        this.f2893d = new WeakReference(pzVar);
        this.f2895f = bfVar;
        this.f2894e = new WeakReference(null);
        this.f2904o = true;
        this.f2906q = false;
        this.f2908s = new sh(200);
        this.f2891b = new as(UUID.randomUUID().toString(), versionInfoParcel, adSizeParcel.f1903b, pzVar.f3934j, pzVar.m4353a(), adSizeParcel.f1910i);
        this.f2897h = (WindowManager) context.getSystemService("window");
        this.f2898i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f2899j = (KeyguardManager) context.getSystemService("keyguard");
        this.f2896g = context;
    }

    private static int m3433a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    private void m3434j() {
        if (this.f2900k != null) {
            this.f2900k.m3475a(this);
        }
    }

    private void m3435k() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f2894e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private JSONObject m3436l() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f2891b.f2925d).put("activeViewJSON", this.f2891b.f2923b).put("timestamp", ar.m2244i().m4888b()).put("adFormat", this.f2891b.f2922a).put("hashCode", this.f2891b.f2924c).put("isMraid", this.f2891b.f2926e).put("isStopped", this.f2903n).put("isPaused", this.f2902m).put("isScreenOn", this.f2898i.isScreenOn()).put("isNative", this.f2891b.f2927f);
        return jSONObject;
    }

    protected final JSONObject m3437a(View view) {
        if (view == null) {
            return m3436l().put("isAttachedToWindow", false).put("isScreenOn", this.f2898i.isScreenOn()).put("isVisible", false);
        }
        boolean a = ar.m2242g().m4472a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C0501b.m3027a(6);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f2897h.getDefaultDisplay().getWidth();
        rect2.bottom = this.f2897h.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject l = m3436l();
        ar.m2240e();
        l.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", ai.m3433a(rect2.top, displayMetrics)).put("bottom", ai.m3433a(rect2.bottom, displayMetrics)).put("left", ai.m3433a(rect2.left, displayMetrics)).put("right", ai.m3433a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", ai.m3433a(rect.top, displayMetrics)).put("bottom", ai.m3433a(rect.bottom, displayMetrics)).put("left", ai.m3433a(rect.left, displayMetrics)).put("right", ai.m3433a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", ai.m3433a(rect3.top, displayMetrics)).put("bottom", ai.m3433a(rect3.bottom, displayMetrics)).put("left", ai.m3433a(rect3.left, displayMetrics)).put("right", ai.m3433a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", ai.m3433a(rect4.top, displayMetrics)).put("bottom", ai.m3433a(rect4.bottom, displayMetrics)).put("left", ai.m3433a(rect4.left, displayMetrics)).put("right", ai.m3433a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", ai.m3433a(rect5.top, displayMetrics)).put("bottom", ai.m3433a(rect5.bottom, displayMetrics)).put("left", ai.m3433a(rect5.left, displayMetrics)).put("right", ai.m3433a(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", rd.m4427a(view, this.f2898i, this.f2899j));
        return l;
    }

    protected final void m3438a() {
        synchronized (this.f2890a) {
            if (this.f2892c != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f2892c = new aj(this);
            this.f2896g.registerReceiver(this.f2892c, intentFilter);
        }
    }

    public final void m3439a(ar arVar) {
        this.f2907r.add(arVar);
    }

    public final void m3440a(au auVar) {
        synchronized (this.f2890a) {
            this.f2900k = auVar;
        }
    }

    protected final void m3441a(ji jiVar) {
        jiVar.m3841a("/updateActiveView", this.f2909t);
        jiVar.m3841a("/untrackActiveViewUnit", this.f2910u);
        jiVar.m3841a("/visibilityChanged", this.f2911v);
    }

    protected final void m3442a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            m3447b(jSONObject2);
        } catch (Throwable th) {
            C0501b.m3027a(6);
        }
    }

    protected final void m3443a(boolean z) {
        Iterator it = this.f2907r.iterator();
        while (it.hasNext()) {
            ((ar) it.next()).m3474a(this, z);
        }
    }

    protected final boolean m3444a(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f2891b.f2924c);
    }

    protected void m3445b() {
        synchronized (this.f2890a) {
            m3435k();
            synchronized (this.f2890a) {
                if (this.f2892c != null) {
                    try {
                        this.f2896g.unregisterReceiver(this.f2892c);
                    } catch (IllegalStateException e) {
                        C0501b.m3027a(6);
                    } catch (Throwable e2) {
                        ar.m2243h().m4367a(e2, true);
                    }
                    this.f2892c = null;
                }
            }
            this.f2904o = false;
            m3434j();
        }
    }

    protected final void m3446b(ji jiVar) {
        jiVar.m3844b("/visibilityChanged", this.f2911v);
        jiVar.m3844b("/untrackActiveViewUnit", this.f2910u);
        jiVar.m3844b("/updateActiveView", this.f2909t);
    }

    protected abstract void m3447b(JSONObject jSONObject);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m3448b(boolean r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = r5.f2890a;
        monitor-enter(r1);
        r2 = r5.m3452f();	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x000e;
    L_0x000a:
        r2 = r5.f2904o;	 Catch:{ all -> 0x0041 }
        if (r2 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r1);	 Catch:{ all -> 0x0041 }
    L_0x000f:
        return;
    L_0x0010:
        r2 = r5.f2895f;	 Catch:{ all -> 0x0041 }
        r2 = r2.m3459a();	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0044;
    L_0x0018:
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0041 }
        r3 = r5.f2898i;	 Catch:{ all -> 0x0041 }
        r4 = r5.f2899j;	 Catch:{ all -> 0x0041 }
        r3 = com.google.android.gms.p006b.rd.m4427a(r2, r3, r4);	 Catch:{ all -> 0x0041 }
        if (r3 == 0) goto L_0x0044;
    L_0x0025:
        r3 = new android.graphics.Rect;	 Catch:{ all -> 0x0041 }
        r3.<init>();	 Catch:{ all -> 0x0041 }
        r4 = 0;
        r3 = r2.getGlobalVisibleRect(r3, r4);	 Catch:{ all -> 0x0041 }
        if (r3 == 0) goto L_0x0044;
    L_0x0031:
        if (r6 == 0) goto L_0x0046;
    L_0x0033:
        r3 = r5.f2908s;	 Catch:{ all -> 0x0041 }
        r3 = r3.m4526a();	 Catch:{ all -> 0x0041 }
        if (r3 != 0) goto L_0x0046;
    L_0x003b:
        r3 = r5.f2906q;	 Catch:{ all -> 0x0041 }
        if (r0 != r3) goto L_0x0046;
    L_0x003f:
        monitor-exit(r1);	 Catch:{ all -> 0x0041 }
        goto L_0x000f;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0044:
        r0 = 0;
        goto L_0x0031;
    L_0x0046:
        r5.f2906q = r0;	 Catch:{ all -> 0x0041 }
        r0 = r5.f2895f;	 Catch:{ all -> 0x0041 }
        r0 = r0.m3460b();	 Catch:{ all -> 0x0041 }
        if (r0 == 0) goto L_0x0055;
    L_0x0050:
        r5.m3449c();	 Catch:{ all -> 0x0041 }
        monitor-exit(r1);	 Catch:{ all -> 0x0041 }
        goto L_0x000f;
    L_0x0055:
        r0 = r5.m3437a(r2);	 Catch:{ JSONException -> 0x009b, RuntimeException -> 0x00a1 }
        r5.m3442a(r0);	 Catch:{ JSONException -> 0x009b, RuntimeException -> 0x00a1 }
    L_0x005c:
        r0 = r5.f2895f;	 Catch:{ all -> 0x0041 }
        r0 = r0.m3461c();	 Catch:{ all -> 0x0041 }
        r2 = r0.m3459a();	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0095;
    L_0x0068:
        r0 = r5.f2894e;	 Catch:{ all -> 0x0041 }
        r0 = r0.get();	 Catch:{ all -> 0x0041 }
        r0 = (android.view.ViewTreeObserver) r0;	 Catch:{ all -> 0x0041 }
        r2 = r2.getViewTreeObserver();	 Catch:{ all -> 0x0041 }
        if (r2 == r0) goto L_0x0095;
    L_0x0076:
        r5.m3435k();	 Catch:{ all -> 0x0041 }
        r3 = r5.f2901l;	 Catch:{ all -> 0x0041 }
        if (r3 == 0) goto L_0x0085;
    L_0x007d:
        if (r0 == 0) goto L_0x008e;
    L_0x007f:
        r0 = r0.isAlive();	 Catch:{ all -> 0x0041 }
        if (r0 == 0) goto L_0x008e;
    L_0x0085:
        r0 = 1;
        r5.f2901l = r0;	 Catch:{ all -> 0x0041 }
        r2.addOnScrollChangedListener(r5);	 Catch:{ all -> 0x0041 }
        r2.addOnGlobalLayoutListener(r5);	 Catch:{ all -> 0x0041 }
    L_0x008e:
        r0 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0041 }
        r0.<init>(r2);	 Catch:{ all -> 0x0041 }
        r5.f2894e = r0;	 Catch:{ all -> 0x0041 }
    L_0x0095:
        r5.m3434j();	 Catch:{ all -> 0x0041 }
        monitor-exit(r1);	 Catch:{ all -> 0x0041 }
        goto L_0x000f;
    L_0x009b:
        r0 = move-exception;
    L_0x009c:
        r0 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r0);	 Catch:{ all -> 0x0041 }
        goto L_0x005c;
    L_0x00a1:
        r0 = move-exception;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.ai.b(boolean):void");
    }

    public void m3449c() {
        synchronized (this.f2890a) {
            if (this.f2904o) {
                this.f2905p = true;
                try {
                    JSONObject l = m3436l();
                    l.put("doneReasonCode", "u");
                    m3442a(l);
                } catch (JSONException e) {
                    C0501b.m3027a(6);
                } catch (RuntimeException e2) {
                    C0501b.m3027a(6);
                }
                "Untracking ad unit: " + this.f2891b.f2924c;
                C0501b.m3027a(3);
            }
        }
    }

    protected final void m3450d() {
        m3448b(false);
    }

    public final boolean m3451e() {
        boolean z;
        synchronized (this.f2890a) {
            z = this.f2904o;
        }
        return z;
    }

    protected abstract boolean m3452f();

    public final void m3453g() {
        synchronized (this.f2890a) {
            this.f2903n = true;
            m3448b(false);
        }
    }

    public final void m3454h() {
        synchronized (this.f2890a) {
            this.f2902m = true;
            m3448b(false);
        }
    }

    public final void m3455i() {
        synchronized (this.f2890a) {
            this.f2902m = false;
            m3448b(false);
        }
    }

    public void onGlobalLayout() {
        m3448b(false);
    }

    public void onScrollChanged() {
        m3448b(true);
    }
}
