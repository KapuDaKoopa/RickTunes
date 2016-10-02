package com.google.android.gms.p006b;

import java.io.IOException;

/* renamed from: com.google.android.gms.b.ym */
public final class ym extends IOException {
    ym(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }
}
