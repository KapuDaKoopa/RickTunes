package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class am {
    private static am f5072a;
    private volatile an f5073b;
    private volatile String f5074c;
    private volatile String f5075d;
    private volatile String f5076e;

    am() {
        this.f5073b = an.NONE;
        this.f5075d = null;
        this.f5074c = null;
        this.f5076e = null;
    }

    static am m5839a() {
        am amVar;
        synchronized (am.class) {
            if (f5072a == null) {
                f5072a = new am();
            }
            amVar = f5072a;
        }
        return amVar;
    }

    private static String m5840a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    final synchronized boolean m5841a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    "Container preview url: " + decode;
                    C0824z.m5940d();
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.f5073b = an.CONTAINER_DEBUG;
                    } else {
                        this.f5073b = an.CONTAINER;
                    }
                    this.f5076e = uri.getQuery().replace("&gtm_debug=x", "");
                    if (this.f5073b == an.CONTAINER || this.f5073b == an.CONTAINER_DEBUG) {
                        this.f5075d = "/r?" + this.f5076e;
                    }
                    this.f5074c = m5840a(this.f5076e);
                } else {
                    if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                        C0824z.m5937a("Invalid preview uri: " + decode);
                        z = false;
                    } else if (m5840a(uri.getQuery()).equals(this.f5074c)) {
                        "Exit preview mode for container: " + this.f5074c;
                        C0824z.m5940d();
                        this.f5073b = an.NONE;
                        this.f5075d = null;
                    } else {
                        z = false;
                    }
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    final an m5842b() {
        return this.f5073b;
    }

    final String m5843c() {
        return this.f5075d;
    }

    final String m5844d() {
        return this.f5074c;
    }
}
