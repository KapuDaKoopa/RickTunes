package com.google.tagmanager;

import java.util.Arrays;

/* renamed from: com.google.tagmanager.s */
final class C0817s {
    final String f5172a;
    final byte[] f5173b;

    C0817s(String str, byte[] bArr) {
        this.f5172a = str;
        this.f5173b = bArr;
    }

    public final String toString() {
        return "KeyAndSerialized: key = " + this.f5172a + " serialized hash = " + Arrays.hashCode(this.f5173b);
    }
}
