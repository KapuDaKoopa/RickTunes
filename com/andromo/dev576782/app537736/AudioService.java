package com.andromo.dev576782.app537736;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;
import java.io.FileDescriptor;
import java.io.IOException;

public class AudioService extends Service implements OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, cb {
    private static int f512F;
    private static int f513G;
    private static long f514H;
    private static long f515I;
    private static long f516J;
    private static long f517K;
    private static long f518L;
    private static long f519M;
    private C0198do f520A;
    private final Handler f521B;
    private int f522C;
    private String f523D;
    private int f524E;
    private volatile String f525N;
    private hy f526O;
    private ex f527P;
    private boolean f528Q;
    private Runnable f529R;
    private int f530S;
    private int f531T;
    private ServiceConnection f532U;
    protected ct f533a;
    protected cs f534b;
    protected ca f535c;
    protected Playlist f536d;
    protected fn f537e;
    private final float f538f;
    private NotificationManager f539g;
    private Notification f540h;
    private boolean f541i;
    private boolean f542j;
    private WifiLock f543k;
    private String f544l;
    private boolean f545m;
    private boolean f546n;
    private boolean f547o;
    private AudioCacheService f548p;
    private AudioItem f549q;
    private int f550r;
    private String f551s;
    private String f552t;
    private boolean f553u;
    private boolean f554v;
    private ew f555w;
    private Runnable f556x;
    private hx f557y;
    private Runnable f558z;

    static {
        f512F = 3;
        f513G = 9;
        f514H = 20000;
        f515I = 60000;
        f516J = 10000;
        f517K = 30000;
        f518L = 15000;
        f519M = 10000;
    }

    public AudioService() {
        this.f538f = 0.1f;
        this.f533a = ct.Stopped;
        this.f534b = cs.NoFocusNoDuck;
        this.f535c = null;
        this.f521B = new Handler();
        this.f526O = new cm(this);
        this.f527P = new cn(this);
        this.f529R = new cp(this);
        this.f530S = -1;
        this.f531T = -1;
        this.f532U = new cr(this);
    }

    private boolean m1006S() {
        return (this.f549q == null || this.f549q.m988e() == null || !this.f549q.m988e().m1316b()) ? false : true;
    }

    private boolean m1007T() {
        return this.f537e != null && (this.f537e.m1466d() || this.f537e.m1467e());
    }

    private void m1008U() {
        if (this.f536d != null && this.f536d.m1162j() == -1) {
            this.f536d.m1143a(gx.f988a);
        }
    }

    private void m1009V() {
        if (this.f534b == cs.Focused && this.f535c != null && this.f535c.m1312a()) {
            this.f534b = cs.NoFocusNoDuck;
        }
    }

    private void m1010W() {
        m1084q();
        if (this.f557y != null) {
            this.f557y.cancel(true);
            this.f557y = null;
        }
    }

    private void m1011X() {
        boolean z = (this.f549q == null || this.f552t == null || this.f552t.length() == 0 || !AudioItem.m971a(this.f552t).equals(AudioItem.m971a(this.f549q.m985b()))) ? false : true;
        if (this.f533a == ct.Playing && m1043B() && z) {
            m1089v();
            m1056a(ct.Playing);
            aa();
        } else if (this.f533a == ct.Paused && m1044C() && z) {
            m1019a(false, true);
            aa();
        } else if (this.f533a == ct.Preparing && this.f537e != null && this.f537e.f920b == gn.PREPARING && m1013Z()) {
            m1089v();
            aa();
        } else {
            m1092y();
        }
    }

    private void m1012Y() {
        boolean z = this.f536d != null && AudioItem.m973a(this.f549q, this.f536d.m1161i());
        m1032e(z);
    }

    private boolean m1013Z() {
        return (this.f549q == null || this.f551s == null || this.f551s.length() == 0 || !AudioItem.m971a(this.f551s).equals(AudioItem.m971a(this.f549q.m985b()))) ? false : true;
    }

    private static int m1014a(Context context) {
        return gr.m1517a(context) ? f512F : f513G;
    }

