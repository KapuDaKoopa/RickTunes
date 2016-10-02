package com.google.android.gms.p006b;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.b.aa */
public final class aa {
    private static final String[] f2880e;
    private String f2881a;
    private String f2882b;
    private String f2883c;
    private String[] f2884d;
    private C0496t f2885f;

    static {
        f2880e = new String[]{"/aclk", "/pcs/click"};
    }

    public aa(C0496t c0496t) {
        this.f2881a = "googleads.g.doubleclick.net";
        this.f2882b = "/pagead/ads";
        this.f2883c = "ad.doubleclick.net";
        this.f2884d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.f2885f = c0496t;
    }

    private Uri m3413a(Uri uri, Context context, String str) {
        try {
            boolean c = m3414c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new ab("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new ab("Query parameter already exists: ms");
            }
            String a = this.f2885f.m2984a(context, str);
            String uri2;
            String encodedPath;
            if (c) {
                String str2 = "dc_ms";
                uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str2).append("=").append(a).append(";").append(uri2.substring(indexOf + 1)).toString());
                }
                encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str2).append("=").append(a).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
            }
            uri2 = "ms";
            encodedPath = uri.toString();
            int indexOf3 = encodedPath.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = encodedPath.indexOf("?adurl");
            }
            return indexOf3 != -1 ? Uri.parse(new StringBuilder(encodedPath.substring(0, indexOf3 + 1)).append(uri2).append("=").append(a).append("&").append(encodedPath.substring(indexOf3 + 1)).toString()) : uri.buildUpon().appendQueryParameter(uri2, a).build();
        } catch (UnsupportedOperationException e) {
            throw new ab("Provided Uri is not in a valid state");
        }
    }

    private boolean m3414c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f2883c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final Uri m3415a(Uri uri, Context context) {
        try {
            return m3413a(uri, context, uri.getQueryParameter("ai"));
        } catch (UnsupportedOperationException e) {
            throw new ab("Provided Uri is not in a valid state");
        }
    }

    public final C0496t m3416a() {
        return this.f2885f;
    }

    public final void m3417a(MotionEvent motionEvent) {
        this.f2885f.m2986a(motionEvent);
    }

    public final boolean m3418a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f2884d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final boolean m3419b(Uri uri) {
        if (!m3418a(uri)) {
            return false;
        }
        for (String endsWith : f2880e) {
            if (uri.getPath().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
