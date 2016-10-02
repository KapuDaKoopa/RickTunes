package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.ao;

/* renamed from: com.google.android.gms.signin.internal.g */
public interface C0789g extends IInterface {
    void m5765a(int i);

    void m5766a(int i, Account account, C0682d c0682d);

    void m5767a(AuthAccountRequest authAccountRequest, C0682d c0682d);

    void m5768a(ResolveAccountRequest resolveAccountRequest, ao aoVar);

    void m5769a(ae aeVar, int i, boolean z);

    void m5770a(CheckServerAuthResult checkServerAuthResult);

    void m5771a(RecordConsentRequest recordConsentRequest, C0682d c0682d);

    void m5772a(SignInRequest signInRequest, C0682d c0682d);

    void m5773a(C0682d c0682d);

    void m5774a(boolean z);
}
