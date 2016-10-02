package com.google.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.tagmanager.n */
final class C0812n implements C0806k {
    private static final String f5160a;
    private final Executor f5161b;
    private final Context f5162c;
    private C0816r f5163d;
    private C0802c f5164e;
    private int f5165f;

    static {
        f5160a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    }

    public C0812n(Context context) {
        this(context, new C0813o(), "google_tagmanager.db", Executors.newSingleThreadExecutor());
    }

    private C0812n(Context context, C0802c c0802c, String str, Executor executor) {
        this.f5162c = context;
        this.f5164e = c0802c;
        this.f5165f = 2000;
        this.f5161b = executor;
        this.f5163d = new C0816r(this, this.f5162c, str);
    }

    private SQLiteDatabase m5903a(String str) {
        try {
            return this.f5163d.getWritableDatabase();
        } catch (SQLiteException e) {
            C0824z.m5937a(str);
            return null;
        }
    }

    private static Object m5904a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Object readObject;
        Throwable th;
        ObjectInputStream objectInputStream2 = null;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                readObject = objectInputStream.readObject();
                try {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (ClassNotFoundException e8) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream = objectInputStream2;
            th = th4;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return readObject;
    }

    private List m5906a(int i) {
        SQLiteException e;
        Throwable th;
        List arrayList = new ArrayList();
        if (i <= 0) {
            C0824z.m5937a("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase a = m5903a("Error opening database for peekEntryIds.");
        if (a == null) {
            return arrayList;
        }
        Cursor query;
        try {
            query = a.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
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
                    C0824z.m5937a("Error in peekEntries fetching entryIds: " + e.getMessage());
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
            C0824z.m5937a("Error in peekEntries fetching entryIds: " + e.getMessage());
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

    private void m5908a(long j) {
        SQLiteDatabase a = m5903a("Error opening database for deleteOlderThan.");
        if (a != null) {
            try {
                "Deleted " + a.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items";
                C0824z.m5940d();
            } catch (SQLiteException e) {
                C0824z.m5937a("Error deleting old entries.");
            }
        }
    }

    private static byte[] m5910a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = bArr;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectOutputStream = bArr;
            th = th4;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    private List m5912b() {
        try {
            m5908a(this.f5164e.m5878a());
            List<C0817s> c = m5914c();
            List arrayList = new ArrayList();
            for (C0817s c0817s : c) {
                arrayList.add(new C0810i(c0817s.f5172a, C0812n.m5904a(c0817s.f5173b)));
            }
            return arrayList;
        } finally {
            m5917e();
        }
    }

    private synchronized void m5913b(List list, long j) {
        long a;
        String[] strArr;
        try {
            a = this.f5164e.m5878a();
            m5908a(a);
            int size = list.size() + (m5916d() - this.f5165f);
            if (size > 0) {
                List a2 = m5906a(size);
                "DataLayer store full, deleting " + a2.size() + " entries to make room.";
                C0824z.m5939c();
                strArr = (String[]) a2.toArray(new String[0]);
                if (!(strArr == null || strArr.length == 0)) {
                    SQLiteDatabase a3 = m5903a("Error opening database for deleteEntries.");
                    if (a3 != null) {
                        a3.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                    }
                }
            }
        } catch (SQLiteException e) {
            C0824z.m5937a("Error deleting entries " + Arrays.toString(strArr));
        } catch (Throwable th) {
            m5917e();
        }
        m5915c(list, a + j);
        m5917e();
    }

    private List m5914c() {
        SQLiteDatabase a = m5903a("Error opening database for loadSerialized.");
        List arrayList = new ArrayList();
        if (a == null) {
            return arrayList;
        }
        Cursor query = a.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C0817s(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private void m5915c(List list, long j) {
        SQLiteDatabase a = m5903a("Error opening database for writeEntryToDatabase.");
        if (a != null) {
            for (C0817s c0817s : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", c0817s.f5172a);
                contentValues.put("value", c0817s.f5173b);
                a.insert("datalayer", null, contentValues);
            }
        }
    }

    private int m5916d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase a = m5903a("Error opening database for getNumStoredEntries.");
        if (a != null) {
            try {
                cursor = a.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                C0824z.m5937a("Error getting numStoredEntries");
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

    private void m5917e() {
        try {
            this.f5163d.close();
        } catch (SQLiteException e) {
        }
    }

    public final void m5918a(C0808l c0808l) {
        this.f5161b.execute(new C0815q(this, c0808l));
    }

    public final void m5919a(List list, long j) {
        List arrayList = new ArrayList();
        for (C0810i c0810i : list) {
            arrayList.add(new C0817s(c0810i.f5158a, C0812n.m5910a(c0810i.f5159b)));
        }
        this.f5161b.execute(new C0814p(this, arrayList, j));
    }
}
