package com.google.android.gms.common;

import com.google.android.gms.common.internal.ax;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.k */
abstract class C0746k {
    private int f4887a;

    protected C0746k(byte[] bArr) {
        ax.m5536b(bArr.length == 25, "cert hash data has incorrect length");
        this.f4887a = Arrays.hashCode(bArr);
    }

    protected static byte[] m5633a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    abstract byte[] m5634a();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0746k)) {
            return false;
        }
        return Arrays.equals(m5634a(), ((C0746k) obj).m5634a());
    }

    public int hashCode() {
        return this.f4887a;
    }
}
