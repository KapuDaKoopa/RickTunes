package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.i */
public final class C0441i {
    private static final String f2306a;
    private static final Object f2307c;
    private static C0441i f2308d;
    private final C0442j f2309b;

    static {
        f2306a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});
        f2307c = new Object();
    }

    private C0441i(Context context) {
        this.f2309b = new C0442j(this, context, "google_inapp_purchase.db");
    }

    private static C0439g m2790a(Cursor cursor) {
        return cursor == null ? null : new C0439g(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    public static C0441i m2791a(Context context) {
        C0441i c0441i;
        synchronized (f2307c) {
            if (f2308d == null) {
                f2308d = new C0441i(context);
            }
            c0441i = f2308d;
        }
        return c0441i;
    }

    private SQLiteDatabase m2793c() {
        try {
            return this.f2309b.getWritableDatabase();
        } catch (SQLiteException e) {
            C0501b.m3025a("Error opening writable conversion tracking database");
            return null;
        }
    }

    private int m2794d() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f2307c) {
            SQLiteDatabase c = m2793c();
            if (c == null) {
            } else {
                try {
                    cursor = c.rawQuery("select count(*) from InAppPurchase", null);
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    C0501b.m3025a("Error getting record count" + e.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }

    public final List m2795a() {
        Cursor query;
        SQLiteException e;
        Throwable th;
        synchronized (f2307c) {
            List linkedList = new LinkedList();
            if (10 <= 0) {
                return linkedList;
            }
            SQLiteDatabase c = m2793c();
            if (c == null) {
                return linkedList;
            }
            try {
                query = c.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(10));
                try {
                    if (query.moveToFirst()) {
                        do {
                            linkedList.add(C0441i.m2790a(query));
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        C0501b.m3025a("Error extracing purchase info: " + e.getMessage());
                        if (query != null) {
                            query.close();
                        }
                        return linkedList;
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
                C0501b.m3025a("Error extracing purchase info: " + e.getMessage());
                if (query != null) {
                    query.close();
                }
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
            return linkedList;
        }
    }

    public final void m2796a(C0439g c0439g) {
        if (c0439g != null) {
            synchronized (f2307c) {
                SQLiteDatabase c = m2793c();
                if (c == null) {
                    return;
                }
                c.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[]{"purchase_id", Long.valueOf(c0439g.f2296a)}), null);
            }
        }
    }

    public final void m2797b(C0439g c0439g) {
        SQLiteException e;
        Throwable th;
        if (c0439g != null) {
            synchronized (f2307c) {
                SQLiteDatabase c = m2793c();
                if (c == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("product_id", c0439g.f2298c);
                contentValues.put("developer_payload", c0439g.f2297b);
                contentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
                c0439g.f2296a = c.insert("InAppPurchase", null, contentValues);
                if (((long) m2794d()) > 20000) {
                    synchronized (f2307c) {
                        c = m2793c();
                        if (c == null) {
                        } else {
                            Cursor query;
                            try {
                                query = c.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            m2796a(C0441i.m2790a(query));
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        try {
                                            C0501b.m3025a("Error remove oldest record" + e.getMessage());
                                            if (query != null) {
                                                query.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (query != null) {
                                                query.close();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                if (query != null) {
                                    query.close();
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                query = null;
                                C0501b.m3025a("Error remove oldest record" + e.getMessage());
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                query = null;
                                if (query != null) {
                                    query.close();
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }
}
