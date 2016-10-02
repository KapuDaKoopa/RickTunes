package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.xo */
public final class xo {
    public static String m4901a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = i + 3;
        for (int i3 = 3; i3 < i2; i3++) {
            String str;
            if (i3 + 4 >= stackTrace.length) {
                str = "<bottom of call stack>";
            } else {
                StackTraceElement stackTraceElement = stackTrace[i3 + 4];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            }
            stringBuffer.append(str).append(" ");
        }
        return stringBuffer.toString();
    }
}
