package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.GridLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.gms.C0772e;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements bk {
    private static final int[] f94n;
    private static final int[] f95o;
    private static final ae f96q;
    ViewPager f97a;
    TextView f98b;
    TextView f99c;
    TextView f100d;
    int f101e;
    private int f102f;
    private float f103g;
    private int f104h;
    private int f105i;
    private boolean f106j;
    private boolean f107k;
    private final ad f108l;
    private WeakReference f109m;
    private int f110p;

    static {
        f94n = new int[]{16842804, 16842901, 16842904, 16842927};
        f95o = new int[]{16843660};
        if (VERSION.SDK_INT >= 14) {
            f96q = new ag();
        } else {
            f96q = new af();
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        this.f102f = -1;
        this.f103g = -1.0f;
        this.f108l = new ad();
        View textView = new TextView(context);
        this.f98b = textView;
        addView(textView);
        textView = new TextView(context);
        this.f99c = textView;
        addView(textView);
        textView = new TextView(context);
        this.f100d = textView;
        addView(textView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f94n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f98b.setTextAppearance(context, resourceId);
            this.f99c.setTextAppearance(context, resourceId);
            this.f100d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            this.f98b.setTextSize(0, f);
            this.f99c.setTextSize(0, f);
            this.f100d.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            dimensionPixelSize = obtainStyledAttributes.getColor(2, 0);
            this.f98b.setTextColor(dimensionPixelSize);
            this.f99c.setTextColor(dimensionPixelSize);
            this.f100d.setTextColor(dimensionPixelSize);
        }
        this.f105i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f101e = this.f99c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f98b.setEllipsize(TruncateAt.END);
        this.f99c.setEllipsize(TruncateAt.END);
        this.f100d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, f95o);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f98b);
            setSingleLineAllCaps(this.f99c);
            setSingleLineAllCaps(this.f100d);
        } else {
            this.f98b.setSingleLine();
            this.f99c.setSingleLine();
            this.f100d.setSingleLine();
        }
        this.f104h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f96q.m351a(textView);
    }

    void m93a(int i, float f, boolean z) {
        if (i != this.f102f) {
            m94a(i, this.f97a.getAdapter());
        } else if (!z && f == this.f103g) {
            return;
        }
        this.f107k = true;
        int measuredWidth = this.f98b.getMeasuredWidth();
        int measuredWidth2 = this.f99c.getMeasuredWidth();
        int measuredWidth3 = this.f100d.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        int i4 = (width - (paddingLeft + i2)) - i3;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        i3 = ((width - i3) - ((int) (f2 * ((float) i4)))) - i2;
        i4 = i3 + measuredWidth2;
        int baseline = this.f98b.getBaseline();
        measuredWidth2 = this.f99c.getBaseline();
        i2 = this.f100d.getBaseline();
        int max = Math.max(Math.max(baseline, measuredWidth2), i2);
        baseline = max - baseline;
        measuredWidth2 = max - measuredWidth2;
        max -= i2;
        i2 = this.f98b.getMeasuredHeight() + baseline;
        int measuredHeight = this.f99c.getMeasuredHeight() + measuredWidth2;
        i2 = Math.max(Math.max(i2, measuredHeight), this.f100d.getMeasuredHeight() + max);
        switch (this.f105i & 112) {
            case C0772e.MapAttrs_ambientEnabled /*16*/:
                height = (((height - paddingTop) - paddingBottom) - i2) / 2;
                i2 = height + baseline;
                measuredWidth2 += height;
                baseline = height + max;
                break;
            case 80:
                height = (height - paddingBottom) - i2;
                i2 = height + baseline;
                measuredWidth2 += height;
                baseline = height + max;
                break;
            default:
                i2 = paddingTop + baseline;
                measuredWidth2 += paddingTop;
                baseline = paddingTop + max;
                break;
        }
        this.f99c.layout(i3, measuredWidth2, i4, this.f99c.getMeasuredHeight() + measuredWidth2);
        measuredWidth2 = Math.min(paddingLeft, (i3 - this.f104h) - measuredWidth);
        this.f98b.layout(measuredWidth2, i2, measuredWidth + measuredWidth2, this.f98b.getMeasuredHeight() + i2);
        measuredWidth2 = Math.max((width - paddingRight) - measuredWidth3, this.f104h + i4);
        this.f100d.layout(measuredWidth2, baseline, measuredWidth2 + measuredWidth3, this.f100d.getMeasuredHeight() + baseline);
        this.f103g = f;
        this.f107k = false;
    }

    final void m94a(int i, aa aaVar) {
        CharSequence charSequence = null;
        int count = aaVar != null ? aaVar.getCount() : 0;
        this.f106j = true;
        CharSequence pageTitle = (i <= 0 || aaVar == null) ? null : aaVar.getPageTitle(i - 1);
        this.f98b.setText(pageTitle);
        TextView textView = this.f99c;
        pageTitle = (aaVar == null || i >= count) ? null : aaVar.getPageTitle(i);
        textView.setText(pageTitle);
        if (i + 1 < count && aaVar != null) {
            charSequence = aaVar.getPageTitle(i + 1);
        }
        this.f100d.setText(charSequence);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        count = MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), GridLayout.UNDEFINED);
        height = MeasureSpec.makeMeasureSpec(height, GridLayout.UNDEFINED);
        this.f98b.measure(count, height);
        this.f99c.measure(count, height);
        this.f100d.measure(count, height);
        this.f102f = i;
        if (!this.f107k) {
            m93a(i, this.f103g, false);
        }
        this.f106j = false;
    }

    final void m95a(aa aaVar, aa aaVar2) {
        if (aaVar != null) {
            aaVar.unregisterDataSetObserver(this.f108l);
            this.f109m = null;
        }
        if (aaVar2 != null) {
            aaVar2.registerDataSetObserver(this.f108l);
            this.f109m = new WeakReference(aaVar2);
        }
        if (this.f97a != null) {
            this.f102f = -1;
            this.f103g = -1.0f;
            m94a(this.f97a.getCurrentItem(), aaVar2);
            requestLayout();
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    public int getTextSpacing() {
        return this.f104h;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            aa adapter = viewPager.getAdapter();
            viewPager.m124a(this.f108l);
            viewPager.setOnAdapterChangeListener(this.f108l);
            this.f97a = viewPager;
            m95a(this.f109m != null ? (aa) this.f109m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f97a != null) {
            m95a(this.f97a.getAdapter(), null);
            this.f97a.m124a(null);
            this.f97a.setOnAdapterChangeListener(null);
            this.f97a = null;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f97a != null) {
            if (this.f103g >= 0.0f) {
                f = this.f103g;
            }
            m93a(this.f102f, f, true);
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        mode = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), GridLayout.UNDEFINED);
        i3 = MeasureSpec.makeMeasureSpec(i3, GridLayout.UNDEFINED);
        this.f98b.measure(makeMeasureSpec, i3);
        this.f99c.measure(makeMeasureSpec, i3);
        this.f100d.measure(makeMeasureSpec, i3);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(mode, this.f99c.getMeasuredHeight() + paddingTop));
        }
    }

    public void requestLayout() {
        if (!this.f106j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f105i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.f110p = ((int) (255.0f * f)) & 255;
        int i = (this.f110p << 24) | (this.f101e & 16777215);
        this.f98b.setTextColor(i);
        this.f100d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f101e = i;
        this.f99c.setTextColor(i);
        int i2 = (this.f110p << 24) | (this.f101e & 16777215);
        this.f98b.setTextColor(i2);
        this.f100d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f104h = i;
        requestLayout();
    }
}
