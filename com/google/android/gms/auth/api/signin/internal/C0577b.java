package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.C0043k;
import com.google.android.gms.common.api.C0660i;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
final class C0577b implements LoaderCallbacks {
    final /* synthetic */ SignInHubActivity f2818a;

    private C0577b(SignInHubActivity signInHubActivity) {
        this.f2818a = signInHubActivity;
    }

    public final C0043k onCreateLoader(int i, Bundle bundle) {
        return new C0581d(this.f2818a, C0660i.m5082a());
    }

    public final /* synthetic */ void onLoadFinished(C0043k c0043k, Object obj) {
        this.f2818a.setResult(this.f2818a.f2809h, this.f2818a.f2810i);
        this.f2818a.finish();
    }

    public final void onLoaderReset(C0043k c0043k) {
    }
}
