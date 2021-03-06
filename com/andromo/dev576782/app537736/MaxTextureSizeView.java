package com.andromo.dev576782.app537736;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class MaxTextureSizeView extends View {
    public MaxTextureSizeView(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public MaxTextureSizeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public MaxTextureSizeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT >= 14) {
            "max openGL texture size: " + canvas.getMaximumBitmapWidth() + " x " + canvas.getMaximumBitmapHeight() + " (canvas " + (canvas.isHardwareAccelerated() ? "is" : "is NOT") + " hardware accelerated)";
            if (canvas.isHardwareAccelerated()) {
                ez.f886a = canvas.getMaximumBitmapWidth();
                ez.f887b = canvas.getMaximumBitmapHeight();
            }
        }
        ((ViewGroup) getParent()).removeView(this);
        setWillNotDraw(true);
    }
}
