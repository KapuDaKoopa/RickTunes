package com.google.android.gms.p006b;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* renamed from: com.google.android.gms.b.zj */
public final class zj extends HttpEntityEnclosingRequestBase {
    public zj(String str) {
        setURI(URI.create(str));
    }

    public final String getMethod() {
        return "PATCH";
    }
}
