package com.google.android.gms.p006b;

import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.b.zf */
public final class zf implements aw {
    private final Map f4445a;
    private long f4446b;
    private final File f4447c;
    private final int f4448d;

    private zf(File file) {
        this.f4445a = new LinkedHashMap(16, 0.75f, true);
        this.f4446b = 0;
        this.f4447c = file;
        this.f4448d = 5242880;
    }

    public zf(File file, byte b) {
        this(file);
    }

    static int m5004a(InputStream inputStream) {
        return ((((zf.m5016e(inputStream) << 0) | 0) | (zf.m5016e(inputStream) << 8)) | (zf.m5016e(inputStream) << 16)) | (zf.m5016e(inputStream) << 24);
    }

    static void m5005a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void m5006a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void m5007a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        zf.m5006a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void m5008a(String str, zg zgVar) {
        if (this.f4445a.containsKey(str)) {
            zg zgVar2 = (zg) this.f4445a.get(str);
            this.f4446b = (zgVar.f4449a - zgVar2.f4449a) + this.f4446b;
        } else {
            this.f4446b += zgVar.f4449a;
        }
        this.f4445a.put(str, zgVar);
    }

    private static byte[] m5009a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    static long m5010b(InputStream inputStream) {
        return (((((((0 | ((((long) zf.m5016e(inputStream)) & 255) << null)) | ((((long) zf.m5016e(inputStream)) & 255) << 8)) | ((((long) zf.m5016e(inputStream)) & 255) << 16)) | ((((long) zf.m5016e(inputStream)) & 255) << 24)) | ((((long) zf.m5016e(inputStream)) & 255) << 32)) | ((((long) zf.m5016e(inputStream)) & 255) << 40)) | ((((long) zf.m5016e(inputStream)) & 255) << 48)) | ((((long) zf.m5016e(inputStream)) & 255) << 56);
    }

    private synchronized void m5011b(String str) {
        boolean delete = m5014d(str).delete();
        zg zgVar = (zg) this.f4445a.get(str);
        if (zgVar != null) {
            this.f4446b -= zgVar.f4449a;
            this.f4445a.remove(str);
        }
        if (!delete) {
            yh.m4916b("Could not delete cache entry for key=%s, filename=%s", str, zf.m5013c(str));
        }
    }

    static String m5012c(InputStream inputStream) {
        return new String(zf.m5009a(inputStream, (int) zf.m5010b(inputStream)), "UTF-8");
    }

