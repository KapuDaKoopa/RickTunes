package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.C0023l;
import android.support.v4.content.C0043k;
import android.support.v4.p001b.C0033d;
import android.support.v4.p001b.C0041n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final C0041n mInactiveLoaders;
    final C0041n mLoaders;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    final class LoaderInfo implements C0023l {
        final Bundle mArgs;
        LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        C0043k mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;

        public LoaderInfo(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        final void callOnLoadFinished(C0043k c0043k, Object obj) {
            String str;
            if (this.mCallbacks != null) {
                if (LoaderManagerImpl.this.mActivity != null) {
                    String str2 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
                    LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        StringBuilder append = new StringBuilder("  onLoadFinished in ").append(c0043k).append(": ");
                        StringBuilder stringBuilder = new StringBuilder(64);
                        C0033d.m36a(obj, stringBuilder);
                        stringBuilder.append("}");
                        append.append(stringBuilder.toString()).toString();
                    }
                    this.mCallbacks.onLoadFinished(c0043k, obj);
                    this.mDeliveredData = true;
                } finally {
                    if (LoaderManagerImpl.this.mActivity != null) {
                        LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        final void destroy() {
            String str;
            Object obj = 1;
            LoaderCallbacks loaderCallbacks = null;
            Object obj2 = null;
            while (true) {
                if (LoaderManagerImpl.DEBUG) {
                    "  Destroying: " + this;
                }
                this.mDestroyed = obj;
                boolean z = this.mDeliveredData;
                this.mDeliveredData = obj2;
                if (this.mCallbacks != null && this.mLoader != null && this.mHaveData && z) {
                    if (LoaderManagerImpl.DEBUG) {
                        "  Reseting: " + this;
                    }
                    if (LoaderManagerImpl.this.mActivity != null) {
                        String str2 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
                        LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoaderReset";
                        str = str2;
                    } else {
                        Object obj3 = loaderCallbacks;
                    }
                    try {
                        this.mCallbacks.onLoaderReset(this.mLoader);
                    } finally {
                        loaderCallbacks = LoaderManagerImpl.this.mActivity;
                        if (loaderCallbacks != null) {
                            loaderCallbacks = LoaderManagerImpl.this.mActivity.mFragments;
                            loaderCallbacks.mNoTransactionsBecause = str;
                        }
                        break;
                    }
                }
                this.mCallbacks = loaderCallbacks;
                this.mData = loaderCallbacks;
                this.mHaveData = obj2;
                if (this.mLoader != null) {
                    if (this.mListenerRegistered) {
                        this.mListenerRegistered = obj2;
                        this.mLoader.m62a(this);
                    }
                    C0043k c0043k = this.mLoader;
                    c0043k.f59k = obj;
                    c0043k.f57i = obj2;
                    c0043k.f58j = obj2;
                    c0043k.f60l = obj2;
                    c0043k.f61m = obj2;
                }
                if (this.mPendingLoader != null) {
                    this = this.mPendingLoader;
                } else {
                    return;
                }
            }
        }

        public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(this.mId);
                printWriter.print(" mArgs=");
                printWriter.println(this.mArgs);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mCallbacks);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(this.mLoader);
                if (this.mLoader != null) {
                    this.mLoader.m63a(str + "  ", fileDescriptor, printWriter, strArr);
                }
                if (this.mHaveData || this.mDeliveredData) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(this.mHaveData);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(this.mDeliveredData);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(this.mData);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(this.mStarted);
                printWriter.print(" mReportNextStart=");
                printWriter.print(this.mReportNextStart);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.mDestroyed);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(this.mRetaining);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(this.mRetainingStarted);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(this.mListenerRegistered);
                if (this.mPendingLoader != null) {
                    printWriter.print(str);
                    printWriter.println("Pending Loader ");
                    printWriter.print(this.mPendingLoader);
                    printWriter.println(":");
                    this = this.mPendingLoader;
                    str = str + "  ";
                } else {
                    return;
                }
            }
        }

        final void finishRetain() {
            if (this.mRetaining) {
                if (LoaderManagerImpl.DEBUG) {
                    "  Finished Retaining: " + this;
                }
                this.mRetaining = false;
                if (!(this.mStarted == this.mRetainingStarted || this.mStarted)) {
                    stop();
                }
            }
            if (this.mStarted && this.mHaveData && !this.mReportNextStart) {
                callOnLoadFinished(this.mLoader, this.mData);
            }
        }

        public final void onLoadComplete(C0043k c0043k, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                "onLoadComplete: " + this;
            }
            boolean z;
            if (this.mDestroyed) {
                z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.m47a(this.mId) != this) {
                z = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        "  Switching to pending loader: " + loaderInfo;
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.m48a(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                    return;
                }
                if (!(this.mData == obj && this.mHaveData)) {
                    this.mData = obj;
                    this.mHaveData = true;
                    if (this.mStarted) {
                        callOnLoadFinished(c0043k, obj);
                    }
                }
                loaderInfo = (LoaderInfo) LoaderManagerImpl.this.mInactiveLoaders.m47a(this.mId);
                if (!(loaderInfo == null || loaderInfo == this)) {
                    loaderInfo.mDeliveredData = false;
                    loaderInfo.destroy();
                    LoaderManagerImpl.this.mInactiveLoaders.m50b(this.mId);
                }
                if (LoaderManagerImpl.this.mActivity != null && !LoaderManagerImpl.this.hasRunningLoaders()) {
                    LoaderManagerImpl.this.mActivity.mFragments.startPendingDeferredFragments();
                }
            }
        }

        final void reportStart() {
            if (this.mStarted && this.mReportNextStart) {
                this.mReportNextStart = false;
                if (this.mHaveData) {
                    callOnLoadFinished(this.mLoader, this.mData);
                }
            }
        }

        final void retain() {
            if (LoaderManagerImpl.DEBUG) {
                "  Retaining: " + this;
            }
            this.mRetaining = true;
            this.mRetainingStarted = this.mStarted;
            this.mStarted = false;
            this.mCallbacks = null;
        }

        final void start() {
            if (this.mRetaining && this.mRetainingStarted) {
                this.mStarted = true;
            } else if (!this.mStarted) {
                this.mStarted = true;
                if (LoaderManagerImpl.DEBUG) {
                    "  Starting: " + this;
                }
                if (this.mLoader == null && this.mCallbacks != null) {
                    this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                }
                if (this.mLoader == null) {
                    return;
                }
                if (!this.mLoader.getClass().isMemberClass() || Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                    if (!this.mListenerRegistered) {
                        C0043k c0043k = this.mLoader;
                        int i = this.mId;
                        if (c0043k.f55g != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c0043k.f55g = this;
                        c0043k.f54f = i;
                        this.mListenerRegistered = true;
                    }
                    this.mLoader.m64d();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
            }
        }

        final void stop() {
            if (LoaderManagerImpl.DEBUG) {
                "  Stopping: " + this;
            }
            this.mStarted = false;
            if (!this.mRetaining && this.mLoader != null && this.mListenerRegistered) {
                this.mListenerRegistered = false;
                this.mLoader.m62a(this);
                this.mLoader.f57i = false;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.mId);
            stringBuilder.append(" : ");
            C0033d.m36a(this.mLoader, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    static {
        DEBUG = false;
    }

    LoaderManagerImpl(String str, FragmentActivity fragmentActivity, boolean z) {
        this.mLoaders = new C0041n();
        this.mInactiveLoaders = new C0041n();
        this.mWho = str;
        this.mActivity = fragmentActivity;
        this.mStarted = z;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    public void destroyLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG) {
            "destroyLoader in " + this + " of " + i;
        }
        int f = this.mLoaders.m54f(i);
        if (f >= 0) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m53e(f);
            this.mLoaders.m51c(f);
            loaderInfo.destroy();
        }
        f = this.mInactiveLoaders.m54f(i);
        if (f >= 0) {
            loaderInfo = (LoaderInfo) this.mInactiveLoaders.m53e(f);
            this.mInactiveLoaders.m51c(f);
            loaderInfo.destroy();
        }
        if (this.mActivity != null && !hasRunningLoaders()) {
            this.mActivity.mFragments.startPendingDeferredFragments();
        }
    }

    void doDestroy() {
        int a;
        if (!this.mRetaining) {
            if (DEBUG) {
                "Destroying Active in " + this;
            }
            for (a = this.mLoaders.m46a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m53e(a)).destroy();
            }
            this.mLoaders.m49b();
        }
        if (DEBUG) {
            "Destroying Inactive in " + this;
        }
        for (a = this.mInactiveLoaders.m46a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mInactiveLoaders.m53e(a)).destroy();
        }
        this.mInactiveLoaders.m49b();
    }

    void doReportNextStart() {
        for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m53e(a)).mReportNextStart = true;
        }
    }

    void doReportStart() {
        for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m53e(a)).reportStart();
        }
    }

    void doRetain() {
        if (DEBUG) {
            "Retaining in " + this;
        }
        if (this.mStarted) {
            this.mRetaining = true;
            this.mStarted = false;
            for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m53e(a)).retain();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w(TAG, "Called doRetain when not started: " + this, runtimeException);
    }

    void doStart() {
        if (DEBUG) {
            "Starting in " + this;
        }
        if (this.mStarted) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.mStarted = true;
        for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m53e(a)).start();
        }
    }

    void doStop() {
        if (DEBUG) {
            "Stopping in " + this;
        }
        if (this.mStarted) {
            for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m53e(a)).stop();
            }
            this.mStarted = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w(TAG, "Called doStop when not started: " + this, runtimeException);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.mLoaders.m46a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.mLoaders.m46a(); i2++) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m53e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.m52d(i2));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.mInactiveLoaders.m46a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.mInactiveLoaders.m46a()) {
                loaderInfo = (LoaderInfo) this.mInactiveLoaders.m53e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.m52d(i));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    void finishRetain() {
        if (this.mRetaining) {
            if (DEBUG) {
                "Finished Retaining in " + this;
            }
            this.mRetaining = false;
            for (int a = this.mLoaders.m46a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m53e(a)).finishRetain();
            }
        }
    }

    public C0043k getLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m47a(i);
        return loaderInfo != null ? loaderInfo.mPendingLoader != null ? loaderInfo.mPendingLoader.mLoader : loaderInfo.mLoader : null;
    }

    public boolean hasRunningLoaders() {
        int a = this.mLoaders.m46a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m53e(i);
            int i2 = (!loaderInfo.mStarted || loaderInfo.mDeliveredData) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    public C0043k initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m47a(i);
        if (DEBUG) {
            "initLoader in " + this + ": args=" + bundle;
        }
        if (loaderInfo == null) {
            loaderInfo = createAndInstallLoader(i, bundle, loaderCallbacks);
            if (DEBUG) {
                "  Created new loader " + loaderInfo;
            }
        } else {
            if (DEBUG) {
                "  Re-using existing loader " + loaderInfo;
            }
            loaderInfo.mCallbacks = loaderCallbacks;
        }
        if (loaderInfo.mHaveData && this.mStarted) {
            loaderInfo.callOnLoadFinished(loaderInfo.mLoader, loaderInfo.mData);
        }
        return loaderInfo.mLoader;
    }

    void installLoader(LoaderInfo loaderInfo) {
        this.mLoaders.m48a(loaderInfo.mId, loaderInfo);
        if (this.mStarted) {
            loaderInfo.start();
        }
    }

    public C0043k restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m47a(i);
        if (DEBUG) {
            "restartLoader in " + this + ": args=" + bundle;
        }
        if (loaderInfo != null) {
            LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.m47a(i);
            if (loaderInfo2 != null) {
                if (loaderInfo.mHaveData) {
                    if (DEBUG) {
                        "  Removing last inactive loader: " + loaderInfo;
                    }
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                } else if (loaderInfo.mStarted) {
                    if (loaderInfo.mPendingLoader != null) {
                        if (DEBUG) {
                            "  Removing pending loader: " + loaderInfo.mPendingLoader;
                        }
                        loaderInfo.mPendingLoader.destroy();
                        loaderInfo.mPendingLoader = null;
                    }
                    r1 = DEBUG;
                    loaderInfo.mPendingLoader = createLoader(i, bundle, loaderCallbacks);
                    return loaderInfo.mPendingLoader.mLoader;
                } else {
                    r1 = DEBUG;
                    this.mLoaders.m48a(i, null);
                    loaderInfo.destroy();
                }
            } else if (DEBUG) {
                "  Making last loader inactive: " + loaderInfo;
            }
            loaderInfo.mLoader.f58j = true;
            this.mInactiveLoaders.m48a(i, loaderInfo);
        }
        return createAndInstallLoader(i, bundle, loaderCallbacks).mLoader;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0033d.m36a(this.mActivity, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    void updateActivity(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }
}
