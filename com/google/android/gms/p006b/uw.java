package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C0530a;
import com.google.android.gms.auth.api.C0562i;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.C0728k;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.b.uw */
public final class uw extends C0469n {
    private final Bundle f4228a;

    public uw(Context context, Looper looper, C0727j c0727j, C0562i c0562i, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 16, c0727j, c0464l, c0465m);
        this.f4228a = c0562i == null ? new Bundle() : new Bundle(c0562i.f2713a);
    }

    protected final /* synthetic */ IInterface m4760a(IBinder iBinder) {
        return vc.m4792a(iBinder);
    }

    protected final String m4761a() {
        return "com.google.android.gms.auth.service.START";
    }

    protected final String m4762b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    protected final Bundle b_() {
        return this.f4228a;
    }

    public final boolean m4763i() {
        C0727j c0727j = this.f2478c;
        if (!TextUtils.isEmpty(c0727j.f4840a != null ? c0727j.f4840a.name : null)) {
            Set set;
            C0728k c0728k = (C0728k) c0727j.f4843d.get(C0530a.f2631g);
            if (c0728k == null || c0728k.f4850a.isEmpty()) {
                set = c0727j.f4841b;
            } else {
                Set hashSet = new HashSet(c0727j.f4841b);
                hashSet.addAll(c0728k.f4850a);
                set = hashSet;
            }
            if (!set.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
