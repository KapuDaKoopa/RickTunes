package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.C0771d;

/* renamed from: com.google.android.gms.auth.api.signin.h */
public enum C0574h {
    GOOGLE("google.com", C0771d.auth_google_play_services_client_google_display_name, "https://accounts.google.com"),
    FACEBOOK("facebook.com", C0771d.auth_google_play_services_client_facebook_display_name, "https://www.facebook.com");
    
    private final String f2789c;
    private final int f2790d;
    private final String f2791e;

    private C0574h(String str, int i, String str2) {
        this.f2789c = str;
        this.f2790d = i;
        this.f2791e = str2;
    }

    public static C0574h m3270a(String str) {
        if (str != null) {
            for (C0574h c0574h : C0574h.values()) {
                if (c0574h.f2789c.equals(str)) {
                    return c0574h;
                }
            }
            Log.w("IdProvider", "Unrecognized providerId: " + str);
        }
        return null;
    }

    public final CharSequence m3271a(Context context) {
        return context.getResources().getString(this.f2790d);
    }

    public final String m3272a() {
        return this.f2789c;
    }

    public final String toString() {
        return this.f2789c;
    }
}
