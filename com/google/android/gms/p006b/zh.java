package com.google.android.gms.p006b;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.b.zh */
final class zh extends FilterInputStream {
    private int f4457a;

    private zh(InputStream inputStream) {
        super(inputStream);
        this.f4457a = 0;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f4457a++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f4457a += read;
        }
        return read;
    }
}
