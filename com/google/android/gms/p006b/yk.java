package com.google.android.gms.p006b;

import android.support.v4.app.NotificationCompat;

/* renamed from: com.google.android.gms.b.yk */
public final class yk {
    final byte[] f4373a;
    int f4374b;
    int f4375c;

    public yk(byte[] bArr) {
        int i;
        this.f4373a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (i = 0; i < NotificationCompat.FLAG_LOCAL_ONLY; i++) {
            this.f4373a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < NotificationCompat.FLAG_LOCAL_ONLY; i2++) {
            i = ((i + this.f4373a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f4373a[i2];
            this.f4373a[i2] = this.f4373a[i];
            this.f4373a[i] = b;
        }
        this.f4374b = 0;
        this.f4375c = 0;
    }

    public final void m4922a(byte[] bArr) {
        int i = this.f4374b;
        int i2 = this.f4375c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f4373a[i]) & 255;
            byte b = this.f4373a[i];
            this.f4373a[i] = this.f4373a[i2];
            this.f4373a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f4373a[(this.f4373a[i] + this.f4373a[i2]) & 255]);
        }
        this.f4374b = i;
        this.f4375c = i2;
    }
}
