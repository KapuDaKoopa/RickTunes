package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    private long f227a;
    private boolean f228b;
    private boolean f229c;
    private boolean f230d;
    private final Runnable f231e;
    private final Runnable f232f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f227a = -1;
        this.f228b = false;
        this.f229c = false;
        this.f230d = false;
        this.f231e = new C0115b(this);
        this.f232f = new C0116c(this);
    }

    private void m556a() {
        removeCallbacks(this.f231e);
        removeCallbacks(this.f232f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m556a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m556a();
    }
}
