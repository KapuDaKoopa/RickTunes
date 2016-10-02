package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore.Audio.Media;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;
import com.google.android.gms.C0772e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SetRingtoneService extends IntentService {
    private Handler f604a;
    private Toast f605b;

    public SetRingtoneService() {
        super("SetRingtoneService");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File m1168a(android.content.res.AssetManager r11, java.lang.String r12, com.andromo.dev576782.app537736.AudioItem r13, int r14) {
        /*
        r10 = this;
        r7 = 5;
        r1 = 0;
        r3 = 0;
        r4 = 1;
        if (r13 == 0) goto L_0x0289;
    L_0x0006:
        if (r11 == 0) goto L_0x0289;
    L_0x0008:
        if (r13 == 0) goto L_0x0289;
    L_0x000a:
        r5 = r13.m985b();
        if (r5 == 0) goto L_0x0289;
    L_0x0010:
        switch(r14) {
            case 1: goto L_0x0043;
            case 2: goto L_0x00aa;
            case 3: goto L_0x0013;
            case 4: goto L_0x00b7;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0028 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0028 }
        r5 = "Invalid type: ";
        r2.<init>(r5);	 Catch:{ IOException -> 0x0028 }
        r2 = r2.append(r14);	 Catch:{ IOException -> 0x0028 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0028 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0028 }
        throw r0;	 Catch:{ IOException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = 2131230988; // 0x7f08010c float:1.8078044E38 double:1.0529680145E-314;
        r2 = new java.lang.Object[r4];
        r4 = r10.m1169a(r14);
        r2[r3] = r4;
        r0 = r10.getString(r0, r2);
        r10.m1174a(r0);
        r10.m1170a();
        r0 = r1;
    L_0x0042:
        return r0;
    L_0x0043:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r2 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x0028 }
        r6 = "Ringtones";
        r0.<init>(r2, r6);	 Catch:{ IOException -> 0x0028 }
        r6 = r0;
    L_0x004f:
        r6.mkdirs();	 Catch:{ IOException -> 0x0028 }
        r0 = r13.m992i();	 Catch:{ IOException -> 0x0028 }
        if (r0 == 0) goto L_0x00c6;
    L_0x0058:
        if (r12 == 0) goto L_0x00c4;
    L_0x005a:
        r0 = "";
        r0 = r0.equals(r12);	 Catch:{ IOException -> 0x0028 }
        if (r0 != 0) goto L_0x00c4;
    L_0x0062:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0028 }
        r0.<init>();	 Catch:{ IOException -> 0x0028 }
        r0 = r0.append(r12);	 Catch:{ IOException -> 0x0028 }
        r2 = "/";
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0028 }
        r0 = r0.append(r5);	 Catch:{ IOException -> 0x0028 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0028 }
        r2 = r0;
    L_0x007a:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r0.<init>(r6, r5);	 Catch:{ IOException -> 0x0028 }
        r2 = r11.openFd(r2);	 Catch:{ IOException -> 0x0028 }
        m1172a(r2, r0);	 Catch:{ IOException -> 0x0028 }
        r2 = r3;
    L_0x0087:
        if (r0 == 0) goto L_0x0042;
    L_0x0089:
        if (r2 != 0) goto L_0x0042;
    L_0x008b:
        r2 = r13.m986c();	 Catch:{ IOException -> 0x0028 }
        m1171a(r10, r0, r2, r14);	 Catch:{ IOException -> 0x0028 }
        switch(r14) {
            case 1: goto L_0x022b;
            case 2: goto L_0x0262;
            case 3: goto L_0x0095;
            case 4: goto L_0x0270;
            default: goto L_0x0095;
        };	 Catch:{ IOException -> 0x0028 }
    L_0x0095:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0028 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0028 }
        r5 = "Invalid type: ";
        r2.<init>(r5);	 Catch:{ IOException -> 0x0028 }
        r2 = r2.append(r14);	 Catch:{ IOException -> 0x0028 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0028 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0028 }
        throw r0;	 Catch:{ IOException -> 0x0028 }
    L_0x00aa:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r2 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x0028 }
        r6 = "Notifications";
        r0.<init>(r2, r6);	 Catch:{ IOException -> 0x0028 }
        r6 = r0;
        goto L_0x004f;
    L_0x00b7:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r2 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x0028 }
        r6 = "Alarms";
        r0.<init>(r2, r6);	 Catch:{ IOException -> 0x0028 }
        r6 = r0;
        goto L_0x004f;
    L_0x00c4:
        r2 = r5;
        goto L_0x007a;
    L_0x00c6:
        r0 = r13.m994k();	 Catch:{ IOException -> 0x0028 }
        if (r0 == 0) goto L_0x00ea;
    L_0x00cc:
        r0 = r5.length();	 Catch:{ IOException -> 0x0028 }
        if (r0 <= r7) goto L_0x0285;
    L_0x00d2:
        r2 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r0 = 5;
        r0 = r5.substring(r0);	 Catch:{ IOException -> 0x0028 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0028 }
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0028 }
        r5 = r2.getName();	 Catch:{ IOException -> 0x0028 }
        r0.<init>(r6, r5);	 Catch:{ IOException -> 0x0028 }
        m1173a(r2, r0);	 Catch:{ IOException -> 0x0028 }
        r2 = r3;
        goto L_0x0087;
    L_0x00ea:
        r0 = r13.m988e();	 Catch:{ IOException -> 0x0028 }
        r0 = r0.m1316b();	 Catch:{ IOException -> 0x0028 }
        if (r0 != 0) goto L_0x0285;
    L_0x00f4:
        r0 = "wifi";
        r0 = r10.getSystemService(r0);	 Catch:{ IOException -> 0x0028 }
        r0 = (android.net.wifi.WifiManager) r0;	 Catch:{ IOException -> 0x0028 }
        r2 = 1;
        r7 = "Andromo-SetRingtoneService";
        r7 = r0.createWifiLock(r2, r7);	 Catch:{ IOException -> 0x0028 }
        r2 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2.<init>(r5);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r0 = r2.getPath();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        if (r0 == 0) goto L_0x0116;
    L_0x010e:
        r8 = "";
        r8 = r8.equals(r0);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        if (r8 == 0) goto L_0x011a;
    L_0x0116:
        r0 = r2.getHost();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
    L_0x011a:
        if (r0 == 0) goto L_0x01a4;
    L_0x011c:
        r2 = "";
        r2 = r2.equals(r0);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        if (r2 != 0) goto L_0x01a4;
    L_0x0124:
        if (r7 == 0) goto L_0x012d;
    L_0x0126:
        r2 = 0;
        r7.setReferenceCounted(r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r7.acquire();	 Catch:{ UnsupportedOperationException -> 0x0173 }
    L_0x012d:
        r2 = 47;
        r2 = r0.lastIndexOf(r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        if (r2 < 0) goto L_0x01a2;
    L_0x0135:
        r2 = r2 + 1;
        r0 = r0.substring(r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2 = r0;
    L_0x013c:
        r0 = new java.io.File;	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r0.<init>(r6, r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2 = r13.m986c();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r6 = 2131230981; // 0x7f080105 float:1.807803E38 double:1.052968011E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r9 = 0;
        r8[r9] = r2;	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2 = r10.getString(r6, r8);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r10.m1175b(r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2 = new java.util.ArrayList;	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2.<init>();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r6 = "text/html";
        r2.add(r6);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r6 = "audio/*";
        r8 = 0;
        com.andromo.dev576782.app537736.dy.m1354a(r5, r0, r6, r2, r8);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
    L_0x0165:
        if (r7 == 0) goto L_0x0282;
    L_0x0167:
        r2 = r7.isHeld();	 Catch:{ IOException -> 0x0028 }
        if (r2 == 0) goto L_0x0282;
    L_0x016d:
        r7.release();	 Catch:{ IOException -> 0x0028 }
        r2 = r3;
        goto L_0x0087;
    L_0x0173:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        goto L_0x012d;
    L_0x0178:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x021e }
        r0 = 2131230987; // 0x7f08010b float:1.8078042E38 double:1.052968014E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x021e }
        r5 = 0;
        r6 = r10.m1169a(r14);	 Catch:{ all -> 0x021e }
        r2[r5] = r6;	 Catch:{ all -> 0x021e }
        r0 = r10.getString(r0, r2);	 Catch:{ all -> 0x021e }
        r10.m1174a(r0);	 Catch:{ all -> 0x021e }
        r10.m1170a();	 Catch:{ all -> 0x021e }
        if (r7 == 0) goto L_0x027e;
    L_0x0195:
        r0 = r7.isHeld();	 Catch:{ IOException -> 0x0028 }
        if (r0 == 0) goto L_0x027e;
    L_0x019b:
        r7.release();	 Catch:{ IOException -> 0x0028 }
        r2 = r4;
        r0 = r1;
        goto L_0x0087;
    L_0x01a2:
        r2 = r0;
        goto L_0x013c;
    L_0x01a4:
        r0 = 2131230987; // 0x7f08010b float:1.8078042E38 double:1.052968014E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r5 = 0;
        r6 = r10.m1169a(r14);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r2[r5] = r6;	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r0 = r10.getString(r0, r2);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r10.m1174a(r0);	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r10.m1170a();	 Catch:{ URISyntaxException -> 0x0178, IOException -> 0x01bd }
        r0 = r1;
        goto L_0x0165;
    L_0x01bd:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x021e }
        r0 = r0.getMessage();	 Catch:{ all -> 0x021e }
        if (r0 == 0) goto L_0x021b;
    L_0x01c7:
        r2 = "";
        r2 = r2.equals(r0);	 Catch:{ all -> 0x021e }
        if (r2 != 0) goto L_0x021b;
    L_0x01cf:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x021e }
        r5 = " (";
        r2.<init>(r5);	 Catch:{ all -> 0x021e }
        r0 = r2.append(r0);	 Catch:{ all -> 0x021e }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ all -> 0x021e }
        r0 = r0.toString();	 Catch:{ all -> 0x021e }
    L_0x01e4:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x021e }
        r2.<init>();	 Catch:{ all -> 0x021e }
        r5 = 2131230987; // 0x7f08010b float:1.8078042E38 double:1.052968014E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x021e }
        r8 = 0;
        r9 = r10.m1169a(r14);	 Catch:{ all -> 0x021e }
        r6[r8] = r9;	 Catch:{ all -> 0x021e }
        r5 = r10.getString(r5, r6);	 Catch:{ all -> 0x021e }
        r2 = r2.append(r5);	 Catch:{ all -> 0x021e }
        r0 = r2.append(r0);	 Catch:{ all -> 0x021e }
        r0 = r0.toString();	 Catch:{ all -> 0x021e }
        r10.m1174a(r0);	 Catch:{ all -> 0x021e }
        r10.m1170a();	 Catch:{ all -> 0x021e }
        if (r7 == 0) goto L_0x027e;
    L_0x020e:
        r0 = r7.isHeld();	 Catch:{ IOException -> 0x0028 }
        if (r0 == 0) goto L_0x027e;
    L_0x0214:
        r7.release();	 Catch:{ IOException -> 0x0028 }
        r2 = r4;
        r0 = r1;
        goto L_0x0087;
    L_0x021b:
        r0 = "";
        goto L_0x01e4;
    L_0x021e:
        r0 = move-exception;
        if (r7 == 0) goto L_0x022a;
    L_0x0221:
        r2 = r7.isHeld();	 Catch:{ IOException -> 0x0028 }
        if (r2 == 0) goto L_0x022a;
    L_0x0227:
        r7.release();	 Catch:{ IOException -> 0x0028 }
    L_0x022a:
        throw r0;	 Catch:{ IOException -> 0x0028 }
    L_0x022b:
        r5 = 2131230978; // 0x7f080102 float:1.8078024E38 double:1.0529680096E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x0028 }
        r7 = 0;
        r6[r7] = r2;	 Catch:{ IOException -> 0x0028 }
        r2 = r10.getString(r5, r6);	 Catch:{ IOException -> 0x0028 }
    L_0x0238:
        r10.m1175b(r2);	 Catch:{ IOException -> 0x0028 }
        r2 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0028 }
        r5 = new android.content.Intent;	 Catch:{ IOException -> 0x0028 }
        r5.<init>();	 Catch:{ IOException -> 0x0028 }
        r6 = "com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_SET";
        r5.setAction(r6);	 Catch:{ IOException -> 0x0028 }
        r6 = "android.intent.category.DEFAULT";
        r5.addCategory(r6);	 Catch:{ IOException -> 0x0028 }
        r6 = "com.andromo.dev576782.app537736.SetRingtoneService.AUDIO_ITEM";
        r5.putExtra(r6, r13);	 Catch:{ IOException -> 0x0028 }
        r6 = "com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_TYPE";
        r5.putExtra(r6, r14);	 Catch:{ IOException -> 0x0028 }
        r6 = "RINGTONE_FILE";
        r5.putExtra(r6, r2);	 Catch:{ IOException -> 0x0028 }
        r10.sendBroadcast(r5);	 Catch:{ IOException -> 0x0028 }
        goto L_0x0042;
    L_0x0262:
        r5 = 2131230979; // 0x7f080103 float:1.8078026E38 double:1.05296801E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x0028 }
        r7 = 0;
        r6[r7] = r2;	 Catch:{ IOException -> 0x0028 }
        r2 = r10.getString(r5, r6);	 Catch:{ IOException -> 0x0028 }
        goto L_0x0238;
    L_0x0270:
        r5 = 2131230980; // 0x7f080104 float:1.8078028E38 double:1.0529680106E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x0028 }
        r7 = 0;
        r6[r7] = r2;	 Catch:{ IOException -> 0x0028 }
        r2 = r10.getString(r5, r6);	 Catch:{ IOException -> 0x0028 }
        goto L_0x0238;
    L_0x027e:
        r2 = r4;
        r0 = r1;
        goto L_0x0087;
    L_0x0282:
        r2 = r3;
        goto L_0x0087;
    L_0x0285:
        r2 = r3;
        r0 = r1;
        goto L_0x0087;
    L_0x0289:
        r0 = r1;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.SetRingtoneService.a(android.content.res.AssetManager, java.lang.String, com.andromo.dev576782.app537736.AudioItem, int):java.io.File");
    }

    private String m1169a(int i) {
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

    private void m1170a() {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.SetRingtoneService.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(intent);
    }

    private static void m1171a(Context context, File file, String str, int i) {
        boolean z = true;
        if (context != null && file != null) {
            String absolutePath = file.getAbsolutePath();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", absolutePath);
            contentValues.put("title", str);
            contentValues.put("_size", Long.valueOf(file.length()));
            contentValues.put("artist", Integer.valueOf(2131230764));
            contentValues.put("is_ringtone", Boolean.valueOf(i == 1));
            contentValues.put("is_notification", Boolean.valueOf(i == 2));
            String str2 = "is_alarm";
            if (i != 4) {
                z = false;
            }
            contentValues.put(str2, Boolean.valueOf(z));
            contentValues.put("is_music", Boolean.valueOf(false));
            Uri contentUriForPath = Media.getContentUriForPath(absolutePath);
            context.getContentResolver().delete(contentUriForPath, "_data=\"" + absolutePath + "\"", null);
            RingtoneManager.setActualDefaultRingtoneUri(context, i, context.getContentResolver().insert(contentUriForPath, contentValues));
        }
    }

    private static void m1172a(AssetFileDescriptor assetFileDescriptor, File file) {
        InputStream bufferedInputStream;
        OutputStream bufferedOutputStream;
        IOException e;
        Throwable th;
        OutputStream outputStream = null;
        try {
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            bufferedInputStream = new BufferedInputStream(assetFileDescriptor.createInputStream());
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw e2;
                            }
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        outputStream = bufferedInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = bufferedOutputStream;
                    }
                }
            } catch (IOException e4) {
                e2 = e4;
                bufferedOutputStream = null;
                Object obj = bufferedInputStream;
                try {
                    e2.printStackTrace();
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = outputStream;
                    outputStream = bufferedOutputStream;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                            throw e22;
                        }
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e22 = e5;
            bufferedOutputStream = null;
            e22.printStackTrace();
            throw e22;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    private static void m1173a(File file, File file2) {
        InputStream bufferedInputStream;
        OutputStream bufferedOutputStream;
        IOException e;
        Throwable th;
        OutputStream outputStream = null;
        try {
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw e2;
                            }
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        outputStream = bufferedInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = bufferedOutputStream;
                    }
                }
            } catch (IOException e4) {
                e2 = e4;
                bufferedOutputStream = null;
                Object obj = bufferedInputStream;
                try {
                    e2.printStackTrace();
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = outputStream;
                    outputStream = bufferedOutputStream;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                            throw e22;
                        }
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e22 = e5;
            bufferedOutputStream = null;
            e22.printStackTrace();
            throw e22;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    private void m1174a(CharSequence charSequence) {
        this.f604a.post(new hs(this, charSequence));
    }

    private void m1175b(CharSequence charSequence) {
        this.f604a.post(new ht(this, charSequence));
    }

    public void onCreate() {
        super.onCreate();
        this.f605b = Toast.makeText(this, "", 1);
        this.f604a = new Handler();
    }

    protected void onHandleIntent(Intent intent) {
        AudioItem audioItem = (AudioItem) intent.getParcelableExtra("com.andromo.dev576782.app537736.SetRingtoneService.AUDIO_ITEM");
        String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.SetRingtoneService.AUDIO_FOLDER");
        int intExtra = intent.getIntExtra("com.andromo.dev576782.app537736.SetRingtoneService.RINGTONE_TYPE", 1);
        if (audioItem != null && !audioItem.m988e().m1316b()) {
            File a = m1168a(getAssets(), stringExtra, audioItem, intExtra);
            if (a != null) {
                m1171a((Context) this, a, audioItem.m986c(), intExtra);
            }
        }
    }
}
