package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.m */
abstract class C0748m extends C0746k {
    private static final WeakReference f4889b;
    private WeakReference f4890a;

    static {
        f4889b = new WeakReference(null);
    }

    C0748m(byte[] bArr) {
        super(bArr);
        this.f4890a = f4889b;
    }

    final byte[] m5636a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f4890a.get();
            if (bArr == null) {
                bArr = m5637b();
                this.f4890a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] m5637b();
}
