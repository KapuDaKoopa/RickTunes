package com.google.android.gms.common.api.internal;

import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.C0698b;
import com.google.android.gms.common.C0707e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class SupportLifecycleFragmentImpl extends zzw {
    protected final /* synthetic */ C0697i m5116a() {
        return C0698b.m5328a();
    }

    protected final void m5117a(int i, ConnectionResult connectionResult) {
        C0707e.m5363a(connectionResult.m5058c(), getActivity(), (Fragment) this, (OnCancelListener) this);
    }

    protected final void m5118b(int i, ConnectionResult connectionResult) {
        C0698b.m5328a();
        this.a = ap.m5119a(getActivity().getApplicationContext(), new C0661a(this, C0698b.m5327a(getActivity(), (OnCancelListener) this)));
    }
}
