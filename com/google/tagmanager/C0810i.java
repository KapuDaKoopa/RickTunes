package com.google.tagmanager;

import java.util.Arrays;

/* renamed from: com.google.tagmanager.i */
final class C0810i {
    public final String f5158a;
    public final Object f5159b;

    C0810i(String str, Object obj) {
        this.f5158a = str;
        this.f5159b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0810i)) {
            return false;
        }
        C0810i c0810i = (C0810i) obj;
        return this.f5158a.equals(c0810i.f5158a) && this.f5159b.equals(c0810i.f5159b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f5158a.hashCode()), Integer.valueOf(this.f5159b.hashCode())});
    }

    public final String toString() {
        return "Key: " + this.f5158a + " value: " + this.f5159b.toString();
    }
}
