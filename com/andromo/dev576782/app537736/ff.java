package com.andromo.dev576782.app537736;

import android.os.Binder;
import java.lang.ref.WeakReference;

public final class ff extends Binder {
    private String f897a;
    private WeakReference f898b;

    public ff(Object obj) {
        this.f897a = "LocalBinder";
        this.f898b = new WeakReference(obj);
    }

    public final Object m1429a() {
        return this.f898b.get();
    }
}
