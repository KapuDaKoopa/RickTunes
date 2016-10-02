package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class FileDownloader extends IntentService {
    et f567a;
    private volatile boolean f568b;
    private volatile String f569c;

    public FileDownloader() {
        super("FileDownloader");
    }

    private File m1104a(String str, String str2, String str3, Collection collection, boolean z) {
        File file;
        Object obj;
        if (!(str == null || str2 == null)) {
            File file2;
            file = new File(str2);
            if (file.isDirectory()) {
                String guessFileName = URLUtil.guessFileName(str2, null, null);
                if (guessFileName == null) {
                    throw new IllegalArgumentException(getString(2131231005));
                }
                file2 = new File(file, guessFileName);
            } else {
                file2 = file;
            }
            if (!z && file2.exists()) {
                return file2;
            }
            WifiLock createWifiLock = ((WifiManager) getSystemService("wifi")).createWifiLock(1, "Andromo-FileDownloader");
            if (createWifiLock != null) {
                try {
                    createWifiLock.setReferenceCounted(false);
                    try {
                        createWifiLock.acquire();
                    } catch (UnsupportedOperationException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    m1106a(str, e2.getMessage());
                    if (createWifiLock != null && createWifiLock.isHeld()) {
                        createWifiLock.release();
                        obj = null;
                    }
                } catch (Throwable th) {
                    if (createWifiLock != null && createWifiLock.isHeld()) {
                        createWifiLock.release();
                    }
                }
            }
            String absolutePath = file2.getAbsolutePath();
            Intent intent = new Intent();
            intent.setAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADING");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
            intent.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", absolutePath);
            sendBroadcast(intent);
            this.f567a = new et(this, str);
            dy.m1354a(str, file2, str3, collection, this.f567a);
            if (createWifiLock == null || !createWifiLock.isHeld()) {
                file = file2;
            } else {
                createWifiLock.release();
                file = file2;
            }
            return file;
        }
        obj = null;
        return file;
    }

    private void m1105a(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.CANCELLED");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(intent);
    }

    private void m1106a(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.putExtra("com.andromo.dev576782.app537736.extra.ERROR_MESSAGE", str2);
        sendBroadcast(intent);
    }

    final void m1107a(String str, long j, long j2) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.PROGRESS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", str);
        intent.putExtra("com.andromo.dev576782.app537736.extra.PROGRESS_BYTES", j);
        intent.putExtra("com.andromo.dev576782.app537736.extra.TOTAL_BYTES", j2);
        sendBroadcast(intent);
    }

    public void onDestroy() {
        this.f568b = true;
        if (this.f567a != null) {
            this.f567a.f874a = true;
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        this.f569c = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
        String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.TO_PATH");
        String stringExtra2 = intent.getStringExtra("com.andromo.dev576782.app537736.extra.ACCEPT_HEADER");
        Collection stringArrayListExtra = intent.getStringArrayListExtra("com.andromo.dev576782.app537736.extra.UNACCEPTABLE_MIME_TYPES");
        boolean booleanExtra = intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.OVERWRITE", true);
        if (this.f569c == null || stringExtra == null) {
            m1106a(this.f569c, getString(2131231015));
            return;
        }
        File a = m1104a(this.f569c, stringExtra, stringExtra2, stringArrayListExtra, booleanExtra);
        if (this.f568b) {
            m1105a(this.f569c);
        } else if (a != null) {
            boolean booleanExtra2 = intent.getBooleanExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", false);
            stringExtra = this.f569c;
            String absolutePath = a.getAbsolutePath();
            Intent intent2 = new Intent();
            intent2.setAction("com.andromo.dev576782.app537736.FileDownloader.broadcast.DOWNLOADED");
            intent2.addCategory("android.intent.category.DEFAULT");
            intent2.putExtra("com.andromo.dev576782.app537736.extra.FROM_URI", stringExtra);
            intent2.putExtra("com.andromo.dev576782.app537736.extra.TO_PATH", absolutePath);
            intent2.putExtra("com.andromo.dev576782.app537736.extra.AUTOPLAY", booleanExtra2);
            sendBroadcast(intent2);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if (action != null && action.equals("com.andromo.dev576782.app537736.FileDownloader.action.CANCEL")) {
                action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FROM_URI");
                if (action == null || (action.length() > 0 && action.equals(this.f569c))) {
                    this.f568b = true;
                    if (this.f567a != null) {
                        this.f567a.f874a = true;
                    }
                    m1105a(this.f569c);
                    stopSelf();
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
