package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.google.android.gms.C0772e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.b.gj */
final class gj implements Runnable {
    final /* synthetic */ String f3282a;
    final /* synthetic */ String f3283b;
    final /* synthetic */ String f3284c;
    final /* synthetic */ String f3285d;
    final /* synthetic */ gg f3286e;

    gj(gg ggVar, String str, String str2, String str3, String str4) {
        this.f3286e = ggVar;
        this.f3282a = str;
        this.f3283b = str2;
        this.f3284c = str3;
        this.f3285d = str4;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f3282a);
        if (!TextUtils.isEmpty(this.f3283b)) {
            hashMap.put("cachedSrc", this.f3283b);
        }
        String str = "type";
        gg ggVar = this.f3286e;
        String str2 = this.f3284c;
        Object obj = "internal";
        Object obj2 = -1;
        switch (str2.hashCode()) {
            case -1396664534:
                if (str2.equals("badUrl")) {
                    obj2 = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    obj2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    obj2 = 7;
                    break;
                }
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    obj2 = 3;
                    break;
                }
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    obj2 = 1;
                    break;
                }
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    obj2 = 8;
                    break;
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    obj2 = 9;
                    break;
                }
                break;
            case 96784904:
                if (str2.equals("error")) {
                    obj2 = null;
                    break;
                }
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    obj2 = 5;
                    break;
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    obj2 = 4;
                    break;
                }
                break;
        }
        switch (obj2) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                obj = "internal";
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                obj = "io";
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                obj = "network";
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                obj = "policy";
                break;
        }
        hashMap.put(str, obj);
        hashMap.put("reason", this.f3284c);
        if (!TextUtils.isEmpty(this.f3285d)) {
            hashMap.put("message", this.f3285d);
        }
        gg.m3751a(this.f3286e, "onPrecacheEvent", hashMap);
    }
}
