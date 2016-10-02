package com.google.android.gms.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.signin.internal.d */
public interface C0682d extends IInterface {
    void m5248a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void m5249a(Status status);

    void m5250a(Status status, GoogleSignInAccount googleSignInAccount);

    void m5251a(SignInResponse signInResponse);

    void m5252b(Status status);
}
