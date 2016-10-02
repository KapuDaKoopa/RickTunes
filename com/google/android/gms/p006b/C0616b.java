package com.google.android.gms.p006b;

import android.support.v4.app.NotificationCompat;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.b.b */
public final class C0616b extends ByteArrayOutputStream {
    private final zd f2946a;

    public C0616b(zd zdVar, int i) {
        this.f2946a = zdVar;
        this.buf = this.f2946a.m5003a(Math.max(i, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private void m3496a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f2946a.m5003a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f2946a.m5002a(this.buf);
            this.buf = a;
        }
    }

    public final void close() {
        this.f2946a.m5002a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f2946a.m5002a(this.buf);
    }

    public final synchronized void write(int i) {
        m3496a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m3496a(i2);
        super.write(bArr, i, i2);
    }
}
