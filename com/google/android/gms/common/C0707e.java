package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.p006b.xn;

/* renamed from: com.google.android.gms.common.e */
public final class C0707e extends C0706q {
    @Deprecated
    public static final int f4742a;

    static {
        f4742a = C0706q.f4734b;
    }

    @TargetApi(11)
    public static void m5362a(Activity activity, OnCancelListener onCancelListener, String str, Dialog dialog) {
        boolean z;
        try {
            z = activity instanceof FragmentActivity;
        } catch (NoClassDefFoundError e) {
            z = false;
        }
        if (z) {
            SupportErrorDialogFragment.m5063a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
        } else if (xn.m4900a(11)) {
            C0652a.m5064a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5363a(int r9, android.app.Activity r10, android.support.v4.app.Fragment r11, android.content.DialogInterface.OnCancelListener r12) {
        /*
        r8 = 3;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        if (r9 != 0) goto L_0x000a;
    L_0x0006:
        r0 = r4;
    L_0x0007:
        if (r0 != 0) goto L_0x01d4;
    L_0x0009:
        return r3;
    L_0x000a:
        r0 = com.google.android.gms.p006b.xh.m4894a(r10);
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = 2;
        if (r9 != r0) goto L_0x0015;
    L_0x0013:
        r9 = 42;
    L_0x0015:
        r0 = com.google.android.gms.common.C0706q.m5355b(r10, r9);
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        r9 = 18;
    L_0x001d:
        r0 = 14;
        r0 = com.google.android.gms.p006b.xn.m4900a(r0);
        if (r0 == 0) goto L_0x01dc;
    L_0x0025:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r1 = r10.getTheme();
        r5 = 16843529; // 0x1010309 float:2.3695736E-38 double:8.321809E-317;
        r1.resolveAttribute(r5, r0, r2);
        r1 = r10.getResources();
        r0 = r0.resourceId;
        r0 = r1.getResourceEntryName(r0);
        r1 = "Theme.Dialog.Alert";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01dc;
    L_0x0046:
        r0 = new android.app.AlertDialog$Builder;
        r1 = 5;
        r0.<init>(r10, r1);
    L_0x004c:
        if (r0 != 0) goto L_0x0053;
    L_0x004e:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r10);
    L_0x0053:
        r5 = com.google.android.gms.common.C0706q.m5359e(r10);
        r6 = r10.getResources();
        switch(r9) {
            case 1: goto L_0x00b4;
            case 2: goto L_0x0121;
            case 3: goto L_0x0109;
            case 5: goto L_0x0149;
            case 7: goto L_0x0141;
            case 9: goto L_0x0135;
            case 16: goto L_0x0151;
            case 17: goto L_0x015d;
            case 18: goto L_0x0115;
            case 20: goto L_0x0165;
            case 42: goto L_0x012d;
            default: goto L_0x005e;
        };
    L_0x005e:
        r1 = com.google.android.gms.C0771d.common_google_play_services_unknown_issue;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
    L_0x0068:
        r0.setMessage(r1);
        if (r12 == 0) goto L_0x0070;
    L_0x006d:
        r0.setOnCancelListener(r12);
    L_0x0070:
        r1 = com.google.android.gms.common.C0698b.m5328a();
        r5 = "d";
        r5 = r1.m5330a(r10, r9, r5);
        if (r11 != 0) goto L_0x016d;
    L_0x007c:
        r1 = new com.google.android.gms.common.internal.l;
        r1.<init>(r10, r5);
    L_0x0081:
        r5 = r10.getResources();
        switch(r9) {
            case 1: goto L_0x0174;
            case 2: goto L_0x0184;
            case 3: goto L_0x017c;
            default: goto L_0x0088;
        };
    L_0x0088:
        r6 = 17039370; // 0x104000a float:2.42446E-38 double:8.4185673E-317;
        r5 = r5.getString(r6);
    L_0x008f:
        if (r5 == 0) goto L_0x0094;
    L_0x0091:
        r0.setPositiveButton(r5, r1);
    L_0x0094:
        r1 = r10.getResources();
        switch(r9) {
            case 1: goto L_0x018c;
            case 2: goto L_0x01a4;
            case 3: goto L_0x0194;
            case 4: goto L_0x00a9;
            case 5: goto L_0x01bc;
            case 6: goto L_0x00a9;
            case 7: goto L_0x01b4;
            case 8: goto L_0x00a9;
            case 9: goto L_0x01ac;
            case 10: goto L_0x00a9;
            case 11: goto L_0x00a9;
            case 16: goto L_0x00a9;
            case 17: goto L_0x01c4;
            case 18: goto L_0x019c;
            case 20: goto L_0x01cc;
            case 42: goto L_0x01a4;
            default: goto L_0x009b;
        };
    L_0x009b:
        r1 = new java.lang.StringBuilder;
        r5 = "Unexpected error code ";
        r1.<init>(r5);
        r1 = r1.append(r9);
        r1.toString();
    L_0x00a9:
        if (r4 == 0) goto L_0x00ae;
    L_0x00ab:
        r0.setTitle(r4);
    L_0x00ae:
        r0 = r0.create();
        goto L_0x0007;
    L_0x00b4:
        if (r6 == 0) goto L_0x00fb;
    L_0x00b6:
        r1 = r6.getConfiguration();
        r1 = r1.screenLayout;
        r1 = r1 & 15;
        if (r1 <= r8) goto L_0x00f5;
    L_0x00c0:
        r1 = r2;
    L_0x00c1:
        r7 = 11;
        r7 = com.google.android.gms.p006b.xn.m4900a(r7);
        if (r7 == 0) goto L_0x00cb;
    L_0x00c9:
        if (r1 != 0) goto L_0x00e6;
    L_0x00cb:
        r1 = r6.getConfiguration();
        r7 = 13;
        r7 = com.google.android.gms.p006b.xn.m4900a(r7);
        if (r7 == 0) goto L_0x00f9;
    L_0x00d7:
        r7 = r1.screenLayout;
        r7 = r7 & 15;
        if (r7 > r8) goto L_0x00f7;
    L_0x00dd:
        r1 = r1.smallestScreenWidthDp;
        r7 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r1 < r7) goto L_0x00f7;
    L_0x00e3:
        r1 = r2;
    L_0x00e4:
        if (r1 == 0) goto L_0x00fb;
    L_0x00e6:
        r1 = r2;
    L_0x00e7:
        if (r1 == 0) goto L_0x00fd;
    L_0x00e9:
        r1 = com.google.android.gms.C0771d.common_google_play_services_install_text_tablet;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x00f5:
        r1 = r3;
        goto L_0x00c1;
    L_0x00f7:
        r1 = r3;
        goto L_0x00e4;
    L_0x00f9:
        r1 = r3;
        goto L_0x00e4;
    L_0x00fb:
        r1 = r3;
        goto L_0x00e7;
    L_0x00fd:
        r1 = com.google.android.gms.C0771d.common_google_play_services_install_text_phone;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x0109:
        r1 = com.google.android.gms.C0771d.common_google_play_services_enable_text;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x0115:
        r1 = com.google.android.gms.C0771d.common_google_play_services_updating_text;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x0121:
        r1 = com.google.android.gms.C0771d.common_google_play_services_update_text;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x012d:
        r1 = com.google.android.gms.C0771d.common_google_play_services_wear_update_text;
        r1 = r6.getString(r1);
        goto L_0x0068;
    L_0x0135:
        r1 = com.google.android.gms.C0771d.common_google_play_services_unsupported_text;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x0141:
        r1 = com.google.android.gms.C0771d.common_google_play_services_network_error_text;
        r1 = r6.getString(r1);
        goto L_0x0068;
    L_0x0149:
        r1 = com.google.android.gms.C0771d.common_google_play_services_invalid_account_text;
        r1 = r6.getString(r1);
        goto L_0x0068;
    L_0x0151:
        r1 = com.google.android.gms.C0771d.common_google_play_services_api_unavailable_text;
        r7 = new java.lang.Object[r2];
        r7[r3] = r5;
        r1 = r6.getString(r1, r7);
        goto L_0x0068;
    L_0x015d:
        r1 = com.google.android.gms.C0771d.common_google_play_services_sign_in_failed_text;
        r1 = r6.getString(r1);
        goto L_0x0068;
    L_0x0165:
        r1 = com.google.android.gms.C0771d.common_google_play_services_restricted_profile_text;
        r1 = r6.getString(r1);
        goto L_0x0068;
    L_0x016d:
        r1 = new com.google.android.gms.common.internal.l;
        r1.<init>(r11, r5);
        goto L_0x0081;
    L_0x0174:
        r6 = com.google.android.gms.C0771d.common_google_play_services_install_button;
        r5 = r5.getString(r6);
        goto L_0x008f;
    L_0x017c:
        r6 = com.google.android.gms.C0771d.common_google_play_services_enable_button;
        r5 = r5.getString(r6);
        goto L_0x008f;
    L_0x0184:
        r6 = com.google.android.gms.C0771d.common_google_play_services_update_button;
        r5 = r5.getString(r6);
        goto L_0x008f;
    L_0x018c:
        r4 = com.google.android.gms.C0771d.common_google_play_services_install_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x0194:
        r4 = com.google.android.gms.C0771d.common_google_play_services_enable_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x019c:
        r4 = com.google.android.gms.C0771d.common_google_play_services_updating_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01a4:
        r4 = com.google.android.gms.C0771d.common_google_play_services_update_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01ac:
        r4 = com.google.android.gms.C0771d.common_google_play_services_unsupported_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01b4:
        r4 = com.google.android.gms.C0771d.common_google_play_services_network_error_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01bc:
        r4 = com.google.android.gms.C0771d.common_google_play_services_invalid_account_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01c4:
        r4 = com.google.android.gms.C0771d.common_google_play_services_sign_in_failed_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01cc:
        r4 = com.google.android.gms.C0771d.common_google_play_services_restricted_profile_title;
        r4 = r1.getString(r4);
        goto L_0x00a9;
    L_0x01d4:
        r1 = "GooglePlayServicesErrorDialog";
        com.google.android.gms.common.C0707e.m5362a(r10, r12, r1, r0);
        r3 = r2;
        goto L_0x0009;
    L_0x01dc:
        r0 = r4;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.e.a(int, android.app.Activity, android.support.v4.app.Fragment, android.content.DialogInterface$OnCancelListener):boolean");
    }
}
