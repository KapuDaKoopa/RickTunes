package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.actionbarsherlock.widget.ShareActionProvider;
import com.google.android.gms.C0772e;
import java.io.File;
import java.io.IOException;

public class Audio98819 extends SherlockListActivity implements OnClickListener {
    private static boolean f423G;
    private static C0210l f424W;
    private PlaylistManagerReceiver f425A;
    private boolean f426B;
    private boolean f427C;
    private boolean f428D;
    private boolean f429E;
    private boolean f430F;
    private boolean f431H;
    private final Handler f432I;
    private br f433J;
    private View f434K;
    private int f435L;
    private String f436M;
    private String f437N;
    private String f438O;
    private String f439P;
    private String f440Q;
    private String f441R;
    private AudioItem f442S;
    private C0198do f443T;
    private volatile String f444U;
    private boolean f445V;
    private boolean f446X;
    private int f447Y;
    private boolean f448Z;
    int f449a;
    private ServiceConnection aa;
    private ServiceConnection ab;
    private cw ac;
    private Runnable ad;
    private Parcelable f450b;
    private MenuItem f451c;
    private boolean f452d;
    private boolean f453e;
    private boolean f454f;
    private int f455g;
    private Playlist f456h;
    private bu f457i;
    private gu f458j;
    private SeekBar f459k;
    private TextView f460l;
    private TextView f461m;
    private TextView f462n;
    private ImageView f463o;
    private ImageButton f464p;
    private ImageButton f465q;
    private Toast f466r;
    private String f467s;
    private boolean f468t;
    private boolean f469u;
    private AudioService f470v;
    private AudioServiceReceiver f471w;
    private boolean f472x;
    private AudioCacheService f473y;
    private SetRingtoneReceiver f474z;

    public class AudioCacheServiceReceiver extends BroadcastReceiver {
        final /* synthetic */ Audio98819 f419a;

        public void onReceive(Context context, Intent intent) {
            Audio98819 audio98819 = this.f419a;
            false;
        }
    }

    public class AudioServiceReceiver extends BroadcastReceiver {
        final /* synthetic */ Audio98819 f420a;

