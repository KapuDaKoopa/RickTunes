package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.support.v4.app.NotificationCompat;
import android.util.Pair;
import com.google.android.gcm.C0313a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public final class aj {
    private static final Random f644g;
    public Location f645a;
    public String f646b;
    public String f647c;
    public String f648d;
    public String f649e;
    public String f650f;

    static {
        f644g = new Random();
    }

    public aj() {
        this.f645a = null;
        this.f646b = null;
        this.f647c = null;
        this.f648d = null;
        this.f649e = null;
        this.f650f = null;
    }

    private aj(String str) {
        this.f645a = null;
        this.f646b = null;
        this.f647c = null;
        this.f648d = null;
        this.f649e = null;
        this.f650f = null;
        this.f650f = str;
    }

    public static aj m1245a(String str) {
        aj ajVar = new aj(str);
        Locale locale = Locale.getDefault();
        if (locale != null) {
            ajVar.f646b = locale.getLanguage();
        }
        return ajVar;
    }

    private String m1246a(boolean z) {
        List arrayList = new ArrayList();
        if (z && this.f649e != null) {
            arrayList.add(Pair.create("label", this.f649e));
        }
        if (z && this.f646b != null) {
            arrayList.add(Pair.create("lang", this.f646b));
        }
        if (this.f650f != null) {
            arrayList.add(Pair.create("reg", this.f650f));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            stringBuilder.append('\"').append((String) pair.first).append("\":");
            stringBuilder.append('\"').append((String) pair.second).append('\"');
            if (it.hasNext()) {
                stringBuilder.append(',');
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void m1247a(String str, boolean z) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            String b;
            URL url = new URL(str);
            String l = Long.toString(System.currentTimeMillis() / 1000);
            String a = m1246a(z);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("POST");
            stringBuilder.append(str);
            stringBuilder.append("92278bf3-103c-404c-882c-00bd5d8e6c70");
            stringBuilder.append(l);
            stringBuilder.append(a);
            stringBuilder.append("0b3cc40ddef3a637ac79fd26a17867b7747f5846d19edb09fcd2ccdd423cfae7");
            String stringBuilder2 = stringBuilder.toString();
            try {
                b = m1250b(stringBuilder2);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                b = stringBuilder2;
            }
            byte[] bytes = a.getBytes();
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(60000);
                    httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                    httpURLConnection2.addRequestProperty("x-timestamp", l);
                    httpURLConnection2.addRequestProperty("x-app-key", "92278bf3-103c-404c-882c-00bd5d8e6c70");
                    httpURLConnection2.addRequestProperty("x-signature", b);
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    outputStream.write(bytes);
                    outputStream.close();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (!(responseCode == 200 || responseCode == 201 || responseCode == 202)) {
                        if (responseCode >= 500 && responseCode <= 599) {
                            throw new ak(this, httpURLConnection2.getResponseMessage(), responseCode);
                        } else if (responseCode >= 400 && responseCode <= 499) {
                            throw new ak(this, httpURLConnection2.getResponseMessage(), responseCode);
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("invalid url: " + str);
        }
    }

    static boolean m1248a(Context context, aj ajVar) {
        long j;
        if (context == null) {
            return false;
        }
        String str = "http://www.airbop.com/api/v1/register";
        int i = 1;
        long nextInt = (long) (f644g.nextInt(1000) + 2000);
        while (i <= 5) {
            try {
                ajVar.m1247a(str, true);
                C0313a.m1985a(context, true);
                C0313a.m1992g(context);
                System.currentTimeMillis();
                return true;
            } catch (ak e) {
                "Error message:  " + e.getMessage();
                int a = e.m1254a();
                if (a < 400 || a > 499) {
                    "Failed to register on attempt " + i;
                    if (i == 5) {
                        break;
                    }
                    try {
                        "Sleeping for " + nextInt + " ms before retry";
                        Thread.sleep(nextInt);
                        j = nextInt * 2;
                        i++;
                        nextInt = j;
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                return false;
            } catch (SocketTimeoutException e3) {
                "Failed to register on attempt (timeout)" + i;
                "Failed to register on attempt " + i;
                if (i == 5) {
                    break;
                }
                try {
                    "Sleeping for " + nextInt + " ms before retry";
                    Thread.sleep(nextInt);
                    j = nextInt * 2;
                    i++;
                    nextInt = j;
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            } catch (IOException e5) {
                "Failed to register on attempt " + i;
                return false;
            }
        }
        context.getString(2131230806, new Object[]{Integer.valueOf(5)});
        return false;
    }

    static boolean m1249a(Context context, String str) {
        try {
            new aj(str).m1247a("http://www.airbop.com/api/v1/unregister", false);
            C0313a.m1985a(context, false);
            "** " + context.getString(2131230805);
            return true;
        } catch (IOException e) {
            "Failed to unregister on attempt " + e;
            context.getString(2131230807, new Object[]{e.getMessage()});
            return false;
        } catch (ak e2) {
            "Failed to unregister on attempt " + e2;
            context.getString(2131230807, new Object[]{e2.getMessage()});
            return false;
        }
    }

    private static String m1250b(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.reset();
        byte[] digest = instance.digest(str.getBytes("UTF-8"));
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            stringBuffer.append(Integer.toString((b & 255) + NotificationCompat.FLAG_LOCAL_ONLY, 16).substring(1));
        }
        return stringBuffer.toString();
    }

    public static void m1251c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.andromo.dev576782.app537736.airbop.data", 0);
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            edit.remove("lat");
            edit.remove("long");
            edit.commit();
        }
    }

    public final void m1252a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.andromo.dev576782.app537736.airbop.data", 0);
            if (sharedPreferences != null) {
                this.f649e = sharedPreferences.getString("label", null);
            }
        }
    }

    public final void m1253b(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.andromo.dev576782.app537736.airbop.data", 0);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                edit.putString("label", this.f649e);
                edit.commit();
            }
        }
    }
}
