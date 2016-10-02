package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: android.support.v4.widget.e */
final class C0119e extends ContentObserver {
    final /* synthetic */ C0118d f371a;

    public C0119e(C0118d c0118d) {
        this.f371a = c0118d;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f371a.onContentChanged();
    }
}
