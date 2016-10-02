package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0590i;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.internal.C0727j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.g */
final class C0560g extends C0531b {
    C0560g() {
    }

    public final /* synthetic */ C0467c m3212a(Context context, Looper looper, C0727j c0727j, Object obj, C0464l c0464l, C0465m c0465m) {
        return new C0590i(context, looper, c0727j, (GoogleSignInOptions) obj, c0464l, c0465m);
    }

    public final /* synthetic */ List m3213a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m3243a();
    }
}
