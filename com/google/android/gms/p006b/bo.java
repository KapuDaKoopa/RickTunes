package com.google.android.gms.p006b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.b.bo */
public abstract class bo {
    private static MessageDigest f2995b;
    protected Object f2996a;

    static {
        f2995b = null;
    }

    public bo() {
        this.f2996a = new Object();
    }

    protected final MessageDigest m3522a() {
        MessageDigest messageDigest;
        synchronized (this.f2996a) {
            if (f2995b != null) {
                messageDigest = f2995b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f2995b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f2995b;
            }
        }
        return messageDigest;
    }

    abstract byte[] m3523a(String str);
}
