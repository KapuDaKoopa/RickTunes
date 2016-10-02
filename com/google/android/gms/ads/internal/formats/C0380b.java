package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.op;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.b */
final class C0380b extends RelativeLayout {
    private static final float[] f2061a;
    private final RelativeLayout f2062b;
    private AnimationDrawable f2063c;

    static {
        f2061a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    }

    public C0380b(Context context, C0379a c0379a) {
        super(context);
        ax.m5527a((Object) c0379a);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f2061a, null, null));
        shapeDrawable.getPaint().setColor(c0379a.m2481c());
        this.f2062b = new RelativeLayout(context);
        this.f2062b.setLayoutParams(layoutParams);
        ar.m2242g().m4468a(this.f2062b, shapeDrawable);
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(c0379a.m2479a())) {
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            View textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(c0379a.m2479a());
            textView.setTextColor(c0379a.m2482d());
            textView.setTextSize((float) c0379a.m2483e());
            C0374z.m2455a();
            int a = C0500a.m3009a(context, 4);
            C0374z.m2455a();
            textView.setPadding(a, 0, C0500a.m3009a(context, 4), 0);
            this.f2062b.addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        View imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List<Drawable> b = c0379a.m2480b();
        if (b.size() > 1) {
            this.f2063c = new AnimationDrawable();
            for (Drawable addFrame : b) {
                this.f2063c.addFrame(addFrame, c0379a.m2484f());
            }
            ar.m2242g().m4468a(imageView, this.f2063c);
        } else if (b.size() == 1) {
            imageView.setImageDrawable((Drawable) b.get(0));
        }
        this.f2062b.addView(imageView);
        addView(this.f2062b);
    }

    public final ViewGroup m2485a() {
        return this.f2062b;
    }

    public final void onAttachedToWindow() {
        if (this.f2063c != null) {
            this.f2063c.start();
        }
        super.onAttachedToWindow();
    }
}
