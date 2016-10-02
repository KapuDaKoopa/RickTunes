package com.andromo.dev576782.app537736;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;

public final class bb extends AsyncTask implements dn {
    private fm f736a;

    public bb(fm fmVar) {
        this.f736a = fmVar;
    }

    private static fj m1299a(AssetFileDescriptor... assetFileDescriptorArr) {
        fj a;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (assetFileDescriptorArr[0] != null) {
            try {
                AssetFileDescriptor assetFileDescriptor = assetFileDescriptorArr[0];
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
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
        return m1299a((AssetFileDescriptor[]) objArr);
    }

    protected final void onCancelled() {
        this.f736a = null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        fj fjVar = (fj) obj;
        if (!isCancelled() && this.f736a != null) {
            this.f736a.m1304a(fjVar);
        }
    }
}
