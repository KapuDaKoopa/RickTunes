package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.p006b.wj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object f4748a;
    private static HashSet f4749b;
    private final Context f4750c;
    private final Handler f4751d;
    private final ExecutorService f4752e;
    private final C0711b f4753f;
    private final wj f4754g;
    private final Map f4755h;
    private final Map f4756i;
    private final Map f4757j;

    @KeepName
    final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager f4745a;
        private final Uri f4746b;
        private final ArrayList f4747c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f4745a.f4752e.execute(new C0712c(this.f4745a, this.f4746b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    static {
        f4748a = new Object();
        f4749b = new HashSet();
    }
}
