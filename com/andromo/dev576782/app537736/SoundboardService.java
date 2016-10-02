package com.andromo.dev576782.app537736;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class SoundboardService extends AudioService {
    final void m1181a(Intent intent) {
        if (this.a == ct.Playing && this.e != null && this.e.m1464b(fr.f949g)) {
            this.e.m1458a(0);
        }
        super.m1054a(intent);
    }

    protected final void m1182b(String str) {
    }

    protected final void m1183b(String str, long j) {
    }

    final int m1184c() {
        return 1;
    }

    final int m1185d() {
        return 2;
    }

    public final String m1186e() {
        return "com.andromo.dev576782.app537736.soundboard.action.PLAY";
    }

    public final String m1187f() {
        return "com.andromo.dev576782.app537736.soundboard.action.PAUSE";
    }

    public final String m1188g() {
        return "com.andromo.dev576782.app537736.soundboard.action.STOP";
    }

    public final String m1189h() {
        return "com.andromo.dev576782.app537736.soundboard.action.SKIP";
    }

    public final String m1190i() {
        return "com.andromo.dev576782.app537736.soundboard.action.REWIND";
    }

    protected final void m1191n() {
    }

    protected final void m1192o() {
    }

    public IBinder onBind(Intent intent) {
        return new ff(this);
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        m1056a(ct.Playing);
        m1071d(m1090w() + " (" + getString(2131231027) + ")");
        m1085r();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.andromo.dev576782.app537736.soundboard.action.PLAY".equals(action)) {
                m1181a(intent);
            } else if ("com.andromo.dev576782.app537736.soundboard.action.PAUSE".equals(action)) {
                m1065b(true);
            } else if ("com.andromo.dev576782.app537736.soundboard.action.SKIP".equals(action)) {
                m1079l();
            } else if ("com.andromo.dev576782.app537736.soundboard.action.STOP".equals(action)) {
                m1080m();
            } else if ("com.andromo.dev576782.app537736.soundboard.action.REWIND".equals(action)) {
                m1078k();
            } else if ("com.andromo.dev576782.app537736.soundboard.action.URL".equals(action)) {
                m1067c(intent);
            } else if ("com.andromo.dev576782.app537736.soundboard.action.PAUSE_IF_PLAYING".equals(action)) {
                m1077j();
            } else if ("com.andromo.dev576782.app537736.soundboard.action.PLAY_IF_PAUSED".equals(action)) {
                m1062b(intent);
            }
        }
        return 2;
    }

    protected final void m1193p() {
    }

    protected final void m1194s() {
    }

    final void m1195v() {
        if (this.b != cs.Focused && this.c != null && this.c.m1313a(3)) {
            this.b = cs.Focused;
        }
    }
}