    private static String m5013c(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private File m5014d(String str) {
        return new File(this.f4447c, zf.m5013c(str));
    }

    static Map m5015d(InputStream inputStream) {
        int a = zf.m5004a(inputStream);
        Map emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(zf.m5012c(inputStream).intern(), zf.m5012c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int m5016e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public final synchronized ax m5017a(String str) {
        ax axVar;
        zh zhVar;
        IOException e;
        zh zhVar2;
        Throwable th;
        zg zgVar = (zg) this.f4445a.get(str);
        if (zgVar == null) {
            axVar = null;
        } else {
            File d = m5014d(str);
            try {
                zhVar = new zh((byte) 0);
                try {
                    zg.m5020a((InputStream) zhVar);
                    byte[] a = zf.m5009a((InputStream) zhVar, (int) (d.length() - ((long) zhVar.f4457a)));
                    ax axVar2 = new ax();
                    axVar2.f2935a = a;
                    axVar2.f2936b = zgVar.f4451c;
                    axVar2.f2937c = zgVar.f4452d;
                    axVar2.f2938d = zgVar.f4453e;
                    axVar2.f2939e = zgVar.f4454f;
                    axVar2.f2940f = zgVar.f4455g;
                    axVar2.f2941g = zgVar.f4456h;
                    try {
                        zhVar.close();
                        axVar = axVar2;
                    } catch (IOException e2) {
                        axVar = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    zhVar2 = zhVar;
                    try {
                        yh.m4916b("%s: %s", d.getAbsolutePath(), e.toString());
                        m5011b(str);
                        if (zhVar2 != null) {
                            try {
                                zhVar2.close();
                            } catch (IOException e4) {
                                axVar = null;
                            }
                        }
                        axVar = null;
                        return axVar;
                    } catch (Throwable th2) {
                        th = th2;
                        zhVar = zhVar2;
                        if (zhVar != null) {
                            try {
                                zhVar.close();
                            } catch (IOException e5) {
                                axVar = null;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (zhVar != null) {
                        zhVar.close();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                zhVar2 = null;
                yh.m4916b("%s: %s", d.getAbsolutePath(), e.toString());
                m5011b(str);
                if (zhVar2 != null) {
                    zhVar2.close();
                }
                axVar = null;
                return axVar;
            } catch (Throwable th4) {
                th = th4;
                zhVar = null;
                if (zhVar != null) {
                    zhVar.close();
                }
                throw th;
            }
        }
        return axVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m5018a() {
        /*
        r9 = this;
        r0 = 0;
        monitor-enter(r9);
        r1 = r9.f4447c;	 Catch:{ all -> 0x006a }
        r1 = r1.exists();	 Catch:{ all -> 0x006a }
        if (r1 != 0) goto L_0x0025;
    L_0x000a:
        r0 = r9.f4447c;	 Catch:{ all -> 0x006a }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x0023;
    L_0x0012:
        r0 = "Unable to create cache dir %s";
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x006a }
        r2 = 0;
        r3 = r9.f4447c;	 Catch:{ all -> 0x006a }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x006a }
        r1[r2] = r3;	 Catch:{ all -> 0x006a }
        com.google.android.gms.p006b.yh.m4917c(r0, r1);	 Catch:{ all -> 0x006a }
    L_0x0023:
        monitor-exit(r9);
        return;
    L_0x0025:
        r1 = r9.f4447c;	 Catch:{ all -> 0x006a }
        r3 = r1.listFiles();	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0023;
    L_0x002d:
        r4 = r3.length;	 Catch:{ all -> 0x006a }
        r2 = r0;
    L_0x002f:
        if (r2 >= r4) goto L_0x0023;
    L_0x0031:
        r5 = r3[r2];	 Catch:{ all -> 0x006a }
        r1 = 0;
        r0 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0054, all -> 0x0063 }
        r6 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0054, all -> 0x0063 }
        r6.<init>(r5);	 Catch:{ IOException -> 0x0054, all -> 0x0063 }
        r0.<init>(r6);	 Catch:{ IOException -> 0x0054, all -> 0x0063 }
        r1 = com.google.android.gms.p006b.zg.m5020a(r0);	 Catch:{ IOException -> 0x0076 }
        r6 = r5.length();	 Catch:{ IOException -> 0x0076 }
        r1.f4449a = r6;	 Catch:{ IOException -> 0x0076 }
        r6 = r1.f4450b;	 Catch:{ IOException -> 0x0076 }
        r9.m5008a(r6, r1);	 Catch:{ IOException -> 0x0076 }
        r0.close();	 Catch:{ IOException -> 0x006d }
    L_0x0050:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x002f;
    L_0x0054:
        r0 = move-exception;
        r0 = r1;
    L_0x0056:
        if (r5 == 0) goto L_0x005b;
    L_0x0058:
        r5.delete();	 Catch:{ all -> 0x0071 }
    L_0x005b:
        if (r0 == 0) goto L_0x0050;
    L_0x005d:
        r0.close();	 Catch:{ IOException -> 0x0061 }
        goto L_0x0050;
    L_0x0061:
        r0 = move-exception;
        goto L_0x0050;
    L_0x0063:
        r0 = move-exception;
    L_0x0064:
        if (r1 == 0) goto L_0x0069;
    L_0x0066:
        r1.close();	 Catch:{ IOException -> 0x006f }
    L_0x0069:
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x006d:
        r0 = move-exception;
        goto L_0x0050;
    L_0x006f:
        r1 = move-exception;
        goto L_0x0069;
    L_0x0071:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0064;
    L_0x0076:
        r1 = move-exception;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.zf.a():void");
    }

    public final synchronized void m5019a(String str, ax axVar) {
        int i = 0;
        synchronized (this) {
            int length = axVar.f2935a.length;
            if (this.f4446b + ((long) length) >= ((long) this.f4448d)) {
                int i2;
                if (yh.f4366b) {
                    yh.m4915a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f4446b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.f4445a.entrySet().iterator();
                while (it.hasNext()) {
                    zg zgVar = (zg) ((Entry) it.next()).getValue();
                    if (m5014d(zgVar.f4450b).delete()) {
                        this.f4446b -= zgVar.f4449a;
                    } else {
                        yh.m4916b("Could not delete cache entry for key=%s, filename=%s", zgVar.f4450b, zf.m5013c(zgVar.f4450b));
                    }
                    it.remove();
                    i2 = i + 1;
                    if (((float) (this.f4446b + ((long) length))) < ((float) this.f4448d) * 0.9f) {
                        break;
                    }
                    i = i2;
                }
                i2 = i;
                if (yh.f4366b) {
                    yh.m4915a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f4446b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d = m5014d(str);
            try {
                OutputStream fileOutputStream = new FileOutputStream(d);
                zg zgVar2 = new zg(str, axVar);
                if (zgVar2.m5021a(fileOutputStream)) {
                    fileOutputStream.write(axVar.f2935a);
                    fileOutputStream.close();
                    m5008a(str, zgVar2);
                } else {
                    fileOutputStream.close();
                    yh.m4916b("Failed to write header for %s", d.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException e) {
                if (!d.delete()) {
                    yh.m4916b("Could not clean up file %s", d.getAbsolutePath());
                }
            }
        }
    }
}
