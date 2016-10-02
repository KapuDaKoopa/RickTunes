package android.support.v4.content;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0772e;

/* renamed from: android.support.v4.content.s */
final class C0060s extends Handler {
    private C0060s() {
    }

    public final void handleMessage(Message message) {
        C0059r c0059r = (C0059r) message.obj;
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                C0045m.m77c(c0059r.f88a, c0059r.f89b[0]);
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                C0045m c0045m = c0059r.f88a;
                Object[] objArr = c0059r.f89b;
                C0045m.m76c();
            default:
        }
    }
}
