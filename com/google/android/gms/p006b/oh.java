package com.google.android.gms.p006b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.C0381c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.b.oh */
final class oh implements sa {
    final /* synthetic */ boolean f3751a;
    final /* synthetic */ double f3752b;
    final /* synthetic */ String f3753c;
    final /* synthetic */ oc f3754d;

    oh(oc ocVar, boolean z, double d, String str) {
        this.f3754d = ocVar;
        this.f3751a = z;
        this.f3752b = d;
        this.f3753c = str;
    }

    private C0381c m4301b(InputStream inputStream) {
        byte[] toByteArray;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            xk.m4896a(inputStream, byteArrayOutputStream);
            toByteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            toByteArray = null;
        }
        if (toByteArray == null) {
            this.f3754d.m4292a(2, this.f3751a);
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(toByteArray, 0, toByteArray.length);
        if (decodeByteArray == null) {
            this.f3754d.m4292a(2, this.f3751a);
            return null;
        }
        decodeByteArray.setDensity((int) (160.0d * this.f3752b));
        return new C0381c(new BitmapDrawable(Resources.getSystem(), decodeByteArray), Uri.parse(this.f3753c), this.f3752b);
    }

    public final /* synthetic */ Object m4302a() {
        this.f3754d.m4292a(2, this.f3751a);
        return null;
    }

    public final /* synthetic */ Object m4303a(InputStream inputStream) {
        return m4301b(inputStream);
    }
}
