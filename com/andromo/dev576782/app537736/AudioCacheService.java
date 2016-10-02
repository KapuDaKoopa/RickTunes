package com.andromo.dev576782.app537736;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import java.io.File;
import java.util.ArrayList;

public class AudioCacheService extends Service implements bu {
    private String f490a;
    private String f491b;
    private bu f492c;
    private bv f493d;
    private String f494e;
    private boolean f495f;
    private AudioCacheSaverReceiver f496g;
    private String f497h;
    private boolean f498i;
    private AudioCacheLoaderReceiver f499j;
    private FileDownloaderReceiver f500k;
    private final Handler f501l;

    public class AudioCacheLoaderReceiver extends BroadcastReceiver {
        final /* synthetic */ AudioCacheService f487a;

        public AudioCacheLoaderReceiver(AudioCacheService audioCacheService) {
            this.f487a = audioCacheService;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.LOADED".equals(action)) {
                String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (stringExtra != null && stringExtra.equals(this.f487a.f497h)) {
                    this.f487a.f490a = stringExtra;
                    this.f487a.f492c = (AudioCacheMap) intent.getParcelableExtra("com.andromo.dev576782.app537736.extra.AUDIO_CACHE");
                    if (stringExtra.equals(this.f487a.f491b)) {
                        this.f487a.f491b = "";
                    }
                    this.f487a.f492c.m888a(new bz(this));
                    this.f487a.m965m(stringExtra);
                    this.f487a.f498i = false;
                    this.f487a.f497h = "";
                }
            } else if ("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.CANCELLED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action != null && action.equals(this.f487a.f497h)) {
                    this.f487a.m966n(action);
                    this.f487a.f498i = false;
                    this.f487a.f497h = "";
                }
            } else if ("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.ERROR".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action != null && action.equals(this.f487a.f497h)) {
                    this.f487a.m949b();
                    this.f487a.f498i = false;
                    this.f487a.f497h = "";
                }
            }
        }
    }

    public class AudioCacheSaverReceiver extends BroadcastReceiver {
        final /* synthetic */ AudioCacheService f488a;

        public AudioCacheSaverReceiver(AudioCacheService audioCacheService) {
            this.f488a = audioCacheService;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.SAVED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action != null && action.equals(this.f488a.f494e)) {
                    this.f488a.m964l(action);
                    this.f488a.f495f = false;
                    this.f488a.f494e = "";
                    if (this.f488a.f491b != null && this.f488a.f491b.length() > 0) {
                        this.f488a.m960h(this.f488a.f491b);
                        this.f488a.f491b = "";
                    }
                }
            } else if ("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.CANCELLED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action != null && action.equals(this.f488a.f494e)) {
                    this.f488a.m966n(action);
                    this.f488a.f495f = false;
                    this.f488a.f494e = "";
                    if (this.f488a.f491b != null && this.f488a.f491b.length() > 0) {
                        this.f488a.m960h(this.f488a.f491b);
                        this.f488a.f491b = "";
                    }
                }
            } else if ("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.ERROR".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action != null && action.equals(this.f488a.f494e)) {
                    this.f488a.m949b();
                    this.f488a.f495f = false;
                    this.f488a.f494e = "";
                    if (this.f488a.f491b != null && this.f488a.f491b.length() > 0) {
                        this.f488a.m960h(this.f488a.f491b);
                        this.f488a.f491b = "";
                    }
                }
            }
        }
    }

    public class FileDownloaderReceiver extends BroadcastReceiver {
        final /* synthetic */ AudioCacheService f489a;

        public FileDownloaderReceiver(AudioCacheService audioCacheService) {
            this.f489a = audioCacheService;
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            String action = intent.getAction();
            if ("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADING".equals(action)) {
                stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
                if (stringExtra != null && stringExtra.length() > 0 && this.f489a.f492c.m894b(stringExtra)) {
                    String stringExtra2 = intent.getStringExtra("com.andromo.dev576782.app537736.extra.TO_PATH");
                    this.f489a.f492c.m891a(stringExtra, da.DOWNLOADING);
                    this.f489a.m951b(stringExtra, stringExtra2);
                }
            }
            if ("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
                if (action != null && action.length() > 0 && this.f489a.f492c.m894b(action)) {
                    stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.TO_PATH");
                    this.f489a.f492c.m893a(action, true);
                    this.f489a.f492c.m891a(action, da.DOWNLOADED);
                    this.f489a.m946a(action, stringExtra, intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", false));
                }
            } else if ("com.andromo.dev576782.app537736.FileDownloader.broadcast.CANCELLED".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
                if (action != null && action.length() > 0 && this.f489a.f492c.m894b(action)) {
                    this.f489a.f492c.m891a(action, da.CANCELLED);
                }
            } else if ("com.andromo.dev576782.app537736.FileDownloader.broadcast.ERROR".equals(action)) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
                if (action != null && action.length() > 0 && this.f489a.f492c.m894b(action)) {
                    this.f489a.f492c.m891a(action, da.ERROR);
                    action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.ERROR_MESSAGE");
                    if (action == null || action.length() <= 0) {
                        this.f489a.m949b();
                    } else {
                        this.f489a.m967o(action);
                    }
                }
            }
        }
    }

    public AudioCacheService() {
        this.f490a = "";
        this.f491b = "";
        this.f492c = new AudioCacheMap();
        this.f501l = new Handler();
    }

    private void m938p(String str) {
        if (str != null && str.length() > 0 && this.f492c != null && !str.equals(this.f494e)) {
            Intent intent = new Intent(this, AudioCacheSaver.class);
            intent.putExtra("com.andromo.dev576782.app537736.extra.AUDIO_CACHE", (AudioCacheMap) this.f492c);
            intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
            this.f495f = true;
            this.f494e = str;
            startService(intent);
        }
    }

    public final CacheItem m939a(String str) {
        return this.f492c != null ? this.f492c.m886a(str) : CacheItem.m1095a();
    }

    public final String m940a() {
        return this.f492c != null ? this.f492c.m887a() : "";
    }

    public final void m941a(bv bvVar) {
        this.f493d = bvVar;
    }

    public final void m942a(String str, int i) {
        if (this.f492c != null) {
            this.f492c.m889a(str, i);
        }
    }

    public final void m943a(String str, int i, da daVar) {
        if (this.f492c != null) {
            this.f492c.m890a(str, i, daVar);
        }
    }

    public final void m944a(String str, da daVar) {
        if (this.f492c != null) {
            this.f492c.m891a(str, daVar);
        }
    }

    public final void m945a(String str, String str2) {
        if (this.f492c != null) {
            this.f492c.m892a(str, str2);
        }
    }

    final void m946a(String str, String str2, boolean z) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.DOWNLOADED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", str2);
        intent.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", z);
        sendBroadcast(intent);
    }

    public final void m947a(String str, boolean z) {
        if (this.f492c != null) {
            this.f492c.m893a(str, z);
        }
    }

    public final boolean m948a(String str, boolean z, boolean z2) {
        if (!(this.f492c == null || str == null || str.length() <= 0)) {
            if (!z && this.f492c.m895c(str)) {
                String e = this.f492c.m897e(str);
                if (new File(e).exists()) {
                    this.f492c.m891a(str, da.READY);
                    Intent intent = new Intent();
                    intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.ALREADY_IN_CACHE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
                    intent.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", e);
                    intent.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", z2);
                    sendBroadcast(intent);
                    return true;
                }
            }
            if (eu.m1405a()) {
                this.f492c.m891a(str, da.QUEUED);
                new File(this.f492c.m887a()).mkdirs();
                this.f492c.m892a(str, this.f492c.m899g(str));
                Intent intent2 = new Intent(this, FileDownloader.class);
                intent2.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
                intent2.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", this.f492c.m897e(str));
                intent2.putExtra("com.andromo.dev576782.app537736.extra.ACCEPT_HEADER", "audio/*");
                intent2.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", z2);
                intent2.putExtra("com.andromo.dev576782.app537736.extra.OVERWRITE", false);
                ArrayList arrayList = new ArrayList();
                arrayList.add("text/html");
                intent2.putStringArrayListExtra("com.andromo.dev576782.app537736.extra.UNACCEPTABLE_MIME_TYPES", arrayList);
                startService(intent2);
                return true;
            }
        }
        return false;
    }

    final void m949b() {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILE", "");
        sendBroadcast(intent);
    }

    final void m950b(String str, da daVar) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.STATUS_CHANGE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.STATUS", daVar.name());
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILE", str);
        sendBroadcast(intent);
    }

    final void m951b(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.DOWNLOADING");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", str2);
        sendBroadcast(intent);
    }

    public final boolean m952b(String str) {
        return this.f492c != null ? this.f492c.m894b(str) : false;
    }

    final void m953c(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.DELETED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", str2);
        sendBroadcast(intent);
    }

    public final boolean m954c(String str) {
        return this.f492c != null ? this.f492c.m895c(str) : false;
    }

    public final da m955d(String str) {
        return this.f492c != null ? this.f492c.m896d(str) : da.NONE;
    }

    final void m956d(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.ERROR_MESSAGE", str2);
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILE", str);
        sendBroadcast(intent);
    }

    public final String m957e(String str) {
        return this.f492c != null ? this.f492c.m897e(str) : "";
    }

    public final String m958f(String str) {
        return this.f492c != null ? this.f492c.m898f(str) : "";
    }

    public final String m959g(String str) {
        return this.f492c != null ? this.f492c.m899g(str) : "";
    }

    final void m960h(String str) {
        if (str != null && str.length() > 0 && this.f492c != null && !str.equals(this.f497h)) {
            Intent intent = new Intent(this, AudioCacheLoader.class);
            intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
            this.f498i = true;
            this.f497h = str;
            startService(intent);
            if (str.equals(this.f491b)) {
                this.f491b = "";
            }
        }
    }

    public final void m961i(String str) {
        if (str != null && str.length() > 0) {
            if (this.f490a == null || this.f490a.length() == 0) {
                m960h(str);
            } else if (str.equals(this.f490a)) {
                this.f491b = "";
            } else {
                this.f491b = str;
                m938p(this.f490a);
            }
        }
    }

    public final void m962j(String str) {
        if (this.f492c != null && str != null && str.length() > 0) {
            da d = this.f492c.m896d(str);
            if (d != da.QUEUED && d == da.DOWNLOADING) {
                Intent intent = new Intent("com.andromo.dev576782.app537736.FileDownloader.action.CANCEL", null, getApplicationContext(), FileDownloader.class);
                intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
                startService(intent);
            }
        }
    }

    public final boolean m963k(String str) {
        if (this.f492c == null || str == null || str.length() <= 0 || !eu.m1405a() || !this.f492c.m895c(str)) {
            return false;
        }
        String e = this.f492c.m897e(str);
        if (e == null || e.length() <= 0) {
            return true;
        }
        if (new File(e).exists()) {
            new dw(new by(this, str, e)).execute(new String[]{e});
            return true;
        }
        this.f492c.m893a(str, false);
        this.f492c.m891a(str, da.READY);
        return true;
    }

    final void m964l(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.SAVED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
        sendBroadcast(intent);
    }

    final void m965m(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.LOADED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
        sendBroadcast(intent);
    }

    final void m966n(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.CANCELLED");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
        sendBroadcast(intent);
    }

    final void m967o(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCache.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILE", str);
        sendBroadcast(intent);
    }

    public IBinder onBind(Intent intent) {
        return new ff(this);
    }

    public void onCreate() {
        IntentFilter intentFilter;
        if (this.f492c == null || this.f492c == AudioCacheMap.f481a) {
            this.f492c = new AudioCacheMap();
        }
        this.f492c.m888a(new bx(this));
        if (this.f500k == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADED");
            intentFilter.addAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADING");
            intentFilter.addAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.CANCELLED");
            intentFilter.addAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f500k = new FileDownloaderReceiver(this);
            if (this.f500k != null) {
                registerReceiver(this.f500k, intentFilter);
            }
        }
        if (this.f496g == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.SAVED");
            intentFilter.addAction("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.CANCELLED");
            intentFilter.addAction("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f496g = new AudioCacheSaverReceiver(this);
            if (this.f496g != null) {
                registerReceiver(this.f496g, intentFilter);
                this.f495f = false;
                this.f494e = "";
            }
        }
        if (this.f499j == null) {
            intentFilter = new IntentFilter("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.LOADED");
            intentFilter.addAction("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.CANCELLED");
            intentFilter.addAction("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.ERROR");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.f499j = new AudioCacheLoaderReceiver(this);
            if (this.f499j != null) {
                registerReceiver(this.f499j, intentFilter);
                this.f498i = false;
                this.f497h = "";
            }
        }
    }

    public void onDestroy() {
        if (this.f500k != null) {
            unregisterReceiver(this.f500k);
            this.f500k = null;
        }
        if (this.f496g != null) {
            unregisterReceiver(this.f496g);
            this.f496g = null;
            this.f495f = false;
            this.f494e = "";
        }
        if (this.f499j != null) {
            unregisterReceiver(this.f499j);
            this.f499j = null;
            this.f498i = false;
            this.f497h = "";
        }
        m938p(this.f490a);
        if (this.f492c != null) {
            this.f492c.m888a(null);
        }
        this.f492c = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent.getAction();
        if (!action.equals("com.andromo.dev576782.app537736.AudioCache.action.START")) {
            if (action.equals("com.andromo.dev576782.app537736.AudioCache.action.SAVE_CACHE")) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action == null || action.length() == 0) {
                    action = "com.andromo.dev576782.app537736_cache.dat";
                }
                m938p(action);
            } else if (action.equals("com.andromo.dev576782.app537736.AudioCache.action.LOAD_CACHE")) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
                if (action == null || action.length() == 0) {
                    action = "com.andromo.dev576782.app537736_cache.dat";
                }
                m960h(action);
            } else if (!action.equals("com.andromo.dev576782.app537736.AudioCache.action.SET_ITEM")) {
                if (action.equals("com.andromo.dev576782.app537736.AudioCache.action.DOWNLOAD")) {
                    m948a(intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI"), intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.OVERWRITE", false), intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", false));
                } else if (action.equals("com.andromo.dev576782.app537736.AudioCache.action.DELETE")) {
                    m963k(intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI"));
                }
            }
        }
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }
}
