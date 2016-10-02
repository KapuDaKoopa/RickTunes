package com.andromo.dev576782.app537736;

public final class fi {
    static final long[] f902a;
    static final String[] f903b;

    static {
        f902a = new long[]{1099511627776L, 1073741824, 1048576, 1024, 1};
        f903b = new String[]{"TB", "GB", "MB", "KB", "bytes"};
    }

    public static String m1436a(int i) {
        int i2 = i / 1000;
        if (i2 >= 3600) {
            return String.format("%d:%02d:%02d", new Object[]{Integer.valueOf(i2 / 3600), Integer.valueOf((i2 % 3600) / 60), Integer.valueOf(i2 % 60)});
        } else if (i2 <= 0) {
            return "0:00";
        } else {
            return String.format("%d:%02d", new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)});
        }
    }
}
