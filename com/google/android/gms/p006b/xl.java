package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.b.xl */
public final class xl {
    private static final Pattern f4330a;
    private static final Pattern f4331b;

    static {
        f4330a = Pattern.compile("\\\\.");
        f4331b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static String m4898a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f4331b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case hp.SherlockTheme_searchViewGoIcon /*34*/:
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case hp.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case '\\':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
                default:
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
