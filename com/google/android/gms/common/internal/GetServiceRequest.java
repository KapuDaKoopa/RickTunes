package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

public class GetServiceRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4786a;
    final int f4787b;
    int f4788c;
    String f4789d;
    IBinder f4790e;
    Scope[] f4791f;
    Bundle f4792g;
    Account f4793h;

    static {
        CREATOR = new C0730m();
    }

    public GetServiceRequest(int i) {
        this.f4786a = 2;
        this.f4788c = C0697i.f4705b;
        this.f4787b = i;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account) {
        this.f4786a = i;
        this.f4787b = i2;
        this.f4788c = i3;
        this.f4789d = str;
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C0719b.m5540a(af.m5416a(iBinder));
            }
            this.f4793h = account2;
        } else {
            this.f4790e = iBinder;
            this.f4793h = account;
        }
        this.f4791f = scopeArr;
        this.f4792g = bundle;
    }

    public final GetServiceRequest m5388a(Account account) {
        this.f4793h = account;
        return this;
    }

    public final GetServiceRequest m5389a(Bundle bundle) {
        this.f4792g = bundle;
        return this;
    }

    public final GetServiceRequest m5390a(ae aeVar) {
        if (aeVar != null) {
            this.f4790e = aeVar.asBinder();
        }
        return this;
    }

    public final GetServiceRequest m5391a(String str) {
        this.f4789d = str;
        return this;
    }

    public final GetServiceRequest m5392a(Collection collection) {
        this.f4791f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0730m.m5552a(this, parcel, i);
    }
}
