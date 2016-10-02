package com.google.android.gms.ads.internal.purchase;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.o */
public final class C0446o {
    public static PublicKey m2804a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            C0501b.m3027a(6);
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean m2805a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            C0501b.m3027a(6);
            return false;
        } catch (NoSuchAlgorithmException e) {
            C0501b.m3027a(6);
            return false;
        } catch (InvalidKeyException e2) {
            C0501b.m3027a(6);
            return false;
        } catch (SignatureException e3) {
            C0501b.m3027a(6);
            return false;
        }
    }
}
