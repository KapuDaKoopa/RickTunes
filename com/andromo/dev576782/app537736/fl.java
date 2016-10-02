package com.andromo.dev576782.app537736;

import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.util.HashMap;

public final class fl extends AsyncTask implements dn {
    private fm f918a;

    public fl(fm fmVar) {
        this.f918a = fmVar;
    }

    private static fj m1454a(String... strArr) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (strArr[0] != null && strArr[0].length() > 0) {
            fj a;
            try {
                if (VERSION.SDK_INT >= 14) {
                    mediaMetadataRetriever.setDataSource(strArr[0], new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(strArr[0]);
                }
                a = new fk().m1448a(mediaMetadataRetriever.extractMetadata(7)).m1449b(mediaMetadataRetriever.extractMetadata(2) != null ? mediaMetadataRetriever.extractMetadata(2) : mediaMetadataRetriever.extractMetadata(13)).m1450c(mediaMetadataRetriever.extractMetadata(1)).m1451d(mediaMetadataRetriever.extractMetadata(8)).m1452e(mediaMetadataRetriever.extractMetadata(9)).m1453f(mediaMetadataRetriever.extractMetadata(6)).m1447a();
                return a;
            } catch (IllegalArgumentException e) {
                a = e;
                a.printStackTrace();
            } catch (RuntimeException e2) {
                a = e2;
                a.printStackTrace();
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        return fj.m1437a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1454a((String[]) objArr);
    }

    protected final void onCancelled() {
        this.f918a = null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        fj fjVar = (fj) obj;
        if (!isCancelled() && this.f918a != null) {
            this.f918a.m1304a(fjVar);
        }
    }
}
