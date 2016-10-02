package com.google.android.gms.p006b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.no */
public final class no extends AsyncTask {
    final /* synthetic */ nn f3688a;
    private final WebView f3689b;
    private Bitmap f3690c;

    public no(nn nnVar, WebView webView) {
        this.f3688a = nnVar;
        this.f3689b = webView;
    }

    private synchronized Boolean m4257a() {
        Boolean valueOf;
        int width = this.f3690c.getWidth();
        int height = this.f3690c.getHeight();
        if (width == 0 || height == 0) {
            valueOf = Boolean.valueOf(false);
        } else {
            int i = 0;
            for (int i2 = 0; i2 < width; i2 += 10) {
                for (int i3 = 0; i3 < height; i3 += 10) {
                    if (this.f3690c.getPixel(i2, i3) != 0) {
                        i++;
                    }
                }
            }
            valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
        }
        return valueOf;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4257a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        nn.m4247c(this.f3688a);
        if (bool.booleanValue() || this.f3688a.m4255c() || this.f3688a.f3684f <= 0) {
            this.f3688a.f3681c = bool.booleanValue();
            this.f3688a.f3685g.m2101a(this.f3688a.f3679a, true);
        } else if (this.f3688a.f3684f > 0) {
            if (C0501b.m3027a(2)) {
                C0501b.m3027a(3);
            }
            this.f3688a.f3682d.postDelayed(this.f3688a, this.f3688a.f3683e);
        }
    }

    protected final synchronized void onPreExecute() {
        this.f3690c = Bitmap.createBitmap(this.f3688a.f3687i, this.f3688a.f3686h, Config.ARGB_8888);
        this.f3689b.setVisibility(0);
        this.f3689b.measure(MeasureSpec.makeMeasureSpec(this.f3688a.f3687i, 0), MeasureSpec.makeMeasureSpec(this.f3688a.f3686h, 0));
        this.f3689b.layout(0, 0, this.f3688a.f3687i, this.f3688a.f3686h);
        this.f3689b.draw(new Canvas(this.f3690c));
        this.f3689b.invalidate();
    }
}
