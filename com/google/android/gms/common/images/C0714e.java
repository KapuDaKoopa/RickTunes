package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.C0724g;
import com.google.android.gms.p006b.wi;
import com.google.android.gms.p006b.wj;
import com.google.android.gms.p006b.wk;

/* renamed from: com.google.android.gms.common.images.e */
public abstract class C0714e {
    final C0715f f4770a;
    protected int f4771b;
    protected C0710a f4772c;
    protected int f4773d;

    protected abstract void m5383a();

    final void m5384a(Context context, Bitmap bitmap) {
        C0724g.m5550a(bitmap);
        if ((this.f4773d & 1) != 0) {
            bitmap = wi.m4855a(bitmap);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        if (this.f4772c != null) {
            C0710a c0710a = this.f4772c;
            Uri uri = this.f4770a.f4774a;
        }
        m5383a();
    }

    final void m5385a(Context context, wj wjVar) {
        if (this.f4771b != 0) {
            int i = this.f4771b;
            Resources resources = context.getResources();
            if (this.f4773d > 0) {
                wk wkVar = new wk(i, this.f4773d);
                if (((Drawable) wjVar.m40a((Object) wkVar)) == null) {
                    Object drawable = resources.getDrawable(i);
                    if ((this.f4773d & 1) != 0) {
                        Bitmap bitmap;
                        if (drawable == null) {
                            bitmap = null;
                        } else if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                            bitmap = createBitmap;
                        }
                        drawable = new BitmapDrawable(resources, wi.m4855a(bitmap));
                    }
                    wjVar.m41a(wkVar, drawable);
                }
            } else {
                resources.getDrawable(i);
            }
        }
        if (this.f4772c != null) {
            C0710a c0710a = this.f4772c;
            Uri uri = this.f4770a.f4774a;
        }
        m5383a();
    }
}
