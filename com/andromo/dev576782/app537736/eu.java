package com.andromo.dev576782.app537736;

import android.os.Environment;
import android.support.v4.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;

public final class eu {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.io.ByteArrayInputStream m1403a(java.lang.String r2, int r3) {
        /*
        if (r2 == 0) goto L_0x0011;
    L_0x0002:
        r0 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x0013 }
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x0013 }
        r1.<init>(r2);	 Catch:{ all -> 0x0013 }
        r1 = m1407a(r1, r3);	 Catch:{ all -> 0x0013 }
        r0.<init>(r1);	 Catch:{ all -> 0x0013 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = 0;
        goto L_0x0010;
    L_0x0013:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.eu.a(java.lang.String, int):java.io.ByteArrayInputStream");
    }

    public static String m1404a(String str, String str2) {
        String str3 = "";
        if (str != null) {
            if (m1406a(str)) {
                return str;
            }
            String substring;
            if (str2 != null) {
                int lastIndexOf = str2.lastIndexOf(File.separator);
                if (lastIndexOf > 0) {
                    substring = str2.substring(0, lastIndexOf + 0);
                    if (substring != null && substring.length() > 0) {
                        return substring + File.separator + str;
                    }
                }
            }
            substring = "";
            return substring + File.separator + str;
        }
        return str3;
    }

    public static boolean m1405a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean m1406a(String str) {
        return str != null && str.length() > 4 && "file:".equalsIgnoreCase(str.substring(0, 5));
    }

    private static byte[] m1407a(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            if (i > 0 && byteArrayOutputStream.size() >= i) {
                break;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean m1408b(String str) {
        return str != null && str.length() > 0 && new File(str.replaceFirst("file://", "/")).exists();
    }

    public static String m1409c(String str) {
        return str != null ? str.lastIndexOf(File.separatorChar) == str.length() + -1 ? str : str + File.separator : File.separator;
    }
}
