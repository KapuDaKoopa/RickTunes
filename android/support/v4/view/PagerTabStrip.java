package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.C0772e;

public class PagerTabStrip extends PagerTitleStrip {
    private int f111f;
    private int f112g;
    private int f113h;
    private int f114i;
    private int f115j;
    private int f116k;
    private final Paint f117l;
    private final Rect f118m;
    private int f119n;
    private boolean f120o;
    private boolean f121p;
    private int f122q;
    private boolean f123r;
    private float f124s;
    private float f125t;
    private int f126u;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117l = new Paint();
        this.f118m = new Rect();
        this.f119n = 255;
        this.f120o = false;
        this.f121p = false;
        this.f111f = this.e;
        this.f117l.setColor(this.f111f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f112g = (int) ((3.0f * f) + 0.5f);
        this.f113h = (int) ((6.0f * f) + 0.5f);
        this.f114i = (int) (64.0f * f);
        this.f116k = (int) ((16.0f * f) + 0.5f);
        this.f122q = (int) ((1.0f * f) + 0.5f);
        this.f115j = (int) ((f * 32.0f) + 0.5f);
        this.f126u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new ab(this));
        this.d.setFocusable(true);
        this.d.setOnClickListener(new ac(this));
        if (getBackground() == null) {
            this.f120o = true;
        }
    }

    final void m96a(int i, float f, boolean z) {
        Rect rect = this.f118m;
        int height = getHeight();
        int i2 = height - this.f112g;
        rect.set(this.c.getLeft() - this.f116k, i2, this.c.getRight() + this.f116k, height);
        super.m93a(i, f, z);
        this.f119n = (int) ((Math.abs(f - 0.5f) * 2.0f) * 255.0f);
        rect.union(this.c.getLeft() - this.f116k, i2, this.c.getRight() + this.f116k, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f120o;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f115j);
    }

    public int getTabIndicatorColor() {
        return this.f111f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.f116k;
        int right = this.c.getRight() + this.f116k;
        int i = height - this.f112g;
        this.f117l.setColor((this.f119n << 24) | (this.f111f & 16777215));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f117l);
        if (this.f120o) {
            this.f117l.setColor(-16777216 | (this.f111f & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f122q), (float) (getWidth() - getPaddingRight()), (float) height, this.f117l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f123r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                this.f124s = x;
                this.f125t = y;
                this.f123r = false;
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (x >= ((float) (this.c.getLeft() - this.f116k))) {
                    if (x > ((float) (this.c.getRight() + this.f116k))) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                }
                this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                break;
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                if (Math.abs(x - this.f124s) > ((float) this.f126u) || Math.abs(y - this.f125t) > ((float) this.f126u)) {
                    this.f123r = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f121p) {
            this.f120o = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f121p) {
            this.f120o = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f121p) {
            this.f120o = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f120o = z;
        this.f121p = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f113h) {
            i4 = this.f113h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f111f = i;
        this.f117l.setColor(this.f111f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f114i) {
            i = this.f114i;
        }
        super.setTextSpacing(i);
    }
}
