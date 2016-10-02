package com.google.android.gms.p006b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.p004a.p005a.C0227b;
import com.google.ads.p004a.p005a.C0229d;
import com.google.ads.p004a.p005a.C0230e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.clearcut.C0646b;
import com.google.android.gms.clearcut.C0648d;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0690j;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.b.v */
public abstract class C0636v extends C0635u {
    private static Method f4240A;
    private static Method f4241B;
    private static Method f4242C;
    private static Method f4243D;
    private static Method f4244E;
    private static String f4245F;
    private static String f4246G;
    private static String f4247H;
    private static long f4248I;
    private static ad f4249J;
    private static Random f4250K;
    private static C0697i f4251L;
    private static boolean f4252M;
    static boolean f4253j;
    protected static C0646b f4254k;
    protected static C0227b f4255l;
    protected static int f4256m;
    protected static boolean f4257n;
    protected static boolean f4258o;
    protected static boolean f4259p;
    protected static boolean f4260q;
    static boolean f4261r;
    private static Method f4262s;
    private static Method f4263t;
    private static Method f4264u;
    private static Method f4265v;
    private static Method f4266w;
    private static Method f4267x;
    private static Method f4268y;
    private static Method f4269z;

    static {
        f4248I = 0;
        f4253j = false;
        f4254k = null;
        f4250K = new Random();
        f4251L = C0697i.m5318b();
        f4257n = false;
        f4258o = false;
        f4259p = false;
        f4260q = false;
        f4261r = false;
    }

    protected C0636v(Context context, ac acVar) {
        super(context, acVar);
        C0227b c0227b = new C0227b();
        f4255l = c0227b;
        c0227b.f1241a = context.getPackageName();
    }

