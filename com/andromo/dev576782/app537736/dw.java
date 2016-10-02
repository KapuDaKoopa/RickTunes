package com.andromo.dev576782.app537736;

import android.os.AsyncTask;
import java.io.File;

final class dw extends AsyncTask implements C0198do {
    private dx f848a;

    public dw(dx dxVar) {
        this.f848a = dxVar;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z = false;
        File file = new File(((String[]) objArr)[0]);
        if (!isCancelled()) {
            z = file.delete();
        }
        return new Boolean(z);
    }

    protected final void onCancelled() {
        this.f848a = null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && this.f848a != null) {
            this.f848a.m1309a(bool.booleanValue());
        }
    }
}
