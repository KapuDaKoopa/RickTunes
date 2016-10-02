package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.i */
public class C0697i {
    private static final C0697i f4704a;
    public static final int f4705b;

    static {
        f4705b = C0706q.f4734b;
        f4704a = new C0697i();
    }

    C0697i() {
    }

    public static boolean m5317a(Context context, String str) {
        return C0706q.m5351a(context, str);
    }

    public static C0697i m5318b() {
        return f4704a;
    }

    private static String m5319b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f4705b);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    public static void m5320c(Context context) {
        C0706q.m5353b(context);
    }

    public int m5321a(Context context) {
        int a = C0706q.m5347a(context);
        return C0706q.m5355b(context, a) ? 18 : a;
    }

    public Intent m5322a(Context context, int i, String str) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return ad.m5414a("com.google.android.gms", C0697i.m5319b(context, str));
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                return ad.m5413a("com.google.android.gms");
            case hp.SherlockTheme_searchResultListItemHeight /*42*/:
                return ad.m5412a();
            default:
                return null;
        }
    }

    public boolean m5323a(int i) {
        return C0706q.m5354b(i);
    }

    public boolean m5324a(Context context, int i) {
        return C0706q.m5355b(context, i);
    }

    public int m5325b(Context context) {
        return C0706q.m5360f(context);
    }

    @Deprecated
    public Intent m5326b(int i) {
        return m5322a(null, i, null);
    }
}
