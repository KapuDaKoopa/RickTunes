package com.google.android.gms.p006b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.ar;
import java.lang.ref.WeakReference;

@op
/* renamed from: com.google.android.gms.b.tb */
final class tb extends td implements OnGlobalLayoutListener {
    private final WeakReference f4124a;

    public tb(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f4124a = new WeakReference(onGlobalLayoutListener);
    }

    protected final void m4547a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    protected final void m4548b(ViewTreeObserver viewTreeObserver) {
        ar.m2242g().m4469a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f4124a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m4545b();
        }
    }
}
