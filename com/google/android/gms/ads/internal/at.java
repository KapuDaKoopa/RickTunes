package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.p006b.qk;
import com.google.android.gms.p006b.rq;
import com.google.android.gms.p006b.sl;
import com.google.android.gms.p006b.tf;
import java.util.ArrayList;
import java.util.List;

public final class at extends ViewSwitcher {
    private final rq f1882a;
    private final sl f1883b;

    public at(Context context, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f1882a = new rq(context);
        if (context instanceof Activity) {
            this.f1883b = new sl((Activity) context, onGlobalLayoutListener, onScrollChangedListener);
            this.f1883b.m4530a();
            return;
        }
        this.f1883b = null;
    }

    public final rq m2269a() {
        return this.f1882a;
    }

    public final void m2270b() {
        qk.m4383a();
        if (this.f1883b != null) {
            this.f1883b.m4531b();
        }
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1883b != null) {
            this.f1883b.m4532c();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1883b != null) {
            this.f1883b.m4533d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f1882a.m4505a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        List<tf> arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof tf)) {
                arrayList.add((tf) childAt);
            }
        }
        super.removeAllViews();
        for (tf destroy : arrayList) {
            destroy.destroy();
        }
    }
}
