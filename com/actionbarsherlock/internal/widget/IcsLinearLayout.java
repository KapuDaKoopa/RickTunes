package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;

public class IcsLinearLayout extends NineLinearLayout {
    private static final int LinearLayout_divider = 0;
    private static final int LinearLayout_dividerPadding = 3;
    private static final int LinearLayout_measureWithLargestChild = 1;
    private static final int LinearLayout_showDividers = 2;
    private static final int[] R_styleable_LinearLayout;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mShowDividers;
    private boolean mUseLargestChild;

    static {
        R_styleable_LinearLayout = new int[]{16843049, 16843476, 16843561, 16843562};
    }

    public IcsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R_styleable_LinearLayout);
        setDividerDrawable(obtainStyledAttributes.getDrawable(LinearLayout_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(SHOW_DIVIDER_MIDDLE, LinearLayout_divider);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(LinearLayout_dividerPadding, LinearLayout_divider);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(SHOW_DIVIDER_BEGINNING, false);
        obtainStyledAttributes.recycle();
    }

    private void useLargestChildHorizontal() {
        int childCount = getChildCount();
        int i = LinearLayout_divider;
        int i2 = LinearLayout_divider;
        while (i < childCount) {
            i += SHOW_DIVIDER_BEGINNING;
            i2 = Math.max(getChildAt(i).getMeasuredWidth(), i2);
        }
        int i3 = LinearLayout_divider;
        i = LinearLayout_divider;
        while (i3 < childCount) {
            int i4;
            View childAt = getChildAt(i3);
            if (childAt == null || childAt.getVisibility() == 8) {
                i4 = i;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.weight > 0.0f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    i += i2;
                } else {
                    i += childAt.getMeasuredWidth();
                }
                i4 = (layoutParams.rightMargin + layoutParams.leftMargin) + i;
            }
            i3 += SHOW_DIVIDER_BEGINNING;
            i = i4;
        }
        setMeasuredDimension((getPaddingLeft() + getPaddingRight()) + i, getMeasuredHeight());
    }

    private void useLargestChildVertical() {
        int childCount = getChildCount();
        int i = LinearLayout_divider;
        int i2 = LinearLayout_divider;
        while (i < childCount) {
            i += SHOW_DIVIDER_BEGINNING;
            i2 = Math.max(getChildAt(i).getMeasuredHeight(), i2);
        }
        int i3 = LinearLayout_divider;
        i = LinearLayout_divider;
        while (i3 < childCount) {
            int i4;
            View childAt = getChildAt(i3);
            if (childAt == null || childAt.getVisibility() == 8) {
                i4 = i;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.weight > 0.0f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    i += i2;
                } else {
                    i += childAt.getMeasuredHeight();
                }
                i4 = (layoutParams.rightMargin + layoutParams.leftMargin) + i;
            }
            i3 += SHOW_DIVIDER_BEGINNING;
            i = i4;
        }
        setMeasuredDimension(getMeasuredWidth(), (getPaddingLeft() + getPaddingRight()) + i);
    }

    void drawDividersHorizontal(Canvas canvas) {
        int childCount = getChildCount();
        int i = LinearLayout_divider;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawVerticalDivider(canvas, childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
            i += SHOW_DIVIDER_BEGINNING;
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            drawVerticalDivider(canvas, childAt2 == null ? (getWidth() - getPaddingRight()) - this.mDividerWidth : childAt2.getRight());
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int childCount = getChildCount();
        int i = LinearLayout_divider;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin);
            }
            i += SHOW_DIVIDER_BEGINNING;
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            drawHorizontalDivider(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : childAt2.getBottom());
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & SHOW_DIVIDER_BEGINNING) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.mShowDividers & SHOW_DIVIDER_END) != 0;
            } else {
                if ((this.mShowDividers & SHOW_DIVIDER_MIDDLE) == 0) {
                    return false;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (hasDividerBeforeChildAt(indexOfChild)) {
            if (orientation == SHOW_DIVIDER_BEGINNING) {
                layoutParams.topMargin = this.mDividerHeight;
            } else {
                layoutParams.leftMargin = this.mDividerWidth;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && hasDividerBeforeChildAt(childCount)) {
            if (orientation == SHOW_DIVIDER_BEGINNING) {
                layoutParams.bottomMargin = this.mDividerHeight;
            } else {
                layoutParams.rightMargin = this.mDividerWidth;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (getOrientation() == SHOW_DIVIDER_BEGINNING) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mUseLargestChild) {
            switch (getOrientation()) {
                case LinearLayout_divider /*0*/:
                    useLargestChildHorizontal();
                case SHOW_DIVIDER_BEGINNING /*1*/:
                    useLargestChildVertical();
                default:
            }
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = LinearLayout_divider;
                this.mDividerHeight = LinearLayout_divider;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
            invalidate();
        }
        this.mShowDividers = i;
    }
}
