package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Audio98819_PlaylistManager extends IntentService {
    private static Playlist f475e;
    private volatile hj f476a;
    private volatile hf f477b;
    private volatile ha f478c;
    private volatile boolean f479d;

    public Audio98819_PlaylistManager() {
        super("Audio98819_PlaylistManager");
        this.f476a = hj.UNKNOWN;
    }

    static Playlist m876a() {
        return f475e;
    }

    private Playlist m877a(String str, long j) {
        Playlist playlist;
        IOException iOException;
        Object obj = null;
        Playlist playlist2 = null;
        this.f477b = new hf();
        if (this.f477b == null) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f477b.m1555a(this, str);
            if (!this.f477b.m1557a()) {
                if (this.f477b.f1032k == hg.ERROR) {
                    obj = 1;
                }
                if (obj == null) {
                    currentTimeMillis -= this.f477b.f1022a;
                    if (j <= 0 || (currentTimeMillis >= 0 && currentTimeMillis <= j)) {
                        playlist = new Playlist(this, (byte) 0);
                        try {
                            m880a(hj.FRESH);
                            return playlist;
                        } catch (FileNotFoundException e) {
                            playlist2 = playlist;
                            m880a(hj.NOT_FOUND);
                            return playlist2;
                        } catch (IOException e2) {
                            IOException iOException2 = e2;
                            playlist2 = playlist;
                            iOException = iOException2;
                            iOException.printStackTrace();
                            m880a(hj.ERROR_LOADING);
                            return playlist2;
                        }
                    }
                    m880a(hj.STALE);
                    return null;
                }
            }
            playlist = null;
            return playlist;
        } catch (FileNotFoundException e3) {
            m880a(hj.NOT_FOUND);
            return playlist2;
        } catch (IOException e4) {
            iOException = e4;
            iOException.printStackTrace();
            m880a(hj.ERROR_LOADING);
            return playlist2;
        }
    }

    static void m878a(Playlist playlist) {
        f475e = playlist;
    }

    private void m879a(Playlist playlist, String str) {
        IOException e;
        Throwable th;
        if (!(playlist == null || str == null || "".equals(str))) {
            m880a(hj.SAVING);
            this.f477b = new hf(playlist);
            if (this.f477b != null) {
                try {
                    hf hfVar = this.f477b;
                    hfVar.f1032k = hg.RUNNING;
                    DataOutputStream dataOutputStream;
                    try {
                        dataOutputStream = new DataOutputStream(new BufferedOutputStream(openFileOutput(str, 0)));
                        try {
                            hfVar.m1556a(dataOutputStream);
                            hfVar.f1032k = hg.DONE;
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            m880a(hj.SAVED);
                            Intent intent = new Intent();
                            intent.setAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_SAVED");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", str);
                            sendBroadcast(intent);
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                hfVar.f1032k = hg.ERROR;
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                if (dataOutputStream != null) {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                }
                                throw th;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        dataOutputStream = null;
                        hfVar.f1032k = hg.ERROR;
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = null;
                        if (dataOutputStream != null) {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    throw e4;
                } catch (IOException e42) {
                    throw e42;
                } catch (IOException e422) {
                    e422.printStackTrace();
                }
            } else {
                return;
            }
        }
        m880a(hj.ERROR_SAVING);
        m881a(str, null);
    }

    private void m880a(hj hjVar) {
        this.f476a = hjVar;
        String str = "STATUS";
        SharedPreferences sharedPreferences = getSharedPreferences("com.andromo.dev576782.app537736.Audio98819.PlaylistManager", 0);
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putString(str, hjVar.name());
                edit.commit();
            }
        }
    }

    private void m881a(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.STATUS", this.f476a.name());
        if (str != null) {
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", str);
        }
        if (str2 != null) {
            intent.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.PLAYLIST_ID", str2);
        }
        sendBroadcast(intent);
    }

    static boolean m882a(ContextWrapper contextWrapper) {
        return m885d(contextWrapper) == hj.EXPANDING;
    }

    static boolean m883b(ContextWrapper contextWrapper) {
        hj d = m885d(contextWrapper);
        return d == hj.LOADING || d == hj.EXPANDING;
    }

    static boolean m884c(ContextWrapper contextWrapper) {
        hj d = m885d(contextWrapper);
        return d == hj.SAVING || d == hj.EXPANDING;
    }

    private static hj m885d(ContextWrapper contextWrapper) {
        hj hjVar = hj.UNKNOWN;
        SharedPreferences sharedPreferences = contextWrapper.getSharedPreferences("com.andromo.dev576782.app537736.Audio98819.PlaylistManager", 0);
        return (sharedPreferences == null || !sharedPreferences.contains("STATUS")) ? hjVar : hj.valueOf(sharedPreferences.getString("STATUS", hj.UNKNOWN.name()));
    }

    public void onCreate() {
        super.onCreate();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = r4.f476a;
        r3 = com.andromo.dev576782.app537736.hj.SAVING;
        if (r2 == r3) goto L_0x0027;
    L_0x0008:
        r2 = r4.f477b;
        if (r2 == 0) goto L_0x0027;
    L_0x000c:
        r2 = r4.f477b;
        r2 = r2.f1032k;
        r3 = com.andromo.dev576782.app537736.hg.PENDING;
        if (r2 != r3) goto L_0x0044;
    L_0x0014:
        r2 = r0;
    L_0x0015:
        if (r2 != 0) goto L_0x0021;
    L_0x0017:
        r2 = r4.f477b;
        r2 = r2.f1032k;
        r3 = com.andromo.dev576782.app537736.hg.RUNNING;
        if (r2 != r3) goto L_0x0046;
    L_0x001f:
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r4.f477b;
        r1 = com.andromo.dev576782.app537736.hg.CANCELLED;
        r0.f1032k = r1;
    L_0x0027:
        r0 = r4.f478c;
        if (r0 == 0) goto L_0x0040;
    L_0x002b:
        r0 = r4.f478c;
        r0 = r0.m1550b();
        if (r0 != 0) goto L_0x003b;
    L_0x0033:
        r0 = r4.f478c;
        r0 = r0.m1551c();
        if (r0 == 0) goto L_0x0040;
    L_0x003b:
        r0 = r4.f478c;
        r0.m1552d();
    L_0x0040:
        super.onDestroy();
        return;
    L_0x0044:
        r2 = r1;
        goto L_0x0015;
    L_0x0046:
        r0 = r1;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.Audio98819_PlaylistManager.onDestroy():void");
    }

    protected void onHandleIntent(Intent intent) {
        boolean z = false;
        if (intent != null) {
            String action = intent.getAction();
            Playlist a;
            Intent intent2;
            if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.LOAD".equals(action)) {
                m880a(hj.LOADING);
                String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME");
                long longExtra = intent.getLongExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.MAX_AGE_MILLISECS", 86400000);
                if (stringExtra == null || "".equals(stringExtra)) {
                    m880a(hj.ERROR_LOADING);
                    m881a(stringExtra, null);
                    return;
                }
                a = m877a(stringExtra, longExtra);
                if (this.f479d || ((this.f477b != null && this.f477b.m1557a()) || (this.f478c != null && this.f478c.m1548a()))) {
                    m880a(hj.CANCELLED_LOADING);
                    m881a(stringExtra, null);
                } else if (a == null) {
                    Intent intent3 = new Intent();
                    intent3.setAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_NOT_LOADED");
                    intent3.addCategory("android.intent.category.DEFAULT");
                    intent3.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.STATUS", this.f476a.name());
                    intent3.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", stringExtra);
                    sendBroadcast(intent3);
                } else if (a != null) {
                    intent2 = new Intent();
                    intent2.setAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_LOADED");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    f475e = a;
                    intent2.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME", stringExtra);
                    sendBroadcast(intent2);
                }
            } else if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.EXPAND".equals(action)) {
                m880a(hj.EXPANDING);
                a = f475e;
                if (a != null) {
                    String b = a.m1149b();
                    int intExtra = intent.getIntExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILES_RES_ID", 0);
                    int intExtra2 = intent.getIntExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.TITLES_RES_ID", 0);
                    int intExtra3 = intent.getIntExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.DESCRIPTIONS_RES_ID", 0);
                    int intExtra4 = intent.getIntExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.TRACK_TYPES_RES_ID", 0);
                    String stringExtra2 = intent.getStringExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME");
                    if (!"".equals(stringExtra2) && intent.getBooleanExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.SAVE_AFTER_EXPANDING", false)) {
                        z = true;
                    }
                    if (this.f479d) {
                        m880a(hj.CANCELLED_EXPANDING);
                        m881a(null, a.m1149b());
                        a = null;
                    } else {
                        if (a != null) {
                            Resources resources = getResources();
                            if (resources != null) {
                                this.f478c = new ha(a.m1149b(), a.m1140a());
                                if (this.f478c != null) {
                                    a = this.f478c.m1549b(a.m1154d()).m1543a(a.m1158f()).m1544a(a.m1156e()).m1545a(a.m1159g()).m1547a(resources.getStringArray(intExtra), resources.getStringArray(intExtra2), resources.getStringArray(intExtra3), resources.getStringArray(intExtra4)).m1553e();
                                }
                            }
                        }
                        a = null;
                    }
                    if (this.f478c != null && this.f478c.m1548a()) {
                        m880a(hj.CANCELLED_EXPANDING);
                        m881a(null, b);
                        return;
                    } else if (a != null) {
                        m880a(hj.EXPANDED);
                        if (a != null) {
                            intent2 = new Intent();
                            intent2.setAction("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.broadcast.PLAYLIST_EXPANDED");
                            intent2.addCategory("android.intent.category.DEFAULT");
                            f475e = a;
                            intent2.putExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.PLAYLIST_ID", a.m1149b());
                            sendBroadcast(intent2);
                        }
                        if (z) {
                            m879a(a, stringExtra2);
                            return;
                        }
                        return;
                    } else {
                        m880a(hj.ERROR_EXPANDING);
                        m881a(null, b);
                        return;
                    }
                }
                m880a(hj.ERROR_EXPANDING);
                m881a(null, null);
            } else if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.SAVE".equals(action)) {
                m880a(hj.SAVING);
                m879a(f475e, intent.getStringExtra("com.andromo.dev576782.app537736.PlaylistManager.extra.FILENAME"));
            } else {
                "com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.CANCEL".equals(action);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if ("com.andromo.dev576782.app537736.Audio98819.PlaylistManager.action.CANCEL".equals(intent.getAction())) {
                this.f479d = true;
                if (this.f477b != null) {
                    this.f477b.f1032k = hg.CANCELLED;
                }
                if (this.f478c != null) {
                    this.f478c.m1552d();
                }
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
