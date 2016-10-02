package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ax;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class C0586c extends C0584e implements aj, C0585d {
    private AtomicReference f2835a;
    final C0655d f2836c;

    public C0586c(C0655d c0655d, C0660i c0660i) {
        super((C0660i) ax.m5528a((Object) c0660i, (Object) "GoogleApiClient must not be null"));
        this.f2835a = new AtomicReference();
        this.f2836c = (C0655d) ax.m5527a((Object) c0655d);
    }

    private void m3361a(RemoteException remoteException) {
        m3366b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void m3362a(C0467c c0467c);

    public final void m3363a(ai aiVar) {
        this.f2835a.set(aiVar);
    }

    public final /* synthetic */ void m3364a(Object obj) {
        super.m3343a((C0653q) obj);
    }

    public final C0655d m3365b() {
        return this.f2836c;
    }

    public final void m3366b(Status status) {
        ax.m5536b(!status.m5071e(), "Failed result must not be success");
        m3343a(m3340a(status));
    }

    public final void m3367b(C0467c c0467c) {
        try {
            m3362a(c0467c);
        } catch (RemoteException e) {
            m3361a(e);
            throw e;
        } catch (RemoteException e2) {
            m3361a(e2);
        }
    }

    public final void m3368c() {
        m3344a(null);
    }

    protected final void m3369d() {
        ai aiVar = (ai) this.f2835a.getAndSet(null);
        if (aiVar != null) {
            aiVar.m5124a(this);
        }
    }
}
