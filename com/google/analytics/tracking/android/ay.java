package com.google.analytics.tracking.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.impl.client.DefaultHttpClient;

final class ay implements C0290f {
    private static final String f1601a;
    private final ba f1602b;
    private volatile C0293o f1603c;
    private final C0298g f1604d;
    private final Context f1605e;
    private final String f1606f;
    private long f1607g;
    private C0288l f1608h;

    static {
        f1601a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    }

    ay(C0298g c0298g, Context context) {
        this(c0298g, context, "google_analytics_v2.db");
    }

    private ay(C0298g c0298g, Context context, String str) {
        this.f1605e = context.getApplicationContext();
        this.f1606f = str;
        this.f1604d = c0298g;
        this.f1608h = new az(this);
        this.f1602b = new ba(this, this.f1605e, this.f1606f);
        this.f1603c = new bg(new DefaultHttpClient(), this.f1605e);
        this.f1607g = 0;
    }

    private SQLiteDatabase m1858a(String str) {
        try {
            return this.f1602b.getWritableDatabase();
        } catch (SQLiteException e) {
            as.m1832d(str);
            return null;
        }
    }

    private static String m1860a(Map map) {
        Iterable arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(ar.m1826a((String) entry.getKey()) + "=" + ar.m1826a((String) entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    private List m1861a(int i) {
        SQLiteException e;
        Throwable th;
        List arrayList = new ArrayList();
        if (i <= 0) {
            as.m1832d("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase a = m1858a("Error opening database for peekHitIds.");
        if (a == null) {
            return arrayList;
        }
        Cursor query;
        try {
            query = a.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    as.m1832d("Error in peekHits fetching hitIds: " + e.getMessage());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            as.m1832d("Error in peekHits fetching hitIds: " + e.getMessage());
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    @Deprecated
    private void m1862a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            as.m1832d("Empty/Null collection passed to deleteHits.");
            return;
        }
        String[] strArr = new String[collection.size()];
        int i = 0;
        for (aq aqVar : collection) {
            int i2 = i + 1;
            strArr[i] = String.valueOf(aqVar.f1589b);
            i = i2;
        }
        m1864a(strArr);
    }

    private static void m1863a(Map map, Collection collection) {
        String substring = "&_v".substring(1);
        if (collection != null) {
            for (Command command : collection) {
                if ("appendVersion".equals(command.m3120a())) {
                    map.put(substring, command.m3121b());
                    return;
                }
            }
        }
    }

    private void m1864a(String[] strArr) {
        boolean z = true;
        if (strArr == null || strArr.length == 0) {
            as.m1832d("Empty hitIds passed to deleteHits.");
            return;
        }
        SQLiteDatabase a = m1858a("Error opening database for deleteHits.");
        if (a != null) {
            try {
                a.delete("hits2", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                C0298g c0298g = this.f1604d;
                if (m1869f() != 0) {
                    z = false;
                }
                c0298g.m1920a(z);
            } catch (SQLiteException e) {
                as.m1832d("Error deleting hits " + strArr);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List m1868e() {
        /*
        r17 = this;
        r14 = 1;
        r15 = 0;
        r12 = 0;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r2 = "Error opening database for peekHits";
        r0 = r17;
        r2 = r0.m1858a(r2);
        if (r2 != 0) goto L_0x0014;
    L_0x0012:
        r2 = r11;
    L_0x0013:
        return r2;
    L_0x0014:
        r3 = "hits2";
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r5 = 1;
        r6 = "hit_time";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r13 = 0;
        r16 = "hit_id";
        r10[r13] = r16;	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r10 = 40;
        r10 = java.lang.Integer.toString(r10);	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x00e0, all -> 0x0101 }
        r12 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x018f, all -> 0x0187 }
        r12.<init>();	 Catch:{ SQLiteException -> 0x018f, all -> 0x0187 }
        r3 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        if (r3 == 0) goto L_0x0062;
    L_0x004a:
        r3 = new com.google.analytics.tracking.android.aq;	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        r4 = 0;
        r4 = r13.getLong(r4);	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        r6 = 1;
        r6 = r13.getLong(r6);	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        r3.<init>(r4, r6);	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        r12.add(r3);	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        r3 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x0195, all -> 0x0187 }
        if (r3 != 0) goto L_0x004a;
    L_0x0062:
        if (r13 == 0) goto L_0x0067;
    L_0x0064:
        r13.close();
    L_0x0067:
        r3 = "hits2";
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteException -> 0x0185 }
        r5 = 0;
        r6 = "hit_id";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0185 }
        r5 = 1;
        r6 = "hit_string";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0185 }
        r5 = 2;
        r6 = "hit_url";
        r4[r5] = r6;	 Catch:{ SQLiteException -> 0x0185 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "%s ASC";
        r10 = 1;
        r10 = new java.lang.Object[r10];	 Catch:{ SQLiteException -> 0x0185 }
        r11 = 0;
        r16 = "hit_id";
        r10[r11] = r16;	 Catch:{ SQLiteException -> 0x0185 }
        r9 = java.lang.String.format(r9, r10);	 Catch:{ SQLiteException -> 0x0185 }
        r10 = 40;
        r10 = java.lang.Integer.toString(r10);	 Catch:{ SQLiteException -> 0x0185 }
        r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteException -> 0x0185 }
        r2 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r2 == 0) goto L_0x00d8;
    L_0x009d:
        r4 = r15;
    L_0x009e:
        r0 = r3;
        r0 = (android.database.sqlite.SQLiteCursor) r0;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = r0;
        r2 = r2.getWindow();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = r2.getNumRows();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r2 <= 0) goto L_0x015d;
    L_0x00ac:
        r2 = r12.get(r4);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = (com.google.analytics.tracking.android.aq) r2;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r5 = 1;
        r5 = r3.getString(r5);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2.f1588a = r5;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = r12.get(r4);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = (com.google.analytics.tracking.android.aq) r2;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r5 = 2;
        r5 = r3.getString(r5);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r5 == 0) goto L_0x00d0;
    L_0x00c6:
        r6 = r5.trim();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r6 == 0) goto L_0x0108;
    L_0x00d0:
        r2 = r4 + 1;
        r4 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r4 != 0) goto L_0x019b;
    L_0x00d8:
        if (r3 == 0) goto L_0x00dd;
    L_0x00da:
        r3.close();
    L_0x00dd:
        r2 = r12;
        goto L_0x0013;
    L_0x00e0:
        r2 = move-exception;
        r3 = r2;
        r4 = r12;
        r2 = r11;
    L_0x00e4:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x018b }
        r6 = "Error in peekHits fetching hitIds: ";
        r5.<init>(r6);	 Catch:{ all -> 0x018b }
        r3 = r3.getMessage();	 Catch:{ all -> 0x018b }
        r3 = r5.append(r3);	 Catch:{ all -> 0x018b }
        r3 = r3.toString();	 Catch:{ all -> 0x018b }
        com.google.analytics.tracking.android.as.m1832d(r3);	 Catch:{ all -> 0x018b }
        if (r4 == 0) goto L_0x0013;
    L_0x00fc:
        r4.close();
        goto L_0x0013;
    L_0x0101:
        r2 = move-exception;
    L_0x0102:
        if (r12 == 0) goto L_0x0107;
    L_0x0104:
        r12.close();
    L_0x0107:
        throw r2;
    L_0x0108:
        r5 = r5.toLowerCase();	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r6 = "http:";
        r5 = r5.startsWith(r6);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        if (r5 == 0) goto L_0x00d0;
    L_0x0114:
        r5 = "http:";
        r2.f1591d = r5;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        goto L_0x00d0;
    L_0x0119:
        r2 = move-exception;
        r13 = r3;
    L_0x011b:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0156 }
        r4 = "Error in peekHits fetching hitString: ";
        r3.<init>(r4);	 Catch:{ all -> 0x0156 }
        r2 = r2.getMessage();	 Catch:{ all -> 0x0156 }
        r2 = r3.append(r2);	 Catch:{ all -> 0x0156 }
        r2 = r2.toString();	 Catch:{ all -> 0x0156 }
        com.google.analytics.tracking.android.as.m1832d(r2);	 Catch:{ all -> 0x0156 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0156 }
        r3.<init>();	 Catch:{ all -> 0x0156 }
        r5 = r12.iterator();	 Catch:{ all -> 0x0156 }
        r4 = r15;
    L_0x013b:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0156 }
        if (r2 == 0) goto L_0x017d;
    L_0x0141:
        r2 = r5.next();	 Catch:{ all -> 0x0156 }
        r2 = (com.google.analytics.tracking.android.aq) r2;	 Catch:{ all -> 0x0156 }
        r6 = r2.f1588a;	 Catch:{ all -> 0x0156 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x0156 }
        if (r6 == 0) goto L_0x0152;
    L_0x014f:
        if (r4 != 0) goto L_0x017d;
    L_0x0151:
        r4 = r14;
    L_0x0152:
        r3.add(r2);	 Catch:{ all -> 0x0156 }
        goto L_0x013b;
    L_0x0156:
        r2 = move-exception;
    L_0x0157:
        if (r13 == 0) goto L_0x015c;
    L_0x0159:
        r13.close();
    L_0x015c:
        throw r2;
    L_0x015d:
        r5 = "HitString for hitId %d too large.  Hit will be deleted.";
        r2 = 1;
        r6 = new java.lang.Object[r2];	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r7 = 0;
        r2 = r12.get(r4);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = (com.google.analytics.tracking.android.aq) r2;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r8 = r2.f1589b;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r6[r7] = r2;	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        r2 = java.lang.String.format(r5, r6);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        com.google.analytics.tracking.android.as.m1832d(r2);	 Catch:{ SQLiteException -> 0x0119, all -> 0x017a }
        goto L_0x00d0;
    L_0x017a:
        r2 = move-exception;
        r13 = r3;
        goto L_0x0157;
    L_0x017d:
        if (r13 == 0) goto L_0x0182;
    L_0x017f:
        r13.close();
    L_0x0182:
        r2 = r3;
        goto L_0x0013;
    L_0x0185:
        r2 = move-exception;
        goto L_0x011b;
    L_0x0187:
        r2 = move-exception;
        r12 = r13;
        goto L_0x0102;
    L_0x018b:
        r2 = move-exception;
        r12 = r4;
        goto L_0x0102;
    L_0x018f:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r11;
        goto L_0x00e4;
    L_0x0195:
        r2 = move-exception;
        r3 = r2;
        r4 = r13;
        r2 = r12;
        goto L_0x00e4;
    L_0x019b:
        r4 = r2;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.tracking.android.ay.e():java.util.List");
    }

    private int m1869f() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase a = m1858a("Error opening database for getNumStoredHits.");
        if (a != null) {
            try {
                cursor = a.rawQuery("SELECT COUNT(*) from hits2", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                as.m1832d("Error getting numStoredHits");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    public final void m1870a() {
        boolean z = true;
        SQLiteDatabase a = m1858a("Error opening database for clearHits");
        if (a != null) {
            if (0 == 0) {
                a.delete("hits2", null, null);
            } else {
                a.delete("hits2", "hit_app_id = ?", new String[]{Long.valueOf(0).toString()});
            }
            C0298g c0298g = this.f1604d;
            if (m1869f() != 0) {
                z = false;
            }
            c0298g.m1920a(z);
        }
    }

    public final void m1871a(Map map, long j, String str, Collection collection) {
        boolean z = true;
        long a = this.f1608h.m1783a();
        if (a > this.f1607g + 86400000) {
            this.f1607g = a;
            SQLiteDatabase a2 = m1858a("Error opening database for deleteStaleHits.");
            if (a2 != null) {
                a2.delete("hits2", "HIT_TIME < ?", new String[]{Long.toString(this.f1608h.m1783a() - 2592000000L)});
                C0298g c0298g = this.f1604d;
                if (m1869f() != 0) {
                    z = false;
                }
                c0298g.m1920a(z);
            }
        }
        int f = (m1869f() - 2000) + 1;
        if (f > 0) {
            List a3 = m1861a(f);
            as.m1831c("Store full, deleting " + a3.size() + " hits to make room.");
            m1864a((String[]) a3.toArray(new String[0]));
        }
        m1863a(map, collection);
        SQLiteDatabase a4 = m1858a("Error opening database for putHit");
        if (a4 != null) {
            long parseLong;
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_string", m1860a(map));
            contentValues.put("hit_time", Long.valueOf(j));
            if (map.containsKey("AppUID")) {
                try {
                    parseLong = Long.parseLong((String) map.get("AppUID"));
                } catch (NumberFormatException e) {
                }
                contentValues.put("hit_app_id", Long.valueOf(parseLong));
                if (str == null) {
                    str = "http://www.google-analytics.com/collect";
                }
                if (str.length() != 0) {
                    as.m1832d("Empty path: not sending hit");
                }
                contentValues.put("hit_url", str);
                try {
                    a4.insert("hits2", null, contentValues);
                    this.f1604d.m1920a(false);
                    return;
                } catch (SQLiteException e2) {
                    as.m1832d("Error storing hit");
                    return;
                }
            }
            parseLong = 0;
            contentValues.put("hit_app_id", Long.valueOf(parseLong));
            if (str == null) {
                str = "http://www.google-analytics.com/collect";
            }
            if (str.length() != 0) {
                contentValues.put("hit_url", str);
                a4.insert("hits2", null, contentValues);
                this.f1604d.m1920a(false);
                return;
            }
            as.m1832d("Empty path: not sending hit");
        }
    }

    public final void m1872b() {
        as.m1831c("Dispatch running...");
        if (this.f1603c.m1898a()) {
            List e = m1868e();
            if (e.isEmpty()) {
                as.m1831c("...nothing to dispatch");
                this.f1604d.m1920a(true);
                return;
            }
            int a = this.f1603c.m1896a(e);
            as.m1831c("sent " + a + " of " + e.size() + " hits");
            m1862a(e.subList(0, Math.min(a, e.size())));
            if (a == e.size() && m1869f() > 0) {
                C0309w.m1950a().m1961c();
            }
        }
    }

    public final C0293o m1873c() {
        return this.f1603c;
    }
}
