package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.dn;
import com.google.android.gms.p006b.eq;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;

public abstract class NativeAdView extends FrameLayout {
    private final FrameLayout f1758a;
    private final dn f1759b;

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1758a = m2046a(context);
        this.f1759b = m2047a();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1758a = m2046a(context);
        this.f1759b = m2047a();
    }

    private FrameLayout m2046a(Context context) {
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private dn m2047a() {
        ax.m5528a(this.f1758a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        eq d = C0374z.m2458d();
        Context context = this.f1758a.getContext();
        FrameLayout frameLayout = this.f1758a;
        C0374z.m2455a();
        if (C0500a.m3021b(context)) {
            dn a = d.m3694a(context, this, frameLayout);
            if (a != null) {
                return a;
            }
        }
        C0501b.m3027a(3);
        return C0374z.m2457c().m2451a(this, frameLayout);
    }

    protected final View m2048a(String str) {
        try {
            C0314a a = this.f1759b.m2421a(str);
            if (a != null) {
                return (View) C0317d.m1997a(a);
            }
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
        return null;
    }

    protected final void m2049a(String str, View view) {
        try {
            this.f1759b.m2424a(str, C0317d.m1996a((Object) view));
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1758a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f1758a != view) {
            super.bringChildToFront(this.f1758a);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1758a);
    }

    public void removeView(View view) {
        if (this.f1758a != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(C0334a c0334a) {
        try {
            this.f1759b.m2423a((C0314a) c0334a.m2050a());
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
    }
}
