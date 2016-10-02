package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.GridLayout;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.cq;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qk;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rt;
import com.google.android.gms.p006b.ru;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@op
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public final class C0413c extends C0412v implements OnAudioFocusChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map f2196a;
    private final ag f2197b;
    private int f2198c;
    private int f2199d;
    private MediaPlayer f2200e;
    private Uri f2201f;
    private int f2202g;
    private int f2203h;
    private int f2204i;
    private int f2205j;
    private int f2206k;
    private float f2207l;
    private boolean f2208m;
    private boolean f2209n;
    private int f2210o;
    private C0430u f2211p;

    static {
        Map hashMap = new HashMap();
        f2196a = hashMap;
        hashMap.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        f2196a.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        f2196a.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        f2196a.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        f2196a.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f2196a.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f2196a.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f2196a.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f2196a.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        f2196a.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f2196a.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f2196a.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f2196a.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f2196a.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        f2196a.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        f2196a.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public C0413c(Context context, ag agVar) {
        super(context);
        this.f2198c = 0;
        this.f2199d = 0;
        this.f2207l = 1.0f;
        setSurfaceTextureListener(this);
        this.f2197b = agVar;
        ag agVar2 = this.f2197b;
        cq.m3589a(agVar2.f2181e, agVar2.f2180d, "vpc");
        agVar2.f2185i = cq.m3588a(agVar2.f2181e);
        agVar2.f2190n = this;
    }

    private void m2646a(boolean z) {
        qk.m4383a();
        if (this.f2200e != null) {
            this.f2200e.reset();
            this.f2200e.release();
            this.f2200e = null;
            m2648b(0);
            if (z) {
                this.f2199d = 0;
                this.f2199d = 0;
            }
            m2651i();
        }
    }

    private void m2647b(float f) {
        if (this.f2200e != null) {
            try {
                this.f2200e.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        C0501b.m3025a("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private void m2648b(int i) {
        if (i == 3) {
            ag agVar = this.f2197b;
            agVar.f2189m = true;
            if (agVar.f2186j != null && agVar.f2187k == null) {
                cq.m3589a(agVar.f2181e, agVar.f2186j, "vfp");
                agVar.f2187k = cq.m3588a(agVar.f2181e);
            }
        } else if (this.f2198c == 3 && i != 3) {
            this.f2197b.f2189m = false;
        }
        this.f2198c = i;
    }

    private void m2649g() {
        Throwable e;
        qk.m4383a();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f2201f != null && surfaceTexture != null) {
            m2646a(false);
            try {
                this.f2200e = new MediaPlayer();
                this.f2200e.setOnBufferingUpdateListener(this);
                this.f2200e.setOnCompletionListener(this);
                this.f2200e.setOnErrorListener(this);
                this.f2200e.setOnInfoListener(this);
                this.f2200e.setOnPreparedListener(this);
                this.f2200e.setOnVideoSizeChangedListener(this);
                this.f2204i = 0;
                this.f2200e.setDataSource(getContext(), this.f2201f);
                this.f2200e.setSurface(new Surface(surfaceTexture));
                this.f2200e.setAudioStreamType(3);
                this.f2200e.setScreenOnWhilePlaying(true);
                this.f2200e.prepareAsync();
                m2648b(1);
            } catch (IOException e2) {
                e = e2;
                C0501b.m3026a("Failed to initialize MediaPlayer at " + this.f2201f, e);
                onError(this.f2200e, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                C0501b.m3026a("Failed to initialize MediaPlayer at " + this.f2201f, e);
                onError(this.f2200e, 1, 0);
            }
        }
    }

    private void m2650h() {
        if (m2652j() && this.f2200e.getCurrentPosition() > 0 && this.f2199d != 3) {
            qk.m4383a();
            m2647b(0.0f);
            this.f2200e.start();
            int currentPosition = this.f2200e.getCurrentPosition();
            long a = ar.m2244i().m4887a();
            while (m2652j() && this.f2200e.getCurrentPosition() == currentPosition) {
                if (ar.m2244i().m4887a() - a > 250) {
                    break;
                }
            }
            this.f2200e.pause();
            m2654l();
        }
    }

    private void m2651i() {
        qk.m4383a();
        AudioManager m = m2655m();
        if (m != null && this.f2209n) {
            if (m.abandonAudioFocus(this) == 1) {
                this.f2209n = false;
            } else {
                C0501b.m3025a("AdMediaPlayerView abandon audio focus failed");
            }
        }
    }

    private boolean m2652j() {
        return (this.f2200e == null || this.f2198c == -1 || this.f2198c == 0 || this.f2198c == 1) ? false : true;
    }

    private void m2653k() {
        qk.m4383a();
        this.f2209n = true;
        m2654l();
    }

    private void m2654l() {
        if (this.f2208m || !this.f2209n) {
            m2647b(0.0f);
        } else {
            m2647b(this.f2207l);
        }
    }

    private AudioManager m2655m() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    public final String m2656a() {
        return "MediaPlayer";
    }

    public final void m2657a(float f) {
        this.f2207l = f;
        m2654l();
    }

    public final void m2658a(int i) {
        "AdMediaPlayerView seek " + i;
        qk.m4383a();
        if (m2652j()) {
            this.f2200e.seekTo(i);
            this.f2210o = 0;
            return;
        }
        this.f2210o = i;
    }

    public final void m2659a(C0430u c0430u) {
        this.f2211p = c0430u;
    }

    public final void m2660b() {
        qk.m4383a();
        if (this.f2200e != null) {
            this.f2200e.stop();
            this.f2200e.release();
            this.f2200e = null;
            m2648b(0);
            this.f2199d = 0;
            m2651i();
        }
        ag agVar = this.f2197b;
        if (((Boolean) ar.m2249n().m3580a(ck.f3082u)).booleanValue() && !agVar.f2191o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", agVar.f2178b);
            bundle.putString("player", agVar.f2190n.m2636a());
            for (ru ruVar : agVar.f2182f.m4507a()) {
                bundle.putString("fps_c_" + ruVar.f4066a, Integer.toString(ruVar.f4070e));
                bundle.putString("fps_p_" + ruVar.f4066a, Double.toString(ruVar.f4069d));
            }
            for (int i = 0; i < agVar.f2183g.length; i++) {
                String str = agVar.f2184h[i];
                if (str != null) {
                    bundle.putString("fh_" + Long.valueOf(agVar.f2183g[i]), str);
                }
            }
            ar.m2240e();
            rd.m4416a(agVar.f2177a, agVar.f2179c.f2539b, "gmob-apps", bundle, true);
            agVar.f2191o = true;
        }
    }

    public final void m2661c() {
        qk.m4383a();
        if (m2652j()) {
            this.f2200e.start();
            m2648b(3);
            rd.f4041a.post(new C0419i(this));
        }
        this.f2199d = 3;
    }

    public final void m2662d() {
        qk.m4383a();
        if (m2652j() && this.f2200e.isPlaying()) {
            this.f2200e.pause();
            m2648b(4);
            rd.f4041a.post(new C0420j(this));
        }
        this.f2199d = 4;
    }

    public final void m2663e() {
        this.f2208m = true;
        m2654l();
    }

    public final void m2664f() {
        this.f2208m = false;
        m2654l();
    }

    public final int getCurrentPosition() {
        return m2652j() ? this.f2200e.getCurrentPosition() : 0;
    }

    public final int getDuration() {
        return m2652j() ? this.f2200e.getDuration() : -1;
    }

    public final int getVideoHeight() {
        return this.f2200e != null ? this.f2200e.getVideoHeight() : 0;
    }

    public final int getVideoWidth() {
        return this.f2200e != null ? this.f2200e.getVideoWidth() : 0;
    }

    public final void onAudioFocusChange(int i) {
        if (i > 0) {
            m2653k();
        } else if (i < 0) {
            qk.m4383a();
            this.f2209n = false;
            m2654l();
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f2204i = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        qk.m4383a();
        m2648b(5);
        this.f2199d = 5;
        rd.f4041a.post(new C0415e(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f2196a.get(Integer.valueOf(i));
        String str2 = (String) f2196a.get(Integer.valueOf(i2));
        C0501b.m3025a("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m2648b(-1);
        this.f2199d = -1;
        rd.f4041a.post(new C0416f(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f2196a.get(Integer.valueOf(i2));
        "AdMediaPlayerView MediaPlayer info: " + ((String) f2196a.get(Integer.valueOf(i))) + ":" + str;
        qk.m4383a();
        return true;
    }

    protected final void onMeasure(int i, int i2) {
        int defaultSize = C0413c.getDefaultSize(this.f2202g, i);
        int defaultSize2 = C0413c.getDefaultSize(this.f2203h, i2);
        if (this.f2202g > 0 && this.f2203h > 0) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.f2202g * defaultSize2 < this.f2203h * size) {
                    defaultSize = (this.f2202g * defaultSize2) / this.f2203h;
                } else if (this.f2202g * defaultSize2 > this.f2203h * size) {
                    defaultSize2 = (this.f2203h * size) / this.f2202g;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.f2203h * size) / this.f2202g;
                if (mode2 != GridLayout.UNDEFINED || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.f2202g * defaultSize2) / this.f2203h;
                if (mode == GridLayout.UNDEFINED && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.f2202g;
                defaultSize = this.f2203h;
                if (mode2 != GridLayout.UNDEFINED || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.f2202g * defaultSize2) / this.f2203h;
                }
                if (mode == GridLayout.UNDEFINED && r1 > size) {
                    defaultSize2 = (this.f2203h * size) / this.f2202g;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (VERSION.SDK_INT == 16) {
            if ((this.f2205j > 0 && this.f2205j != defaultSize) || (this.f2206k > 0 && this.f2206k != defaultSize2)) {
                m2650h();
            }
            this.f2205j = defaultSize;
            this.f2206k = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        qk.m4383a();
        m2648b(2);
        ag agVar = this.f2197b;
        if (agVar.f2185i != null && agVar.f2186j == null) {
            cq.m3589a(agVar.f2181e, agVar.f2185i, "vfr");
            agVar.f2186j = cq.m3588a(agVar.f2181e);
        }
        rd.f4041a.post(new C0414d(this));
        this.f2202g = mediaPlayer.getVideoWidth();
        this.f2203h = mediaPlayer.getVideoHeight();
        if (this.f2210o != 0) {
            m2658a(this.f2210o);
        }
        m2650h();
        "AdMediaPlayerView stream dimensions: " + this.f2202g + " x " + this.f2203h;
        C0501b.m3027a(4);
        if (this.f2199d == 3) {
            m2661c();
        }
        AudioManager m = m2655m();
        if (!(m == null || this.f2209n)) {
            if (m.requestAudioFocus(this, 3, 2) == 1) {
                m2653k();
            } else {
                C0501b.m3025a("AdMediaPlayerView audio focus request failed");
            }
        }
        m2654l();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        qk.m4383a();
        m2649g();
        rd.f4041a.post(new C0417g(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qk.m4383a();
        if (this.f2200e != null && this.f2210o == 0) {
            this.f2210o = this.f2200e.getCurrentPosition();
        }
        rd.f4041a.post(new C0418h(this));
        m2646a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object obj = 1;
        qk.m4383a();
        Object obj2 = this.f2199d == 3 ? 1 : null;
        if (!(this.f2202g == i && this.f2203h == i2)) {
            obj = null;
        }
        if (this.f2200e != null && obj2 != null && r1 != null) {
            if (this.f2210o != 0) {
                m2658a(this.f2210o);
            }
            m2661c();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i;
        ag agVar = this.f2197b;
        if (agVar.f2187k != null && agVar.f2188l == null) {
            cq.m3589a(agVar.f2181e, agVar.f2187k, "vff");
            cq.m3589a(agVar.f2181e, agVar.f2180d, "vtt");
            agVar.f2188l = cq.m3588a(agVar.f2181e);
        }
        long c = ar.m2244i().m4889c();
        if (agVar.f2189m && agVar.f2192p && agVar.f2193q != -1) {
            double toNanos = ((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - agVar.f2193q));
            rt rtVar = agVar.f2182f;
            rtVar.f4064d++;
            i = 0;
            while (i < rtVar.f4062b.length) {
                if (rtVar.f4062b[i] <= toNanos && toNanos < rtVar.f4061a[i]) {
                    int[] iArr = rtVar.f4063c;
                    iArr[i] = iArr[i] + 1;
                }
                if (toNanos < rtVar.f4062b[i]) {
                    break;
                }
                i++;
            }
        }
        agVar.f2192p = agVar.f2189m;
        agVar.f2193q = c;
        c = ((Long) ar.m2249n().m3580a(ck.f3084w)).longValue();
        long currentPosition = (long) getCurrentPosition();
        i = 0;
        while (i < agVar.f2184h.length) {
            if (agVar.f2184h[i] != null || c <= Math.abs(currentPosition - agVar.f2183g[i])) {
                i++;
            } else {
                String[] strArr = agVar.f2184h;
                Bitmap bitmap = getBitmap(8, 8);
                currentPosition = 0;
                c = 63;
                int i2 = 0;
                while (i2 < 8) {
                    int i3 = 0;
                    long j = currentPosition;
                    currentPosition = c;
                    while (i3 < 8) {
                        int pixel = bitmap.getPixel(i3, i2);
                        j |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > NotificationCompat.FLAG_HIGH_PRIORITY ? 1 : 0) << ((int) currentPosition);
                        i3++;
                        currentPosition--;
                    }
                    i2++;
                    c = currentPosition;
                    currentPosition = j;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(currentPosition)});
                return;
            }
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        "AdMediaPlayerView size changed: " + i + " x " + i2;
        qk.m4383a();
        this.f2202g = mediaPlayer.getVideoWidth();
        this.f2203h = mediaPlayer.getVideoHeight();
        if (this.f2202g != 0 && this.f2203h != 0) {
            requestLayout();
        }
    }

    public final void setMimeType(String str) {
    }

    public final void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public final void setVideoURI(Uri uri) {
        this.f2201f = uri;
        this.f2210o = 0;
        m2649g();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
