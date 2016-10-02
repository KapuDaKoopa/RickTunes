package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.p006b.vg;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
final class C0576a implements vg {
    final /* synthetic */ String f2811a;
    final /* synthetic */ SignInHubActivity f2812b;

    C0576a(SignInHubActivity signInHubActivity, String str) {
        this.f2812b = signInHubActivity;
        this.f2811a = str;
    }

    public final void m3294a(Intent intent) {
        if (intent != null) {
            if (!TextUtils.isEmpty(this.f2811a)) {
                intent.putExtra("scopes", this.f2811a);
            }
            this.f2812b.m3287a(intent);
            return;
        }
        Log.w("AuthSignInClient", "Idp signin failed!");
        this.f2812b.m3285a(4);
    }
}
