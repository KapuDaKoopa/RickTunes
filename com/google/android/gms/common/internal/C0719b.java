package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0706q;

/* renamed from: com.google.android.gms.common.internal.b */
public final class C0719b extends af {
    int f4834a;
    private Account f4835b;
    private Context f4836c;

    public static Account m5540a(ae aeVar) {
        Account account = null;
        if (aeVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = aeVar.m5415a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final Account m5541a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f4834a) {
            return this.f4835b;
        }
        if (C0706q.m5349a(this.f4836c, callingUid)) {
            this.f4834a = callingUid;
            return this.f4835b;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof C0719b) ? false : this.f4835b.equals(((C0719b) obj).f4835b);
    }
}
