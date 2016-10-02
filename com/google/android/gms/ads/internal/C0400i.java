package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.i */
final class C0400i implements OnTouchListener {
    final /* synthetic */ C0403l f2136a;
    final /* synthetic */ C0399h f2137b;

    C0400i(C0399h c0399h, C0403l c0403l) {
        this.f2137b = c0399h;
        this.f2136a = c0403l;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f2136a.f2144b = true;
        return false;
    }
}
