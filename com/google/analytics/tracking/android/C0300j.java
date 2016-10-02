package com.google.analytics.tracking.android;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.google.analytics.tracking.android.j */
final class C0300j implements C0292n {
    private static C0300j f1647a;
    private static final Object f1648b;
    private final Context f1649c;
    private String f1650d;
    private boolean f1651e;
    private final Object f1652f;

    static {
        f1648b = new Object();
    }

    private C0300j(Context context) {
        this.f1651e = false;
        this.f1652f = new Object();
        this.f1649c = context;
        new C0301k(this, "client_id_fetcher").start();
    }

    public static C0300j m1924a() {
        C0300j c0300j;
        synchronized (f1648b) {
            c0300j = f1647a;
        }
        return c0300j;
    }

    public static void m1927a(Context context) {
        synchronized (f1648b) {
            if (f1647a == null) {
                f1647a = new C0300j(context);
            }
        }
    }

    private boolean m1929b(String str) {
        try {
            as.m1831c("Storing clientId.");
            FileOutputStream openFileOutput = this.f1649c.openFileOutput("gaClientId", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
            return true;
        } catch (FileNotFoundException e) {
            as.m1827a("Error creating clientId file.");
            return false;
        } catch (IOException e2) {
            as.m1827a("Error writing to clientId file.");
            return false;
        }
    }

    private String m1930c() {
        if (!this.f1651e) {
            synchronized (this.f1652f) {
                if (!this.f1651e) {
                    as.m1831c("Waiting for clientId to load");
                    do {
                        try {
                            this.f1652f.wait();
                        } catch (InterruptedException e) {
                            as.m1827a("Exception while waiting for clientId: " + e);
                        }
                    } while (!this.f1651e);
                }
            }
        }
        as.m1831c("Loaded clientId");
        return this.f1650d;
    }

    public final String m1931a(String str) {
        return "&cid".equals(str) ? m1930c() : null;
    }

    final String m1932b() {
        String str = null;
        try {
            FileInputStream openFileInput = this.f1649c.openFileInput("gaClientId");
            byte[] bArr = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
            int read = openFileInput.read(bArr, 0, NotificationCompat.FLAG_HIGH_PRIORITY);
            if (openFileInput.available() > 0) {
                as.m1827a("clientId file seems corrupted, deleting it.");
                openFileInput.close();
                this.f1649c.deleteFile("gaClientId");
            } else if (read <= 0) {
                as.m1827a("clientId file seems empty, deleting it.");
                openFileInput.close();
                this.f1649c.deleteFile("gaClientId");
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    str = str2;
                } catch (FileNotFoundException e) {
                    str = str2;
                } catch (IOException e2) {
                    str = str2;
                    as.m1827a("Error reading clientId file, deleting it.");
                    this.f1649c.deleteFile("gaClientId");
                }
            }
        } catch (FileNotFoundException e3) {
        } catch (IOException e4) {
            as.m1827a("Error reading clientId file, deleting it.");
            this.f1649c.deleteFile("gaClientId");
        }
        if (str != null) {
            return str;
        }
        str = UUID.randomUUID().toString().toLowerCase();
        return !m1929b(str) ? "0" : str;
    }
}
