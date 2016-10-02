package com.google.analytics.tracking.android;

public final class as {
    private static ap f1592a;

    public static void m1827a(String str) {
        at b = m1829b();
        if (b != null) {
            b.m1838d(str);
        }
    }

    public static boolean m1828a() {
        return m1829b() != null ? au.VERBOSE.equals(m1829b().m1833a()) : false;
    }

    private static at m1829b() {
        if (f1592a == null) {
            f1592a = ap.m1816a();
        }
        return f1592a != null ? f1592a.m1825d() : null;
    }

    public static void m1830b(String str) {
        at b = m1829b();
        if (b != null) {
            b.m1836b(str);
        }
    }

    public static void m1831c(String str) {
        at b = m1829b();
        if (b != null) {
            b.m1835a(str);
        }
    }

    public static void m1832d(String str) {
        at b = m1829b();
        if (b != null) {
            b.m1837c(str);
        }
    }
}
