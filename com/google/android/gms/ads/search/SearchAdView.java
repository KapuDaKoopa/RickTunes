package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0259a;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.internal.client.C0352d;

public final class SearchAdView extends ViewGroup {
    private final C0352d f2587a;

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2587a = new C0352d(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2587a = new C0352d(this, attributeSet, false);
    }

    public final C0259a getAdListener() {
        return this.f2587a.f1973c;
    }

    public final C0333f getAdSize() {
        return this.f2587a.m2371a();
    }

    public final String getAdUnitId() {
        return this.f2587a.f1977g;
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
        this.f2587a.m2372a(c0259a);
    }

    public final void setAdSize(C0333f c0333f) {
        this.f2587a.m2375a(c0333f);
    }

    public final void setAdUnitId(String str) {
        this.f2587a.m2374a(str);
    }
}
