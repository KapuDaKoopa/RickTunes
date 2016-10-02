package com.google.android.gms.p006b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.math.BigInteger;
import java.util.Locale;

@op
/* renamed from: com.google.android.gms.b.qh */
public final class qh {
    private static final Object f4011a;
    private static String f4012b;

    static {
        f4011a = new Object();
    }

    public static String m4381a() {
        String str;
        synchronized (f4011a) {
            str = f4012b;
        }
        return str;
    }

    public static String m4382a(Context context, String str, String str2) {
        String str3;
        synchronized (f4011a) {
            if (f4012b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        ar.m2240e();
                        if (rd.m4429a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    f4012b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable th) {
                    f4012b = "err";
                }
            }
            str3 = f4012b;
        }
        return str3;
    }
}