    private static String m4768a(Context context, ac acVar) {
        if (f4246G != null) {
            return f4246G;
        }
        if (f4265v == null) {
            throw new C0639w();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f4265v.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C0639w();
            }
            String a = acVar.m3420a(byteBuffer.array());
            f4246G = a;
            return a;
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static String m4769a(byte[] bArr, String str) {
        try {
            return new String(f4249J.m3423a(bArr, str), "UTF-8");
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static ArrayList m4770a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (f4266w == null || motionEvent == null) {
            throw new C0639w();
        }
        try {
            return (ArrayList) f4266w.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static void m4771a() {
        if (f4252M) {
            i.m5096e();
            f4260q = true;
            return;
        }
        f4260q = false;
    }

    protected static void m4772a(int i, int i2) {
        if (f4260q && f4257n && f4254k != null) {
            C0648d a = f4254k.m5048a(ys.m1656a(f4255l));
            a.f4495i.f4417g = i2;
            a.f4495i.f4416f = i;
            C0660i c0660i = i;
            if (a.f4496j) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            a.f4496j = true;
            PlayLoggerContext playLoggerContext = new PlayLoggerContext(a.f4497k.f4475f, a.f4497k.f4476g, a.f4487a, a.f4488b, a.f4489c, a.f4490d, a.f4497k.f4481l, a.f4491e);
            a.f4497k.f4483n.m4812a(c0660i, new LogEventParcelable(r0, a.f4495i, a.f4492f, a.f4493g, C0646b.m5035a(a.f4494h)));
        }
    }

    protected static synchronized void m4773a(String str, Context context, ac acVar) {
        File file;
        File createTempFile;
        synchronized (C0636v.class) {
            if (!f4253j) {
                try {
                    f4249J = new ad(acVar);
                    f4245F = str;
                    ck.m3582a(context);
                    byte[] a = f4249J.m3422a("QpmJ8ul06jlIzFufLfsNAWUj2KYEV5t//bwTAlu38Ok=");
                    byte[] a2 = f4249J.m3423a(a, "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");
                    File cacheDir = context.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = context.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new C0639w();
                        }
                    }
                    file = cacheDir;
                    createTempFile = File.createTempFile("ads", ".jar", file);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(a2, 0, a2.length);
                    fileOutputStream.close();
                    DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
                    Class loadClass = dexClassLoader.loadClass(C0636v.m4769a(a, "ktoRfyOnoO1UjQHnCkq5ItOpW0axUMvWdzcIwj3wwW8FnVC5hIfYkGwiRuPCBnq+"));
                    Class loadClass2 = dexClassLoader.loadClass(C0636v.m4769a(a, "fldV/m3DQfpMh/XkZ7PVfMZ1Iutm0Sb00WK0tHDOxXFMfcZbQOL2m0r0fDApX5hJ"));
                    Class loadClass3 = dexClassLoader.loadClass(C0636v.m4769a(a, "AnychZgAlAV3ZnoBMQDVpC6izMmt//ud3tAm+424uqHZW1kXBktDF/bNPbEluVc2"));
                    Class loadClass4 = dexClassLoader.loadClass(C0636v.m4769a(a, "xyhWlbKd4eml6t9rWW06yNUX/WDUiR9lDSnnTkgs0Onza9u+AmnRSHiWjaxem75t"));
                    Class loadClass5 = dexClassLoader.loadClass(C0636v.m4769a(a, "3B4Vnl+si70eVtw8Yh4NrGqS9wt0YpDAszneZxSqGA2rTwpBsAsSSIREAUQ/Wo88"));
                    Class loadClass6 = dexClassLoader.loadClass(C0636v.m4769a(a, "uFM0Pj3pF9PB2W4sjJ5pZPW0vpeZKX7f/64YRqVSQnPbpfUlMgWVSzS9A8A+tOln"));
                    Class loadClass7 = dexClassLoader.loadClass(C0636v.m4769a(a, "sPuW9cMnn4JlIZD4TqWMl/JyLcHN+NFurYlkNBHpZVAtFN0iAg/JhJBrmGb1Jtrg"));
                    Class loadClass8 = dexClassLoader.loadClass(C0636v.m4769a(a, "mfwyvVeKxdPX9C426cCXKd4wY2r5nKaQvgXSHmtl6i2aEsRkLJPrqO7iLT2zhg3E"));
                    Class loadClass9 = dexClassLoader.loadClass(C0636v.m4769a(a, "S0ZpAOXKyCOaWv/C/SQBoSWBExXS85UZD30OL9MtDGYat+7f0tVlx+qnzAUjU0Mc"));
                    Class loadClass10 = dexClassLoader.loadClass(C0636v.m4769a(a, "s6v+PY0ZikfZAYTGqdgLv/fCC78CCoTMx3IgbrK5VjOd/IM870cjIhMi6ywBt/Ex"));
                    Class loadClass11 = dexClassLoader.loadClass(C0636v.m4769a(a, "0qxcGqM5j6H5VOXc28Imq02o2iDJzF2LijchZVuusipECWbqfD8CuWSaIowIXsVI"));
                    Class loadClass12 = dexClassLoader.loadClass(C0636v.m4769a(a, "UzpkIFaKlCK/h8SXOo2gfa/ztYrHak8wxSh5CpQd6kbQs9gux5X9YzMoDgEL2XFf"));
                    Class loadClass13 = dexClassLoader.loadClass(C0636v.m4769a(a, "lBQTAevFxL0g4LRFE0rzygMrR55uFvDnYIr03bk3OId6IUe+7Y+YCl7ZDqgAg07r"));
                    f4262s = loadClass.getMethod(C0636v.m4769a(a, "x0OfR5IV8zz69jHJ9xL6+rYD8ZC7iCVcOkmyTcXwlvA="), new Class[0]);
                    f4263t = loadClass2.getMethod(C0636v.m4769a(a, "aNbgaX4rGQMJKZuJWNXRB905G3VXk50cEAIyh+PvJ8I="), new Class[0]);
                    f4264u = loadClass3.getMethod(C0636v.m4769a(a, "tc4Pde/lkQgDrTKedhx5fJmUv0W5ZQHDNlsZr58jcyM="), new Class[0]);
                    f4265v = loadClass4.getMethod(C0636v.m4769a(a, "N2YLWIZQ9us2p6FbUxfCCCAU5dmy2Ts8R/ITtOS31Cc="), new Class[]{Context.class});
                    f4266w = loadClass5.getMethod(C0636v.m4769a(a, "xta28cbCC3cezF9rc2qtbxb1TQhRGnVV+QH7K1smgKs="), new Class[]{MotionEvent.class, DisplayMetrics.class});
                    f4267x = loadClass6.getMethod(C0636v.m4769a(a, "KVd1ylZso5GeST61zmSViFEqHWi14677jnGlH97RdF0="), new Class[]{Context.class});
                    f4268y = loadClass7.getMethod(C0636v.m4769a(a, "hieBZwy+ShTIe5lnOXJXLck19dWk3BEnvR2qIYS0QQM="), new Class[]{Context.class});
                    f4269z = loadClass8.getMethod(C0636v.m4769a(a, "8kUv9Ndq/cmP4fvhC6sGvBDyc1sVCtgRvK+Cu/HBvEs="), new Class[]{Context.class});
                    f4240A = loadClass9.getMethod(C0636v.m4769a(a, "mOjS6vC7MErnWROP+O8P/FO9yz6dJPRGU55DXT5YRX8="), new Class[]{Context.class});
                    f4241B = loadClass10.getMethod(C0636v.m4769a(a, "7tgI1hxrieM4ngm4d159Lws8lSVBcs9EpFE6INIca14="), new Class[]{Context.class});
                    f4242C = loadClass11.getMethod(C0636v.m4769a(a, "Vmrsh5SFoeaS2GstmMOODOh2nyuwwLJN2arMT14YfKg="), new Class[]{Context.class});
                    f4243D = loadClass12.getMethod(C0636v.m4769a(a, "+ZR3123cdcCzDnr/T2xLFkOfXgPtaoiKSrRS+ZTmmP0="), new Class[]{Context.class});
                    f4244E = loadClass13.getMethod(C0636v.m4769a(a, "l5ERTDCOtpVYFE0n0hL/SF7lk6MeC04bJCo0Yzm/XWY="), new Class[]{Context.class});
                    String name = createTempFile.getName();
                    createTempFile.delete();
                    new File(file, name.replace(".jar", ".dex")).delete();
                    f4248I = C0636v.m4777d().longValue();
                    f4250K = new Random();
                    try {
                        i = new C0690j(context).m5309a(C0646b.f4472c).m5312b();
                        C0697i b = C0697i.m5318b();
                        f4251L = b;
                        f4252M = b.m5321a(context) == 0;
                        ck.m3582a(context);
                        f4257n = ((Boolean) ar.m2249n().m3580a(ck.az)).booleanValue();
                        f4254k = new C0646b(context, "ADSHIELD");
                    } catch (NoClassDefFoundError e) {
                    }
                    f4261r = f4251L.m5325b(context) > 0;
                    f4253j = true;
                } catch (Throwable e2) {
                    throw new C0639w(e2);
                } catch (Throwable e22) {
                    throw new C0639w(e22);
                } catch (Throwable e222) {
                    throw new C0639w(e222);
                } catch (Throwable e2222) {
                    throw new C0639w(e2222);
                } catch (Throwable e22222) {
                    throw new C0639w(e22222);
                } catch (Throwable e222222) {
                    throw new C0639w(e222222);
                } catch (C0639w e3) {
                } catch (UnsupportedOperationException e4) {
                } catch (Throwable th) {
                    String name2 = createTempFile.getName();
                    createTempFile.delete();
                    new File(file, name2.replace(".jar", ".dex")).delete();
                }
            }
        }
    }

    private static String m4774b(Context context, ac acVar) {
        if (f4247H != null) {
            return f4247H;
        }
        if (f4268y == null) {
            throw new C0639w();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f4268y.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C0639w();
            }
            String a = acVar.m3420a(byteBuffer.array());
            f4247H = a;
            return a;
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static void m4775b() {
        if (f4260q && f4254k != null) {
            C0646b c0646b = f4254k;
            C0660i c0660i = i;
            c0646b.m5049a(TimeUnit.MILLISECONDS);
            i.m5098g();
        }
    }

    private static String m4776c() {
        if (f4245F != null) {
            return f4245F;
        }
        throw new C0639w();
    }

    private static Long m4777d() {
        if (f4262s == null) {
            throw new C0639w();
        }
        try {
            return (Long) f4262s.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    static String m4778d(Context context) {
        if (f4267x == null) {
            throw new C0639w();
        }
        try {
            String str = (String) f4267x.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new C0639w();
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static String m4779e() {
        if (f4264u == null) {
            throw new C0639w();
        }
        try {
            return (String) f4264u.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static String m4780e(Context context) {
        if (f4241B == null) {
            throw new C0639w();
        }
        try {
            return (String) f4241B.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static Long m4781f() {
        if (f4263t == null) {
            throw new C0639w();
        }
        try {
            return (Long) f4263t.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static Long m4782f(Context context) {
        if (f4242C == null) {
            throw new C0639w();
        }
        try {
            return (Long) f4242C.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static ArrayList m4783g(Context context) {
        if (f4269z == null) {
            throw new C0639w();
        }
        try {
            ArrayList arrayList = (ArrayList) f4269z.invoke(null, new Object[]{context});
            if (arrayList != null && arrayList.size() == 2) {
                return arrayList;
            }
            throw new C0639w();
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static int[] m4784h(Context context) {
        if (f4240A == null) {
            throw new C0639w();
        }
        try {
            return (int[]) f4240A.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static int m4785i(Context context) {
        if (f4243D == null) {
            throw new C0639w();
        }
        try {
            return ((Integer) f4243D.invoke(null, new Object[]{context})).intValue();
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    private static int m4786j(Context context) {
        if (f4244E == null) {
            throw new C0639w();
        }
        try {
            return ((Integer) f4244E.invoke(null, new Object[]{context})).intValue();
        } catch (Throwable e) {
            throw new C0639w(e);
        } catch (Throwable e2) {
            throw new C0639w(e2);
        }
    }

    protected C0229d m4787b(Context context) {
        C0229d c0229d = new C0229d();
        try {
            C0636v.m4771a();
            f4256m = f4250K.nextInt();
            C0636v.m4772a(0, f4256m);
            try {
                c0229d.f1260a = C0636v.m4779e();
                C0636v.m4772a(1, f4256m);
            } catch (C0639w e) {
            }
            try {
                c0229d.f1261b = C0636v.m4776c();
                C0636v.m4772a(2, f4256m);
            } catch (C0639w e2) {
            }
            try {
                long longValue = C0636v.m4777d().longValue();
                c0229d.f1258Q = Long.valueOf(longValue);
                if (f4248I != 0) {
                    c0229d.f1276q = Long.valueOf(longValue - f4248I);
                    c0229d.f1281v = Long.valueOf(f4248I);
                }
                C0636v.m4772a(25, f4256m);
            } catch (C0639w e3) {
            }
            try {
                ArrayList g = C0636v.m4783g(context);
                c0229d.f1284y = Long.valueOf(((Long) g.get(0)).longValue());
                c0229d.f1285z = Long.valueOf(((Long) g.get(1)).longValue());
                C0636v.m4772a(31, f4256m);
            } catch (C0639w e4) {
            }
            try {
                c0229d.f1242A = C0636v.m4781f();
                C0636v.m4772a(33, f4256m);
            } catch (C0639w e5) {
            }
            try {
                if (!(f4258o && f4259p)) {
                    c0229d.f1282w = C0636v.m4768a(context, this.h);
                    C0636v.m4772a(27, f4256m);
                }
            } catch (C0639w e6) {
            }
            try {
                c0229d.f1283x = C0636v.m4774b(context, this.h);
                C0636v.m4772a(29, f4256m);
            } catch (C0639w e7) {
            }
            try {
                int[] h = C0636v.m4784h(context);
                c0229d.f1264e = Long.valueOf((long) h[0]);
                c0229d.f1265f = Long.valueOf((long) h[1]);
                C0636v.m4772a(5, f4256m);
            } catch (C0639w e8) {
            }
            try {
                c0229d.f1271l = Long.valueOf((long) C0636v.m4785i(context));
                C0636v.m4772a(12, f4256m);
            } catch (C0639w e9) {
            }
            try {
                c0229d.f1262c = Long.valueOf((long) C0636v.m4786j(context));
                C0636v.m4772a(3, f4256m);
            } catch (C0639w e10) {
            }
            try {
                c0229d.f1243B = C0636v.m4780e(context);
                C0636v.m4772a(34, f4256m);
            } catch (C0639w e11) {
            }
            try {
                c0229d.f1244C = C0636v.m4782f(context);
                C0636v.m4772a(35, f4256m);
            } catch (C0639w e12) {
            }
            C0636v.m4775b();
        } catch (IOException e13) {
        }
        return c0229d;
    }

    protected final C0229d m4788c(Context context) {
        C0229d c0229d = new C0229d();
        C0636v.m4771a();
        f4256m = f4250K.nextInt();
        try {
            c0229d.f1261b = C0636v.m4776c();
        } catch (C0639w e) {
        }
        try {
            c0229d.f1260a = C0636v.m4779e();
        } catch (C0639w e2) {
        }
        try {
            c0229d.f1258Q = C0636v.m4777d();
        } catch (C0639w e3) {
        }
        C0636v.m4772a(0, f4256m);
        try {
            ArrayList a = C0636v.m4770a(this.a, this.g);
            c0229d.f1273n = (Long) a.get(0);
            c0229d.f1274o = (Long) a.get(1);
            if (((Long) a.get(2)).longValue() >= 0) {
                c0229d.f1275p = (Long) a.get(2);
            }
            c0229d.f1245D = (Long) a.get(3);
            c0229d.f1246E = (Long) a.get(4);
            C0636v.m4772a(14, f4256m);
        } catch (C0639w e4) {
        }
        try {
            if (this.c > 0) {
                c0229d.f1250I = Long.valueOf(this.c);
            }
            if (this.d > 0) {
                c0229d.f1249H = Long.valueOf(this.d);
            }
            if (this.e > 0) {
                c0229d.f1248G = Long.valueOf(this.e);
            }
            if (this.f > 0) {
                c0229d.f1251J = Long.valueOf(this.f);
            }
            try {
                int size = this.b.size() - 1;
                if (size > 0) {
                    c0229d.f1252K = new C0230e[size];
                    for (int i = 0; i < size; i++) {
                        ArrayList a2 = C0636v.m4770a((MotionEvent) this.b.get(i), this.g);
                        C0230e c0230e = new C0230e();
                        c0230e.f1287a = (Long) a2.get(0);
                        c0230e.f1288b = (Long) a2.get(1);
                        c0229d.f1252K[i] = c0230e;
                    }
                }
            } catch (C0639w e5) {
                c0229d.f1252K = null;
            }
            try {
                c0229d.f1243B = C0636v.m4780e(context);
            } catch (C0639w e6) {
            }
            try {
                c0229d.f1244C = C0636v.m4782f(context);
            } catch (C0639w e7) {
            }
            C0636v.m4775b();
        } catch (IOException e8) {
        }
        return c0229d;
    }
}
