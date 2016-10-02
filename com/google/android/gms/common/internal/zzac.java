package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0772e;

public final class zzac extends Button {
    public zzac(Context context) {
        this(context, null);
    }

    public zzac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private static int m5630a(int i, int i2, int i3) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return i3;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return i2;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    private static int m5631a(int i, int i2, int i3, int i4) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return i2;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return i3;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return i4;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5632a(android.content.res.Resources r10, int r11, int r12, com.google.android.gms.common.api.Scope[] r13) {
        /*
        r9 = this;
        r8 = 0;
        r0 = 1;
        r1 = 0;
        r7 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r13 == 0) goto L_0x009e;
    L_0x0009:
        r3 = r13.length;
        r2 = r1;
    L_0x000b:
        if (r2 >= r3) goto L_0x009e;
    L_0x000d:
        r4 = r13[r2];
        r4 = r4.m5065a();
        r5 = "/plus.";
        r5 = r4.contains(r5);
        if (r5 == 0) goto L_0x0092;
    L_0x001b:
        r5 = "https://www.googleapis.com/auth/plus.me";
        r5 = r4.equals(r5);
        if (r5 != 0) goto L_0x0092;
    L_0x0023:
        r1 = android.graphics.Typeface.DEFAULT_BOLD;
        r9.setTypeface(r1);
        r1 = 1096810496; // 0x41600000 float:14.0 double:5.41896386E-315;
        r9.setTextSize(r1);
        r1 = r10.getDisplayMetrics();
        r1 = r1.density;
        r2 = r1 * r7;
        r2 = r2 + r6;
        r2 = (int) r2;
        r9.setMinHeight(r2);
        r1 = r1 * r7;
        r1 = r1 + r6;
        r1 = (int) r1;
        r9.setMinWidth(r1);
        if (r0 == 0) goto L_0x00a0;
    L_0x0042:
        r1 = com.google.android.gms.C0644c.common_plus_signin_btn_icon_dark;
        r2 = com.google.android.gms.C0644c.common_plus_signin_btn_icon_light;
        r3 = com.google.android.gms.C0644c.common_plus_signin_btn_icon_dark;
        r1 = m5631a(r12, r1, r2, r3);
        r2 = com.google.android.gms.C0644c.common_plus_signin_btn_text_dark;
        r3 = com.google.android.gms.C0644c.common_plus_signin_btn_text_light;
        r4 = com.google.android.gms.C0644c.common_plus_signin_btn_text_dark;
        r2 = m5631a(r12, r2, r3, r4);
        r1 = m5630a(r11, r1, r2);
    L_0x005a:
        r1 = r10.getDrawable(r1);
        r9.setBackgroundDrawable(r1);
        if (r0 == 0) goto L_0x00b9;
    L_0x0063:
        r0 = com.google.android.gms.C0643b.common_plus_signin_btn_text_dark;
        r1 = com.google.android.gms.C0643b.common_plus_signin_btn_text_light;
        r2 = com.google.android.gms.C0643b.common_plus_signin_btn_text_dark;
        r0 = m5631a(r12, r0, r1, r2);
    L_0x006d:
        r0 = r10.getColorStateList(r0);
        r0 = com.google.android.gms.common.internal.ax.m5527a(r0);
        r0 = (android.content.res.ColorStateList) r0;
        r9.setTextColor(r0);
        switch(r11) {
            case 0: goto L_0x00c4;
            case 1: goto L_0x00d1;
            case 2: goto L_0x00db;
            default: goto L_0x007d;
        };
    L_0x007d:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unknown button size: ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0092:
        r5 = "https://www.googleapis.com/auth/games";
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x0023;
    L_0x009a:
        r2 = r2 + 1;
        goto L_0x000b;
    L_0x009e:
        r0 = r1;
        goto L_0x0023;
    L_0x00a0:
        r1 = com.google.android.gms.C0644c.common_google_signin_btn_icon_dark;
        r2 = com.google.android.gms.C0644c.common_google_signin_btn_icon_light;
        r3 = com.google.android.gms.C0644c.common_google_signin_btn_icon_light;
        r1 = m5631a(r12, r1, r2, r3);
        r2 = com.google.android.gms.C0644c.common_google_signin_btn_text_dark;
        r3 = com.google.android.gms.C0644c.common_google_signin_btn_text_light;
        r4 = com.google.android.gms.C0644c.common_google_signin_btn_text_light;
        r2 = m5631a(r12, r2, r3, r4);
        r1 = m5630a(r11, r1, r2);
        goto L_0x005a;
    L_0x00b9:
        r0 = com.google.android.gms.C0643b.common_google_signin_btn_text_dark;
        r1 = com.google.android.gms.C0643b.common_google_signin_btn_text_light;
        r2 = com.google.android.gms.C0643b.common_google_signin_btn_text_light;
        r0 = m5631a(r12, r0, r1, r2);
        goto L_0x006d;
    L_0x00c4:
        r0 = com.google.android.gms.C0771d.common_signin_button_text;
        r0 = r10.getString(r0);
        r9.setText(r0);
    L_0x00cd:
        r9.setTransformationMethod(r8);
        return;
    L_0x00d1:
        r0 = com.google.android.gms.C0771d.common_signin_button_text_long;
        r0 = r10.getString(r0);
        r9.setText(r0);
        goto L_0x00cd;
    L_0x00db:
        r9.setText(r8);
        goto L_0x00cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzac.a(android.content.res.Resources, int, int, com.google.android.gms.common.api.Scope[]):void");
    }
}
