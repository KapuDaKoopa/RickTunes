package com.google.android.gms.p006b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@op
/* renamed from: com.google.android.gms.b.sg */
public final class sg extends qi {
    private final String f4093a;
    private final Context f4094b;
    private final String f4095c;
    private String f4096d;

    public sg(Context context, String str, String str2) {
        this.f4096d = null;
        this.f4094b = context;
        this.f4093a = str;
        this.f4095c = str2;
    }

    public sg(Context context, String str, String str2, String str3) {
        this.f4096d = null;
        this.f4094b = context;
        this.f4093a = str;
        this.f4095c = str2;
        this.f4096d = str3;
    }

    public final void m4524a() {
        HttpURLConnection httpURLConnection;
        try {
            "Pinging URL: " + this.f4095c;
            qk.m4383a();
            httpURLConnection = (HttpURLConnection) new URL(this.f4095c).openConnection();
            if (TextUtils.isEmpty(this.f4096d)) {
                ar.m2240e().m4456a(this.f4094b, this.f4093a, true, httpURLConnection);
            } else {
                ar.m2240e();
                Context context = this.f4094b;
                String str = this.f4093a;
                rd.m4420a(httpURLConnection, this.f4096d);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                C0501b.m3025a("Received non-success response code " + responseCode + " from pinging URL: " + this.f4095c);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            C0501b.m3025a("Error while parsing ping URL: " + this.f4095c + ". " + e.getMessage());
        } catch (IOException e2) {
            C0501b.m3025a("Error while pinging URL: " + this.f4095c + ". " + e2.getMessage());
        } catch (RuntimeException e3) {
            C0501b.m3025a("Error while pinging URL: " + this.f4095c + ". " + e3.getMessage());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public final void m4525b() {
    }
}
