package com.andromo.dev576782.app537736;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.C0772e;

public abstract class InterstitialHelperBase {
    static AudioItem f580a;
    static boolean f581b;
    static AudioServiceReceiver f582c;

    public class AudioServiceReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                "AudioServiceReceiver onReceive(): " + action;
                if ("com.andromo.dev576782.app537736.broadcast.STATE_CHANGED".equals(action)) {
                    action = intent.getStringExtra("com.andromo.dev576782.app537736.extra.STATE");
                    "AudioServiceReceiver onReceive(): " + action;
                    switch (fc.f896a[ct.valueOf(action).ordinal()]) {
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                            if (InterstitialHelperBase.f581b) {
                                InterstitialHelperBase.f580a = (AudioItem) intent.getParcelableExtra("com.andromo.dev576782.app537736.extra.CURRENT_ITEM");
                                InterstitialHelperBase.f581b = false;
                            }
                        default:
                    }
                }
            }
        }
    }
}
