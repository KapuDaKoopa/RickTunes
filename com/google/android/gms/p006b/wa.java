package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.wa */
public abstract class wa {
    static we f4303a;
    private static final Object f4304d;
    private static int f4305e;
    private static String f4306f;
    protected final String f4307b;
    protected final Object f4308c;
    private Object f4309g;

    static {
        f4304d = new Object();
        f4303a = null;
        f4305e = 0;
        f4306f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }

    protected wa(String str, Object obj) {
        this.f4309g = null;
        this.f4307b = str;
        this.f4308c = obj;
    }

    public static int m4841a() {
        return f4305e;
    }

    public static wa m4842a(String str, Integer num) {
        return new wc(str, num);
    }

    public static wa m4843a(String str, Long l) {
        return new wb(str, l);
    }

    public static wa m4844a(String str, String str2) {
        return new wd(str, str2);
    }

    public static boolean m4845b() {
        return f4303a != null;
    }

    protected abstract Object m4846c();

    public final Object m4847d() {
        if (this.f4309g != null) {
            return this.f4309g;
        }
        String str = this.f4307b;
        return m4846c();
    }
}
