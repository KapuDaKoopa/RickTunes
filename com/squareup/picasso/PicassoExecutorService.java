package com.squareup.picasso;

import android.net.NetworkInfo;
import com.google.android.gms.C0772e;
import com.squareup.picasso.Picasso.Priority;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class PicassoExecutorService extends ThreadPoolExecutor {
    private static final int DEFAULT_THREAD_COUNT = 3;

    final class PicassoFutureTask extends FutureTask implements Comparable {
        private final BitmapHunter hunter;

        public PicassoFutureTask(BitmapHunter bitmapHunter) {
            super(bitmapHunter, null);
            this.hunter = bitmapHunter;
        }

        public final int compareTo(PicassoFutureTask picassoFutureTask) {
            Priority priority = this.hunter.getPriority();
            Priority priority2 = picassoFutureTask.hunter.getPriority();
            return priority == priority2 ? this.hunter.sequence - picassoFutureTask.hunter.sequence : priority2.ordinal() - priority.ordinal();
        }
    }

    PicassoExecutorService() {
        super(DEFAULT_THREAD_COUNT, DEFAULT_THREAD_COUNT, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new PicassoThreadFactory());
    }

    private void setThreadCount(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    void adjustThreadCount(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setThreadCount(DEFAULT_THREAD_COUNT);
            return;
        }
        switch (networkInfo.getType()) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                switch (networkInfo.getSubtype()) {
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        setThreadCount(1);
                    case DEFAULT_THREAD_COUNT /*3*/:
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    case C0772e.MapAttrs_uiZoomGestures /*12*/:
                        setThreadCount(2);
                    case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    case C0772e.MapAttrs_uiMapToolbar /*15*/:
                        setThreadCount(DEFAULT_THREAD_COUNT);
                    default:
                        setThreadCount(DEFAULT_THREAD_COUNT);
                }
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                setThreadCount(4);
            default:
                setThreadCount(DEFAULT_THREAD_COUNT);
        }
    }

    public Future submit(Runnable runnable) {
        Object picassoFutureTask = new PicassoFutureTask((BitmapHunter) runnable);
        execute(picassoFutureTask);
        return picassoFutureTask;
    }
}
