package com.google.android.gms.p006b;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.lm */
public final class lm extends lv {
    static final Set f3589a;
    private String f3590b;
    private boolean f3591c;
    private int f3592d;
    private int f3593e;
    private int f3594f;
    private int f3595g;
    private int f3596i;
    private int f3597j;
    private final Object f3598k;
    private final tf f3599l;
    private final Activity f3600m;
    private AdSizeParcel f3601n;
    private ImageView f3602o;
    private LinearLayout f3603p;
    private lw f3604q;
    private PopupWindow f3605r;
    private RelativeLayout f3606s;
    private ViewGroup f3607t;

    static {
        Set emptySet;
        String[] strArr = new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"};
        Object obj;
        Object obj2;
        Object obj3;
        switch (strArr.length) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                emptySet = Collections.emptySet();
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                emptySet = Collections.singleton(strArr[0]);
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                obj = strArr[0];
                obj2 = strArr[1];
                emptySet = new xb(2);
                emptySet.add(obj);
                emptySet.add(obj2);
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                obj = strArr[0];
                obj3 = strArr[1];
                obj2 = strArr[2];
                emptySet = new xb(3);
                emptySet.add(obj);
                emptySet.add(obj3);
                emptySet.add(obj2);
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                obj = strArr[0];
                obj3 = strArr[1];
                Object obj4 = strArr[2];
                obj2 = strArr[3];
                emptySet = new xb(4);
                emptySet.add(obj);
                emptySet.add(obj3);
                emptySet.add(obj4);
                emptySet.add(obj2);
                break;
            default:
                if (strArr.length > 32) {
                    emptySet = new HashSet(Arrays.asList(strArr));
                    break;
                } else {
                    emptySet = new xb(Arrays.asList(strArr));
                    break;
                }
        }
        emptySet = Collections.unmodifiableSet(emptySet);
        f3589a = emptySet;
    }

    public lm(tf tfVar, lw lwVar) {
        super(tfVar, "resize");
        this.f3590b = "top-right";
        this.f3591c = true;
        this.f3592d = 0;
        this.f3593e = 0;
        this.f3594f = -1;
        this.f3595g = 0;
        this.f3596i = 0;
        this.f3597j = -1;
        this.f3598k = new Object();
        this.f3599l = tfVar;
        this.f3600m = tfVar.m4573f();
        this.f3604q = lwVar;
    }

    private void m4182b(int i, int i2) {
        ar.m2240e();
        int i3 = i2 - rd.m4442c(this.f3600m)[0];
        int i4 = this.f3597j;
        try {
            this.f3579h.m3845b("onSizeChanged", new JSONObject().put("x", i).put("y", i3).put("width", i4).put("height", this.f3594f));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }

    private int[] m4183b() {
        int i;
        ar.m2240e();
        int[] b = rd.m4437b(this.f3600m);
        ar.m2240e();
        int[] c = rd.m4442c(this.f3600m);
        int i2 = b[0];
        int i3 = b[1];
        if (this.f3597j < 50 || this.f3597j > i2) {
            C0501b.m3025a("Width is too small or too large.");
            i3 = 0;
        } else if (this.f3594f < 50 || this.f3594f > i3) {
            C0501b.m3025a("Height is too small or too large.");
            i3 = 0;
        } else if (this.f3594f == i3 && this.f3597j == i2) {
            C0501b.m3025a("Cannot resize to a full-screen ad.");
            i3 = 0;
        } else {
            if (this.f3591c) {
                String str = this.f3590b;
                i3 = -1;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            i3 = 2;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            i3 = 0;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            i3 = 5;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            i3 = 4;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            i3 = 1;
                            break;
                        }
                        break;
                }
                switch (i3) {
                    case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                        i = this.f3595g + this.f3592d;
                        i3 = this.f3593e + this.f3596i;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        i = ((this.f3592d + this.f3595g) + (this.f3597j / 2)) - 25;
                        i3 = this.f3593e + this.f3596i;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        i = ((this.f3592d + this.f3595g) + (this.f3597j / 2)) - 25;
                        i3 = ((this.f3593e + this.f3596i) + (this.f3594f / 2)) - 25;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                        i = this.f3595g + this.f3592d;
                        i3 = ((this.f3593e + this.f3596i) + this.f3594f) - 50;
                        break;
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                        i = ((this.f3592d + this.f3595g) + (this.f3597j / 2)) - 25;
                        i3 = ((this.f3593e + this.f3596i) + this.f3594f) - 50;
                        break;
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                        i = ((this.f3592d + this.f3595g) + this.f3597j) - 50;
                        i3 = ((this.f3593e + this.f3596i) + this.f3594f) - 50;
                        break;
                    default:
                        i = ((this.f3592d + this.f3595g) + this.f3597j) - 50;
                        i3 = this.f3593e + this.f3596i;
                        break;
                }
                if (i < 0 || i + 50 > i2 || r0 < c[0] || r0 + 50 > c[1]) {
                    i3 = 0;
                }
            }
            i3 = 1;
        }
        if (i3 == 0) {
            return null;
        }
        if (this.f3591c) {
            return new int[]{this.f3592d + this.f3595g, this.f3593e + this.f3596i};
        }
        ar.m2240e();
        b = rd.m4437b(this.f3600m);
        ar.m2240e();
        c = rd.m4442c(this.f3600m);
        i2 = b[0];
        i3 = this.f3592d + this.f3595g;
        i = this.f3593e + this.f3596i;
        if (i3 < 0) {
            i3 = 0;
        } else if (this.f3597j + i3 > i2) {
            i3 = i2 - this.f3597j;
        }
        if (i < c[0]) {
            i = c[0];
        } else if (this.f3594f + i > c[1]) {
            i = c[1] - this.f3594f;
        }
        return new int[]{i3, i};
    }

    public final void m4184a(int i, int i2) {
        this.f3592d = i;
        this.f3593e = i2;
    }

    public final void m4185a(int i, int i2, boolean z) {
        synchronized (this.f3598k) {
            this.f3592d = i;
            this.f3593e = i2;
            if (this.f3605r != null && z) {
                int[] b = m4183b();
                if (b != null) {
                    PopupWindow popupWindow = this.f3605r;
                    C0374z.m2455a();
                    int a = C0500a.m3009a(this.f3600m, b[0]);
                    C0374z.m2455a();
                    popupWindow.update(a, C0500a.m3009a(this.f3600m, b[1]), this.f3605r.getWidth(), this.f3605r.getHeight());
                    m4182b(b[0], b[1]);
                } else {
                    m4187a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4186a(java.util.Map r13) {
        /*
        r12 = this;
        r4 = -1;
        r5 = 1;
        r3 = 0;
        r6 = r12.f3598k;
        monitor-enter(r6);
        r1 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0011;
    L_0x000a:
        r1 = "Not an activity context. Cannot resize.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
    L_0x0010:
        return;
    L_0x0011:
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4578k();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0023;
    L_0x0019:
        r1 = "Webview is not yet available, size is not set.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0020:
        r1 = move-exception;
        monitor-exit(r6);
        throw r1;
    L_0x0023:
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4578k();	 Catch:{ all -> 0x0020 }
        r1 = r1.f1906e;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0034;
    L_0x002d:
        r1 = "Is interstitial. Cannot resize an interstitial.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0034:
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4583p();	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = "Cannot resize an expanded banner.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0043:
        r1 = "width";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0020 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0062;
    L_0x0051:
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = "width";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4432b(r1);	 Catch:{ all -> 0x0020 }
        r12.f3597j = r1;	 Catch:{ all -> 0x0020 }
    L_0x0062:
        r1 = "height";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0020 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0081;
    L_0x0070:
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = "height";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4432b(r1);	 Catch:{ all -> 0x0020 }
        r12.f3594f = r1;	 Catch:{ all -> 0x0020 }
    L_0x0081:
        r1 = "offsetX";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0020 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x00a0;
    L_0x008f:
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = "offsetX";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4432b(r1);	 Catch:{ all -> 0x0020 }
        r12.f3595g = r1;	 Catch:{ all -> 0x0020 }
    L_0x00a0:
        r1 = "offsetY";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0020 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x00bf;
    L_0x00ae:
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = "offsetY";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4432b(r1);	 Catch:{ all -> 0x0020 }
        r12.f3596i = r1;	 Catch:{ all -> 0x0020 }
    L_0x00bf:
        r1 = "allowOffscreen";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0020 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x00db;
    L_0x00cd:
        r1 = "allowOffscreen";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r1 = java.lang.Boolean.parseBoolean(r1);	 Catch:{ all -> 0x0020 }
        r12.f3591c = r1;	 Catch:{ all -> 0x0020 }
    L_0x00db:
        r1 = "customClosePosition";
        r1 = r13.get(r1);	 Catch:{ all -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0020 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0020 }
        if (r2 != 0) goto L_0x00eb;
    L_0x00e9:
        r12.f3590b = r1;	 Catch:{ all -> 0x0020 }
    L_0x00eb:
        r1 = r12.f3597j;	 Catch:{ all -> 0x0020 }
        if (r1 < 0) goto L_0x00fe;
    L_0x00ef:
        r1 = r12.f3594f;	 Catch:{ all -> 0x0020 }
        if (r1 < 0) goto L_0x00fe;
    L_0x00f3:
        r1 = r5;
    L_0x00f4:
        if (r1 != 0) goto L_0x0100;
    L_0x00f6:
        r1 = "Invalid width and height options. Cannot resize.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x00fe:
        r1 = r3;
        goto L_0x00f4;
    L_0x0100:
        r1 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r7 = r1.getWindow();	 Catch:{ all -> 0x0020 }
        if (r7 == 0) goto L_0x010e;
    L_0x0108:
        r1 = r7.getDecorView();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0116;
    L_0x010e:
        r1 = "Activity context is not ready, cannot get window or decor view.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0116:
        r8 = r12.m4183b();	 Catch:{ all -> 0x0020 }
        if (r8 != 0) goto L_0x0124;
    L_0x011c:
        r1 = "Resize location out of screen or close button is not visible.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0124:
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ all -> 0x0020 }
        r1 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3597j;	 Catch:{ all -> 0x0020 }
        r9 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r1, r2);	 Catch:{ all -> 0x0020 }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ all -> 0x0020 }
        r1 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3594f;	 Catch:{ all -> 0x0020 }
        r10 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4564b();	 Catch:{ all -> 0x0020 }
        r2 = r1.getParent();	 Catch:{ all -> 0x0020 }
        if (r2 == 0) goto L_0x027f;
    L_0x0146:
        r1 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x027f;
    L_0x014a:
        r0 = r2;
        r0 = (android.view.ViewGroup) r0;	 Catch:{ all -> 0x0020 }
        r1 = r0;
        r11 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r11 = r11.m4564b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r11);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3605r;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0278;
    L_0x015b:
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x0020 }
        r12.f3607t = r2;	 Catch:{ all -> 0x0020 }
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4564b();	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4399a(r1);	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.ImageView;	 Catch:{ all -> 0x0020 }
        r11 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r2.<init>(r11);	 Catch:{ all -> 0x0020 }
        r12.f3602o = r2;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3602o;	 Catch:{ all -> 0x0020 }
        r2.setImageBitmap(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r1 = r1.m4578k();	 Catch:{ all -> 0x0020 }
        r12.f3601n = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f3607t;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3602o;	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
    L_0x0189:
        r1 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f3606s = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r2 = 0;
        r1.setBackgroundColor(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r2 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x0020 }
        r2.<init>(r9, r10);	 Catch:{ all -> 0x0020 }
        r1.setLayoutParams(r2);	 Catch:{ all -> 0x0020 }
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.p006b.rd.m4401a(r1, r9, r10);	 Catch:{ all -> 0x0020 }
        r12.f3605r = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f3605r;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setOutsideTouchable(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3605r;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setTouchable(r2);	 Catch:{ all -> 0x0020 }
        r2 = r12.f3605r;	 Catch:{ all -> 0x0020 }
        r1 = r12.f3591c;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0287;
    L_0x01bf:
        r1 = r5;
    L_0x01c0:
        r2.setClippingEnabled(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r2 = r2.m4564b();	 Catch:{ all -> 0x0020 }
        r9 = -1;
        r10 = -1;
        r1.addView(r2, r9, r10);	 Catch:{ all -> 0x0020 }
        r1 = new android.widget.LinearLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f3603p = r1;	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x0020 }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ all -> 0x0020 }
        r1 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r9 = 50;
        r1 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r1, r9);	 Catch:{ all -> 0x0020 }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ all -> 0x0020 }
        r9 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r10 = 50;
        r9 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r9, r10);	 Catch:{ all -> 0x0020 }
        r2.<init>(r1, r9);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3590b;	 Catch:{ all -> 0x0020 }
        r9 = r1.hashCode();	 Catch:{ all -> 0x0020 }
        switch(r9) {
            case -1364013995: goto L_0x02a0;
            case -1012429441: goto L_0x028a;
            case -655373719: goto L_0x02ab;
            case 1163912186: goto L_0x02c1;
            case 1288627767: goto L_0x02b6;
            case 1755462605: goto L_0x0295;
            default: goto L_0x01fd;
        };	 Catch:{ all -> 0x0020 }
    L_0x01fd:
        r1 = r4;
    L_0x01fe:
        switch(r1) {
            case 0: goto L_0x02cc;
            case 1: goto L_0x02d8;
            case 2: goto L_0x02e4;
            case 3: goto L_0x02eb;
            case 4: goto L_0x02f7;
            case 5: goto L_0x0303;
            default: goto L_0x0201;
        };	 Catch:{ all -> 0x0020 }
    L_0x0201:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
    L_0x020b:
        r1 = r12.f3603p;	 Catch:{ all -> 0x0020 }
        r3 = new com.google.android.gms.b.ln;	 Catch:{ all -> 0x0020 }
        r3.<init>(r12);	 Catch:{ all -> 0x0020 }
        r1.setOnClickListener(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3603p;	 Catch:{ all -> 0x0020 }
        r3 = "Close button";
        r1.setContentDescription(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r3 = r12.f3603p;	 Catch:{ all -> 0x0020 }
        r1.addView(r3, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3605r;	 Catch:{ RuntimeException -> 0x030f }
        r2 = r7.getDecorView();	 Catch:{ RuntimeException -> 0x030f }
        r3 = 0;
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ RuntimeException -> 0x030f }
        r4 = r12.f3600m;	 Catch:{ RuntimeException -> 0x030f }
        r5 = 0;
        r5 = r8[r5];	 Catch:{ RuntimeException -> 0x030f }
        r4 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r4, r5);	 Catch:{ RuntimeException -> 0x030f }
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ RuntimeException -> 0x030f }
        r5 = r12.f3600m;	 Catch:{ RuntimeException -> 0x030f }
        r7 = 1;
        r7 = r8[r7];	 Catch:{ RuntimeException -> 0x030f }
        r5 = com.google.android.gms.ads.internal.util.client.C0500a.m3009a(r5, r7);	 Catch:{ RuntimeException -> 0x030f }
        r1.showAtLocation(r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x030f }
        r1 = r12.f3604q;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0252;
    L_0x0249:
        r1 = r12.f3604q;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3597j;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3594f;	 Catch:{ all -> 0x0020 }
        r1.m2467z();	 Catch:{ all -> 0x0020 }
    L_0x0252:
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r2 = new com.google.android.gms.ads.internal.client.AdSizeParcel;	 Catch:{ all -> 0x0020 }
        r3 = r12.f3600m;	 Catch:{ all -> 0x0020 }
        r4 = new com.google.android.gms.ads.f;	 Catch:{ all -> 0x0020 }
        r5 = r12.f3597j;	 Catch:{ all -> 0x0020 }
        r7 = r12.f3594f;	 Catch:{ all -> 0x0020 }
        r4.<init>(r5, r7);	 Catch:{ all -> 0x0020 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0020 }
        r1.m4557a(r2);	 Catch:{ all -> 0x0020 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.m4182b(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = "resized";
        r12.m4179b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0278:
        r1 = r12.f3605r;	 Catch:{ all -> 0x0020 }
        r1.dismiss();	 Catch:{ all -> 0x0020 }
        goto L_0x0189;
    L_0x027f:
        r1 = "Webview is detached, probably in the middle of a resize or expand.";
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0287:
        r1 = r3;
        goto L_0x01c0;
    L_0x028a:
        r5 = "top-left";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x0292:
        r1 = r3;
        goto L_0x01fe;
    L_0x0295:
        r3 = "top-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x029d:
        r1 = r5;
        goto L_0x01fe;
    L_0x02a0:
        r3 = "center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x02a8:
        r1 = 2;
        goto L_0x01fe;
    L_0x02ab:
        r3 = "bottom-left";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x02b3:
        r1 = 3;
        goto L_0x01fe;
    L_0x02b6:
        r3 = "bottom-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x02be:
        r1 = 4;
        goto L_0x01fe;
    L_0x02c1:
        r3 = "bottom-right";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01fd;
    L_0x02c9:
        r1 = 5;
        goto L_0x01fe;
    L_0x02cc:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x02d8:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x02e4:
        r1 = 13;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x02eb:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x02f7:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x0303:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x020b;
    L_0x030f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0020 }
        r3 = "Cannot show popup window: ";
        r2.<init>(r3);	 Catch:{ all -> 0x0020 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0020 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x0020 }
        r1 = r1.toString();	 Catch:{ all -> 0x0020 }
        r12.m4178a(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3606s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r2 = r2.m4564b();	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3607t;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x034e;
    L_0x0335:
        r1 = r12.f3607t;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3602o;	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3607t;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r2 = r2.m4564b();	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f3599l;	 Catch:{ all -> 0x0020 }
        r2 = r12.f3601n;	 Catch:{ all -> 0x0020 }
        r1.m4557a(r2);	 Catch:{ all -> 0x0020 }
    L_0x034e:
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.lm.a(java.util.Map):void");
    }

    public final void m4187a(boolean z) {
        synchronized (this.f3598k) {
            if (this.f3605r != null) {
                this.f3605r.dismiss();
                this.f3606s.removeView(this.f3599l.m4564b());
                if (this.f3607t != null) {
                    this.f3607t.removeView(this.f3602o);
                    this.f3607t.addView(this.f3599l.m4564b());
                    this.f3599l.m4557a(this.f3601n);
                }
                if (z) {
                    m4179b("default");
                    if (this.f3604q != null) {
                        this.f3604q.m2466A();
                    }
                }
                this.f3605r = null;
                this.f3606s = null;
                this.f3607t = null;
                this.f3603p = null;
            }
        }
    }

    public final boolean m4188a() {
        boolean z;
        synchronized (this.f3598k) {
            z = this.f3605r != null;
        }
        return z;
    }
}
