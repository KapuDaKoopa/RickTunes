package com.andromo.dev576782.app537736;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import java.io.IOException;

public final class fn {
    MediaPlayer f919a;
    volatile gn f920b;
    volatile fr f921c;
    gj f922d;
    String f923e;
    boolean f924f;
    long f925g;
    long f926h;
    go f927i;
    OnPreparedListener f928j;
    OnCompletionListener f929k;
    OnSeekCompleteListener f930l;
    OnErrorListener f931m;
    OnInfoListener f932n;
    private OnPreparedListener f933o;
    private OnCompletionListener f934p;
    private OnErrorListener f935q;
    private OnBufferingUpdateListener f936r;
    private OnVideoSizeChangedListener f937s;
    private gk f938t;
    private gl f939u;

    fn() {
        this.f922d = gj.NONE;
        this.f923e = "";
        this.f933o = new fo(this);
        this.f934p = new fp(this);
        this.f935q = new fq(this);
        this.f919a = new MediaPlayer();
        this.f920b = gn.IDLE;
        this.f921c = fr.f943a;
        this.f919a.setOnPreparedListener(this.f933o);
        this.f919a.setOnCompletionListener(this.f934p);
        this.f919a.setOnErrorListener(this.f935q);
    }

    private boolean m1455j() {
        return this.f920b == gn.PREPARING;
    }

    public final void m1456a() {
        if (m1455j()) {
            new Thread(new gm(this.f919a)).start();
        } else if (this.f919a != null) {
            this.f919a.release();
        }
        this.f919a = new MediaPlayer();
        m1460a(gn.IDLE);
        this.f921c = fr.f943a;
        if (this.f938t != null) {
            gk gkVar = this.f938t;
            fr frVar = fr.f943a;
        }
        this.f922d = gj.NONE;
        this.f923e = "";
        this.f919a.setOnPreparedListener(this.f933o);
        this.f919a.setOnCompletionListener(this.f934p);
        this.f919a.setOnErrorListener(this.f935q);
        if (this.f936r != null) {
            this.f919a.setOnBufferingUpdateListener(this.f936r);
        }
        if (this.f932n != null) {
            this.f919a.setOnInfoListener(this.f932n);
        }
        if (this.f930l != null) {
            this.f919a.setOnSeekCompleteListener(this.f930l);
        }
        if (this.f937s != null) {
            this.f919a.setOnVideoSizeChangedListener(this.f937s);
        }
    }

    public final void m1457a(float f, float f2) {
        m1459a(fr.f956n);
        if (m1464b(fr.f956n)) {
            this.f919a.setVolume(f, f2);
            return;
        }
        throw new IllegalStateException();
    }

    public final void m1458a(int i) {
        m1459a(fr.f949g);
        if (m1464b(fr.f949g)) {
            this.f919a.seekTo(i);
            if (this.f924f) {
                this.f926h = (long) i;
                this.f925g = this.f920b == gn.STARTED ? System.currentTimeMillis() : 0;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    final void m1459a(fr frVar) {
        if (frVar.m1472a()) {
            this.f921c = frVar;
        }
        if (this.f938t != null) {
            gk gkVar = this.f938t;
        }
    }

    final void m1460a(gn gnVar) {
        if (gnVar != this.f920b) {
            if (this.f939u != null) {
                gl glVar = this.f939u;
            }
            this.f920b = gnVar;
        }
    }

    public final void m1461a(String str) {
        m1459a(fr.f944b);
        if (this.f920b == gn.IDLE) {
            try {
                this.f919a.setDataSource(str);
                this.f922d = gj.PATH_OR_URL;
                this.f923e = str;
                m1460a(gn.INITIALIZED);
                this.f924f = m1465c();
                return;
            } catch (IllegalArgumentException e) {
                m1460a(gn.ERROR);
                throw e;
            } catch (IllegalStateException e2) {
                m1460a(gn.ERROR);
                throw e2;
            } catch (IOException e3) {
                m1460a(gn.ERROR);
                throw e3;
            }
        }
        throw new IllegalStateException();
    }

    public final void m1462a(boolean z) {
        m1459a(fr.f955m);
        if (m1464b(fr.f955m)) {
            this.f919a.setLooping(z);
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean m1463b() {
        return m1466d() || m1467e() || this.f920b == gn.INITIALIZED || this.f920b == gn.PREPARING || this.f920b == gn.PREPARED || this.f920b == gn.PLAYBACK_COMPLETED;
    }

    public final boolean m1464b(fr frVar) {
        return frVar.m1473a(this.f920b);
    }

    public final boolean m1465c() {
        if (m1463b() && this.f922d == gj.PATH_OR_URL) {
            String str = this.f923e;
            boolean z = str != null && ((str.length() > 4 && "http:".equalsIgnoreCase(str.substring(0, 5))) || ((str.length() > 5 && "https:".equalsIgnoreCase(str.substring(0, 6))) || (str.length() > 4 && "rtsp:".equalsIgnoreCase(str.substring(0, 5)))));
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean m1466d() {
        m1459a(fr.f951i);
        return m1464b(fr.f951i) ? this.f919a.isPlaying() : false;
    }

    public final boolean m1467e() {
        return this.f920b == gn.PAUSED;
    }

    public final void m1468f() {
        m1459a(fr.f947e);
        if (m1464b(fr.f947e)) {
            this.f919a.pause();
            if (this.f924f && this.f925g > 0) {
                this.f926h += System.currentTimeMillis() - this.f925g;
                this.f925g = 0;
            }
            m1460a(gn.PAUSED);
            return;
        }
        throw new IllegalStateException();
    }

    public final void m1469g() {
        m1459a(fr.f958p);
        this.f919a.reset();
        if (this.f924f) {
            this.f925g = 0;
            this.f926h = 0;
        }
        m1460a(gn.IDLE);
    }

    public final synchronized void m1470h() {
        boolean j = m1455j();
        m1459a(fr.f959q);
        m1460a(gn.RELEASING);
        if (j) {
            new Thread(new gm(this.f919a)).start();
        } else {
            this.f919a.release();
        }
        m1460a(gn.RELEASED);
        this.f919a = null;
    }

    public final int m1471i() {
        m1459a(fr.f952j);
        if (!m1464b(fr.f952j)) {
            return 0;
        }
        if (!this.f924f) {
            return this.f919a.getCurrentPosition();
        }
        int currentPosition = this.f919a.getCurrentPosition();
        if (currentPosition != 0) {
            this.f926h = 0;
            this.f925g = 0;
            this.f924f = false;
            return currentPosition;
        } else if (this.f926h <= 0 && this.f925g <= 0) {
            return currentPosition;
        } else {
            long j = this.f926h;
            if (this.f925g > 0) {
                j += System.currentTimeMillis() - this.f925g;
            }
            return (int) j;
        }
    }
}
