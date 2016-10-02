package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.C0501b;

@TargetApi(19)
@op
/* renamed from: com.google.android.gms.b.nx */
public final class nx extends nw {
    private Object f3702h;
    private PopupWindow f3703i;
    private boolean f3704j;

    nx(Context context, qa qaVar, tf tfVar, nv nvVar) {
        super(context, qaVar, tfVar, nvVar);
        this.f3702h = new Object();
        this.f3704j = false;
    }

    private void m4269f() {
        synchronized (this.f3702h) {
            this.f3704j = true;
            if ((this.b instanceof Activity) && ((Activity) this.b).isDestroyed()) {
                this.f3703i = null;
            }
            if (this.f3703i != null) {
                if (this.f3703i.isShowing()) {
                    this.f3703i.dismiss();
                }
                this.f3703i = null;
            }
        }
    }

    protected final void m4270a(int i) {
        m4269f();
        super.m4240a(i);
    }

    protected final void m4271c() {
        Window window = this.b instanceof Activity ? ((Activity) this.b).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.b).isDestroyed()) {
            View frameLayout = new FrameLayout(this.b);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            frameLayout.addView(this.c.m4564b(), -1, -1);
            synchronized (this.f3702h) {
                if (this.f3704j) {
                    return;
                }
                this.f3703i = new PopupWindow(frameLayout, 1, 1, false);
                this.f3703i.setOutsideTouchable(true);
                this.f3703i.setClippingEnabled(false);
                C0501b.m3027a(3);
                try {
                    this.f3703i.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception e) {
                    this.f3703i = null;
                }
            }
        }
    }

    public final void m4272d() {
        m4269f();
        super.m4243d();
    }
}
