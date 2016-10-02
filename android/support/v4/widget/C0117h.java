package android.support.v4.widget;

import android.database.Cursor;

/* renamed from: android.support.v4.widget.h */
interface C0117h {
    void changeCursor(Cursor cursor);

    CharSequence convertToString(Cursor cursor);

    Cursor getCursor();

    Cursor runQueryOnBackgroundThread(CharSequence charSequence);
}
