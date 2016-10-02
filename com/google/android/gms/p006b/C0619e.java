package com.google.android.gms.p006b;

import android.util.Base64;

/* renamed from: com.google.android.gms.b.e */
final class C0619e implements ac {
    C0619e() {
    }

    public final String m3670a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final byte[] m3671a(String str) {
        return Base64.decode(str, 2);
    }
}
