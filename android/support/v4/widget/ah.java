package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.an;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

final class ah {
    private static final Interpolator f325a;
    private final Paint f326b;
    private final RectF f327c;
    private float f328d;
    private long f329e;
    private long f330f;
    private boolean f331g;
    private int f332h;
    private int f333i;
    private int f334j;
    private int f335k;
    private View f336l;
    private Rect f337m;

    static {
        f325a = C0114a.m627a();
    }

    public ah(View view) {
        this.f326b = new Paint();
        this.f327c = new RectF();
        this.f337m = new Rect();
        this.f336l = view;
        this.f332h = -1291845632;
        this.f333i = GridLayout.UNDEFINED;
        this.f334j = 1291845632;
        this.f335k = 436207616;
    }

    private void m651a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f326b.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f325a.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f326b);
        canvas.restore();
    }

    private void m652a(Canvas canvas, int i, int i2) {
        this.f326b.setColor(this.f332h);
        canvas.drawCircle((float) i, (float) i2, ((float) i) * this.f328d, this.f326b);
    }

    final void m653a() {
        if (!this.f331g) {
            this.f328d = 0.0f;
            this.f329e = AnimationUtils.currentAnimationTimeMillis();
            this.f331g = true;
            this.f336l.postInvalidate();
        }
    }

    final void m654a(float f) {
        this.f328d = f;
        this.f329e = 0;
        an.m372c(this.f336l);
    }

    final void m655a(int i, int i2) {
        this.f337m.left = 0;
        this.f337m.top = 0;
        this.f337m.right = i;
        this.f337m.bottom = i2;
    }

    final void m656a(Canvas canvas) {
        int width = this.f337m.width();
        int height = this.f337m.height();
        int i = width / 2;
        int i2 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.f337m);
        if (this.f331g || this.f330f > 0) {
            Canvas canvas2;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.f329e) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - this.f329e) % 2000)) / 20.0f;
            Object obj;
            if (this.f331g) {
                obj = null;
            } else if (currentAnimationTimeMillis - this.f330f >= 1000) {
                this.f330f = 0;
                return;
            } else {
                float f2 = (((float) ((currentAnimationTimeMillis - this.f330f) % 1000)) / 10.0f) / 100.0f;
                f2 = f325a.getInterpolation(f2) * ((float) i);
                this.f327c.set(((float) i) - f2, 0.0f, f2 + ((float) i), (float) height);
                canvas.saveLayerAlpha(this.f327c, 0, 0);
                obj = 1;
            }
            if (j == 0) {
                canvas.drawColor(this.f332h);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.f335k);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.f332h);
            } else if (f < 50.0f || f >= 75.0f) {
                canvas.drawColor(this.f334j);
            } else {
                canvas.drawColor(this.f333i);
            }
            if (f >= 0.0f && f <= 25.0f) {
                canvas2 = canvas;
                m651a(canvas2, (float) i, (float) i2, this.f332h, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                canvas2 = canvas;
                m651a(canvas2, (float) i, (float) i2, this.f333i, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                canvas2 = canvas;
                m651a(canvas2, (float) i, (float) i2, this.f334j, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                canvas2 = canvas;
                m651a(canvas2, (float) i, (float) i2, this.f335k, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                canvas2 = canvas;
                m651a(canvas2, (float) i, (float) i2, this.f332h, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.f328d <= 0.0f || r9 == null) {
                width = save;
            } else {
                canvas.restoreToCount(save);
                width = canvas.save();
                canvas.clipRect(this.f337m);
                m652a(canvas, i, i2);
            }
            an.m372c(this.f336l);
            save = width;
        } else if (this.f328d > 0.0f && ((double) this.f328d) <= 1.0d) {
            m652a(canvas, i, i2);
        }
        canvas.restoreToCount(save);
    }

    final void m657b() {
        if (this.f331g) {
            this.f328d = 0.0f;
            this.f330f = AnimationUtils.currentAnimationTimeMillis();
            this.f331g = false;
            this.f336l.postInvalidate();
        }
    }
}