    private void m1018a(String str, String str2) {
        if (this.f536d != null) {
            String a = this.f536d.m1140a();
            try {
                Intent intent = new Intent(this, Class.forName(a));
                intent.addFlags(603979776);
                if (this.f522C == 2 || a.endsWith("_Episode")) {
                    intent.putExtra("TRACK_INDEX", this.f536d.m1162j());
                    intent.putExtra("PLAYLIST", this.f536d);
                }
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
                if (this.f540h == null) {
                    this.f540h = new Notification();
                    this.f540h.icon = 2130837732;
                    this.f540h.flags = 2;
                }
                this.f540h.tickerText = str2;
                this.f540h.setLatestEventInfo(this, getString(2131230764), str, activity);
                startForeground(m1070d(), this.f540h);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void m1019a(boolean z, boolean z2) {
        if (this.f536d != null) {
            if (z) {
                this.f544l = this.f536d.m1149b();
                this.f549q = this.f536d.m1161i();
                if (!z2 || this.f549q == null) {
                    m1008U();
                    m1012Y();
                    return;
                } else if (this.f549q.m988e().m1316b()) {
                    if (!(this.f524E >= m1014a((Context) this) || this.f555w == null || this.f555w.m1414b().equals(this.f549q.m985b()))) {
                        m1082o();
                    }
                } else if (this.f549q.m986c() != null && this.f549q.m986c().length() > 0) {
                    m1051J();
                }
            }
            m1089v();
            m1056a(ct.Playing);
            m1018a(m1090w() + " (" + getString(2131231027) + ")", null);
            m1085r();
            return;
        }
        m1008U();
        m1012Y();
    }

    private void aa() {
        if (this.f536d != null) {
            int j = this.f536d.m1162j();
            if (j != this.f550r) {
                this.f550r = j;
                m1029d(j);
            }
        }
    }

    private void ab() {
        this.f539g.cancel(m1070d());
        this.f540h = null;
    }

    private void ac() {
        if (!this.f546n && !this.f547o) {
            this.f547o = true;
            bindService(new Intent("com.andromo.dev576782.app537736.AudioCache.action.START", null, this, AudioCacheService.class), this.f532U, 1);
        }
    }

    private void ad() {
        if (this.f546n) {
            unbindService(this.f532U);
            this.f546n = false;
            this.f547o = false;
        }
    }

    private void m1024b(int i) {
        if (this.f536d != null) {
            this.f536d.m1152c(i);
        }
        if (i != this.f550r) {
            this.f550r = i;
            m1029d(i);
        }
    }

    private void m1026c(int i) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.broadcast.POSITION_CHANGED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.SEEK_POSITION", i);
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILE", this.f549q != null ? this.f549q.m985b() : "");
        sendBroadcast(intent);
    }

    private void m1029d(int i) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.broadcast.TRACK_CHANGED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.TRACK_INDEX", i);
        sendBroadcast(intent);
    }

    private void m1030d(boolean z) {
        stopForeground(true);
        m1083p();
        m1082o();
        m1084q();
        m1010W();
        if (z && this.f537e != null) {
            if (this.f537e.m1466d() && this.f537e.m1464b(fr.f948f)) {
                fn fnVar = this.f537e;
                fnVar.m1459a(fr.f948f);
                if (fnVar.m1464b(fr.f948f)) {
                    fnVar.f919a.stop();
                    if (fnVar.f924f) {
                        fnVar.f925g = 0;
                        fnVar.f926h = 0;
                    }
                    fnVar.m1460a(gn.STOPPED);
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f537e.m1464b(fr.f958p)) {
                this.f537e.m1469g();
            }
            this.f537e.m1470h();
            this.f537e = null;
        }
        if (this.f543k.isHeld()) {
            this.f543k.release();
        }
    }

    static /* synthetic */ int m1031e(AudioService audioService) {
        int i = audioService.f524E + 1;
        audioService.f524E = i;
        return i;
    }

    private void m1032e(boolean z) {
        Object obj = 1;
        if (this.f536d != null) {
            Object obj2 = (z && this.f549q != null && this.f549q.equals(this.f536d.m1161i())) ? 1 : null;
            this.f549q = this.f536d.m1161i();
            if (this.f549q != null) {
                if (this.f544l == null || !this.f544l.equals(this.f536d.m1149b())) {
                    obj = null;
                }
                this.f544l = this.f536d.m1149b();
                if (obj == null) {
                    m1018a(m1090w() + " (" + getString(2131231027) + ")", null);
                }
                if (obj2 != null) {
                    m1011X();
                    return;
                } else if (z) {
                    m1071d(m1090w());
                    if (this.f549q.m988e().m1316b()) {
                        m1058a(this.f549q.m985b());
                    } else if (this.f549q.m986c() == null || this.f549q.m986c().length() == 0) {
                        m1086s();
                    } else {
                        m1051J();
                    }
                    m1011X();
                    return;
                } else {
                    m1082o();
                    m1081n();
                    m1010W();
                    m1092y();
                    return;
                }
            }
            this.f544l = null;
            m1035f(getString(2131231000));
            return;
        }
        this.f544l = null;
        m1035f(getString(2131231009));
    }

    private boolean m1033e(String str) {
        return (str == null || str.equals(this.f525N)) ? false : true;
    }

    private void m1035f(String str) {
        if (str != null && str.length() > 0) {
            Toast.makeText(this, str, 0).show();
        }
        m1056a(ct.Stopped);
        m1030d(true);
        m1009V();
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.ERROR_MESSAGE", str);
        sendBroadcast(intent);
    }

    public final int m1042A() {
        return this.f530S >= 0 ? this.f530S : this.f531T >= 0 ? this.f531T : this.f537e != null ? this.f537e.m1471i() : -1;
    }

    public final boolean m1043B() {
        return this.f537e != null ? this.f537e.m1466d() : false;
    }

    public final boolean m1044C() {
        return this.f537e != null && this.f537e.f920b == gn.PAUSED;
    }

    public final boolean m1045D() {
        return this.f533a == ct.Stopped;
    }

    public final boolean m1046E() {
        return (this.f533a == ct.Stopped || this.f533a == ct.Preparing) ? false : true;
    }

    public final boolean m1047F() {
        return this.f537e != null && this.f537e.m1465c();
    }

    public final int m1048G() {
        if (this.f537e == null || (this.f533a != ct.Playing && this.f533a != ct.Paused)) {
            return -1;
        }
        fn fnVar = this.f537e;
        fnVar.m1459a(fr.f953k);
        return fnVar.m1464b(fr.f953k) ? fnVar.f919a.getDuration() : 0;
    }

    public final hd m1049H() {
        return this.f536d != null ? this.f536d.m1156e() : hd.SEQUENTIAL;
    }

    public final he m1050I() {
        return this.f536d != null ? this.f536d.m1159g() : he.OFF;
    }

    final void m1051J() {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.broadcast.NOW_PLAYING_TEXT_CHANGED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.NOW_PLAYING_TEXT", m1091x());
        sendBroadcast(intent);
    }

    public final void m1052a() {
        this.f534b = cs.Focused;
        if (this.f533a == ct.Playing) {
            m1085r();
        }
    }

    public final void m1053a(int i) {
        if (this.f537e != null && this.f537e.m1464b(fr.f949g) && (this.f533a == ct.Playing || this.f533a == ct.Paused)) {
            this.f537e.m1458a(i);
        } else {
            this.f530S = i;
        }
    }

    void m1054a(Intent intent) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (this.f548p != null && this.f549q != null && m1007T() && this.f537e.m1464b(fr.f952j) && this.f548p.m952b(this.f549q.m985b())) {
            this.f548p.m942a(this.f549q.m985b(), this.f537e.m1471i());
        }
        int intExtra = intent.getIntExtra("com.andromo.dev576782.app537736.extra.TRACK_INDEX", -1);
        int intExtra2 = intent.getIntExtra("com.andromo.dev576782.app537736.extra.SEEK_TO", 0);
        int intExtra3 = intent.getIntExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", -1);
        if (intExtra3 != -1) {
            this.f522C = intExtra3;
            m1069c(intExtra3 == 2);
        }
        if (intExtra2 > 0) {
            this.f530S = intExtra2;
        }
        m1089v();
        this.f554v = false;
        this.f553u = false;
        if (this.f533a == ct.Preparing && this.f537e != null) {
            z = (this.f536d == null || this.f536d.m1161i() == null || this.f551s == null || this.f551s.length() == 0 || !AudioItem.m971a(this.f551s).equals(AudioItem.m971a(this.f536d.m1161i().m985b()))) ? false : true;
            if (!z) {
                this.f537e.m1456a();
                this.f533a = ct.Stopped;
            }
        }
        boolean z4 = intExtra != -1 ? this.f536d != null && AudioItem.m973a(this.f549q, this.f536d.m1148b(intExtra)) : false;
        z = intExtra == -1 || (this.f536d != null && this.f536d.m1162j() == intExtra);
        if (!(this.f536d == null || intExtra == -1)) {
            m1024b(intExtra);
        }
        if (this.f533a == ct.Paused && this.f549q != null && (intExtra == -1 || z4)) {
            if (!(!z4 || z || m1006S() || this.f537e == null || !this.f537e.m1464b(fr.f949g))) {
                this.f537e.m1458a(intExtra2);
                m1026c(intExtra2);
            }
            if (intExtra == -1) {
                z2 = false;
            }
            m1019a(z2, z4);
        } else if (this.f533a != ct.Playing) {
            if (!(this.f533a == ct.Stopped || this.f533a == ct.Preparing)) {
                if (!(this.f536d == null || this.f549q == null)) {
                    AudioItem i = this.f536d.m1161i();
                    if (!((this.f544l == null || this.f544l.equals(this.f536d.m1149b())) && this.f549q.equals(i))) {
                        z3 = true;
                    }
                }
                if (!z3) {
                    return;
                }
            }
            m1008U();
            m1012Y();
        } else if (intExtra != -1) {
            if (!(!z4 || z || m1006S() || this.f537e == null || !this.f537e.m1464b(fr.f949g))) {
                this.f537e.m1458a(intExtra2);
                m1026c(intExtra2);
            }
            m1032e(z4);
            if (this.f533a == ct.Playing) {
                m1056a(ct.Playing);
            }
        }
    }

    final void m1055a(Playlist playlist) {
        if (!(this.f536d == null || this.f536d.m1150b(playlist))) {
            m1056a(ct.Stopped);
            m1030d(true);
            m1009V();
        }
        this.f536d = playlist;
        if (this.f536d != null) {
            this.f536d.m1142a(this.f533a);
        }
    }

    protected final void m1056a(ct ctVar) {
        int i = 1;
        this.f533a = ctVar;
        if (this.f536d != null) {
            this.f536d.m1142a(this.f533a);
        }
        if (!(this.f549q == null || this.f548p == null)) {
            String b = this.f549q.m985b();
            if (b != null) {
                if (this.f533a == ct.Stopped) {
                    this.f548p.m944a(b, da.STOPPED);
                } else if (this.f533a == ct.Playing) {
                    fn fnVar = this.f537e;
                    if (this.f537e != null) {
                        fnVar = this.f537e;
                        int i2 = (fnVar.m1463b() && fnVar.f922d == gj.FILE_DESCRIPTOR) ? 1 : 0;
                        if (i2 != 0) {
                            this.f548p.m944a(b, da.PLAYING);
                        } else if (this.f537e.m1465c()) {
                            this.f548p.m944a(b, da.STREAMING);
                        } else {
                            fnVar = this.f537e;
                            if (!(fnVar.m1463b() && fnVar.f922d == gj.PATH_OR_URL && fnVar.f923e != null && fnVar.f923e.length() > 4 && "file:".equalsIgnoreCase(fnVar.f923e.substring(0, 5)))) {
                                i = 0;
                            }
                            if (i != 0) {
                                this.f548p.m944a(b, da.PLAYING);
                            }
                        }
                    } else {
                        AudioCacheService audioCacheService = this.f548p;
                        da daVar = (!this.f542j || this.f548p.m954c(b)) ? da.PLAYING : da.STREAMING;
                        audioCacheService.m944a(b, daVar);
                    }
                } else if (this.f533a == ct.Paused) {
                    if (this.f537e == null || !this.f537e.m1464b(fr.f952j)) {
                        this.f548p.m944a(b, da.PAUSED);
                    } else {
                        this.f548p.m943a(b, this.f537e.m1471i(), da.PAUSED);
                    }
                }
            }
        }
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.broadcast.STATE_CHANGED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.STATE", ctVar.name());
        intent.putExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", m1066c());
        intent.putExtra("com.andromo.dev576782.app537736.extra.CURRENT_ITEM", this.f549q);
        sendBroadcast(intent);
    }

    public final void m1057a(he heVar) {
        if (this.f536d != null) {
            this.f536d.m1145a(heVar);
        }
        if (this.f537e != null && this.f537e.m1464b(fr.f955m)) {
            try {
                this.f537e.m1462a(heVar == he.ONE_TRACK);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    protected final void m1058a(String str) {
        if (str != null) {
            if (!m1033e(str)) {
                m1063b(str);
            } else if (this.f557y == null || !str.equals(this.f557y.m1580a())) {
                this.f557y = new hx(this.f526O);
                if (this.f557y != null) {
                    this.f557y.execute(new String[]{str});
                }
            } else {
                "SevenTask already exists for spec: " + str;
            }
        }
    }

    protected final void m1059a(String str, long j) {
        if (str != null && j > 0 && m1033e(str)) {
            this.f558z = new ck(this, str);
            this.f521B.postDelayed(this.f558z, j);
        }
    }

    public final void m1060a(boolean z) {
        this.f534b = z ? cs.NoFocusCanDuck : cs.NoFocusNoDuck;
        if (this.f537e != null && this.f537e.m1466d()) {
            m1085r();
        }
    }

    final void m1061b() {
        this.f522C = 0;
    }

    final void m1062b(Intent intent) {
        if (this.f533a == ct.Paused && this.f549q != null) {
            if (this.f549q.equals((AudioItem) intent.getParcelableExtra("com.andromo.dev576782.app537736.extra.AUDIO_ITEM"))) {
                if (this.f548p != null && m1007T() && this.f537e.m1464b(fr.f952j) && this.f548p.m952b(this.f549q.m985b())) {
                    this.f548p.m942a(this.f549q.m985b(), this.f537e.m1471i());
                }
                m1089v();
                this.f554v = false;
                this.f553u = false;
                m1056a(ct.Playing);
                m1018a(m1090w() + " (" + getString(2131231027) + ")", null);
                m1085r();
            }
        }
    }

    protected void m1063b(String str) {
        if (str != null) {
            boolean z;
            if (this.f555w != null) {
                z = !str.equalsIgnoreCase(this.f555w.m1414b());
                if (z) {
                    this.f555w.m1413a();
                    this.f555w.cancel(true);
                    this.f555w = null;
                    this.f524E = 0;
                }
            } else {
                z = true;
            }
            if (z) {
                if (!str.equalsIgnoreCase(this.f523D)) {
                    this.f524E = 0;
                }
                this.f523D = str;
                if (this.f524E < m1014a((Context) this)) {
                    this.f555w = new ew(this.f527P, gr.m1517a((Context) this) ? 15000 : 240000);
                    this.f555w.execute(new String[]{str});
                }
            }
        }
    }

    protected void m1064b(String str, long j) {
        if (str != null && j > 0) {
            this.f556x = new cl(this, str);
            this.f521B.postDelayed(this.f556x, j);
        }
    }

    final void m1065b(boolean z) {
        if (this.f533a == ct.Playing) {
            if (this.f537e != null && this.f537e.m1464b(fr.f947e)) {
                m1056a(ct.Paused);
                this.f537e.m1468f();
                if (!(this.f548p == null || this.f549q == null || !this.f537e.m1464b(fr.f952j))) {
                    this.f548p.m942a(this.f549q.m985b(), this.f537e.m1471i());
                }
                m1030d(false);
                m1009V();
            }
        } else if (this.f533a == ct.Preparing) {
            m1056a(ct.Paused);
            m1030d(false);
            m1009V();
        } else if (this.f533a == ct.Stopped && !z) {
            if (this.f536d != null) {
                this.f544l = this.f536d.m1149b();
                this.f549q = this.f536d.m1161i();
            } else {
                this.f544l = null;
            }
            m1092y();
            m1056a(ct.Paused);
            m1030d(false);
            m1009V();
        }
    }

    int m1066c() {
        return this.f522C;
    }

    final void m1067c(Intent intent) {
        if (this.f533a == ct.Playing || this.f533a == ct.Paused || this.f533a == ct.Stopped) {
            m1089v();
            String uri = intent.getData().toString();
            String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.TITLE");
            String stringExtra2 = intent.getStringExtra("com.andromo.dev576782.app537736.extra.DESCRIPTION");
            cd cdVar = new cd();
            cdVar.f779a = uri;
            cdVar.f780b = stringExtra;
            cdVar.f781c = stringExtra2;
            cdVar.f782d = ce.f788b;
            this.f549q = cdVar.m1314a();
            m1024b(-2);
            m1089v();
            m1092y();
        }
    }

    final void m1068c(String str) {
        m1071d(str);
    }

    public final void m1069c(boolean z) {
        this.f545m = z;
        if (this.f545m) {
            ac();
        } else {
            ad();
        }
    }

    int m1070d() {
        return 1;
    }

    final void m1071d(String str) {
        if (this.f536d != null) {
            String a = this.f536d.m1140a();
            try {
                Intent intent = new Intent(this, Class.forName(a));
                intent.addFlags(603979776);
                if (this.f522C == 2 || a.endsWith("_Episode")) {
                    intent.putExtra("TRACK_INDEX", this.f536d.m1162j());
                    intent.putExtra("PLAYLIST", this.f536d);
                }
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
                if (this.f540h == null) {
                    this.f540h = new Notification();
                    this.f540h.icon = 2130837732;
                    this.f540h.flags = 2;
                }
                this.f540h.tickerText = null;
                this.f540h.setLatestEventInfo(this, getString(2131230764), str, activity);
                this.f539g.notify(m1070d(), this.f540h);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public String m1072e() {
        return "com.andromo.dev576782.app537736.audio.action.PLAY";
    }

    public String m1073f() {
        return "com.andromo.dev576782.app537736.audio.action.PAUSE";
    }

    public String m1074g() {
        return "com.andromo.dev576782.app537736.audio.action.STOP";
    }

    public String m1075h() {
        return "com.andromo.dev576782.app537736.audio.action.SKIP";
    }

    public String m1076i() {
        return "com.andromo.dev576782.app537736.audio.action.REWIND";
    }

    final void m1077j() {
        if (this.f533a == ct.Playing) {
            if (this.f537e != null && this.f537e.m1464b(fr.f947e)) {
                m1056a(ct.Paused);
                this.f537e.m1468f();
                if (!(this.f548p == null || this.f549q == null || !this.f537e.m1464b(fr.f952j))) {
                    this.f548p.m942a(this.f549q.m985b(), this.f537e.m1471i());
                }
                m1030d(false);
                m1009V();
            }
        } else if (this.f533a == ct.Preparing) {
            m1056a(ct.Paused);
            m1030d(false);
            m1009V();
        }
    }

    final void m1078k() {
        if (this.f533a == ct.Preparing && this.f537e != null) {
            this.f537e.m1456a();
            this.f533a = ct.Stopped;
        }
        if (this.f533a == ct.Playing || this.f533a == ct.Paused) {
            if (this.f536d == null || !(m1006S() || this.f537e == null || this.f537e.m1471i() < 2500)) {
                if (this.f537e != null && this.f537e.m1464b(fr.f949g)) {
                    this.f537e.m1458a(0);
                    m1026c(0);
                }
                if (this.f533a == ct.Paused) {
                    m1089v();
                    m1056a(ct.Playing);
                    m1018a(m1090w() + " (" + getString(2131231027) + ")", null);
                    m1085r();
                    return;
                }
                return;
            }
            this.f536d.m1164l();
            boolean a = AudioItem.m973a(this.f549q, this.f536d.m1161i());
            if (a && !m1006S() && this.f537e != null && this.f537e.m1464b(fr.f949g)) {
                this.f537e.m1458a(0);
                m1026c(0);
            }
            m1032e(a);
        } else if (this.f536d != null) {
            this.f536d.m1164l();
            m1012Y();
        }
    }

    final void m1079l() {
        if (this.f533a == ct.Preparing && this.f537e != null) {
            this.f537e.m1456a();
            this.f533a = ct.Stopped;
        }
        if (this.f536d != null && (this.f533a == ct.Playing || this.f533a == ct.Paused)) {
            this.f536d.m1143a(gx.f988a);
            boolean a = AudioItem.m973a(this.f549q, this.f536d.m1161i());
            if (a && !m1006S() && this.f537e != null && this.f537e.m1464b(fr.f949g)) {
                this.f537e.m1458a(0);
                m1026c(0);
            }
            m1032e(a);
        } else if (this.f536d != null) {
            this.f536d.m1143a(gx.f988a);
            m1012Y();
        } else {
            this.f544l = null;
            m1035f(getString(2131231009));
        }
    }

    final void m1080m() {
        if (this.f533a == ct.Playing || this.f533a == ct.Paused || this.f533a == ct.Preparing) {
            m1056a(ct.Stopped);
            m1082o();
            m1081n();
            m1010W();
            if (!(this.f548p == null || this.f549q == null)) {
                this.f548p.m942a(this.f549q.m985b(), 0);
            }
            m1030d(true);
            m1009V();
            stopSelf();
            m1051J();
        }
    }

    protected void m1081n() {
        if (this.f520A != null) {
            this.f520A.cancel(true);
            this.f520A = null;
        }
    }

    protected void m1082o() {
        m1083p();
        if (this.f555w != null) {
            this.f555w.cancel(true);
            this.f555w = null;
        }
    }

    public IBinder onBind(Intent intent) {
        return new ff(this);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m1081n();
        m1010W();
        if (this.f536d != null) {
            if (!(this.f548p == null || this.f549q == null)) {
                this.f548p.m942a(this.f549q.m985b(), 0);
            }
            if (this.f536d.m1163k()) {
                ab();
                this.f528Q = true;
                m1012Y();
                return;
            }
            m1080m();
            if (this.f536d.m1162j() == -1) {
                this.f549q = null;
            } else {
                this.f549q = this.f536d.m1161i();
            }
        }
    }

    public void onCreate() {
        this.f543k = ((WifiManager) getSystemService("wifi")).createWifiLock(1, "Andromo-AudioService");
        if (this.f543k != null) {
            this.f543k.setReferenceCounted(false);
        }
        this.f539g = (NotificationManager) getSystemService("notification");
        if (VERSION.SDK_INT >= 8) {
            this.f535c = new ca(getApplicationContext(), this);
        } else {
            this.f534b = cs.Focused;
        }
        if (this.f545m) {
            ac();
        }
    }

    public void onDestroy() {
        ad();
        m1082o();
        m1083p();
        m1010W();
        m1084q();
        m1081n();
        this.f521B.removeCallbacks(this.f529R);
        m1056a(ct.Stopped);
        m1030d(true);
        m1009V();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f537e != null && this.f537e.f921c == fr.f945c) {
            if (this.f554v) {
                "After retrying, got another onError: what=" + String.valueOf(i) + ", extra=" + String.valueOf(i2);
                this.f554v = false;
            } else {
                if (m1006S() && m1033e(this.f549q.m985b())) {
                    this.f557y = new hx(new cq(this));
                    this.f557y.execute(new String[]{this.f549q.m985b()});
                } else {
                    this.f521B.postDelayed(this.f529R, 10);
                    this.f537e.m1456a();
                    this.f533a = ct.Stopped;
                    this.f554v = true;
                }
                return true;
            }
        }
        m1035f(getString(2131231007));
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 701) {
            Toast.makeText(this, 2131230953, 1).show();
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f551s = "";
        this.f554v = false;
        this.f553u = false;
        if (this.f533a == ct.Paused) {
            ab();
            this.f552t = "";
        } else {
            m1056a(ct.Playing);
            this.f552t = this.f549q != null ? this.f549q.m985b() : "";
            String str = m1090w() + " (" + getString(2131231027) + ")";
            if (this.f528Q) {
                ab();
                m1018a(str, str);
                this.f528Q = false;
            } else {
                m1071d(str);
            }
            m1085r();
        }
        m1051J();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        this.f531T = -1;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z = false;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.andromo.dev576782.app537736.audio.action.PLAY".equals(action)) {
                m1054a(intent);
            } else if ("com.andromo.dev576782.app537736.audio.action.PAUSE".equals(action)) {
                m1065b(intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.IGNORE_PAUSE_IF_STOPPED", false));
            } else if ("com.andromo.dev576782.app537736.audio.action.SKIP".equals(action)) {
                m1079l();
            } else if ("com.andromo.dev576782.app537736.audio.action.STOP".equals(action)) {
                m1080m();
            } else if ("com.andromo.dev576782.app537736.audio.action.REWIND".equals(action)) {
                m1078k();
            } else if ("com.andromo.dev576782.app537736.audio.action.URL".equals(action)) {
                m1067c(intent);
            } else if ("com.andromo.dev576782.app537736.audio.action.START".equals(action)) {
                int intExtra = intent.getIntExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", -1);
                if (intExtra != -1) {
                    this.f522C = intExtra;
                    if (intExtra == 2) {
                        z = true;
                    }
                    m1069c(z);
                }
            } else if ("com.andromo.dev576782.app537736.audio.action.PAUSE_IF_PLAYING".equals(action)) {
                m1077j();
            } else if ("com.andromo.dev576782.app537736.audio.action.PLAY_IF_PAUSED".equals(action)) {
                m1062b(intent);
            }
        }
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }

    protected void m1083p() {
        if (this.f556x != null) {
            this.f521B.removeCallbacks(this.f556x);
            this.f556x = null;
        }
    }

    protected final void m1084q() {
        if (this.f558z != null) {
            this.f521B.removeCallbacks(this.f558z);
            this.f558z = null;
        }
    }

    final void m1085r() {
        boolean z = true;
        if (this.f537e != null) {
            if (this.f534b != cs.NoFocusNoDuck) {
                if (this.f534b == cs.NoFocusCanDuck) {
                    if (this.f537e.m1464b(fr.f956n)) {
                        this.f537e.m1457a(0.1f, 0.1f);
                    }
                } else if (this.f537e.m1464b(fr.f956n)) {
                    this.f537e.m1457a(1.0f, 1.0f);
                }
                if (this.f536d != null && this.f537e.m1464b(fr.f955m)) {
                    fn fnVar = this.f537e;
                    if (this.f536d.m1159g() != he.ONE_TRACK) {
                        z = false;
                    }
                    fnVar.m1462a(z);
                }
                if (this.f530S != -1) {
                    if (this.f537e.m1464b(fr.f949g) && this.f537e.m1471i() != this.f530S) {
                        this.f531T = this.f530S;
                        this.f537e.m1458a(this.f530S);
                    }
                    this.f530S = -1;
                }
                if (!this.f537e.m1466d() && this.f537e.m1464b(fr.f946d)) {
                    fn fnVar2 = this.f537e;
                    fnVar2.m1459a(fr.f946d);
                    if (fnVar2.m1464b(fr.f946d)) {
                        fnVar2.f919a.start();
                        if (fnVar2.f924f) {
                            fnVar2.f925g = System.currentTimeMillis();
                        }
                        fnVar2.m1460a(gn.STARTED);
                        if (this.f541i) {
                            m1056a(ct.Playing);
                            m1071d(m1090w() + " (" + getString(2131231027) + ")");
                            this.f541i = false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (this.f549q == null) {
                    return;
                }
                if (this.f549q.m988e().m1316b()) {
                    m1058a(this.f549q.m985b());
                } else if (this.f549q.m986c() == null || this.f549q.m986c().length() == 0) {
                    m1086s();
                }
            } else if (this.f537e.m1466d()) {
                this.f537e.m1468f();
                if (!(this.f548p == null || this.f549q == null || !this.f537e.m1464b(fr.f952j))) {
                    this.f548p.m942a(this.f549q.m985b(), this.f537e.m1471i());
                }
                this.f541i = true;
                m1056a(ct.Paused);
                m1071d(m1090w() + " (" + getString(2131231028) + ")");
            }
        }
    }

    protected void m1086s() {
        fm coVar = new co(this);
        if (this.f549q.m992i()) {
            Object bbVar = new bb(coVar);
            this.f520A = bbVar;
            try {
                String b = this.f549q.m985b();
                String d = this.f536d != null ? this.f536d.m1154d() : "";
                if (!(d == null || "".equals(d))) {
                    b = d + "/" + b;
                }
                AssetFileDescriptor openFd = getAssets().openFd(b);
                bbVar.execute(new AssetFileDescriptor[]{openFd});
                return;
            } catch (IOException e) {
                e.printStackTrace();
                this.f520A = null;
                return;
            }
        }
        Object flVar = new fl(coVar);
        this.f520A = flVar;
        flVar.execute(new String[]{this.f549q.m985b()});
    }

    final Playlist m1087t() {
        return this.f536d;
    }

    public final ct m1088u() {
        return this.f533a;
    }

    void m1089v() {
        if (this.f534b != cs.Focused && this.f535c != null && this.f535c.m1313a(1)) {
            this.f534b = cs.Focused;
        }
    }

    final String m1090w() {
        if (this.f549q == null || this.f549q.m985b() == null || "".equals(this.f549q.m985b())) {
            return getString(2131230952);
        }
        String c = this.f549q.m986c();
        return (c == null || "".equals(c)) ? this.f549q.m985b() : c;
    }

    final String m1091x() {
        if (this.f549q == null || this.f549q.m985b() == null || "".equals(this.f549q.m985b())) {
            return getString(2131230952);
        }
        String c = this.f549q.m986c();
        if (c == null || "".equals(c)) {
            c = this.f549q.m985b();
        }
        if (!(this.f522C == 2 || this.f549q.m987d() == null || "".equals(this.f549q.m987d()))) {
            c = c + " (" + this.f549q.m987d() + ")";
        }
        if (this.f533a != ct.Preparing || this.f549q.m992i() || this.f549q.m994k()) {
            return c;
        }
        return getString(2131230954, new Object[]{c});
    }

    final void m1092y() {
        boolean z;
        fn fnVar;
        aa();
        if (this.f533a == ct.Preparing && !this.f553u && !this.f554v && m1013Z()) {
            z = this.f537e != null && this.f537e.f920b == gn.PREPARING;
            if (z) {
                return;
            }
        }
        z = this.f554v;
        this.f551s = "";
        this.f552t = "";
        if (this.f549q != null) {
            m1089v();
            fn fnVar2;
            try {
                String b = this.f549q.m985b();
                if (b != null) {
                    this.f542j = this.f549q.m995l();
                    if (this.f537e == null) {
                        this.f537e = new fn();
                        fnVar2 = this.f537e;
                        Context applicationContext = getApplicationContext();
                        fnVar2.m1459a(fr.f957o);
                        fnVar2.f919a.setWakeMode(applicationContext, 1);
                        this.f537e.f928j = this;
                        this.f537e.f929k = this;
                        this.f537e.f931m = this;
                        fnVar2 = this.f537e;
                        fnVar2.f930l = this;
                        fnVar2.f919a.setOnSeekCompleteListener(this);
                        fnVar2 = this.f537e;
                        fnVar2.f932n = this;
                        fnVar2.f919a.setOnInfoListener(this);
                    } else if (this.f537e.m1464b(fr.f958p)) {
                        this.f537e.m1469g();
                    } else {
                        this.f537e.m1456a();
                    }
                    fnVar2 = this.f537e;
                    fnVar2.m1459a(fr.f954l);
                    if (fnVar2.m1464b(fr.f954l)) {
                        fnVar2.f919a.setAudioStreamType(3);
                        if (this.f549q.m992i()) {
                            String d = this.f536d != null ? this.f536d.m1154d() : "";
                            d = (d == null || "".equals(d)) ? b : d + "/" + b;
                            AssetFileDescriptor openFd = getAssets().openFd(d);
                            fnVar = this.f537e;
                            FileDescriptor fileDescriptor = openFd.getFileDescriptor();
                            long startOffset = openFd.getStartOffset();
                            long length = openFd.getLength();
                            fnVar.m1459a(fr.f944b);
                            if (fnVar.f920b == gn.IDLE) {
                                fnVar.f919a.setDataSource(fileDescriptor, startOffset, length);
                                fnVar.f922d = gj.FILE_DESCRIPTOR;
                                fnVar.f923e = "";
                                fnVar.m1460a(gn.INITIALIZED);
                                openFd.close();
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        if (this.f548p == null || !this.f548p.m954c(b)) {
                            this.f537e.m1461a(b);
                            if (this.f548p != null) {
                                this.f548p.m944a(b, da.STREAMING);
                            }
                        } else {
                            this.f537e.m1461a(VERSION.SDK_INT >= 16 ? this.f548p.m957e(b) : this.f548p.m958f(b));
                            this.f548p.m944a(b, da.PLAYING);
                        }
                        if (this.f549q.m988e().m1316b()) {
                            m1058a(b);
                        }
                        m1056a(ct.Preparing);
                        m1018a(m1090w() + " (" + getString(2131231026) + ")", null);
                        this.f551s = b;
                        fnVar2 = this.f537e;
                        fnVar2.m1459a(fr.f945c);
                        if (fnVar2.m1464b(fr.f945c)) {
                            fnVar2.f919a.prepareAsync();
                            fnVar2.m1460a(gn.PREPARING);
                            this.f553u = false;
                            try {
                                if (this.f542j) {
                                    this.f543k.acquire();
                                    return;
                                } else if (this.f543k.isHeld()) {
                                    this.f543k.release();
                                    return;
                                } else {
                                    return;
                                }
                            } catch (UnsupportedOperationException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                m1035f(getString(2131231010));
                return;
            } catch (IllegalArgumentException e2) {
                fnVar.m1460a(gn.ERROR);
                throw e2;
            } catch (IllegalStateException e3) {
                fnVar.m1460a(gn.ERROR);
                throw e3;
            } catch (IOException e4) {
                fnVar.m1460a(gn.ERROR);
                throw e4;
            } catch (IllegalStateException e32) {
                if (this.f553u) {
                    this.f553u = false;
                    e32.printStackTrace();
                    m1035f(getString(2131230999));
                    return;
                }
                this.f553u = true;
                this.f521B.postDelayed(this.f529R, 100);
                fr frVar = this.f537e.f921c;
                frVar = fr.f958p;
                frVar = this.f537e.f921c;
                frVar = fr.f959q;
                if (this.f537e.m1464b(fr.f958p)) {
                    try {
                        fnVar2 = this.f537e;
                        if (fnVar2.f927i == null) {
                            fnVar2.f927i = new go(fnVar2);
                        }
                        fnVar2.f927i.f981a.m1469g();
                        return;
                    } catch (IllegalStateException e322) {
                        e322.printStackTrace();
                        this.f537e.m1456a();
                        this.f533a = ct.Stopped;
                        return;
                    }
                }
                this.f537e.m1456a();
                this.f533a = ct.Stopped;
                return;
            } catch (IllegalArgumentException e22) {
                e22.printStackTrace();
                m1035f(getString(2131231007));
                return;
            } catch (IOException e42) {
                e42.printStackTrace();
                m1035f(getString(2131231007));
                return;
            }
        }
        m1035f(getString(2131230952));
    }

    public final AudioItem m1093z() {
        return this.f549q != null ? this.f549q : AudioItem.m968a();
    }
}
