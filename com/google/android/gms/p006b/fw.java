package com.google.android.gms.p006b;

import android.app.AlertDialog.Builder;
import android.net.Uri;
import android.support.v4.p001b.C0029a;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0771d;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.C0403l;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Collections;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.fw */
public final class fw implements fk {
    static final Map f3250a;
    private final C0403l f3251b;
    private final lm f3252c;

    static {
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(2);
        Integer valueOf3 = Integer.valueOf(3);
        Integer valueOf4 = Integer.valueOf(4);
        Integer valueOf5 = Integer.valueOf(5);
        Integer valueOf6 = Integer.valueOf(6);
        Map c0029a = new C0029a(6);
        c0029a.put("resize", valueOf);
        c0029a.put("playVideo", valueOf2);
        c0029a.put("storePicture", valueOf3);
        c0029a.put("createCalendarEvent", valueOf4);
        c0029a.put("setOrientationProperties", valueOf5);
        c0029a.put("closeResizedAd", valueOf6);
        f3250a = Collections.unmodifiableMap(c0029a);
    }

    public fw(C0403l c0403l, lm lmVar) {
        this.f3251b = c0403l;
        this.f3252c = lmVar;
    }

    public final void m3728a(tf tfVar, Map map) {
        int intValue = ((Integer) f3250a.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.f3251b == null || this.f3251b.m2605a()) {
            switch (intValue) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    this.f3252c.m4186a(map);
                    return;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    lp lpVar = new lp(tfVar, map);
                    if (lpVar.f3613b == null) {
                        lpVar.m4178a("Activity context is not available");
                        return;
                    }
                    ar.m2240e();
                    if (rd.m4445e(lpVar.f3613b).m3536a()) {
                        String str = (String) lpVar.f3612a.get("iurl");
                        if (TextUtils.isEmpty(str)) {
                            lpVar.m4178a("Image url cannot be empty.");
                            return;
                        } else if (URLUtil.isValidUrl(str)) {
                            String lastPathSegment = Uri.parse(str).getLastPathSegment();
                            ar.m2240e();
                            if (rd.m4441c(lastPathSegment)) {
                                ar.m2240e();
                                Builder d = rd.m4444d(lpVar.f3613b);
                                d.setTitle(ar.m2243h().m4361a(C0771d.store_picture_title, "Save image"));
                                d.setMessage(ar.m2243h().m4361a(C0771d.store_picture_message, "Allow Ad to store image in Picture gallery?"));
                                d.setPositiveButton(ar.m2243h().m4361a(C0771d.accept, "Accept"), new lq(lpVar, str, lastPathSegment));
                                d.setNegativeButton(ar.m2243h().m4361a(C0771d.decline, "Decline"), new lr(lpVar));
                                d.create().show();
                                return;
                            }
                            lpVar.m4178a("Image type not recognized: " + lastPathSegment);
                            return;
                        } else {
                            lpVar.m4178a("Invalid image url: " + str);
                            return;
                        }
                    }
                    lpVar.m4178a("Feature is not supported by the device.");
                    return;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    lj ljVar = new lj(tfVar, map);
                    if (ljVar.f3580a == null) {
                        ljVar.m4178a("Activity context is not available.");
                        return;
                    }
                    ar.m2240e();
                    if (rd.m4445e(ljVar.f3580a).m3538b()) {
                        ar.m2240e();
                        Builder d2 = rd.m4444d(ljVar.f3580a);
                        d2.setTitle(ar.m2243h().m4361a(C0771d.create_calendar_title, "Create calendar event"));
                        d2.setMessage(ar.m2243h().m4361a(C0771d.create_calendar_message, "Allow Ad to create a calendar event?"));
                        d2.setPositiveButton(ar.m2243h().m4361a(C0771d.accept, "Accept"), new lk(ljVar));
                        d2.setNegativeButton(ar.m2243h().m4361a(C0771d.decline, "Decline"), new ll(ljVar));
                        d2.create().show();
                        return;
                    }
                    ljVar.m4178a("This feature is not available on the device.");
                    return;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    lo loVar = new lo(tfVar, map);
                    if (loVar.f3609a == null) {
                        C0501b.m3025a("AdWebView is null");
                        return;
                    }
                    intValue = "portrait".equalsIgnoreCase(loVar.f3611c) ? ar.m2242g().m4474b() : "landscape".equalsIgnoreCase(loVar.f3611c) ? ar.m2242g().m4461a() : loVar.f3610b ? -1 : ar.m2242g().m4476c();
                    loVar.f3609a.m4565b(intValue);
                    return;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    this.f3252c.m4187a(true);
                    return;
                default:
                    C0501b.m3027a(4);
                    return;
            }
        }
        this.f3251b.m2604a(null);
    }
}
