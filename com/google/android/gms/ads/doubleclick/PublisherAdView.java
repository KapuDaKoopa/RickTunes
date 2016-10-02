package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0259a;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.C0340g;
import com.google.android.gms.ads.internal.client.C0352d;
import com.google.android.gms.ads.internal.client.C0372w;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.di;

public final class PublisherAdView extends ViewGroup {
    private final C0352d f1745a;

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1745a = new C0352d(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1745a = new C0352d(this, attributeSet, true);
    }

    public final C0259a getAdListener() {
        return this.f1745a.f1973c;
    }

    public final C0333f getAdSize() {
        return this.f1745a.m2371a();
    }

    public final C0333f[] getAdSizes() {
        return this.f1745a.f1976f;
    }

    public final String getAdUnitId() {
        return this.f1745a.f1977g;
    }

    public final C0329a getAppEventListener() {
        return this.f1745a.f1980j;
    }

    public final String getMediationAdapterClassName() {
        return this.f1745a.m2376b();
    }

    public final C0330b getOnCustomRenderedAdLoadedListener() {
        return this.f1745a.f1983m;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int b;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C0333f adSize = getAdSize();
            if (adSize != null) {
                Context context = getContext();
                b = adSize.m2044b(context);
                i3 = adSize.m2042a(context);
            } else {
                b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            b = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(C0259a c0259a) {
        this.f1745a.m2372a(c0259a);
    }

    public final void setAdSizes(C0333f... c0333fArr) {
        if (c0333fArr == null || c0333fArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f1745a.m2377b(c0333fArr);
    }

    public final void setAdUnitId(String str) {
        this.f1745a.m2374a(str);
    }

    public final void setAppEventListener(C0329a c0329a) {
        C0352d c0352d = this.f1745a;
        try {
            c0352d.f1980j = c0329a;
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2119a(c0329a != null ? new C0372w(c0329a) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the AppEventListener.", e);
        }
    }

    public final void setCorrelator(C0340g c0340g) {
        C0352d c0352d = this.f1745a;
        c0352d.f1985o = c0340g;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2120a(c0352d.f1985o == null ? null : c0352d.f1985o.f1766a);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set correlator.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C0352d c0352d = this.f1745a;
        c0352d.f1984n = z;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2126a(c0352d.f1984n);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set manual impressions.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(C0330b c0330b) {
        C0352d c0352d = this.f1745a;
        c0352d.f1983m = c0330b;
        try {
            if (c0352d.f1975e != null) {
                c0352d.f1975e.m2122a(c0330b != null ? new di(c0330b) : null);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }
}
