package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Debug;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.google.android.gms.common.internal.C0726i;
import com.google.android.gms.p006b.wa;
import com.google.android.gms.p006b.xe;
import com.google.android.gms.p006b.xo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.b */
public final class C0765b {
    private static final Object f4959a;
    private static C0765b f4960b;
    private static Integer f4961h;
    private final List f4962c;
    private final List f4963d;
    private final List f4964e;
    private final List f4965f;
    private C0769f f4966g;
    private C0769f f4967i;

    static {
        f4959a = new Object();
    }

    private C0765b() {
        if (C0765b.m5737b() == C0768e.f4977b) {
            this.f4962c = Collections.EMPTY_LIST;
            this.f4963d = Collections.EMPTY_LIST;
            this.f4964e = Collections.EMPTY_LIST;
            this.f4965f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) C0767d.f4971b.m4847d();
        this.f4962c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C0767d.f4972c.m4847d();
        this.f4963d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C0767d.f4973d.m4847d();
        this.f4964e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C0767d.f4974e.m4847d();
        this.f4965f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.f4966g = new C0769f(((Long) C0767d.f4975f.m4847d()).longValue());
        this.f4967i = new C0769f(((Long) C0767d.f4975f.m4847d()).longValue());
    }

    public static C0765b m5734a() {
        synchronized (f4959a) {
            if (f4960b == null) {
                f4960b = new C0765b();
            }
        }
        return f4960b;
    }

    private static String m5735a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private void m5736a(Context context, String str, String str2, Intent intent, int i) {
        Object obj = !C0726i.f4839a ? null : C0765b.m5737b() == C0768e.f4977b ? null : 1;
        if (obj != null && this.f4966g != null) {
            String str3;
            String str4;
            String str5;
            if (i != 4 && i != 1) {
                ServiceInfo serviceInfo;
                List queryIntentServices = context.getPackageManager().queryIntentServices(intent, NotificationCompat.FLAG_HIGH_PRIORITY);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), xo.m4901a(20)}));
                    serviceInfo = null;
                } else {
                    if (queryIntentServices.size() > 1) {
                        Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), xo.m4901a(20)}));
                        Iterator it = queryIntentServices.iterator();
                        if (it.hasNext()) {
                            Log.w("ConnectionTracker", ((ResolveInfo) it.next()).serviceInfo.name);
                            serviceInfo = null;
                        }
                    }
                    serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                }
                if (serviceInfo == null) {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str2, intent.toUri(0)}));
                    return;
                }
                String str6;
                str3 = serviceInfo.processName;
                str4 = serviceInfo.name;
                int callingPid = Binder.getCallingPid();
                List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == callingPid) {
                            str6 = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                }
                str6 = null;
                Object obj2 = (this.f4962c.contains(str6) || this.f4963d.contains(str2) || this.f4964e.contains(str3) || this.f4965f.contains(str4) || (str3.equals(str6) && (C0765b.m5737b() & C0768e.f4982g) != 0)) ? null : 1;
                if (obj2 != null) {
                    this.f4966g.m5743a(str);
                    str5 = str6;
                } else {
                    return;
                }
            } else if (this.f4966g.m5744b(str)) {
                str3 = null;
                str4 = null;
                str5 = null;
            } else {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str7 = null;
            if (!((C0765b.m5737b() & C0768e.f4981f) == 0 || i == 13)) {
                str7 = xo.m4901a(5);
            }
            long j = 0;
            if ((C0765b.m5737b() & C0768e.f4983h) != 0) {
                j = Debug.getNativeHeapAllocatedSize();
            }
            Parcelable connectionEvent = (i == 1 || i == 4 || i == 14) ? new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str7, str, SystemClock.elapsedRealtime(), j) : new ConnectionEvent(currentTimeMillis, i, str5, str2, str3, str4, str7, str, SystemClock.elapsedRealtime(), j);
            context.startService(new Intent().setComponent(C0768e.f4976a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", connectionEvent));
        }
    }

    private static int m5737b() {
        if (f4961h == null) {
            try {
                Object obj = (C0726i.f4839a && wa.m4845b() && wa.m4841a() == Process.myUid()) ? 1 : null;
                f4961h = Integer.valueOf(obj != null ? ((Integer) C0767d.f4970a.m4847d()).intValue() : C0768e.f4977b);
            } catch (SecurityException e) {
                f4961h = Integer.valueOf(C0768e.f4977b);
            }
        }
        return f4961h.intValue();
    }

    @SuppressLint({"UntrackedBindService"})
    public final void m5738a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        m5736a(context, C0765b.m5735a(serviceConnection), null, null, 1);
    }

    public final void m5739a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        m5736a(context, C0765b.m5735a(serviceConnection), str, intent, 3);
    }

    public final boolean m5740a(Context context, Intent intent, ServiceConnection serviceConnection) {
        return m5741a(context, context.getClass().getName(), intent, serviceConnection, 1);
    }

    @SuppressLint({"UntrackedBindService"})
    public final boolean m5741a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        boolean a = (component == null || (C0726i.f4839a && "com.google.android.gms".equals(component.getPackageName()))) ? false : xe.m4886a(context, component.getPackageName());
        if (a) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            m5736a(context, C0765b.m5735a(serviceConnection), str, intent, 2);
        }
        return bindService;
    }

    public final void m5742b(Context context, ServiceConnection serviceConnection) {
        m5736a(context, C0765b.m5735a(serviceConnection), null, null, 4);
    }
}
