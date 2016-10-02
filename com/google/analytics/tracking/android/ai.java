package com.google.analytics.tracking.android;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

final class ai extends Thread implements C0289h {
    private static ai f1510g;
    private final LinkedBlockingQueue f1511a;
    private volatile boolean f1512b;
    private volatile boolean f1513c;
    private volatile List f1514d;
    private volatile String f1515e;
    private volatile String f1516f;
    private volatile bf f1517h;
    private final Context f1518i;

    private ai(Context context) {
        super("GAThread");
        this.f1511a = new LinkedBlockingQueue();
        this.f1512b = false;
        this.f1513c = false;
        if (context != null) {
            this.f1518i = context.getApplicationContext();
        } else {
            this.f1518i = context;
        }
        start();
    }

    static ai m1791a(Context context) {
        if (f1510g == null) {
            f1510g = new ai(context);
        }
        return f1510g;
    }

    private static String m1793a(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    private void m1794a(Runnable runnable) {
        this.f1511a.add(runnable);
    }

    private static String m1796b(Context context) {
        try {
            FileInputStream openFileInput = context.openFileInput("gaInstallData");
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            int read = openFileInput.read(bArr, 0, FragmentTransaction.TRANSIT_EXIT_MASK);
            if (openFileInput.available() > 0) {
                as.m1827a("Too much campaign data, ignoring it.");
                openFileInput.close();
                context.deleteFile("gaInstallData");
                return null;
            }
            openFileInput.close();
            context.deleteFile("gaInstallData");
            if (read <= 0) {
                as.m1832d("Campaign file is empty.");
                return null;
            }
            String str = new String(bArr, 0, read);
            as.m1830b("Campaign found: " + str);
            return str;
        } catch (FileNotFoundException e) {
            as.m1830b("No campaign data found.");
            return null;
        } catch (IOException e2) {
            as.m1827a("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
    }

    static /* synthetic */ boolean m1797b(Map map) {
        if (map.get("&sf") != null) {
            double b = bk.m1914b((String) map.get("&sf"));
            if (b < 100.0d) {
                int i;
                String str = (String) map.get("&cid");
                if (TextUtils.isEmpty(str)) {
                    i = 1;
                } else {
                    int i2 = 0;
                    for (int length = str.length() - 1; length >= 0; length--) {
                        char charAt = str.charAt(length);
                        i2 = (((i2 << 6) & 268435455) + charAt) + (charAt << 14);
                        int i3 = 266338304 & i2;
                        if (i3 != 0) {
                            i2 ^= i3 >> 21;
                        }
                    }
                    i = i2;
                }
                if (((double) (i % 10000)) >= b * 100.0d) {
                    str = map.get("&t") == null ? "unknown" : (String) map.get("&t");
                    as.m1831c(String.format("%s hit sampled out", new Object[]{str}));
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ void m1799c(Map map) {
        C0292n a = C0299i.m1921a();
        bk.m1913a(map, "&an", a.m1882a("&an"));
        bk.m1913a(map, "&av", a.m1882a("&av"));
        bk.m1913a(map, "&aid", a.m1882a("&aid"));
        bk.m1913a(map, "&aiid", a.m1882a("&aiid"));
        map.put("&v", "1");
    }

    static /* synthetic */ String m1801d(Map map) {
        return (!map.containsKey("useSecure") || bk.m1915c((String) map.get("useSecure"))) ? "https:" : "http:";
    }

    public final void m1804a() {
        m1794a(new ak(this));
    }

    public final void m1805a(Map map) {
        Map hashMap = new HashMap(map);
        String str = (String) map.get("&ht");
        if (str != null) {
            try {
                Long.valueOf(str).longValue();
            } catch (NumberFormatException e) {
                str = null;
            }
        }
        if (str == null) {
            hashMap.put("&ht", Long.toString(System.currentTimeMillis()));
        }
        m1794a(new aj(this, hashMap));
    }

    public final void m1806b() {
        m1794a(new al(this));
    }

    public final void m1807c() {
        m1794a(new am(this));
    }

    public final LinkedBlockingQueue m1808d() {
        return this.f1511a;
    }

    public final Thread m1809e() {
        return this;
    }

    public final void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            as.m1832d("sleep interrupted in GAThread initialize");
        }
        try {
            if (this.f1517h == null) {
                this.f1517h = new C0312z(this.f1518i, this);
            }
            this.f1517h.m1895f();
            this.f1514d = new ArrayList();
            this.f1514d.add(new Command("appendVersion", "&_v".substring(1), "ma3.0.2"));
            this.f1514d.add(new Command("appendQueueTime", "&qt".substring(1), null));
            this.f1514d.add(new Command("appendCacheBuster", "&z".substring(1), null));
            this.f1516f = C0300j.m1924a().m1931a("&cid");
            this.f1515e = m1796b(this.f1518i);
        } catch (Throwable th) {
            as.m1827a("Error initializing the GAThread: " + m1793a(th));
            as.m1827a("Google Analytics will not start up.");
            this.f1512b = true;
        }
        while (!this.f1513c) {
            try {
                Runnable runnable = (Runnable) this.f1511a.take();
                if (!this.f1512b) {
                    runnable.run();
                }
            } catch (InterruptedException e2) {
                as.m1830b(e2.toString());
            } catch (Throwable th2) {
                as.m1827a("Error on GAThread: " + m1793a(th2));
                as.m1827a("Google Analytics is shutting down.");
                this.f1512b = true;
            }
        }
    }
}
