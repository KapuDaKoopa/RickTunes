package com.google.android.gms.p006b;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.b.td */
abstract class td {
    private final WeakReference f4123a;

    public td(View view) {
        this.f4123a = new WeakReference(view);
    }

    private ViewTreeObserver m4542c() {
        View view = (View) this.f4123a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }

    public final void m4543a() {
        ViewTreeObserver c = m4542c();
        if (c != null) {
            m4544a(c);
        }
    }

    protected abstract void m4544a(ViewTreeObserver viewTreeObserver);

    public final void m4545b() {
        ViewTreeObserver c = m4542c();
        if (c != null) {
            m4546b(c);
        }
    }

    protected abstract void m4546b(ViewTreeObserver viewTreeObserver);
}
