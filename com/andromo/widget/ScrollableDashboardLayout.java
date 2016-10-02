package com.andromo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.GridLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class ScrollableDashboardLayout extends ViewGroup {
    private boolean f1228a;
    private int f1229b;
    private Rect f1230c;
    private int f1231d;
    private int f1232e;
    private int f1233f;
    private int f1234g;
    private int f1235h;
    private int f1236i;
    private int f1237j;
    private int f1238k;
    private boolean f1239l;

    public ScrollableDashboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1228a = true;
        this.f1229b = 2;
        this.f1230c = new Rect(m1653a(14.0f), m1653a(14.0f), m1653a(14.0f), m1653a(14.0f));
        this.f1231d = 2;
        this.f1232e = 6;
        this.f1233f = 3;
        this.f1234g = m1653a(160.0f);
        this.f1235h = 0;
        this.f1236i = 0;
        this.f1237j = m1653a(6.0f);
        this.f1238k = m1653a(20.0f);
        this.f1239l = false;
        m1655a(context, attributeSet);
    }

    public ScrollableDashboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1228a = true;
        this.f1229b = 2;
        this.f1230c = new Rect(m1653a(14.0f), m1653a(14.0f), m1653a(14.0f), m1653a(14.0f));
        this.f1231d = 2;
        this.f1232e = 6;
        this.f1233f = 3;
        this.f1234g = m1653a(160.0f);
        this.f1235h = 0;
        this.f1236i = 0;
        this.f1237j = m1653a(6.0f);
        this.f1238k = m1653a(20.0f);
        this.f1239l = false;
        m1655a(context, attributeSet);
    }

    private int m1653a(float f) {
        return Math.round(getContext().getResources().getDisplayMetrics().density * f);
    }

    private int m1654a(int i, int i2, int i3) {
        int i4 = i > this.f1233f ? this.f1231d : 1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = i4; i6 <= this.f1232e; i6++) {
            int i7 = ((i - 1) / i6) + 1;
            int i8 = (i2 - (this.f1235h * i6)) / (i6 + 1);
            int max = (Math.max(i3, (this.f1236i * i7) + ((i7 - 1) * this.f1238k)) - (this.f1236i * i7)) / (i7 + 1);
            int abs = Math.abs(max - i8);
            if (i7 * i6 != i) {
                if (this.f1228a) {
                    abs *= (i7 * i6) - i;
                }
                abs *= this.f1229b;
            }
            if (abs < i5 && i8 >= 0 && max >= 0) {
                if (i7 == 1) {
                    return i6;
                }
                i4 = i6;
                i5 = abs;
            }
        }
        return i4;
    }

    private void m1655a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0225b.ScrollableDashboardLayout);
        this.f1231d = obtainStyledAttributes.getInt(C0225b.ScrollableDashboardLayout_minColumns, this.f1231d);
        this.f1232e = obtainStyledAttributes.getInt(C0225b.ScrollableDashboardLayout_maxColumns, this.f1232e);
        this.f1233f = obtainStyledAttributes.getInt(C0225b.ScrollableDashboardLayout_allowSingleColumnUpTo, this.f1233f);
        this.f1229b = obtainStyledAttributes.getInt(C0225b.ScrollableDashboardLayout_unevenGridPenalty, this.f1229b);
        this.f1230c = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C0225b.ScrollableDashboardLayout_margin_left, this.f1230c.left), obtainStyledAttributes.getDimensionPixelOffset(C0225b.ScrollableDashboardLayout_margin_top, this.f1230c.top), obtainStyledAttributes.getDimensionPixelOffset(C0225b.ScrollableDashboardLayout_margin_right, this.f1230c.right), obtainStyledAttributes.getDimensionPixelOffset(C0225b.ScrollableDashboardLayout_margin_bottom, this.f1230c.bottom));
        this.f1234g = obtainStyledAttributes.getDimensionPixelSize(C0225b.ScrollableDashboardLayout_maxColumnWidth, this.f1234g);
        this.f1237j = obtainStyledAttributes.getDimensionPixelSize(C0225b.ScrollableDashboardLayout_minHorizontalGap, this.f1237j);
        this.f1238k = obtainStyledAttributes.getDimensionPixelSize(C0225b.ScrollableDashboardLayout_minVerticalGap, this.f1238k);
        this.f1228a = obtainStyledAttributes.getBoolean(C0225b.ScrollableDashboardLayout_preferFullerLastRows, this.f1228a);
        this.f1239l = obtainStyledAttributes.getBoolean(C0225b.ScrollableDashboardLayout_centerLastRow, this.f1239l);
        obtainStyledAttributes.recycle();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = ((i3 - i) - this.f1230c.left) - this.f1230c.right;
        int i7 = ((i4 - i2) - this.f1230c.top) - this.f1230c.bottom;
        int childCount = getChildCount();
        int i8 = 0;
        for (i5 = 0; i5 < childCount; i5++) {
            if (getChildAt(i5).getVisibility() != 8) {
                i8++;
            }
        }
        if (i8 != 0) {
            int a = m1654a(i8, i6, i7);
            int i9 = ((i8 - 1) / a) + 1;
            int i10 = (i7 - (this.f1236i * i9)) / (i9 + 1);
            int max = Math.max(0, (i6 - (this.f1235h * a)) / (a + 1));
            int max2 = Math.max(0, i10);
            Object obj = (!this.f1239l || i9 <= 0 || i9 * a == i8) ? null : 1;
            if (obj != null) {
                i8 %= a;
                i8 = ((i6 - (this.f1235h * i8)) - ((i8 + 1) * max)) / 2;
            } else {
                i8 = 0;
            }
            int i11 = (i6 - ((a + 1) * max)) / a;
            int i12 = (i7 - ((i9 + 1) * max2)) / i9;
            i10 = 0;
            i7 = 0;
            while (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    int i13 = i10 / a;
                    i5 = i10 % a;
                    int i14;
                    int i15;
                    if (obj == null || i13 != i9 - 1) {
                        i14 = (i11 * i5) + (this.f1230c.left + ((i5 + 1) * max));
                        i15 = (i12 * i13) + (this.f1230c.top + ((i13 + 1) * max2));
                        i6 = (max == 0 && i5 == a - 1) ? i3 - this.f1230c.right : i14 + i11;
                        i5 = (max2 == 0 && i13 == i9 - 1) ? i4 - this.f1230c.top : i15 + i12;
                        childAt.layout(i14, i15, i6, i5);
                    } else {
                        i14 = ((this.f1230c.left + ((i5 + 1) * max)) + (i11 * i5)) + i8;
                        i15 = (i12 * i13) + (this.f1230c.top + ((i13 + 1) * max2));
                        i6 = (max == 0 && i5 == a - 1) ? (i3 - this.f1230c.right) - i8 : i14 + i11;
                        i5 = (max2 == 0 && i13 == i9 - 1) ? i4 - this.f1230c.top : i15 + i12;
                        childAt.layout(i14, i15, i6, i5);
                    }
                    i5 = i10 + 1;
                } else {
                    i5 = i10;
                }
                i7++;
                i10 = i5;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        this.f1235h = 0;
        this.f1236i = 0;
        int size = (MeasureSpec.getSize(i) - this.f1230c.left) - this.f1230c.right;
        int max = Math.max(0, (MeasureSpec.getSize(i2) - this.f1230c.top) - this.f1230c.bottom);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, GridLayout.UNDEFINED);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(max, 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                i4++;
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                this.f1235h = Math.max(this.f1235h, childAt.getMeasuredWidth());
                this.f1236i = Math.max(this.f1236i, childAt.getMeasuredHeight());
            }
        }
        if (i4 == 0) {
            setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
            return;
        }
        i3 = i4 > this.f1233f ? this.f1231d : 1;
        i3 = (size - ((i3 - 1) * this.f1237j)) / i3;
        if (this.f1234g > 0 && i3 > this.f1234g) {
            i3 = this.f1234g;
        }
        if (this.f1235h > i3) {
            this.f1235h = 0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, GridLayout.UNDEFINED);
            for (i3 = 0; i3 < childCount; i3++) {
                childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                    this.f1235h = Math.max(this.f1235h, childAt.getMeasuredWidth());
                    this.f1236i = Math.max(this.f1236i, childAt.getMeasuredHeight());
                }
            }
            i3 = this.f1235h;
        }
        i4 = ((i4 - 1) / m1654a(i4, size, max)) + 1;
        i3 = Math.max(MeasureSpec.getSize(i2), ((((i4 - 1) * this.f1238k) + (this.f1236i * i4)) + this.f1230c.top) + this.f1230c.bottom);
        size = MeasureSpec.makeMeasureSpec(this.f1235h, 1073741824);
        max = MeasureSpec.makeMeasureSpec(this.f1236i, 1073741824);
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(size, max);
            }
        }
        setMeasuredDimension(resolveSize(this.f1235h, i), resolveSize(i3, i2));
    }

    public void setAllowSingleColumnUpTo(int i) {
        this.f1233f = i;
    }

    public void setCenterLastRow(boolean z) {
        this.f1239l = z;
    }

    public void setMargins(Rect rect) {
        this.f1230c = rect;
    }

    public void setMaxColumnWidth(int i) {
        this.f1234g = i;
    }

    public void setMaxColumns(int i) {
        this.f1232e = i;
    }

    public void setMinColumns(int i) {
        this.f1231d = i;
    }

    public void setMinHorizontalGap(int i) {
        this.f1237j = i;
    }

    public void setMinVerticalGap(int i) {
        this.f1238k = i;
    }

    public void setPreferFullerLastRows(boolean z) {
        this.f1228a = z;
    }

    public void setUnevenGridPenaltyMultiplier(int i) {
        this.f1229b = i;
    }
}
