package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rq;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.n */
final class C0424n extends RelativeLayout {
    rq f2240a;

    public C0424n(Context context, String str) {
        super(context);
        this.f2240a = new rq(context, str);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f2240a.m4505a(motionEvent);
        return false;
    }
}
