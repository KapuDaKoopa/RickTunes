package com.google.android.gms.p006b;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.C0369t;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@op
/* renamed from: com.google.android.gms.b.hx */
final class hx {
    final AdRequestParcel f3366a;
    final String f3367b;
    final int f3368c;

    private hx(AdRequestParcel adRequestParcel, String str, int i) {
        this.f3366a = adRequestParcel;
        this.f3367b = str;
        this.f3368c = i;
    }

    hx(hu huVar) {
        this(huVar.f3350b, huVar.f3351c, huVar.f3352d);
    }

    hx(String str) {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            this.f3367b = new String(Base64.decode(split[0], 0), "UTF-8");
            this.f3368c = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            C0369t c0369t = AdRequestParcel.CREATOR;
            this.f3366a = C0369t.m2442a(obtain);
            obtain.recycle();
        } catch (IllegalArgumentException e) {
            throw new IOException("Malformed QueueSeed encoding.");
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    final String m3840a() {
        Parcel obtain = Parcel.obtain();
        String encodeToString;
        try {
            encodeToString = Base64.encodeToString(this.f3367b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f3368c);
            this.f3366a.writeToParcel(obtain, 0);
            encodeToString = encodeToString + "\u0000" + num + "\u0000" + Base64.encodeToString(obtain.marshall(), 0);
            return encodeToString;
        } catch (UnsupportedEncodingException e) {
            encodeToString = 6;
            C0501b.m3027a(6);
            return "";
        } finally {
            obtain.recycle();
        }
    }
}
