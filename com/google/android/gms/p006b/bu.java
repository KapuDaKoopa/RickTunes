package com.google.android.gms.p006b;

import java.security.MessageDigest;

@op
/* renamed from: com.google.android.gms.b.bu */
public final class bu extends bo {
    private MessageDigest f3005b;

    public final byte[] m3530a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        byte[] bArr2 = new byte[split.length];
        for (int i = 0; i < split.length; i++) {
            int a = bt.m3528a(split[i]);
            bArr2[i] = (byte) (((a & -16777216) >> 24) ^ (((a & 255) ^ ((65280 & a) >> 8)) ^ ((16711680 & a) >> 16)));
        }
        this.f3005b = m3522a();
        synchronized (this.a) {
            if (this.f3005b == null) {
                bArr = new byte[0];
            } else {
                this.f3005b.reset();
                this.f3005b.update(bArr2);
                Object digest = this.f3005b.digest();
                bArr = new byte[(digest.length > 4 ? 4 : digest.length)];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }
}
