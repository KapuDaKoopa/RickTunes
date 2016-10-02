package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class GCMBaseIntentService extends IntentService {
    private static WakeLock f570a;
    private static final Object f571b;
    private static int f572d;
    private static final Random f573e;
    private static final int f574f;
    private static final String f575g;
    private final String[] f576c;

    static {
        f571b = GCMBaseIntentService.class;
        f572d = 0;
        f573e = new Random();
        f574f = (int) TimeUnit.SECONDS.toMillis(3600);
        f575g = Long.toBinaryString(f573e.nextLong());
    }

    protected GCMBaseIntentService() {
        this(m1109b("DynamicSenderIds"), null);
    }

    private GCMBaseIntentService(String str, String[] strArr) {
        super(str);
        this.f576c = strArr;
    }

    public GCMBaseIntentService(String... strArr) {
        this(m1109b(C0313a.m1981a(strArr)), strArr);
    }

    static void m1108a(Context context, Intent intent, String str) {
        synchronized (f571b) {
            if (f570a == null) {
                f570a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        f570a.acquire();
        intent.setClassName(context, str);
        context.startService(intent);
    }

    private static String m1109b(String str) {
        StringBuilder append = new StringBuilder("GCMIntentService-").append(str).append("-");
        int i = f572d + 1;
        f572d = i;
        String stringBuilder = append.append(i).toString();
        "Intent service name: " + stringBuilder;
        return stringBuilder;
    }

    protected void m1110a(Context context, int i) {
    }

    protected abstract void m1111a(Context context, Intent intent);

    protected abstract void m1112a(Context context, String str);

    protected abstract void m1113a(String str);

    protected abstract void m1114b(Context context, String str);

    public boolean m1115c(Context context, String str) {
        return true;
    }

    public final void onHandleIntent(Intent intent) {
        Object obj = null;
        try {
            Context applicationContext = getApplicationContext();
            String action = intent.getAction();
            String stringExtra;
            int i;
            if (action.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                C0313a.m1989d(applicationContext);
                stringExtra = intent.getStringExtra("registration_id");
                action = intent.getStringExtra("error");
                String stringExtra2 = intent.getStringExtra("unregistered");
                "handleRegistration: registrationId = " + stringExtra + ", error = " + action + ", unregistered = " + stringExtra2;
                if (stringExtra != null) {
                    C0313a.m1993h(applicationContext);
                    C0313a.m1980a(applicationContext, stringExtra);
                    m1112a(applicationContext, stringExtra);
                } else if (stringExtra2 != null) {
                    C0313a.m1993h(applicationContext);
                    m1114b(applicationContext, C0313a.m1980a(applicationContext, ""));
                } else {
                    "Registration error: " + action;
                    if (!"SERVICE_NOT_AVAILABLE".equals(action)) {
                        m1113a(action);
                    } else if (m1115c(applicationContext, action)) {
                        i = applicationContext.getSharedPreferences("com.google.android.gcm", 0).getInt("backoff_ms", 3000);
                        int nextInt = f573e.nextInt(i) + (i / 2);
                        "Scheduling registration retry, backoff = " + nextInt + " (" + i + ")";
                        Intent intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                        intent2.putExtra("token", f575g);
                        ((AlarmManager) applicationContext.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + ((long) nextInt), PendingIntent.getBroadcast(applicationContext, 0, intent2, 0));
                        if (i < f574f) {
                            C0313a.m1983a(applicationContext, i * 2);
                        }
                    }
                }
            } else if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                stringExtra = intent.getStringExtra("message_type");
                if (stringExtra == null) {
                    m1111a(applicationContext, intent);
                } else if (stringExtra.equals("deleted_messages")) {
                    stringExtra = intent.getStringExtra("total_deleted");
                    if (stringExtra != null) {
                        try {
                            i = Integer.parseInt(stringExtra);
                            "Received deleted messages notification: " + i;
                            m1110a(applicationContext, i);
                        } catch (NumberFormatException e) {
                            "GCM returned invalid number of deleted messages: " + stringExtra;
                        }
                    }
                } else {
                    "Received unknown special message: " + stringExtra;
                }
            } else if (action.equals("com.google.android.gcm.intent.RETRY")) {
                action = intent.getStringExtra("token");
                if (f575g.equals(action)) {
                    if (C0313a.m1990e(applicationContext).length() > 0) {
                        obj = 1;
                    }
                    if (obj != null) {
                        C0313a.m1988c(applicationContext);
                    } else if (this.f576c == null) {
                        throw new IllegalStateException("sender id not set on constructor");
                    } else {
                        C0313a.m1986a(applicationContext, this.f576c);
                    }
                } else {
                    "Received invalid token: " + action;
                    synchronized (f571b) {
                        if (f570a != null) {
                            f570a.release();
                        }
                    }
                    return;
                }
            }
            synchronized (f571b) {
                if (f570a != null) {
                    f570a.release();
                }
            }
        } catch (Throwable th) {
            synchronized (f571b) {
            }
            if (f570a != null) {
                f570a.release();
            }
        }
    }
}
