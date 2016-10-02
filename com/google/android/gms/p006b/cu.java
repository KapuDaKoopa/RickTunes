package com.google.android.gms.p006b;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.b.cu */
final class cu extends cr {
    cu() {
    }

    private static String m3594a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    public final String m3595a(String str, String str2) {
        String a = cu.m3594a(str);
        String a2 = cu.m3594a(str2);
        return TextUtils.isEmpty(a) ? a2 : TextUtils.isEmpty(a2) ? a : a + "," + a2;
    }
}
