package com.google.android.gms.p006b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@op
/* renamed from: com.google.android.gms.b.tc */
final class tc extends td implements OnScrollChangedListener {
    private final WeakReference f4125a;

    public tc(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f4125a = new WeakReference(onScrollChangedListener);
    }

    protected final void m4549a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    protected final void m4550b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f4125a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m4545b();
        }
    }
}
