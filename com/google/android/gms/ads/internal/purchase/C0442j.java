package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.ads.internal.purchase.j */
public final class C0442j extends SQLiteOpenHelper {
    final /* synthetic */ C0441i f2310a;

    public C0442j(C0441i c0441i, Context context, String str) {
        this.f2310a = c0441i;
        super(context, str, null, 4);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C0441i.f2306a);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        "Database updated from version " + i + " to version " + i2;
        C0501b.m3027a(4);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sQLiteDatabase);
    }
}
