package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.support.v4.p001b.C0035f;

/* renamed from: com.google.android.gms.common.images.b */
final class C0711b extends C0035f {
    protected final /* synthetic */ int m5381b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
