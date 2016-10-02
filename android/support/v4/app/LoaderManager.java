package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0043k;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks {
        C0043k onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C0043k c0043k, Object obj);

        void onLoaderReset(C0043k c0043k);
    }

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public abstract void destroyLoader(int i);

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract C0043k getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract C0043k initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public abstract C0043k restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);
}
