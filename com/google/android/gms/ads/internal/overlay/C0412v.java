package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* renamed from: com.google.android.gms.ads.internal.overlay.v */
public abstract class C0412v extends TextureView {
    public C0412v(Context context) {
        super(context);
    }

    public abstract String m2636a();

    public abstract void m2637a(float f);

    public abstract void m2638a(int i);

    public abstract void m2639a(C0430u c0430u);

    public abstract void m2640b();

    public abstract void m2641c();

    public abstract void m2642d();

    public abstract void m2643e();

    public abstract void m2644f();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setMimeType(String str);

    public abstract void setVideoPath(String str);
}
