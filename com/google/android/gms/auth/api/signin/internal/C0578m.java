package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
public interface C0578m extends IInterface {
    void m3315a(GoogleSignInAccount googleSignInAccount, Status status);

    void m3316a(Status status);

    void m3317a(Status status, SignInAccount signInAccount);

    void m3318a(Status status, String str, String str2, long j);

    void m3319b(Status status);

    void m3320c(Status status);
}