        public AudioServiceReceiver(Audio98819 audio98819) {
            this.f420a = audio98819;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!this.f420a.m849i()) {
                return;
            }
            Audio98819 audio98819;
            if ("com.andromo.dev576782.app537736.broadcast.STATE_CHANGED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.STATE");
                intent.getIntExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", 0);
                switch (bi.f746b[ct.valueOf(action).ordinal()]) {
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        if (this.f420a.f470v != null) {
                            this.f420a.m837e(this.f420a.f470v.m1091x());
                        }
                        this.f420a.m810a(true);
                        Audio98819.m851j(this.f420a);
                        if (this.f420a.f459k != null) {
                            this.f420a.f459k.setProgress(0);
                        }
                        this.f420a.m831d("0:00");
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        Audio98819.m858l(this.f420a);
                        this.f420a.m810a(false);
                        Audio98819.m851j(this.f420a);
                        if (!(this.f420a.f467s == null || this.f420a.f467s.equals(this.f420a.getString(2131230952)))) {
                            this.f420a.m837e("");
                            break;
                        }
                    case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                        audio98819 = this.f420a;
                        true;
                        this.f420a.m861n();
                        this.f420a.m810a(true);
                        Audio98819.m851j(this.f420a);
                        break;
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                        this.f420a.m810a(false);
                        Audio98819.m864o(this.f420a);
                        break;
                }
                BaseAdapter baseAdapter = (BaseAdapter) this.f420a.getListAdapter();
                if (baseAdapter != null) {
                    baseAdapter.notifyDataSetChanged();
                }
            } else if ("com.andromo.dev576782.app537736.broadcast.POSITION_CHANGED".equals(action)) {
                if (this.f420a.f459k != null) {
                    int intExtra = intent.getIntExtra("com.andromo.dev576782.app537736.extra.SEEK_POSITION", 0);
                    this.f420a.f459k.setProgress(intExtra);
                    this.f420a.m831d(fi.m1436a(intExtra));
                    return;
                }
                audio98819 = this.f420a;
                false;
            } else if ("com.andromo.dev576782.app537736.broadcast.NOW_PLAYING_TEXT_CHANGED".equals(action)) {
                audio98819 = this.f420a;
                true;
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.NOW_PLAYING_TEXT");
                if (action == null || action.length() == 0) {
                    action = this.f420a.getString(2131230952);
                } else if (!(this.f420a.f470v == null || this.f420a.f470v.m1088u() != ct.Stopped || this.f420a.f467s == null || this.f420a.f467s.equals(this.f420a.getString(2131230952)))) {
                    action = "";
                }
                this.f420a.m837e(action);
            } else if (!"com.andromo.dev576782.app537736.broadcast.TRACK_CHANGED".equals(action) && "com.andromo.dev576782.app537736.broadcast.ERROR".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.ERROR_MESSAGE");
                if (action != null) {
                    this.f420a.m837e(action);
                }
            }
        }
    }

    public class PlaylistManagerReceiver extends BroadcastReceiver {
        final /* synthetic */ Audio98819 f421a;

        public PlaylistManagerReceiver(Audio98819 audio98819) {
            this.f421a = audio98819;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = 1;
            String action = intent.getAction();
            he p;
            hd q;
            Playlist a;
            Audio98819 audio98819;
            if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_LOADED".equals(action)) {
                if (this.f421a.f470v == null || !(this.f421a.f470v.m1087t() == null || this.f421a.f470v.m1087t().m1150b(this.f421a.f456h))) {
                    obj = null;
                }
                p = this.f421a.m840f();
                q = this.f421a.m843g();
                a = Audio98819_PlaylistManager.m876a();
                if (a != null) {
                    this.f421a.f456h = a;
                    this.f421a.f456h.m1145a(p);
                    this.f421a.f456h.m1144a(q);
                    Audio98819.m818b(this.f421a, this.f421a.f456h);
                    this.f421a.m802a(this.f421a.getListView());
                    Audio98819.m867r(this.f421a);
                    this.f421a.m863o();
                    if (obj != null) {
                        this.f421a.f470v.m1055a(this.f421a.f456h);
                        this.f421a.f470v.m1061b();
                    }
                    audio98819 = this.f421a;
                    true;
                    this.f421a.m861n();
                    audio98819 = this.f421a;
                    false;
                    if (this.f421a.f470v != null && this.f421a.m849i() && this.f421a.f470v.m1088u() == ct.Paused) {
                        Audio98819.m864o(this.f421a);
                    }
                    audio98819 = this.f421a;
                    false;
                }
            } else if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_NOT_LOADED".equals(action)) {
                this.f421a.m836e();
            } else if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_EXPANDED".equals(action)) {
                if (this.f421a.f470v == null || !(this.f421a.f470v.m1087t() == null || this.f421a.f470v.m1087t().m1150b(this.f421a.f456h))) {
                    obj = null;
                }
                p = this.f421a.m840f();
                q = this.f421a.m843g();
                a = Audio98819_PlaylistManager.m876a();
                if (a != null) {
                    this.f421a.f456h = a;
                    this.f421a.f456h.m1145a(p);
                    this.f421a.f456h.m1144a(q);
                    Audio98819.m818b(this.f421a, this.f421a.f456h);
                    this.f421a.m802a(this.f421a.getListView());
                    Audio98819.m867r(this.f421a);
                    if (obj != null) {
                        this.f421a.f470v.m1055a(this.f421a.f456h);
                        this.f421a.f470v.m1061b();
                    }
                    audio98819 = this.f421a;
                    false;
                }
                this.f421a.m860m();
            } else if (!"com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_SAVED".equals(action) && "com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.ERROR".equals(action)) {
                String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.STATUS");
                if (stringExtra != null) {
                    switch (bi.f747c[hj.valueOf(stringExtra).ordinal()]) {
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                            this.f421a.m860m();
                        default:
                    }
                }
            }
        }
    }

    public class SetRingtoneReceiver extends BroadcastReceiver {
        final /* synthetic */ Audio98819 f422a;

        public SetRingtoneReceiver(Audio98819 audio98819) {
            this.f422a = audio98819;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!"com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_SET".equals(action)) {
                "com.andromo.dev576782.app537736.SetRingtoneService.ERROR".equals(action);
            }
        }
    }

    static {
        f423G = true;
        f424W = new C0210l();
    }

    public Audio98819() {
        this.f449a = -1;
        this.f458j = gu.STREAM;
        this.f466r = null;
        this.f468t = false;
        this.f469u = false;
        this.f426B = true;
        this.f427C = true;
        this.f428D = true;
        this.f429E = true;
        this.f430F = true;
        this.f431H = false;
        this.f432I = new Handler();
        this.f447Y = -1;
        this.aa = new be(this);
        this.ab = new bf(this);
        this.ac = new cw(new bg(this));
        this.ad = new bh(this);
    }

    private String m800a(AudioItem audioItem) {
        String c;
        String str = "";
        if (audioItem != null) {
            c = audioItem.m986c();
            if (c == null || c.length() <= 0) {
                c = audioItem.m985b();
                if (c != null && c.length() > 0) {
                    c = audioItem.m985b();
                    return getString(2131230881, new Object[]{c});
                }
            }
            String f = audioItem.m989f();
            String g = audioItem.m990g();
            String h = audioItem.m991h();
            int i = (f == null || f.length() <= 0) ? 0 : 1;
            int i2 = (g == null || g.length() <= 0) ? 0 : 1;
            int i3 = (h == null || h.length() <= 0) ? 0 : 1;
            if (!(i == 0 && i2 == 0 && i3 == 0)) {
                c = c + " (";
                if (i != 0) {
                    c = c + f;
                    if (i2 != 0) {
                        c = c + ", " + g;
                    }
                    if (i3 != 0) {
                        c = c + ", " + h;
                    }
                } else if (i2 != 0) {
                    c = c + g;
                    if (i3 != 0) {
                        c = c + ", " + h;
                    }
                } else if (i3 != 0) {
                    c = c + h;
                }
                c = c + ")";
            }
            if (audioItem.m993j()) {
                if (c.length() > 0) {
                    c = c + " ";
                }
                c = c + audioItem.m985b();
            }
            return getString(2131230881, new Object[]{c});
        }
        c = str;
        return getString(2131230881, new Object[]{c});
    }

    private void m801a(int i, int i2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Toast.makeText(this, getString(2131230986, new Object[]{m824c(i2)}), 1).show();
        } else if (this.f456h != null) {
            Parcelable b = this.f456h.m1157e(i) ? this.f456h.m1148b(i) : null;
            if (b == null) {
                Toast.makeText(this, 2131231006, 1).show();
            } else if (b.m988e().m1316b()) {
                Toast.makeText(this, getString(2131230985, new Object[]{m824c(i2)}), 1).show();
            } else if (m853j() || i2 != 1) {
                Intent intent = new Intent(this, SetRingtoneService.class);
                intent.putExtra("com.andromo.dev576782.app537736.SetRingtoneService.AUDIO_ITEM", b);
                intent.putExtra("com.andromo.dev576782.app537736.SetRingtoneService.AUDIO_FOLDER", this.f456h.m1154d());
                intent.putExtra("com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_TYPE", i2);
                startService(intent);
            } else {
                Toast.makeText(this, 2131230989, 1).show();
            }
        } else {
            Toast.makeText(this, 2131231008, 1).show();
        }
    }

    private void m802a(ListView listView) {
        if (listView != null) {
            if (getListAdapter() == null) {
                setListAdapter(new bs(this, this.f456h));
            } else {
                bs bsVar = (bs) getListAdapter();
                if (bsVar != null) {
                    bsVar.m1306a(this.f456h);
                }
            }
            SharedPreferences preferences = getPreferences(0);
            if (preferences != null) {
                getListView().setSelectionFromTop(preferences.getInt("listIndex", 0), preferences.getInt("listTop", 0));
            }
            if (this.f446X && this.f456h != null && this.f470v != null) {
                boolean b = this.f456h.m1150b(this.f470v.m1087t());
                if (this.f470v.m1045D() || (this.f470v.m1044C() && !b)) {
                    m816b(0);
                }
                this.f446X = false;
            }
        }
    }

    static /* synthetic */ void m804a(Audio98819 audio98819, AudioItem audioItem, hv hvVar) {
        if (hvVar == null || hvVar == hv.m1568a()) {
            audio98819.f436M = audioItem.m986c();
            audio98819.f440Q = "";
        } else {
            String property = System.getProperty("line.separator");
            if (hvVar.m1575h().length() > 0) {
                audio98819.f436M = audioItem.m986c() + property + property + hvVar.m1575h();
            } else {
                audio98819.f436M = audioItem.m986c();
            }
            audio98819.f440Q = (hvVar.m1570c() != 0 ? audio98819.getString(2131231020) : audio98819.getString(2131231021)) + property + audio98819.getString(2131231022, new Object[]{Integer.valueOf(hvVar.m1569b()), Integer.valueOf(hvVar.m1573f())}) + property + audio98819.getString(2131231023, new Object[]{Integer.valueOf(hvVar.m1571d())}) + property + audio98819.getString(2131231024, new Object[]{Integer.valueOf(hvVar.m1572e())}) + property + audio98819.getString(2131231025, new Object[]{Integer.valueOf(hvVar.m1574g())});
        }
        audio98819.f438O = "";
        audio98819.f437N = "";
        audio98819.f439P = "";
        audio98819.f441R = audioItem.m987d();
    }

    private void m805a(AudioItem audioItem, hv hvVar) {
        this.f443T = null;
        this.f442S = null;
        if (this.f432I != null) {
            this.f432I.post(new bc(this, audioItem, hvVar));
        }
    }

    private void m806a(hd hdVar) {
        ImageView imageView = (ImageView) findViewById(2131361811);
        if (imageView != null) {
            switch (bi.f748d[hdVar.ordinal()]) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    imageView.setImageDrawable(getResources().getDrawable(2130837700));
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    imageView.setImageDrawable(getResources().getDrawable(2130837701));
                default:
                    imageView.setImageDrawable(getResources().getDrawable(2130837700));
            }
        }
    }

    private void m807a(hd hdVar, String str) {
        if (this.f456h != null) {
            this.f456h.m1144a(hdVar);
            if (hdVar == hd.SHUFFLE) {
                this.f456h.m1165m();
            }
        }
        Playlist t = this.f470v != null ? this.f470v.m1087t() : null;
        if (t != null) {
            t.m1144a(hdVar);
            if (hdVar == hd.SHUFFLE) {
                if (!(this.f456h != null ? t.m1153c(this.f456h) : false)) {
                    t.m1165m();
                }
            }
        }
        m806a(hdVar);
        SharedPreferences sharedPreferences = getSharedPreferences("com.andromo.dev576782.app537736.AudioActivity", 0);
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putString("PLAYLIST_MODE", hdVar.name());
                edit.commit();
            }
        }
        if (str != null && str.length() > 0) {
            m820b(str);
        }
    }

    private void m808a(he heVar) {
        ImageView imageView = (ImageView) findViewById(2131361813);
        if (imageView != null) {
            switch (bi.f745a[heVar.ordinal()]) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    imageView.setImageDrawable(getResources().getDrawable(2130837698));
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    imageView.setImageDrawable(getResources().getDrawable(2130837699));
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    imageView.setImageDrawable(getResources().getDrawable(2130837697));
                default:
                    imageView.setImageDrawable(getResources().getDrawable(2130837698));
            }
        }
    }

    private void m809a(he heVar, String str) {
        if (this.f470v != null) {
            this.f470v.m1057a(heVar);
        }
        if (this.f456h != null) {
            this.f456h.m1145a(heVar);
        }
        m808a(heVar);
        SharedPreferences sharedPreferences = getSharedPreferences("com.andromo.dev576782.app537736.AudioActivity", 0);
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putString("REPEAT_MODE", heVar.name());
                edit.commit();
            }
        }
        if (str != null && str.length() > 0) {
            m820b(str);
        }
    }

    private void m810a(boolean z) {
        int i = (z && m849i()) ? 1 : 0;
        if (this.f464p == null) {
            this.f464p = (ImageButton) findViewById(2131361806);
        }
        if (this.f464p != null) {
            if (i != 0) {
                this.f464p.setVisibility(8);
            } else {
                this.f464p.setVisibility(0);
            }
        }
        if (this.f465q == null) {
            this.f465q = (ImageButton) findViewById(2131361808);
        }
        if (this.f465q == null) {
            return;
        }
        if (i != 0) {
            this.f465q.setVisibility(0);
        } else {
            this.f465q.setVisibility(8);
        }
    }

    static /* synthetic */ boolean m812a(Audio98819 audio98819, String str) {
        return audio98819.f473y != null && str != null && str.length() > 0 && new File(audio98819.f473y.m957e(str)).exists();
    }

    private boolean m814a(String str) {
        return (str == null || str.equals(this.f444U)) ? false : true;
    }

    private void m816b(int i) {
        if (this.f456h != null) {
            this.f456h.m1152c(i);
        }
        if (((AudioItem) getListAdapter().getItem(i)) != null && this.f470v != null) {
            this.f470v.m1055a(this.f456h);
            this.f470v.m1061b();
            this.f470v.m1069c(false);
            Intent intent = new Intent(this.f470v.m1072e(), null, this, this.f470v.getClass());
            intent.putExtra("com.andromo.dev576782.app537736.extra.TRACK_INDEX", i);
            startService(intent);
            this.f462n = null;
            if (this.f468t) {
                m861n();
                return;
            }
            this.f469u = true;
            bindService(intent, this.aa, 1);
        }
    }

    static /* synthetic */ void m818b(Audio98819 audio98819, Playlist playlist) {
        if (audio98819.f470v != null && playlist != null) {
            Playlist t = audio98819.f470v.m1087t();
            if (t != null) {
                Playlist.m1137n();
                if (!t.m1147a(audio98819.f456h)) {
                    if (t.m1150b(playlist)) {
                        int j = t.m1162j();
                        if (j == -1 || !AudioItem.m973a(t.m1148b(j), audio98819.f470v.m1093z())) {
                            AudioItem z = audio98819.f470v.m1093z();
                            if (z != null) {
                                j = playlist.m1138a(z);
                                if (j == -1) {
                                    j = playlist.m1139a(z.m985b());
                                }
                            } else {
                                j = -1;
                            }
                        }
                        if (playlist.m1157e(j)) {
                            playlist.m1152c(j);
                        }
                    } else {
                        return;
                    }
                }
                playlist.m1142a(audio98819.f470v.m1088u());
            }
            audio98819.f470v.m1055a(playlist);
            audio98819.f470v.m1061b();
        }
    }

    private void m820b(String str) {
        if (str != null && str.length() > 0) {
            if (this.f466r == null) {
                this.f466r = Toast.makeText(this, "", 0);
            }
            if (this.f466r != null) {
                this.f466r.setText(str);
                this.f466r.show();
            }
        }
    }

    private String m824c(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return getString(2131230982);
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return getString(2131230983);
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                return getString(2131230984);
            default:
                throw new IllegalArgumentException("Invalid type: " + i);
        }
    }

    private void m826c(String str) {
        if (this.f461m == null) {
            this.f461m = (TextView) findViewById(2131361817);
        }
        if (this.f461m != null) {
            this.f461m.setText(str);
        }
    }

    private void m831d(String str) {
        if (this.f460l == null) {
            this.f460l = (TextView) findViewById(2131361816);
        }
        if (this.f460l != null) {
            this.f460l.setText(str);
        }
    }

    private void m836e() {
        Intent intent = new Intent("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.EXPAND", null, getApplicationContext(), Audio98819_PlaylistManager.class);
        Playlist e = new ha(this).m1549b("Audio98819/playlist_537736_576782_98819").m1543a(hc.AUTOMATIC).m1544a(m843g()).m1545a(m840f()).m1546a(getClass().getName()).m1553e();
        if (e != null) {
            Audio98819_PlaylistManager.m878a(e);
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILES_RES_ID", 2131623943);
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.TITLES_RES_ID", 2131623941);
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.DESCRIPTIONS_RES_ID", 2131623942);
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.TRACK_TYPES_RES_ID", 2131623944);
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", "Audio98819_playlist.json");
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.SAVE_AFTER_EXPANDING", true);
            startService(intent);
            m857l();
            return;
        }
        Toast.makeText(this, 2131231003, 1).show();
        m802a(getListView());
    }

    private void m837e(String str) {
        this.f467s = str;
        if (this.f462n == null) {
            this.f462n = (TextView) findViewById(2131361818);
        }
        if (this.f462n != null) {
            this.f462n.setText(str);
        }
    }

    private he m840f() {
        he heVar = null;
        SharedPreferences sharedPreferences = getSharedPreferences("com.andromo.dev576782.app537736.AudioActivity", 0);
        if (sharedPreferences != null) {
            heVar = he.valueOf(sharedPreferences.getString("REPEAT_MODE", he.OFF.name()));
        }
        return heVar == null ? this.f456h != null ? this.f456h.m1159g() : this.f470v != null ? this.f470v.m1050I() : he.OFF : heVar;
    }

    private hd m843g() {
        hd hdVar = null;
        SharedPreferences sharedPreferences = getSharedPreferences("com.andromo.dev576782.app537736.AudioActivity", 0);
        if (sharedPreferences != null) {
            hdVar = hd.valueOf(sharedPreferences.getString("PLAYLIST_MODE", hd.SEQUENTIAL.name()));
        }
        return hdVar == null ? this.f456h != null ? this.f456h.m1156e() : this.f470v != null ? this.f470v.m1049H() : hd.SEQUENTIAL : hdVar;
    }

    private void m847h() {
        int firstVisiblePosition = getListView().getFirstVisiblePosition();
        View childAt = getListView().getChildAt(0);
        int top = childAt == null ? 0 : childAt.getTop();
        SharedPreferences preferences = getPreferences(0);
        if (preferences != null) {
            Editor edit = preferences.edit();
            if (edit != null) {
                edit.putInt("listIndex", firstVisiblePosition);
                edit.putInt("listTop", top);
                if (this.f456h != null) {
                    edit.putString("playerState", this.f456h.m1160h().name());
                    edit.putInt("currentTrack", this.f456h.m1162j());
                }
                edit.commit();
            }
        }
    }

    private boolean m849i() {
        return (this.f470v == null || this.f456h == null || !this.f456h.m1150b(this.f470v.m1087t())) ? false : true;
    }

    static /* synthetic */ void m851j(Audio98819 audio98819) {
        if (audio98819.ac != null && audio98819.f460l != null) {
            cw cwVar = audio98819.ac;
            cwVar.f814b.removeCallbacks(cwVar.f816d);
            cwVar.f817e = false;
            audio98819.f460l.setVisibility(0);
        }
    }

    private boolean m853j() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        return telephonyManager == null || telephonyManager.getPhoneType() != 0;
    }

    private Intent m854k() {
        String str = "";
        if (this.f470v != null && this.f470v.m1046E()) {
            String x = this.f470v.m1091x();
            if (!(x == null || x.length() <= 0 || x.equals(getString(2131230952)))) {
                str = getString(2131230881, new Object[]{x});
            }
            AudioItem z = this.f470v.m1093z();
            if (z != null && z.m993j()) {
                if (str.length() > 0) {
                    str = str + " ";
                }
                str = str + z.m985b();
            }
        } else if (!(this.f456h == null || this.f456h.m1162j() == -1)) {
            str = m800a(this.f456h.m1161i());
        }
        if (str.length() == 0) {
            str = getString(2131230881, new Object[]{C0208j.m1607a((Context) this, this.f449a)});
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return intent;
    }

    private void m857l() {
        if (this.f451c != null) {
            this.f451c.setActionView(2130903065);
            this.f452d = false;
            return;
        }
        this.f452d = true;
    }

    static /* synthetic */ void m858l(Audio98819 audio98819) {
        if (audio98819.f459k == null) {
            audio98819.f459k = (SeekBar) audio98819.findViewById(2131361815);
        }
        if (audio98819.f459k != null) {
            audio98819.f459k.setProgress(0);
        }
        audio98819.m831d("0:00");
    }

    private void m860m() {
        if (this.f451c != null) {
            this.f451c.setActionView(null);
        }
        this.f452d = false;
    }

    private void m861n() {
        this.f459k = (SeekBar) findViewById(2131361815);
        if (this.f459k == null) {
            return;
        }
        if (this.f470v == null || !m849i()) {
            this.f459k.setEnabled(false);
            return;
        }
        this.f459k.setEnabled(true);
        if (this.f470v.m1046E()) {
            this.f459k.setMax(this.f470v.m1048G());
            if (this.f462n == null) {
                m837e(this.f470v.m1091x());
            }
            int A = this.f470v.m1042A();
            if (A != -1) {
                this.f459k.setProgress(A);
                m831d(fi.m1436a(A));
            } else {
                this.f459k.setProgress(0);
                m831d("0:00");
            }
            A = this.f470v.m1048G();
            if (A != -1) {
                m826c(fi.m1436a(A));
            } else {
                m826c("0:00");
            }
            if (this.f470v.m1043B()) {
                this.f459k.postDelayed(this.ad, 1000);
            }
        } else {
            this.f459k.setProgress(0);
        }
        this.f459k.setOnSeekBarChangeListener(new bd(this));
        m810a(this.f470v.m1043B());
    }

    private void m863o() {
        Intent intent = new Intent("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.SAVE", null, this, Audio98819_PlaylistManager.class);
        intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", "Audio98819_playlist.json");
        Audio98819_PlaylistManager.m878a(this.f456h);
        startService(intent);
    }

    static /* synthetic */ void m864o(Audio98819 audio98819) {
        if (audio98819.ac != null) {
            cw cwVar = audio98819.ac;
            if (!cwVar.f817e) {
                cwVar.f814b.postDelayed(cwVar.f816d, (long) cwVar.f813a);
                cwVar.f817e = true;
            }
        }
    }

    static /* synthetic */ void m867r(Audio98819 audio98819) {
        audio98819.m806a(audio98819.m843g());
        audio98819.m808a(audio98819.m840f());
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        ag.m1235g(this);
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (id == 2131361806) {
                if (this.f470v != null) {
                    this.f470v.m1055a(this.f456h);
                    this.f470v.m1061b();
                    Intent intent = new Intent(this.f470v.m1072e(), null, this, this.f470v.getClass());
                    intent.putExtra("com.andromo.dev576782.app537736.extra.TRACK_INDEX", this.f456h != null ? this.f456h.m1162j() : 0);
                    intent.putExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", 0);
                    startService(intent);
                    ao.m1273a("Audio", "Play", "Audio98819");
                }
            } else if (id == 2131361808) {
                if (this.f470v != null) {
                    startService(new Intent(this.f470v.m1073f(), null, this, this.f470v.getClass()));
                }
            } else if (id == 2131361807) {
                if (this.f470v != null) {
                    startService(new Intent(this.f470v.m1074g(), null, this, this.f470v.getClass()));
                }
            } else if (id == 2131361809) {
                if (m849i()) {
                    startService(new Intent(this.f470v.m1076i(), null, this, this.f470v.getClass()));
                } else if (this.f456h != null) {
                    this.f456h.m1164l();
                    r0 = (BaseAdapter) getListAdapter();
                    if (r0 != null) {
                        r0.notifyDataSetChanged();
                    }
                } else {
                    Toast.makeText(this, 2131231008, 1).show();
                }
            } else if (id == 2131361810) {
                if (m849i()) {
                    startService(new Intent(this.f470v.m1075h(), null, this, this.f470v.getClass()));
                } else if (this.f456h != null) {
                    this.f456h.m1143a(gx.f988a);
                    r0 = (BaseAdapter) getListAdapter();
                    if (r0 != null) {
                        r0.notifyDataSetChanged();
                    }
                } else {
                    Toast.makeText(this, 2131231008, 1).show();
                }
            } else if (id == 2131361812) {
                if (m843g() == hd.SEQUENTIAL) {
                    m807a(hd.SHUFFLE, getString(2131231046));
                } else {
                    m807a(hd.SEQUENTIAL, getString(2131231047));
                }
            } else if (id == 2131361814) {
                switch (bi.f745a[m840f().ordinal()]) {
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        m809a(he.ONE_TRACK, getString(2131231017));
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        m809a(he.ALL_TRACKS, getString(2131231018));
                    case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                        m809a(he.OFF, getString(2131231019));
                    default:
                }
            }
        }
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == -1) {
            return super.onContextItemSelected(menuItem);
        }
        int i = this.f455g + itemId;
        AudioItem b;
        Intent intent;
        boolean z;
        switch (menuItem.getGroupId()) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (this.f426B) {
                    m801a(i, 1);
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                if (this.f427C) {
                    m801a(i, 2);
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                if (this.f428D) {
                    m801a(i, 4);
                    break;
                }
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                if (this.f429E) {
                    Intent intent2;
                    if (this.f456h != null) {
                        b = this.f456h.m1148b(i);
                        if (b != null) {
                            String a = m800a(b);
                            if (a.length() == 0) {
                                a = getString(2131230881, new Object[]{C0208j.m1607a((Context) this, this.f449a)});
                            }
                            intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", a);
                            intent2 = intent;
                        } else {
                            Toast.makeText(this, 2131231006, 1).show();
                            intent2 = null;
                        }
                    } else {
                        Toast.makeText(this, 2131231008, 1).show();
                        intent2 = null;
                    }
                    if (intent2 != null) {
                        startActivity(intent2);
                        break;
                    }
                }
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                if (this.f456h != null) {
                    b = this.f456h.m1148b(i);
                    if (b != null) {
                        b.m988e().m1316b();
                        this.f442S = b;
                        showDialog(3);
                        break;
                    }
                }
                break;
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                if (this.f456h != null) {
                    b = this.f456h.m1148b(i);
                    if (!(b == null || !b.m995l() || b.m988e().m1316b())) {
                        if (this.f473y != null) {
                            this.f473y.m948a(b.m985b(), false, true);
                        } else {
                            intent = new Intent("com.andromo.dev576782.app537736.AudioCache.action.DOWNLOAD", null, getApplicationContext(), AudioCacheService.class);
                            intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", b.m985b());
                            intent.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", true);
                            startService(intent);
                        }
                        ao.m1273a("Audio", "Play", "Audio98819");
                        break;
                    }
                }
                break;
            case C0772e.MapAttrs_uiZoomGestures /*12*/:
                if (this.f456h != null) {
                    b = this.f456h.m1148b(i);
                    if (!(b == null || !b.m995l() || b.m988e().m1316b())) {
                        if (this.f473y == null) {
                            Intent intent3 = new Intent("com.andromo.dev576782.app537736.AudioCache.action.DOWNLOAD", null, getApplicationContext(), AudioCacheService.class);
                            intent3.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", b.m985b());
                            intent3.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", false);
                            startService(intent3);
                            break;
                        }
                        this.f473y.m948a(b.m985b(), false, false);
                        break;
                    }
                }
                break;
            case C0772e.MapAttrs_useViewLifecycle /*13*/:
                if (!(this.f456h == null || this.f473y == null)) {
                    b = this.f456h.m1148b(i);
                    if (b != null) {
                        this.f473y.m962j(b.m985b());
                        break;
                    }
                }
                break;
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                m816b(i);
                ao.m1273a("Audio", "Play", "Audio98819");
                break;
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                m816b(i);
                ao.m1273a("Audio", "Play", "Audio98819");
                break;
            case C0772e.MapAttrs_ambientEnabled /*16*/:
                if (!(this.f470v == null || this.f456h == null)) {
                    z = this.f456h.m1150b(this.f470v.m1087t()) && this.f456h.m1155d(i);
                    if (z) {
                        this.f470v.m1061b();
                        this.f470v.m1069c(false);
                        startService(new Intent(this.f470v.m1073f(), null, this, this.f470v.getClass()));
                        break;
                    }
                }
                break;
            case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                if (!(this.f470v == null || this.f456h == null)) {
                    z = this.f456h.m1150b(this.f470v.m1087t()) && this.f456h.m1155d(i);
                    if (z) {
                        this.f470v.m1061b();
                        this.f470v.m1069c(false);
                        startService(new Intent(this.f470v.m1074g(), null, this, this.f470v.getClass()));
                        break;
                    }
                }
                break;
            case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                if (!(this.f470v == null || this.f456h == null)) {
                    z = this.f456h.m1150b(this.f470v.m1087t()) && this.f456h.m1155d(i);
                    if (z) {
                        this.f470v.m1061b();
                        this.f470v.m1069c(false);
                        this.f470v.m1053a(0);
                        if (this.f473y != null) {
                            this.f473y.m942a(this.f456h.m1141a(i), 0);
                        }
                        z = true;
                    } else if (this.f473y != null) {
                        this.f473y.m942a(this.f456h.m1141a(i), 0);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        BaseAdapter baseAdapter = (BaseAdapter) getListAdapter();
                        if (baseAdapter != null) {
                            baseAdapter.notifyDataSetChanged();
                            break;
                        }
                    }
                }
                break;
            case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                if (this.f456h != null) {
                    b = this.f456h.m1148b(i);
                    if (b != null) {
                        if (this.f473y == null) {
                            intent = new Intent("com.andromo.dev576782.app537736.AudioCache.action.DELETE", null, getApplicationContext(), AudioCacheService.class);
                            intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", b.m985b());
                            startService(intent);
                            break;
                        }
                        this.f473y.m963k(b.m985b());
                        break;
                    }
                }
                break;
            default:
                return super.onContextItemSelected(menuItem);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(2130903068);
        ViewStub viewStub = (ViewStub) findViewById(2131361956);
        if (viewStub != null) {
            viewStub.setLayoutResource(2130903072);
            viewStub.setInflatedId(-1);
            View inflate = viewStub.inflate();
            if (inflate == null) {
                viewStub.setVisibility(8);
            } else {
                TextView textView = (TextView) inflate.findViewById(2131361818);
                if (textView != null) {
                    try {
                        String str;
                        String str2 = "#bebebe";
                        if (str2.charAt(0) == '#') {
                            switch (str2.length()) {
                                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                                    str = "#";
                                    int i = 1;
                                    while (i < str2.length()) {
                                        char charAt = str2.charAt(i);
                                        i++;
                                        str = (str + charAt) + charAt;
                                    }
                                    break;
                            }
                        }
                        str = str2;
                        textView.setTextColor(Color.parseColor(str));
                    } catch (IllegalArgumentException e) {
                    }
                }
            }
        }
        if (this.f464p == null) {
            this.f464p = (ImageButton) findViewById(2131361806);
        }
        if (this.f464p != null) {
            this.f464p.setOnClickListener(this);
        }
        if (this.f465q == null) {
            this.f465q = (ImageButton) findViewById(2131361808);
        }
        if (this.f465q != null) {
            this.f465q.setOnClickListener(this);
        }
        ImageButton imageButton = (ImageButton) findViewById(2131361809);
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        imageButton = (ImageButton) findViewById(2131361810);
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        View findViewById = findViewById(2131361812);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        findViewById = findViewById(2131361814);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        ao.m1275b(this);
        if (this.f449a == -1) {
            this.f449a = C0208j.m1617b(this);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0208j.m1612a(supportActionBar, false, f424W.m1619a(this, "none"));
            C0208j.m1609a((Activity) this, supportActionBar, this.f449a);
        }
        ListView listView = getListView();
        registerForContextMenu(listView);
        findViewById = findViewById(2131361955);
        if (findViewById != null) {
            findViewById.setBackgroundColor(2134061875);
        }
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("ShowingTrackInfo");
            this.f454f = z2;
            this.f444U = bundle.getString("LastBad7Html");
            "got mLastBad7Html: " + this.f444U;
            this.f442S = (AudioItem) bundle.getParcelable("GettingTrackInfo");
            z = this.f442S != null ? true : z2;
            this.f436M = bundle.getString("TrackInfoTitle");
            this.f437N = bundle.getString("TrackInfoAlbum");
            this.f438O = bundle.getString("TrackInfoArtist");
            this.f439P = bundle.getString("TrackInfoYear");
            this.f440Q = bundle.getString("TrackInfoShoutcast");
            this.f441R = bundle.getString("TrackInfoDescription");
            this.f435L = bundle.getInt("TrackInfoScrollY", 0);
            this.f467s = bundle.getString("StatusText");
            if (this.f467s != null) {
                m837e(this.f467s);
            }
            this.f452d = bundle.getBoolean("StartProgressWhenActionReady");
            this.f453e = bundle.getBoolean("NeedRefreshAction");
            this.f445V = bundle.getBoolean("PlaylistIsExpandable");
        } else {
            z = false;
        }
        this.f446X = false;
        if (Audio98819_PlaylistManager.m883b(this)) {
            if (bundle == null) {
                z = Playlist.m1126a((Context) this);
                this.f445V = z;
                this.f453e = z;
            }
            if (Audio98819_PlaylistManager.m882a((ContextWrapper) this)) {
                m857l();
            }
        } else {
            this.f445V = Playlist.m1126a((Context) this);
            if (this.f445V) {
                this.f453e = true;
                long j = (this.f454f || z) ? 0 : 86400000;
                Intent intent = new Intent("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.LOAD", null, this, Audio98819_PlaylistManager.class);
                intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", "Audio98819_playlist.json");
                intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.MAX_AGE_MILLISECS", j);
                startService(intent);
            } else {
                this.f456h = new ha(this).m1549b("Audio98819/playlist_537736_576782_98819").m1542a((Context) this).m1543a(hc.AUTOMATIC).m1544a(m843g()).m1545a(m840f()).m1546a(getClass().getName()).m1553e();
                m802a(listView);
            }
        }
        setVolumeControlStream(3);
        ag.m1225a(this, (LinearLayout) findViewById(2131361894));
        aa.m1212a(this);
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            this.f447Y = defaultDisplay.getRotation();
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) contextMenuInfo;
        int i = adapterContextMenuInfo.position + this.f455g;
        if (this.f456h != null && this.f456h.m1157e(i)) {
            AudioItem b = this.f456h.m1148b(i);
            if (b != null) {
                contextMenu.setHeaderTitle(b.m986c());
                contextMenu.add(6, adapterContextMenuInfo.position, 0, 2131230886);
            } else {
                contextMenu.setHeaderTitle(2131230887);
            }
            if (this.f426B && m853j()) {
                contextMenu.add(1, adapterContextMenuInfo.position, 0, 2131230883);
            }
            if (this.f427C) {
                contextMenu.add(2, adapterContextMenuInfo.position, 0, 2131230884);
            }
            if (this.f428D) {
                contextMenu.add(3, adapterContextMenuInfo.position, 0, 2131230885);
            }
            if (this.f429E) {
                contextMenu.add(4, adapterContextMenuInfo.position, 0, 2131230882);
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return C0204h.m1530a((Context) this);
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                this.f434K = LayoutInflater.from(this).inflate(2130903070, null);
                return new Builder(this).setTitle(2131230991).setView(this.f434K).setPositiveButton(17039370, new bo(this)).setOnCancelListener(new bn(this)).create();
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131230990));
                progressDialog.setIndeterminate(true);
                progressDialog.setOnCancelListener(new bp(this));
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater supportMenuInflater = getSupportMenuInflater();
        supportMenuInflater.inflate(2131689473, menu);
        if (this.f430F) {
            MenuItem findItem = menu.findItem(2131361996);
            if (findItem != null) {
                ShareActionProvider shareActionProvider = (ShareActionProvider) findItem.getActionProvider();
                if (shareActionProvider != null) {
                    shareActionProvider.m1180a(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
                    shareActionProvider.m1179a(m854k());
                }
            }
        } else {
            menu.removeItem(2131361996);
        }
        C0208j.m1613a(supportMenuInflater, menu);
        if (this.f453e) {
            this.f451c = menu.findItem(2131361995);
            if (this.f452d) {
                m857l();
            }
        } else {
            this.f451c = null;
            menu.removeItem(2131361995);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        ag.m1234f(this);
        super.onDestroy();
        AudioService audioService = this.f470v;
        if (this.f443T != null) {
            this.f443T.cancel(true);
            this.f443T = null;
        }
        this.f442S = null;
        this.f470v = null;
        if (this.f463o != null) {
            this.f463o.setImageDrawable(null);
            this.f463o.setBackgroundDrawable(null);
            this.f463o = null;
        }
    }

    protected void onListItemClick(ListView listView, View view, int i, long j) {
        int i2 = this.f455g + i;
        if (i2 >= 0) {
            m816b(i2);
            ao.m1273a("Audio", "Play", "Audio98819");
        }
        super.onListItemClick(listView, view, i, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 1;
        r5 = 0;
        r2 = r7.getItemId();
        switch(r2) {
            case 2131361807: goto L_0x0078;
            case 2131361995: goto L_0x0059;
            case 2131361996: goto L_0x0070;
            case 2131361998: goto L_0x001b;
            case 2131361999: goto L_0x0022;
            case 2131362001: goto L_0x0029;
            case 2131362002: goto L_0x0034;
            case 2131362003: goto L_0x003e;
            case 2131362007: goto L_0x0048;
            default: goto L_0x000a;
        };
    L_0x000a:
        r2 = r0;
    L_0x000b:
        if (r2 != 0) goto L_0x0019;
    L_0x000d:
        r2 = com.andromo.dev576782.app537736.C0208j.m1615a(r6, r7);
        if (r2 != 0) goto L_0x0019;
    L_0x0013:
        r2 = super.onOptionsItemSelected(r7);
        if (r2 == 0) goto L_0x001a;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        return r0;
    L_0x001b:
        r2 = com.andromo.dev576782.app537736.hd.SHUFFLE;
        r6.m807a(r2, r5);
        r2 = r0;
        goto L_0x000b;
    L_0x0022:
        r2 = com.andromo.dev576782.app537736.hd.SEQUENTIAL;
        r6.m807a(r2, r5);
        r2 = r0;
        goto L_0x000b;
    L_0x0029:
        r2 = r6.f456h;
        if (r2 == 0) goto L_0x000a;
    L_0x002d:
        r2 = com.andromo.dev576782.app537736.he.OFF;
        r6.m809a(r2, r5);
    L_0x0032:
        r2 = r1;
        goto L_0x000b;
    L_0x0034:
        r2 = r6.f456h;
        if (r2 == 0) goto L_0x000a;
    L_0x0038:
        r2 = com.andromo.dev576782.app537736.he.ONE_TRACK;
        r6.m809a(r2, r5);
        goto L_0x0032;
    L_0x003e:
        r2 = r6.f456h;
        if (r2 == 0) goto L_0x000a;
    L_0x0042:
        r2 = com.andromo.dev576782.app537736.he.ALL_TRACKS;
        r6.m809a(r2, r5);
        goto L_0x0032;
    L_0x0048:
        r2 = r6.f456h;
        if (r2 == 0) goto L_0x004e;
    L_0x004c:
        r2 = r6.f470v;
    L_0x004e:
        r2 = 2131231000; // 0x7f080118 float:1.8078069E38 double:1.0529680205E-314;
        r2 = android.widget.Toast.makeText(r6, r2, r1);
        r2.show();
        goto L_0x0032;
    L_0x0059:
        r6.m847h();
        r6.m836e();
        r2 = "Audio";
        r3 = "Refresh";
        r4 = "Audio98819";
        com.andromo.dev576782.app537736.ao.m1273a(r2, r3, r4);
        r2 = "Audio";
        r3 = "Refresh";
        com.andromo.dev576782.app537736.ao.m1276b(r2, r3, r5);
        goto L_0x0032;
    L_0x0070:
        r2 = r6.m854k();
        r6.startActivity(r2);
        goto L_0x0032;
    L_0x0078:
        r2 = r6.f470v;
        if (r2 == 0) goto L_0x0032;
    L_0x007c:
        r2 = new android.content.Intent;
        r3 = r6.f470v;
        r3 = r3.m1074g();
        r4 = r6.f470v;
        r4 = r4.getClass();
        r2.<init>(r3, r5, r6, r4);
        r6.startService(r2);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.Audio98819.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    protected void onPause() {
        ag.m1232d(this);
        super.onPause();
        m847h();
        this.f448Z = false;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        if (i == 2) {
            if (this.f454f && this.f434K != null) {
                TextView textView = (TextView) this.f434K.findViewById(2131361960);
                if (textView != null) {
                    if (this.f436M == null || this.f436M.length() <= 0) {
                        textView.setText(getString(2131230998));
                    } else {
                        textView.setText(this.f436M);
                    }
                }
                View findViewById = this.f434K.findViewById(2131361961);
                View findViewById2 = this.f434K.findViewById(2131361962);
                textView = (TextView) this.f434K.findViewById(2131361963);
                if (this.f438O == null || this.f438O.length() <= 0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setText(this.f438O);
                        textView.setVisibility(0);
                    }
                }
                findViewById = this.f434K.findViewById(2131361964);
                findViewById2 = this.f434K.findViewById(2131361965);
                textView = (TextView) this.f434K.findViewById(2131361966);
                if (this.f437N == null || this.f437N.length() <= 0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setText(this.f437N);
                        textView.setVisibility(0);
                    }
                }
                findViewById = this.f434K.findViewById(2131361967);
                findViewById2 = this.f434K.findViewById(2131361968);
                textView = (TextView) this.f434K.findViewById(2131361969);
                if (this.f439P == null || this.f439P.length() <= 0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setText(this.f439P);
                        textView.setVisibility(0);
                    }
                }
                findViewById = this.f434K.findViewById(2131361970);
                findViewById2 = this.f434K.findViewById(2131361971);
                textView = (TextView) this.f434K.findViewById(2131361972);
                if (this.f440Q == null || this.f440Q.length() <= 0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setText(this.f440Q);
                        textView.setVisibility(0);
                    }
                }
                findViewById = this.f434K.findViewById(2131361973);
                findViewById2 = this.f434K.findViewById(2131361974);
                textView = (TextView) this.f434K.findViewById(2131361975);
                if (this.f441R == null || this.f441R.length() <= 0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    if (textView != null) {
                        textView.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(this.f441R);
                    textView.setVisibility(0);
                    ScrollView scrollView = (ScrollView) this.f434K.findViewById(2131361958);
                    if (scrollView != null) {
                        scrollView.post(new bq(this, scrollView));
                    }
                }
            }
        } else if (i == 3) {
            AudioItem audioItem = this.f442S;
            if (audioItem == null) {
                if (this.f432I != null) {
                    this.f432I.post(new bm(this));
                }
                ao.m1276b("Audio", "Show Track Info", "Error (AudioItem null)");
            } else if (!audioItem.m988e().m1316b()) {
                this.f442S = audioItem;
                fm bkVar = new bk(this, audioItem);
                if (audioItem.m992i()) {
                    r2 = new bb(bkVar);
                    this.f443T = r2;
                    try {
                        String b = audioItem.m985b();
                        String d = this.f456h.m1154d();
                        if (!(d == null || "".equals(d))) {
                            b = d + "/" + b;
                        }
                        AssetFileDescriptor openFd = getAssets().openFd(b);
                        r2.execute(new AssetFileDescriptor[]{openFd});
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                        this.f443T = null;
                        this.f442S = null;
                        if (this.f432I != null) {
                            this.f432I.post(new bl(this, audioItem));
                            return;
                        }
                        return;
                    }
                }
                r2 = new fl(bkVar);
                this.f443T = r2;
                r2.execute(new String[]{audioItem.m985b()});
            } else if (m814a(audioItem.m985b())) {
                this.f442S = audioItem;
                r2 = new hx(new bj(this, audioItem));
                this.f443T = r2;
                r2.execute(new String[]{audioItem.m985b()});
            } else {
                m805a(audioItem, hv.m1568a());
            }
        } else if (i == 0) {
            C0204h.m1531a(dialog);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        SubMenu subMenu;
        MenuItem findItem = menu.findItem(2131361997);
        if (findItem != null) {
            subMenu = findItem.getSubMenu();
            if (subMenu != null) {
                findItem = subMenu.findItem(m843g() == hd.SEQUENTIAL ? 2131361999 : 2131361998);
                if (findItem != null) {
                    findItem.setChecked(true);
                }
            }
        }
        findItem = menu.findItem(2131362000);
        if (findItem != null) {
            subMenu = findItem.getSubMenu();
            if (subMenu != null) {
                int i;
                switch (bi.f745a[m840f().ordinal()]) {
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        i = 2131362001;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        i = 2131362002;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                        i = 2131362003;
                        break;
                    default:
                        i = 2131362001;
                        break;
                }
                findItem = subMenu.findItem(i);
                if (findItem != null) {
                    findItem.setChecked(true);
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onRestart() {
        super.onRestart();
        if (this.f445V) {
            ag.m1228b();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f450b = bundle.getParcelable("listState");
    }

    protected void onResume() {
        super.onResume();
        if (this.f450b != null) {
            getListView().onRestoreInstanceState(this.f450b);
            this.f450b = null;
        }
        ag.m1233e(this);
    }

    public Object onRetainNonConfigurationInstance() {
        this.f448Z = true;
        return super.onRetainNonConfigurationInstance();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f450b = getListView().onSaveInstanceState();
        bundle.putParcelable("listState", this.f450b);
        if (this.f442S != null) {
            bundle.putParcelable("GettingTrackInfo", this.f442S);
        }
        bundle.putString("LastBad7Html", this.f444U);
        bundle.putBoolean("ShowingTrackInfo", this.f454f);
        if (this.f454f && this.f434K != null) {
            View findViewById = this.f434K.findViewById(2131361958);
            if (findViewById != null) {
                this.f435L = findViewById.getScrollY();
                bundle.putInt("TrackInfoScrollY", this.f435L);
            }
        }
        bundle.putString("TrackInfoTitle", this.f436M);
        bundle.putString("TrackInfoAlbum", this.f437N);
        bundle.putString("TrackInfoArtist", this.f438O);
        bundle.putString("TrackInfoYear", this.f439P);
        bundle.putString("TrackInfoShoutcast", this.f440Q);
        bundle.putString("TrackInfoDescription", this.f441R);
        bundle.putBoolean("StartProgressWhenActionReady", this.f452d);
        bundle.putBoolean("NeedRefreshAction", this.f453e);
        bundle.putBoolean("PlaylistIsExpandable", this.f445V);
        bundle.putString("StatusText", this.f467s);
    }

    protected void onStart() {
        IntentFilter intentFilter;
        super.onStart();
        ag.m1227b(this);
        C0208j.m1610a(getSupportActionBar(), this.f449a);
        this.f458j = PodcastPreferences.m1166a(this);
        if (!(this.f468t || this.f469u)) {
            this.f469u = true;
            Intent intent = new Intent("com.andromo.dev576782.app537736.audio.action.START", null, this, AudioService.class);
            intent.putExtra("com.andromo.dev576782.app537736.extra.PLAYER_TYPE", 0);
            bindService(intent, this.aa, 1);
        }
        if (this.f471w == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.broadcast.STATE_CHANGED");
            intentFilter.addAction("com.andromo.dev576782.app537736.broadcast.NOW_PLAYING_TEXT_CHANGED");
            intentFilter.addAction("com.andromo.dev576782.app537736.broadcast.POSITION_CHANGED");
            intentFilter.addAction("com.andromo.dev576782.app537736.broadcast.TRACK_CHANGED");
            intentFilter.addAction("com.andromo.dev576782.app537736.broadcast.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f471w = new AudioServiceReceiver(this);
            if (this.f471w != null) {
                registerReceiver(this.f471w, intentFilter);
            }
        }
        if (this.f474z == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_SET");
            intentFilter.addAction("com.andromo.dev576782.app537736.SetRingtoneService.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f474z = new SetRingtoneReceiver(this);
            if (this.f474z != null) {
                registerReceiver(this.f474z, intentFilter);
            }
        }
        if (this.f425A == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_LOADED");
            intentFilter.addAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_NOT_LOADED");
            intentFilter.addAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_SAVED");
            intentFilter.addAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_EXPANDED");
            intentFilter.addAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f425A = new PlaylistManagerReceiver(this);
            if (this.f425A != null) {
                registerReceiver(this.f425A, intentFilter);
            }
        }
        m861n();
        ao.m1268a((Activity) this, "Audio");
    }

    protected void onStop() {
        super.onStop();
        if (this.f445V && !Audio98819_PlaylistManager.m884c(this)) {
            m863o();
        }
        if (this.f433J != null) {
            this.f433J.cancel(true);
            this.f433J = null;
        }
        if (this.f468t) {
            unbindService(this.aa);
            this.f468t = false;
            this.f469u = false;
        }
        if (this.f471w != null) {
            unregisterReceiver(this.f471w);
            this.f471w = null;
        }
        if (this.f474z != null) {
            unregisterReceiver(this.f474z);
            this.f474z = null;
        }
        if (this.f425A != null) {
            unregisterReceiver(this.f425A);
            this.f425A = null;
        }
        this.f462n = null;
        this.f459k = null;
        m860m();
        ag.m1230c(this);
        ao.m1267a((Activity) this);
    }

    protected void onUserLeaveHint() {
        AudioService audioService = this.f470v;
    }
}
