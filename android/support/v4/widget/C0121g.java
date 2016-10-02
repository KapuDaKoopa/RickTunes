package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
final class C0121g extends Filter {
    C0117h f373a;

    C0121g(C0117h c0117h) {
        this.f373a = c0117h;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f373a.convertToString((Cursor) obj);
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f373a.runQueryOnBackgroundThread(charSequence);
        FilterResults filterResults = new FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor cursor = this.f373a.getCursor();
        if (filterResults.values != null && filterResults.values != cursor) {
            this.f373a.changeCursor((Cursor) filterResults.values);
        }
    }
}
