package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.xk;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.ads.internal.request.b */
final class C0450b implements Runnable {
    final /* synthetic */ OutputStream f2443a;
    final /* synthetic */ byte[] f2444b;
    final /* synthetic */ LargeParcelTeleporter f2445c;

    C0450b(LargeParcelTeleporter largeParcelTeleporter, OutputStream outputStream, byte[] bArr) {
        this.f2445c = largeParcelTeleporter;
        this.f2443a = outputStream;
        this.f2444b = bArr;
    }

    public final void run() {
        Closeable dataOutputStream;
        Throwable e;
        try {
            dataOutputStream = new DataOutputStream(this.f2443a);
            try {
                dataOutputStream.writeInt(this.f2444b.length);
                dataOutputStream.write(this.f2444b);
                xk.m4897a(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    C0501b.m3027a(6);
                    ar.m2243h().m4367a(e, true);
                    if (dataOutputStream != null) {
                        xk.m4897a(dataOutputStream);
                    } else {
                        xk.m4897a(this.f2443a);
                    }
                } catch (Throwable th) {
                    e = th;
                    if (dataOutputStream != null) {
                        xk.m4897a(dataOutputStream);
                    } else {
                        xk.m4897a(this.f2443a);
                    }
                    throw e;
                }
            }
        } catch (IOException e3) {
            e = e3;
            dataOutputStream = null;
            C0501b.m3027a(6);
            ar.m2243h().m4367a(e, true);
            if (dataOutputStream != null) {
                xk.m4897a(this.f2443a);
            } else {
                xk.m4897a(dataOutputStream);
            }
        } catch (Throwable th2) {
            e = th2;
            dataOutputStream = null;
            if (dataOutputStream != null) {
                xk.m4897a(this.f2443a);
            } else {
                xk.m4897a(dataOutputStream);
            }
            throw e;
        }
    }
}
