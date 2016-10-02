package com.andromo.dev576782.app537736;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class dt {
    private static String[] f845a;
    private static String[] f846b;

    static {
        f845a = new String[]{"yyyy-MM-dd'T'HH:mm:ss Z", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd HH:mm:ss.SSSZ", "yyyy-MM-dd HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"};
        f846b = new String[]{"yyyy-mm-dd'T'HH:mm:sszzzz", "yyyy-MM-dd'T'HH:mm:ss.SSSzzzz", "yyyy-MM-dd'T'HH:mm:sszzzz", "yyyy-MM-dd'T'HHmmss.SSSz", "yyyy-MM-dd'T'HH:mm:ss z", "yyyy-MM-dd'T'HH:mm:ssz", "yyyy-mm-dd'T'HH:mm:ssz", "EEE MMM dd HH:mm:ss z yyyy", "EEE, dd MMM yyyy HH:mm:ss Z", "EEE, dd MMM yyyy HH:mm:ss z", "EEE, dd MMM yyyy HH:mm zzzz", "EEE MMM dd HH:mm:ss z yyyy", "MMM dd, yyyy HH:mm:ss a", "M d, yyyy HH:mm:ss a z", "dd MMM yyyy HH:mm:ss z", "dd MMM yyyy HH:mm:ss Z", "d MMM yyyy HH:mm:ss Z", "d MMM yyyy HH:mm:ss z", "yy/MM/dd HH:mm a", "EEE, dd MMM yyyy HH:mm:ss"};
    }

    public static String m1347a(String str) {
        SimpleDateFormat a = du.m1350a("yyyy-MM-dd HH:mm:ss Z", true);
        Date b = m1348b(str);
        return (b == null || a == null) ? new Date().toString() : a.format(b);
    }

    private static Date m1348b(String str) {
        int i = 0;
        Date c = m1349c(str);
        if (c == null) {
            String[] strArr = f845a;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    c = du.m1350a(strArr[i2], true).parse(str);
                    break;
                } catch (ParseException e) {
                    i2++;
                }
            }
            if (c == null) {
                String[] strArr2 = f846b;
                int length2 = strArr2.length;
                while (i < length2) {
                    try {
                        c = du.m1350a(strArr2[i], false).parse(str);
                        break;
                    } catch (ParseException e2) {
                        i++;
                    }
                }
            }
        }
        return c;
    }

    private static Date m1349c(String str) {
        Date date = null;
        try {
            SimpleDateFormat a = du.m1350a("yyyy-MM-dd HH:mm:ss Z", true);
            if (a != null) {
                date = a.parse(str);
            }
        } catch (ParseException e) {
        }
        return date;
    }
}
