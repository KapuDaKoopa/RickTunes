package com.google.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.tagmanager.f */
public final class C0805f {
    public static final Object f5148a;
    static final String[] f5149b;
    private static final Pattern f5150c;
    private final ConcurrentHashMap f5151d;
    private final Map f5152e;
    private final ReentrantLock f5153f;
    private final LinkedList f5154g;
    private final C0806k f5155h;
    private final CountDownLatch f5156i;

    static {
        f5148a = new Object();
        f5149b = "gtm.lifetime".toString().split("\\.");
        f5150c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    }

    C0805f() {
        this(new C0807g());
    }

    C0805f(C0806k c0806k) {
        this.f5155h = c0806k;
        this.f5151d = new ConcurrentHashMap();
        this.f5152e = new HashMap();
        this.f5153f = new ReentrantLock();
        this.f5154g = new LinkedList();
        this.f5156i = new CountDownLatch(1);
        this.f5155h.m5895a(new C0809h(this));
    }

    private static Long m5884a(String str) {
        Matcher matcher = f5150c.matcher(str);
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                C0824z.m5937a("illegal number in _lifetime value: " + str);
                parseLong = 0;
            }
            if (parseLong <= 0) {
                "non-positive _lifetime: " + str;
                C0824z.m5939c();
                return null;
            }
            String group = matcher.group(2);
            if (group.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (group.charAt(0)) {
                case 'd':
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case 'h':
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case 's':
                    return Long.valueOf(parseLong * 1000);
                default:
                    C0824z.m5937a("unknown units in _lifetime: " + str);
                    return null;
            }
        }
        "unknown _lifetime: " + str;
        C0824z.m5939c();
        return null;
    }

    static Map m5885a(Object obj, Object obj2) {
        Map hashMap = new HashMap();
        String[] split = obj.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj3 = hashMap2;
        }
        map.put(split[split.length - 1], obj2);
        return hashMap;
    }

    private void m5888a(List list, List list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m5888a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m5890a((Map) obj, (Map) list2.get(i));
            } else if (obj != f5148a) {
                list2.set(i, obj);
            }
        }
    }

    private void m5889a(Map map, String str, Collection collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str + (str.length() == 0 ? "" : ".") + entry.getKey();
            if (entry.getValue() instanceof Map) {
                m5889a((Map) entry.getValue(), str2, collection);
            } else if (!str2.equals("gtm.lifetime")) {
                collection.add(new C0810i(str2, entry.getValue()));
            }
        }
    }

    private void m5890a(Map map, Map map2) {
        for (Object next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof List) {
                if (!(map2.get(next) instanceof List)) {
                    map2.put(next, new ArrayList());
                }
                m5888a((List) obj, (List) map2.get(next));
            } else if (obj instanceof Map) {
                if (!(map2.get(next) instanceof Map)) {
                    map2.put(next, new HashMap());
                }
                m5890a((Map) obj, (Map) map2.get(next));
            } else {
                map2.put(next, obj);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5891b(java.util.Map r7) {
        /*
        r6 = this;
        r0 = r6.f5153f;
        r0.lock();
        r0 = r6.f5154g;	 Catch:{ all -> 0x0045 }
        r0.offer(r7);	 Catch:{ all -> 0x0045 }
        r0 = r6.f5153f;	 Catch:{ all -> 0x0045 }
        r0 = r0.getHoldCount();	 Catch:{ all -> 0x0045 }
        r1 = 1;
        if (r0 != r1) goto L_0x007a;
    L_0x0013:
        r0 = 0;
        r2 = r0;
    L_0x0015:
        r0 = r6.f5154g;	 Catch:{ all -> 0x0045 }
        r0 = r0.poll();	 Catch:{ all -> 0x0045 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x007a;
    L_0x001f:
        r1 = r6.f5152e;	 Catch:{ all -> 0x0045 }
        monitor-enter(r1);	 Catch:{ all -> 0x0045 }
        r3 = r0.keySet();	 Catch:{ all -> 0x0042 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0042 }
    L_0x002a:
        r4 = r3.hasNext();	 Catch:{ all -> 0x0042 }
        if (r4 == 0) goto L_0x004c;
    L_0x0030:
        r4 = r3.next();	 Catch:{ all -> 0x0042 }
        r5 = r0.get(r4);	 Catch:{ all -> 0x0042 }
        r4 = com.google.tagmanager.C0805f.m5885a(r4, r5);	 Catch:{ all -> 0x0042 }
        r5 = r6.f5152e;	 Catch:{ all -> 0x0042 }
        r6.m5890a(r4, r5);	 Catch:{ all -> 0x0042 }
        goto L_0x002a;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        r1 = r6.f5153f;
        r1.unlock();
        throw r0;
    L_0x004c:
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        r1 = r6.f5151d;	 Catch:{ all -> 0x0045 }
        r1 = r1.keySet();	 Catch:{ all -> 0x0045 }
        r3 = r1.iterator();	 Catch:{ all -> 0x0045 }
    L_0x0057:
        r1 = r3.hasNext();	 Catch:{ all -> 0x0045 }
        if (r1 == 0) goto L_0x0067;
    L_0x005d:
        r1 = r3.next();	 Catch:{ all -> 0x0045 }
        r1 = (com.google.tagmanager.C0799j) r1;	 Catch:{ all -> 0x0045 }
        r1.m5800a(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x0057;
    L_0x0067:
        r0 = r2 + 1;
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r0 <= r1) goto L_0x00aa;
    L_0x006d:
        r0 = r6.f5154g;	 Catch:{ all -> 0x0045 }
        r0.clear();	 Catch:{ all -> 0x0045 }
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0045 }
        r1 = "Seems like an infinite loop of pushing to the data layer";
        r0.<init>(r1);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x007a:
        r0 = com.google.tagmanager.C0805f.m5892c(r7);	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x00a1;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        if (r0 == 0) goto L_0x009b;
    L_0x0083:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0045 }
        r1.<init>();	 Catch:{ all -> 0x0045 }
        r2 = "";
        r6.m5889a(r7, r2, r1);	 Catch:{ all -> 0x0045 }
        r2 = "gtm.lifetime";
        r1.remove(r2);	 Catch:{ all -> 0x0045 }
        r2 = r6.f5155h;	 Catch:{ all -> 0x0045 }
        r4 = r0.longValue();	 Catch:{ all -> 0x0045 }
        r2.m5896a(r1, r4);	 Catch:{ all -> 0x0045 }
    L_0x009b:
        r0 = r6.f5153f;
        r0.unlock();
        return;
    L_0x00a1:
        r0 = r0.toString();	 Catch:{ all -> 0x0045 }
        r0 = com.google.tagmanager.C0805f.m5884a(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x0081;
    L_0x00aa:
        r2 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.f.b(java.util.Map):void");
    }

    private static Object m5892c(Map map) {
        String[] strArr = f5149b;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    final void m5893a(C0799j c0799j) {
        this.f5151d.put(c0799j, Integer.valueOf(0));
    }

    public final void m5894a(Map map) {
        try {
            this.f5156i.await();
        } catch (InterruptedException e) {
            C0824z.m5937a("DataLayer.push: unexpected InterruptedException");
        }
        m5891b(map);
    }
}
