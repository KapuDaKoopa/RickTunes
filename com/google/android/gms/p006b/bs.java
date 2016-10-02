package com.google.android.gms.p006b;

import android.support.v4.app.FragmentTransaction;
import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.b.bs */
final class bs {
    ByteArrayOutputStream f3003a;
    Base64OutputStream f3004b;

    public bs() {
        this.f3003a = new ByteArrayOutputStream(FragmentTransaction.TRANSIT_ENTER_MASK);
        this.f3004b = new Base64OutputStream(this.f3003a, 10);
    }

    public final void m3527a(byte[] bArr) {
        this.f3004b.write(bArr);
    }

    public final String toString() {
        String byteArrayOutputStream;
        try {
            this.f3004b.close();
        } catch (IOException e) {
            C0501b.m3027a(6);
        }
        try {
            this.f3003a.close();
            byteArrayOutputStream = this.f3003a.toString();
        } catch (IOException e2) {
            C0501b.m3027a(6);
            byteArrayOutputStream = "";
        } finally {
            this.f3003a = null;
            this.f3004b = null;
        }
        return byteArrayOutputStream;
    }
}
