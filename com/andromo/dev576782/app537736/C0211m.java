package com.andromo.dev576782.app537736;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.andromo.dev576782.app537736.m */
class C0211m extends DataSetObservable {
    private static final String f1190a;
    private static final Object f1191b;
    private static final Map f1192c;
    private static final Executor f1193q;
    private final Object f1194d;
    private final List f1195e;
    private final List f1196f;
    private final Context f1197g;
    private final String f1198h;
    private Intent f1199i;
    private C0213o f1200j;
    private int f1201k;
    private boolean f1202l;
    private boolean f1203m;
    private boolean f1204n;
    private final Handler f1205o;
    private C0206u f1206p;

    static {
        f1190a = C0211m.class.getSimpleName();
        f1191b = new Object();
        f1192c = new HashMap();
        f1193q = Executors.newSingleThreadExecutor();
    }

    private C0211m(Context context, String str) {
        this.f1194d = new Object();
        this.f1195e = new ArrayList();
        this.f1196f = new ArrayList();
        this.f1200j = new C0214p();
        this.f1201k = 50;
        this.f1202l = true;
        this.f1203m = false;
        this.f1204n = true;
        this.f1205o = new Handler();
        this.f1197g = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1198h = str;
        } else {
            this.f1198h = str + ".xml";
        }
    }

    public static C0211m m1620a(Context context, String str) {
        C0211m c0211m;
        synchronized (f1191b) {
            c0211m = (C0211m) f1192c.get(str);
            if (c0211m == null) {
                c0211m = new C0211m(context, str);
                f1192c.put(str, c0211m);
            }
            synchronized (c0211m.f1194d) {
                if (c0211m.f1202l && c0211m.f1204n) {
                    c0211m.f1202l = false;
                    c0211m.f1203m = true;
                    if (!TextUtils.isEmpty(c0211m.f1198h)) {
                        f1193q.execute(new C0216r(c0211m, (byte) 0));
                    }
                }
            }
        }
        return c0211m;
    }

    private boolean m1622a(C0215q c0215q) {
        boolean add;
        synchronized (this.f1194d) {
            add = this.f1196f.add(c0215q);
            if (add) {
                this.f1204n = true;
                m1628e();
                synchronized (this.f1194d) {
                    if (!this.f1203m) {
                        throw new IllegalStateException("No preceding call to #readHistoricalData");
                    } else if (this.f1204n) {
                        this.f1204n = false;
                        this.f1202l = true;
                        if (!TextUtils.isEmpty(this.f1198h)) {
                            f1193q.execute(new C0218t());
                        }
                    }
                }
                m1627d();
            }
        }
        return add;
    }

    private void m1627d() {
        synchronized (this.f1194d) {
            if (!(this.f1200j == null || this.f1195e.isEmpty())) {
                C0213o c0213o = this.f1200j;
                Intent intent = this.f1199i;
                c0213o.m1641a(this.f1195e, Collections.unmodifiableList(this.f1196f));
                notifyChanged();
            }
        }
    }

    private void m1628e() {
        List list = this.f1196f;
        int size = list.size() - this.f1201k;
        if (size > 0) {
            this.f1204n = true;
            for (int i = 0; i < size; i++) {
                list.remove(0);
            }
        }
    }

    public final int m1633a() {
        int size;
        synchronized (this.f1194d) {
            size = this.f1195e.size();
        }
        return size;
    }

    public final int m1634a(ResolveInfo resolveInfo) {
        List list = this.f1195e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C0212n) list.get(i)).f1207a == resolveInfo) {
                return i;
            }
        }
        return -1;
    }

    public final ResolveInfo m1635a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1194d) {
            resolveInfo = ((C0212n) this.f1195e.get(i)).f1207a;
        }
        return resolveInfo;
    }

    public final void m1636a(Intent intent) {
        synchronized (this.f1194d) {
            if (this.f1199i == intent) {
                return;
            }
            this.f1199i = intent;
            this.f1195e.clear();
            if (this.f1199i != null) {
                List queryIntentActivities = this.f1197g.getPackageManager().queryIntentActivities(this.f1199i, 0);
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    this.f1195e.add(new C0212n(this, (ResolveInfo) queryIntentActivities.get(i)));
                }
                m1627d();
            } else {
                notifyChanged();
            }
        }
    }

    public final void m1637a(C0206u c0206u) {
        this.f1206p = c0206u;
    }

    public final Intent m1638b(int i) {
        C0212n c0212n = (C0212n) this.f1195e.get(i);
        ComponentName componentName = new ComponentName(c0212n.f1207a.activityInfo.packageName, c0212n.f1207a.activityInfo.name);
        Intent intent = new Intent(this.f1199i);
        intent.setComponent(componentName);
        if (this.f1206p != null) {
            Intent intent2 = new Intent(intent);
            if (this.f1206p.m1582a()) {
                return null;
            }
        }
        m1622a(new C0215q(componentName, System.currentTimeMillis(), 1.0f));
        return intent;
    }

    public final ResolveInfo m1639b() {
        synchronized (this.f1194d) {
            if (this.f1195e.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0212n) this.f1195e.get(0)).f1207a;
            return resolveInfo;
        }
    }

    public final void m1640c(int i) {
        C0212n c0212n = (C0212n) this.f1195e.get(i);
        C0212n c0212n2 = (C0212n) this.f1195e.get(0);
        m1622a(new C0215q(new ComponentName(c0212n.f1207a.activityInfo.packageName, c0212n.f1207a.activityInfo.name), System.currentTimeMillis(), c0212n2 != null ? (c0212n2.f1208b - c0212n.f1208b) + 5.0f : 1.0f));
    }
}
